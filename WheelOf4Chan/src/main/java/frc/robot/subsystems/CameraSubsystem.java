package frc.robot.subsystems;

import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoSink;
 
public class CameraSubsystem extends SubsystemBase {

    private static CameraServer cameraServer;
    private static UsbCamera robotCamera;
    private static VideoSink frames;

public void initCamera() {
    robotCamera = cameraServer.startAutomaticCapture(Constants.CAMERA_ID);
    frames = cameraServer.getServer();
}

@Override
public void periodic () {

    }
}




























