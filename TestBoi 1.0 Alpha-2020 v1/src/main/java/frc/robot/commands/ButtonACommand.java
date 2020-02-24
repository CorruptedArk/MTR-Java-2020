package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class ButtonACommand extends CommandBase
{
    @Override
    public void execute(){

        if(Constants.modeID == Constants.INTAKE_MODE_ID){

        }

        if(Constants.modeID == Constants.WHEEL_OF_FORTUNE_MODE_ID){

        }

        if(Constants.modeID == Constants.LAUNCH_MODE_ID){

        }
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
    return false;
    }
}