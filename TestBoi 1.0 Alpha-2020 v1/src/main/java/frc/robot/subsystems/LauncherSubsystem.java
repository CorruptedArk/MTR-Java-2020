package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
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
    private static final DigitalInput topSwitch = new DigitalInput(Constants.TOP_TIER_LIMIT_SWITCH_ID);
    private static final DigitalInput middleSwitch = new DigitalInput(Constants.MIDDLE_LIMIT_SWITCH_ID);
    private static final DigitalInput bottomSwitch = new DigitalInput(Constants.BOTTOM_LIMIT_SWITCH_ID);
    private double motorOutput = 0.0; 


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
        if(Constants.modeID == Constants.LAUNCH_MODE_ID){

        }
        else
        {
            if(topSwitch.get())
            {
                /*
                NEVER set motors to 0, for some reason according to documentation, setting a motor to 0 makes it 
                permanently unusable, setting a max or min of 0 is the best alternative.  
                */
                Math.max(motorOutput, 0);
                tiltTalon.set(motorOutput);
            }else
            {
                tiltTalon.set(-2);
            }
            //check limit switches for true on the switch that is above the current mode. 
        }

    }
    public void TiltDown(){

        if(Constants.modeID == Constants.INTAKE_MODE_ID){

        }
        else
        {
            if(topSwitch.get())
            {
                Math.min(motorOutput, 0);
                tiltTalon.set(motorOutput);
            }else
            {
                tiltTalon.set(2);
            }
            //check limit switches for true on the switch that is above the current mode. 
        }


    }
    
    public void CannonFire(){
        double flySpeed = 5;

        rightFlyTalon.set(-flySpeed);
        leftFlyTalon.set(flySpeed);
    }
    public void CannonIdle(boolean previousMode){
        // previousMode is used to find which way it needs to be maxxed or minned to stop the motor without permanently stopping them
        // True is intake, false is launch
        double flySpeed = 0;

        if(previousMode){
            Math.min(flySpeed, 0);
            rightFlyTalon.set(flySpeed);

            Math.max(flySpeed, 0);
            leftFlyTalon.set(flySpeed);
        }
        if(!previousMode){
            Math.max(flySpeed, 0);
            rightFlyTalon.set(flySpeed);

            Math.min(flySpeed, 0);
            leftFlyTalon.set(flySpeed);
        }

    }


    public void CannonIntake(){
        double flySpeed = 5;

        rightFlyTalon.set(-flySpeed);
        leftFlyTalon.set(flySpeed);

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