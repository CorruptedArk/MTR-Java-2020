package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class ButtonXCommand extends CommandBase
{

    public ButtonXCommand(){

        addRequirements(RobotContainer.m_launcherSubsystem);
    {

      }
    

    

    if(RobotContainer.modeID == Constants.INTAKE_MODE_ID){


    }

    if(RobotContainer.modeID == Constants.WHEEL_OF_FORTUNE_MODE_ID){

    }

    if(RobotContainer.modeID == Constants.LAUNCH_MODE_ID){

    }

    }


    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    
    }
    

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    
    

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