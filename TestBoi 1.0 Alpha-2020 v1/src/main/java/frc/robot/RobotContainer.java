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
  public final static DriveSubsystem m_driveSubsystem = new DriveSubsystem();
  

  
  public static final Joystick pilot = new Joystick(Constants.PILOT_ID);
  public static final Joystick artillery = new Joystick(Constants.ARTILLERY_ID);
  


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
    JoystickButton xboxLStickX = new JoystickButton(driveController, Constants.XBOX_LStickXAxis);
    //linking a button to a command
    xboxLStickX.whenActive(null/*command*/);

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
