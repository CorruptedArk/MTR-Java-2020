package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LauncherSubsystem;
import frc.robot.RobotContainer;
import frc.robot.Constants;


public class ChangeModeToLaunchCommand extends CommandBase{

    public ChangeModeToLaunchCommand(){
        addRequirements(RobotContainer.m_launcherSubsystem);

    }
    
}