package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
public class ScaleDownCommand extends CommandBase{
    private boolean finished;
    public ScaleDownCommand(){


    }   
    public void execute(){
        RobotContainer.lowerDriveScale();
        finished = true;
    }
    public void initialize(){
        finished = false;
    }
    public void end(){

    }
    public boolean isFinished(){
        return finished;
    }
}