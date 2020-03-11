/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.WheelOfFortuneSubsystem;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj.I2C;
import com.revrobotics.ColorSensorV3;
import edu.wpi.first.wpilibj.Talon;
import com.revrobotics.ColorMatch;
import com.revrobotics.ColorMatchResult;

public class GoToGivenColorCommand extends CommandBase {
    private boolean finished;
    private ColorMatch m_matcher = RobotContainer.m_wheelOfFortuneSubsystem.getColorMatcher();

    public GoToGivenColorCommand() {
        addRequirements(RobotContainer.m_wheelOfFortuneSubsystem);

    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        finished = false;
        m_matcher.addColorMatch(Constants.WHEEL_BLUE);
        m_matcher.addColorMatch(Constants.WHEEL_RED);
        m_matcher.addColorMatch(Constants.WHEEL_GREEN);
        m_matcher.addColorMatch(Constants.WHEEL_YELLOW);
        m_matcher.addColorMatch(Constants.WHEEL_WHITE);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {

        String gameData;
        Color givenColor;
        gameData = DriverStation.getInstance().getGameSpecificMessage();
        if (true/*gameData.length() > 0*/) {
            switch ('Y'/*gameData.charAt(0)*/) {
                case 'B':
                    // Blue case code
                    givenColor = Constants.WHEEL_BLUE;
                    break;
                case 'G':
                    // Green case code
                    givenColor = Constants.WHEEL_GREEN;
                    break;
                case 'R':
                    // Red case code
                    givenColor = Constants.WHEEL_RED;
                    break;
                case 'Y':
                    // Yellow case code
                    givenColor = Constants.WHEEL_YELLOW;
                    break;
                default:
                    // This is corrupt data
                    givenColor = Color.kBlack;
                    break;
            }
        } 
        else {
            // Code for no data received yet
            givenColor = Color.kBlack;
        }
        
        ColorMatchResult colorResult = m_matcher.matchClosestColor(RobotContainer.m_wheelOfFortuneSubsystem.getColor());
        if (givenColor == colorResult.color) {
            RobotContainer.m_wheelOfFortuneSubsystem.stopWheel();
            finished = true;
        } else {
            RobotContainer.m_wheelOfFortuneSubsystem.turnWheel();
        }

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
