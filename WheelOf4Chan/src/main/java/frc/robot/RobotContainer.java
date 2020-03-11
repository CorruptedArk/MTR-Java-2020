/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.*;
import frc.robot.commands.TeleOpCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.LauncherSubsystem;
import frc.robot.subsystems.WheelOfFortuneSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
 

  private final TeleOpCommand m_teleOpCommand = new TeleOpCommand();
  private final AutonCommand m_autonCommand = new AutonCommand();
  public final ButtonXCommand m_buttonXCommand = new ButtonXCommand();
  public final ButtonYCommand m_buttonYCommand = new ButtonYCommand();
  public final ButtonACommand m_buttonACommand = new ButtonACommand();
  public final ButtonBCommand m_buttonBCommand = new ButtonBCommand();
  public final ScaleUpCommand m_ScaleUpCommand = new ScaleUpCommand();
  public final ScaleDownCommand m_ScaleDownCommand = new ScaleDownCommand();
  public final RotateWheel3TimesCommand m_RotateWheel3TimesCommand = new RotateWheel3TimesCommand();
  public final static WheelOfFortuneSubsystem m_wheelOfFortuneSubsystem = new WheelOfFortuneSubsystem();
  private final GoToGivenColorCommand m_goToGivenColorCommand = new GoToGivenColorCommand();
  //public final ChangeModeToLaunchCommand m_changetoLaunchCommand = new ChangeModeToLaunchCommand();
  //public final ChangeModeToWheelOfFortuneCommand m_changetoWheelOfFortuneCommand = new ChangeModeToWheelOfFortuneCommand();
  //public final ChangeModeToIntakeCommand m_changetoIntakeCommand = new ChangeModeToIntakeCommand();
  public final static DriveSubsystem m_driveSubsystem = new DriveSubsystem();
  //public final static LauncherSubsystem m_launcherSubsystem = new LauncherSubsystem();
  
  
  public static final Joystick pilot = new Joystick(Constants.PILOT_ID);
  public static final Joystick artillery = new Joystick(Constants.ARTILLERY_ID);

  // Globally available Variables, Not Constants
  public static int modeID = 0;
  public static int lastModeID = 0;
  
  //check old 2019 code for info.
  public static final double ZERO_MARGIN = 0.18;
  private static volatile double driveScale = 0.5;
  public static final double DRIVE_STEP_VAL = 0.1;

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Note: all of this was useless so i rewrote it -Luke
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a GenericHID or one of its subclasses Joystick
   * or XboxController, and then instantiating a JoystickButton Class and passing the 
   * Controller/HID Device and the axis for that device that correlates to the button
   * on the device
   */
  private void configureButtonBindings() {

    //Xbox A Button Mapping
   /* JoystickButton xboxAButton = new JoystickButton(artillery, Constants.XBOX_A);
    xboxAButton.whenPressed(m_buttonACommand);
    //Xbox B Button Mapping
    JoystickButton xboxBButton = new JoystickButton(artillery, Constants.XBOX_B);
    xboxBButton.whenPressed(m_buttonBCommand);
    //Xbox X Button Mapping
    JoystickButton xboxXButton = new JoystickButton(artillery, Constants.XBOX_X);
    xboxXButton.whenPressed(m_buttonXCommand);
    //Xbox Y Button Mapping
    JoystickButton xboxYButton = new JoystickButton(artillery, Constants.XBOX_Y);
    xboxYButton.whenPressed(m_buttonYCommand);*/
    //Xbox Left Bumper Button Mapping
    JoystickButton scaleUpButton = new JoystickButton(pilot, Constants.XBOX_LBumper);
    scaleUpButton.whenPressed(m_ScaleUpCommand);
    //Xbox Right Bumper Button Mapping
    JoystickButton scaleDownButton = new JoystickButton(pilot, Constants.XBOX_RBumper);
    scaleDownButton.whenPressed(m_ScaleDownCommand);
    //Xbox A Button Mapping
    JoystickButton activateColorSearchButton = new JoystickButton(artillery, Constants.XBOX_A);
    activateColorSearchButton.whenPressed(m_goToGivenColorCommand);
    //Xbox B Button Mapping
    JoystickButton rotationButton = new JoystickButton(artillery, Constants.XBOX_B);
    rotationButton.whenPressed(m_RotateWheel3TimesCommand);
    /*
    //Xbox Start Button Mapping
    JoystickButton xboxStartButton = new JoystickButton(artillery, Constants.XBOX_Start);
    xboxStartButton.whenPressed(m_changetoLaunchCommand);
    //Xbox Select Button Mapping
    JoystickButton xboxSelectButton = new JoystickButton(artillery, Constants.XBOX_Select);
    xboxSelectButton.whenPressed(m_changetoIntakeCommand);
    //Xbox Right Joystick Click Button Mapping
    JoystickButton xboxRightJoystickClick = new JoystickButton(artillery, Constants.XBOX_RStickButton);
    xboxRightJoystickClick.whenPressed(m_changetoWheelOfFortuneCommand);
    */
  }

  // driveScale indirect calls
  public static double getDriveScale(){
  return driveScale;  
  }
  public static void raiseDriveScale(){
    if(driveScale < Constants.SCALE_MAX + Constants.SCALE_INTERVAL){
      driveScale = driveScale + Constants.SCALE_INTERVAL;
    }
  }
  public static void lowerDriveScale(){
    if(driveScale > Constants.SCALE_INTERVAL + Constants.SCALE_INTERVAL){
      driveScale = driveScale - Constants.SCALE_INTERVAL;
    }
  }


  public static double Buffer(int axisVal, Joystick joystick, boolean inverted, double highMargin, double lowMargin, double scale){
    
    double moveRaw = joystick.getRawAxis(axisVal);
    double moveProc = 0.0;
      
    if(moveRaw >= highMargin && moveRaw <= lowMargin){
      moveProc = 0.0;
    }
      
    else {

      //invert values
      if (inverted){
        moveProc = -moveRaw;

      }

      else{
        moveProc = moveRaw;
          
      }
    }
    
    scale = Math.abs(scale);
    moveProc = moveProc * scale;
    
    return moveProc;
  }
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autonCommand;
  }
/**
   * Use this to pass the TeleOp command to the main {@link Robot} class.
   *
   * @return the command to run in TeleOp
   */
  public Command getTeleOpCommand() {
    return m_teleOpCommand;
  }
}

