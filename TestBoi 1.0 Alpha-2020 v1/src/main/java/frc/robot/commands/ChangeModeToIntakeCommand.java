package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LauncherSubsystem;
import frc.robot.RobotContainer;
import frc.robot.Constants;

import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;



public class ChangeModeToIntakeCommand extends CommandBase{

   private static final DigitalInput topSwitch = new DigitalInput(Constants.TOP_TIER_LIMIT_SWITCH_ID);
   private static final DigitalInput middleSwitch = new DigitalInput(Constants.MIDDLE_LIMIT_SWITCH_ID);
   private static final DigitalInput bottomSwitch = new DigitalInput(Constants.BOTTOM_LIMIT_SWITCH_ID);
   private double motorOutput = 0.0;
   private static final Talon tiltTalon = new Talon(Constants.TILT_MOTOR_ID);
   private boolean finished;
   private int topSwitchCounter = 0;
   public ChangeModeToIntakeCommand(){

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
      Constants.modeID = Constants.INTAKE_MODE_ID;
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










































