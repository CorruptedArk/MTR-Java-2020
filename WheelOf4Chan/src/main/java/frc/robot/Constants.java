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
    public static final double SCALE_MAX = 1;
    public static final double SCALE_INTERVAL = 0.1;

    // Variable for the speed of the tilt of the arm of the robot.
    public static final double TILT_SPEED = .75;

    
    public static final int INTAKE_MODE_ID = 0;
    public static final int LAUNCH_MODE_ID = 1;
    public static final int WHEEL_OF_FORTUNE_MODE_ID = 2;


    // Motor IDs are here for drive. //
    public static final int RIGHT_MOTOR_ID = 9;
    public static final int LEFT_MOTOR_ID = 8;

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
    public static final int CAMERA_ID_1 = 0;
    public static final int CAMERA_ID_2 = 1;


    // Driver IDs are here. //
    public static final int PILOT_ID = 0;
    public static final int ARTILLERY_ID = 1;

    // Constants for the Axis on the controller.
    public static final int LEFT_X_AXIS = 0;
    public static final int LEFT_Y_AXIS = 1;
    public static final int LEFT_TRIGGER_AXIS = 2;
    public static final int RIGHT_TRIGGER_AXIS = 3;
    public static final int RIGHT_X_AXIS = 4;
    public static final int RIGHT_Y_AXIS = 5;
    public static final int D_PAD = 6;

    //Variables for Xbox Controller buttons
    public static final int XBOX_A = XboxController.Button.kA.value;
    public static final int XBOX_B = XboxController.Button.kB.value;
    public static final int XBOX_X = XboxController.Button.kX.value;
    public static final int XBOX_Y = XboxController.Button.kY.value;

    public static final int XBOX_LBumper = XboxController.Button.kBumperLeft.value;
    public static final int XBOX_RBumper = XboxController.Button.kBumperRight.value;

    public static final int XBOX_LStickButton= XboxController.Button.kStickLeft.value;
    public static final int XBOX_RStickButton = XboxController.Button.kStickRight.value;

    public static final int XBOX_Start = XboxController.Button.kStart.value;
    public static final int XBOX_Select = XboxController.Button.kBack.value; 
    
    


}
