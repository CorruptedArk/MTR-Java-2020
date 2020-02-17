/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import java.util.Set;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.*;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.TeleOpCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.LauncherSubsystem;
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
 
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  private final TeleOpCommand m_teleOpCommand = new TeleOpCommand();
  public final ButtonXCommand m_buttonXCommand = new ButtonXCommand();
  public final ButtonYCommand m_buttonYCommand = new ButtonYCommand();
  public final ButtonACommand m_buttonACommand = new ButtonACommand();
  public final ButtonBCommand m_buttonBCommand = new ButtonBCommand();
  public final static DriveSubsystem m_driveSubsystem = new DriveSubsystem();
  public final static LauncherSubsystem m_launcherSubsystem = new LauncherSubsystem();
  

  
  public static final Joystick pilot = new Joystick(Constants.PILOT_ID);
  public static final Joystick artillery = new Joystick(Constants.ARTILLERY_ID);
  
  //check old 2019 code for info
  public static final double ZERO_MARGIN = 0.18;
  public static volatile double driveScale = 0.5;
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
    //sets up controller
    XboxController driveController = new XboxController(Constants.PILOT_ID);
    //defining a button, this will need to be done for every button used
    JoystickButton xboxLStickButton = new JoystickButton(driveController, Constants.XBOX_LStickButton);
    //linking a button to a command
    xboxLStickButton.whenActive(null/*command*/);

  }

  public static double Buffer(int axisVal, Joystick joystick, boolean inverted, double highMargin, double lowMargin, double scale){
    //get raw input from joystick
    double moveRaw = joystick.getRawAxis(axisVal);
    //processed movement info
    double moveProc = 0.0;
      
      if(moveRaw >= highMargin && moveRaw <= lowMargin){
        moveProc = 0.0;
      } else{
        //invert controls
        if (inverted){
          moveProc = -moveRaw;

        }else{
          moveProc = moveRaw;
          
        }
      }
    //make sure the scale is a positive value or its absolute value
    scale = Math.abs(scale);
    //multipl the raw value by a scale
    moveProc = moveProc * scale;
    //return the processed movement value to the caller
    return moveProc;
  }
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
