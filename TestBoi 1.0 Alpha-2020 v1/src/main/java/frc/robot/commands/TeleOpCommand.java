/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.Constants;
import frc.robot.subsystems.LauncherSubsystem;

import frc.robot.RobotContainer;


public class TeleOpCommand extends CommandBase {
  /**
   * Creates a new TeleOp.
   */
  public TeleOpCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.m_launcherSubsystem);
    addRequirements(RobotContainer.m_driveSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }
    

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    DriveSubsystem driveSub = new DriveSubsystem();
    LauncherSubsystem launcherSub = new LauncherSubsystem();
    
    driveSub.drive(RobotContainer.Buffer(Constants.XBOX_LStickYAxis, RobotContainer.pilot, false, 0.0, 0.0, Constants.driveScale),
      RobotContainer.Buffer(Constants.XBOX_LStickYAxis, RobotContainer.pilot, true, 0.0, 0.0, Constants.driveScale));

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
