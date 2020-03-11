/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.Constants;
import frc.robot.subsystems.LauncherSubsystem;
import frc.robot.subsystems.WheelOfFortuneSubsystem;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.WheelOfFortuneSubsystem;



public class TeleOpCommand extends CommandBase {
  /**
   * Creates a new TeleOp.
   * 
   * 
   */
  //private static final DigitalInput topSwitch = new DigitalInput(Constants.TOP_TIER_LIMIT_SWITCH_ID);
  //private static final DigitalInput middleSwitch = new DigitalInput(Constants.MIDDLE_LIMIT_SWITCH_ID);
  //private static final DigitalInput bottomSwitch = new DigitalInput(Constants.BOTTOM_LIMIT_SWITCH_ID);
  //private static final Talon tiltTalon = new Talon(Constants.TILT_MOTOR_ID);
  public TeleOpCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    //addRequirements(RobotContainer.m_launcherSubsystem);
    addRequirements(RobotContainer.m_driveSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }
    

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double rightSpeed = RobotContainer.Buffer(Constants.RIGHT_Y_AXIS, RobotContainer.pilot, true, RobotContainer.ZERO_MARGIN, -RobotContainer.ZERO_MARGIN, RobotContainer.getDriveScale());
    double leftSpeed = RobotContainer.Buffer(Constants.LEFT_Y_AXIS, RobotContainer.pilot, true, RobotContainer.ZERO_MARGIN, -RobotContainer.ZERO_MARGIN,RobotContainer.getDriveScale());
    
    RobotContainer.m_driveSubsystem.drive(leftSpeed, rightSpeed);
    SmartDashboard.putString("ColorSensorColor", RobotContainer.m_wheelOfFortuneSubsystem.getColor().toString());
    SmartDashboard.putNumber("Red", RobotContainer.m_wheelOfFortuneSubsystem.getColor().red);
    SmartDashboard.putNumber("Blue", RobotContainer.m_wheelOfFortuneSubsystem.getColor().blue);
    SmartDashboard.putNumber("Green", RobotContainer.m_wheelOfFortuneSubsystem.getColor().green);

    //if(topSwitch.get()){
      //RobotContainer.lastModeID = Constants.LAUNCH_MODE_ID;
      
    //}
    //if(middleSwitch.get()){
      //RobotContainer.lastModeID = Constants.WHEEL_OF_FORTUNE_MODE_ID;
    //}
    //if(bottomSwitch.get()){
      //RobotContainer.lastModeID = Constants.INTAKE_MODE_ID;
    //}
/*
    switch(RobotContainer.modeID)
    {
      case Constants.LAUNCH_MODE_ID:
        if(RobotContainer.lastModeID == Constants.LAUNCH_MODE_ID){
          tiltTalon.set(0);
        }
        else{
          tiltTalon.set(Constants.tiltSpeed);
        }
      break;
      
      case Constants.WHEEL_OF_FORTUNE_MODE_ID:
        if(RobotContainer.lastModeID == Constants.LAUNCH_MODE_ID){
          tiltTalon.set(-Constants.tiltSpeed);
        }
        if(RobotContainer.lastModeID == Constants.INTAKE_MODE_ID){
          tiltTalon.set(Constants.tiltSpeed);
        }
        if(RobotContainer.lastModeID == Constants.WHEEL_OF_FORTUNE_MODE_ID){
          tiltTalon.set(0);
        }
      break;

      case Constants.INTAKE_MODE_ID:
        if(RobotContainer.lastModeID == Constants.INTAKE_MODE_ID) {
          tiltTalon.set(0);
        }
        else{
          tiltTalon.set(-Constants.tiltSpeed);
        }
      break;
    }*/
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
