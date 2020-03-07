package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;


public class ScaleUpCommand extends CommandBase{
    private boolean finished;
    public ScaleUpCommand(){


    }   
    public void execute(){
        RobotContainer.raiseDriveScale();
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