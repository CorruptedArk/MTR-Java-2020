
package frc.robot.subsystems;

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


  /**
   * Creates a new ColorSensorSubsystem.
   */
  //ColorSubsystem Constuctor//
  public WheelOfFortuneSubsystem() { 
    // The use of the left fly wheel ID is temporary
    flyWheelMotor = new Talon(Constants.LEFT_FLY_WHEEL_MOTOR_ID);
    
  }

  public Color getColor() {
    return m_colorSensor.getColor();
  }

  public void turnWheelToBlue(){

  }
  
  @Override
  public void periodic() {
    
    // This method will be called once per scheduler run
  }
}
