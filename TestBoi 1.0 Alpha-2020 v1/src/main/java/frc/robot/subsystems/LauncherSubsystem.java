




package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;



public class LauncherSubsystem extends SubsystemBase{

    private static final Talon rightFlytalon = new Talon(Constants.RIGHT_FLY_WHEEL_MOTOR_ID); 
    private static final Talon leftFlytalon = new Talon(Constants.LEFT_FLY_WHEEL_MOTOR_ID); 
    private static final Talon tiltTalon = new Talon(Constants.TILT_MOTOR_ID);
    private static final Servo lockTiltServo = new Servo(Constants.LOCK_TILT_SERVO_ID);



    public LauncherSubsystem(){


    }




}