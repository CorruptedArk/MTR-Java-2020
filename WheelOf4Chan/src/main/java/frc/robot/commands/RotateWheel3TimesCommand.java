package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.WheelOfFortuneSubsystem;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.util.Color;
import com.revrobotics.*;
import frc.robot.Constants;
public class RotateWheel3TimesCommand extends CommandBase{
    private boolean finished;
    private Color baseColor;
    private boolean newColor;
    private int totalRotations;
    private ColorMatch m_matcher = RobotContainer.m_wheelOfFortuneSubsystem.getColorMatcher();

    public RotateWheel3TimesCommand(){
    }
    
    @Override
    public void initialize(){
        finished = false;
        newColor = true;
        totalRotations = 0;

        m_matcher.addColorMatch(Constants.WHEEL_BLUE);
        m_matcher.addColorMatch(Constants.WHEEL_RED);
        m_matcher.addColorMatch(Constants.WHEEL_GREEN);
        m_matcher.addColorMatch(Constants.WHEEL_YELLOW);
        m_matcher.addColorMatch(Constants.WHEEL_WHITE);

        // Color at the start of the rotation
        ColorMatchResult colorResult = m_matcher.matchClosestColor(RobotContainer.m_wheelOfFortuneSubsystem.getColor());

        baseColor = colorResult.color;
    }
    @Override
    public void execute(){
        
        ColorMatchResult colorResult = m_matcher.matchClosestColor(RobotContainer.m_wheelOfFortuneSubsystem.getColor());
 
        // Check if the wheel has been rotated 3 times
        if(totalRotations <= 3){
         RobotContainer.m_wheelOfFortuneSubsystem.turnWheel();
           
            // This checks if the base color of the Wheel of Fortune has been detected seven times.
            if(colorResult.color == baseColor){
                if(newColor){
                totalRotations = totalRotations + 1;   
                }
                newColor = false;

            }
            else{
                newColor = true;
            }
                
            
        }
        // This here stops the wheel once it detects the base color the seventh time.
        else{
            RobotContainer.m_wheelOfFortuneSubsystem.stopWheel();
            finished = true;
        }
    }
    @Override
    public void end(boolean interrupted){

    }
    @Override
    public boolean isFinished(){
        return finished;
    }




}