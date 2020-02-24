/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
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
    // Globally available Variables, Not Constants
    public static int modeID = 0;
    public static int lastModeID = 0; 

    //used to define the speed at which the robot will travel By DEFAULT this is 0.5
    public static double driveScale = 0.5;
    
    // Mode ID's
    public static final int INTAKE_MODE_ID = 0;
    public static final int LAUNCH_MODE_ID = 1;
    public static final int WHEEL_OF_FORTUNE_MODE_ID = 2;
    
    //Speed for cannon tilt
    public static final double tiltSpeed = 2.0;


    // Motor IDs are here for drive. //
    public static final int RIGHT_MOTOR_ID = 0;
    public static final int LEFT_MOTOR_ID = 1;

    // Fly wheel IDs are here.//
    public static final int LEFT_FLY_WHEEL_MOTOR_ID = 2;
    public static final int RIGHT_FLY_WHEEL_MOTOR_ID = 3;

    // IDs for conveyor belt and arm tilt motors here.//
    public static final int TILT_MOTOR_ID = 4;
    public static final int CONVEYOR_BELT_MOTOR_ID = 5; 

    // Limit Switch IDs go here//
    public static final int BOTTOM_LIMIT_SWITCH_ID = 0;
    public static final int MIDDLE_LIMIT_SWITCH_ID = 1;
    public static final int TOP_TIER_LIMIT_SWITCH_ID = 2;

    // Servo IDS //

    public static final int LOCK_TILT_SERVO_ID = 0;

    // Color Sensor ID // 
    public static final int COLOR_SENSOR_ID = 0;

    // Camera ID //
    public static final int CAMERA_ID = 0;


    // Driver IDs are here. //
    public static final int PILOT_ID = 0;
    public static final int ARTILLERY_ID = 1;

    //Variables for Xbox Controller buttons
    public static final int XBOX_A = XboxController.Button.kA.value;
    public static final int XBOX_B = XboxController.Button.kB.value;
    public static final int XBOX_X = XboxController.Button.kX.value;
    public static final int XBOX_Y = XboxController.Button.kY.value;

    public static final int XBOX_LBumper = XboxController.Button.kBumperLeft.value;
    public static final int XBOX_RBumper = XboxController.Button.kBumperRight.value;
    public static final int XBOX_LTrigger = XboxController.Axis.kLeftTrigger.value;
    public static final int XBOX_RTrigger = XboxController.Axis.kRightTrigger.value;

    public static final int XBOX_LStickXAxis = XboxController.Axis.kLeftX.value;
    public static final int XBOX_LStickYAxis = XboxController.Axis.kLeftY.value;
    public static final int XBOX_LStickButton= XboxController.Button.kStickLeft.value;
    
    public static final int XBOX_RStickXAxis = XboxController.Axis.kRightX.value;
    public static final int XBOX_RStickYAxis = XboxController.Axis.kRightY.value;
    public static final int XBOX_RStickButton = XboxController.Button.kStickRight.value;

    public static final int XBOX_Start = XboxController.Button.kStart.value;
    public static final int XBOX_Select = XboxController.Button.kBack.value; 
    
    


}
