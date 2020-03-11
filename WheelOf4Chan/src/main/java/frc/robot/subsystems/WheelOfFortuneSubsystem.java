
package frc.robot.subsystems;

import com.revrobotics.ColorMatch;
import com.revrobotics.ColorSensorV3;
import edu.wpi.first.wpilibj.Talon;
//import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj.I2C;




public class WheelOfFortuneSubsystem extends SubsystemBase {
    
    //This is supposed to match the port connection of the color sensor.//
  private final I2C.Port i2cPort = I2C.Port.kOnboard;
  private final Talon flyWheelMotor;
  private final ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);
  private final static ColorMatch colormatcher = new ColorMatch();

  /**
   * Creates a new WheelOfFortuneSubsystem.
   */
  // WheelOfFortuneSubsystem Constuctor
  public WheelOfFortuneSubsystem() { 
    // The use of the left fly wheel ID is temporary until the robot is the design we originally planned on it being.
    flyWheelMotor = new Talon(Constants.LEFT_FLY_WHEEL_MOTOR_ID);
  
  }
  public ColorMatch getColorMatcher(){
    return colormatcher;
  }

  public Color getColor() {
    return m_colorSensor.getColor();
  }

  public void turnWheel() {
    flyWheelMotor.setSpeed(Constants.FLY_WHEEL_SPEED);

  }

  public void stopWheel() {
    flyWheelMotor.setSpeed(0);
  }
  
  @Override
  public void periodic() {
    
    // This method will be called once per scheduler run
  }
}
