package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class LauncherSubsystem extends SubsystemBase{
    private static final Talon conveyorTalon = new Talon(Constants.CONVEYOR_BELT_MOTOR_ID);
    private static final Talon rightFlyTalon = new Talon(Constants.RIGHT_FLY_WHEEL_MOTOR_ID); 
    private static final Talon leftFlyTalon = new Talon(Constants.LEFT_FLY_WHEEL_MOTOR_ID); 
    private static final Talon tiltTalon = new Talon(Constants.TILT_MOTOR_ID);
    private static final Servo lockTiltServo = new Servo(Constants.LOCK_TILT_SERVO_ID);
   


    public LauncherSubsystem(){
        

    }
    //TiltUp depending on how we make the system will do different things.    
    /*
    Locked System: if the system is based on 3 possible positions for the cannon TiltUp will cycle upward

    Free System: if the system is based completely on user input and the conveyor can travel with it then 
    it will be used to freely move the whole cannon structure upward. 
    */

    public void TiltUp(){
        // as long as its not as high as it can go
        if(Constants.modeID != 2){

        }
        else
        {
            //check limit switches for true on the switch that is above the current mode. 
        }

    }
    public void TiltDown(){


    }
    
    public void CannonFire(){



    }

    public void CannonSuck(){


    }

    public void CannonWheelOfFortune(final int rotations){
        //get the first color seen, then rotate slightly slower than polling rate of color sensor
        //once the color is seen X times stop the flywheels

    }
    public void CannonWheelOfFortune(final String color){
        switch(color){
            //if color is blue
            case "blue":
            break;
            //if color is red
            case "red":
            break;
            //if color is yellow
            case "yellow":
            break;
            //if color is green
            case "green":
            break;
        }
            

        
    }




}