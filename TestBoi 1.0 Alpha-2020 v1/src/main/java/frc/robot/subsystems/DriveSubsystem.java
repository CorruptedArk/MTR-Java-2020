/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.Talon;

public class DriveSubsystem extends SubsystemBase {
  private final Talon frontRightMotor;
  private final Talon rearRightMotor;
  private final Talon frontLeftMotor;
  private final Talon rearLeftMotor;
  private final MecanumDrive chassis;
 
  
  /**
   * Creates a new DriveSubsystem.
   */
  //DriveSystem Constuctor
  public DriveSubsystem() {
    //link motors to the const/final 
    frontRightMotor = new Talon(Constants.FRONT_RIGHT_MOTOR_ID);
    frontLeftMotor = new Talon(Constants.FRONT_LEFT_MOTOR_ID);
    rearRightMotor = new Talon(Constants.REAR_RIGHT_MOTOR_ID);
    rearLeftMotor = new Talon(Constants.REAR_LEFT_MOTOR_ID);
    chassis = new MecanumDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
  }
  

  
  public void drive(final double rightSpeed, final double leftSpeed) {
      chassis.driveCartesian(rightSpeed, leftSpeed, 0,0);

  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
