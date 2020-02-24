package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LauncherSubsystem;
import frc.robot.RobotContainer;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;


public class ChangeModeToLaunchCommand extends CommandBase{

    private static final Talon tiltTalon = new Talon(Constants.TILT_MOTOR_ID);
    private boolean finished;

    public ChangeModeToLaunchCommand(){

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
    Constants.modeID = Constants.LAUNCH_MODE_ID;
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