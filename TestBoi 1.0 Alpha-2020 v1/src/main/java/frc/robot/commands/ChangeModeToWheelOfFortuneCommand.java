package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.Talon;
import frc.robot.Constants;


public class ChangeModeToWheelOfFortuneCommand extends CommandBase{

 
  private static final Talon tiltTalon = new Talon(Constants.TILT_MOTOR_ID);
  private boolean finished;

  public ChangeModeToWheelOfFortuneCommand(){

      addRequirements(RobotContainer.m_launcherSubsystem);


  }

      
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  finished = false;

  }


  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  
  RobotContainer.modeID = Constants.WHEEL_OF_FORTUNE_MODE_ID;
  finished = true;

}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
  return finished;
  }
}