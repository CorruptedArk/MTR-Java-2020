/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // Motor IDs are here for drive. //
    public static final int RIGHT_MOTOR_ID = 0;
    public static final int LEFT_MOTOR_ID = 1;

    // Fly wheel IDs are here.//
    public static final int LEFT_FLY_WHEEL_MOTOR_ID = 2;
    public static final int RIGHT_FLY_WHEEL_MOTOR_ID = 3;

    // IDs for conveyor belt and arm tilt motors here.//
    public static final int TILT_MOTOR_ID = 4;
    public static final int CONVEYOR_BELT_MOTOR_ID = 5; 


    // Driver IDs are here. //
    public static final int PILOT_ID = 0;
    public static final int ARTILLERY_ID = 1;

    //Variables for Xbox Controller buttons NOTE: I do not know the actual button configuration all values are placeholder
    public static final int XBOX_A = XboxController.Button.kA.value;
    public static final int XBOX_B = 1;
    public static final int XBOX_X = 2;
    public static final int XBOX_Y = 3;

    public static final int XBOX_LBumper = 4;
    public static final int XBOX_RBumper = 5;
    public static final int XBOX_LTrigger = 6;
    public static final int XBOX_RTrigger = 7;

    public static final int XBOX_LStickXAxis = 8;
    public static final int XBOX_LStickYAxis = 9;
    public static final int XBOX_LStickButton= 10;
    
    public static final int XBOX_RStickXAxis = 11;
    public static final int XBOX_RStickYAxis = 12;
    public static final int XBOX_RStickButton = 13;
    
    public static final int XBOX_Start = 14;
    public static final int XBOX_Select = 15; //you may also know this as Back
    public static final int XBOX_Home = 16; //Don't know if you can actually map this one
    


}
