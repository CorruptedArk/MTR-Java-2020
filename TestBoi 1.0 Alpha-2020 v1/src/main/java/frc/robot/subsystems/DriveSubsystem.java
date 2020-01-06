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
  private final int frontRightMotor;
  private final int rearRightMotor;
  private final int frontLeftMotor;
  private final int rearLeftMotor;
  private final int chassis;
  
  /**
   * Creates a new DriveSubsystem.
   */
  public DriveSubsystem() {
    final Talon frontRightMotor = new Talon(Constants.FRONT_RIGHT_MOTOR_ID);
    final Talon frontLeftMotor = new Talon(Constants.FRONT_LEFT_MOTOR_ID);
    final Talon rearRightMotor = new Talon(Constants.REAR_RIGHT_MOTOR_ID);
    final Talon rearLeftMotor = new Talon(Constants.REAR_LEFT_MOTOR_ID);
    final MecanumDrive chassis = new MecanumDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);

    public void drive(double frontRightSpeed, double frontLeftSpeed, double rearRightSpeed, double rearLeftSpeed) {
      chassis.MecanumDrive(frontRightSpeed, frontLeftSpeed, rearRightSpeed);

    }

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
