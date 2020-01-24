/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants;
//import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.Talon;

public class DriveSubsystem extends SubsystemBase {
  /*private final Talon frontRightMotor;
  private final Talon rearRightMotor;
  private final Talon frontLeftMotor;
  private final Talon rearLeftMotor;
  private final MecanumDrive chassis;*/

  private final Talon rightTalon;
  private final Talon leftTalon;
  private final DifferentialDrive chassis;

 
  
  /**
   * Creates a new DriveSubsystem.
   */
  //DriveSystem Constuctor
  public DriveSubsystem() {
    //link motors to the const/final 
    rightTalon = new Talon(Constants.RIGHT_MOTOR_ID);
    leftTalon = new Talon(Constants.LEFT_MOTOR_ID);
    chassis = new DifferentialDrive(leftTalon, rightTalon);
  }
  

  
  public void drive(final double leftSpeed, final double rightSpeed) {
    
      chassis.tankDrive(leftSpeed, rightSpeed);
 
  }
  @Override
  public void periodic() {
    
    // This method will be called once per scheduler run
  }
}
