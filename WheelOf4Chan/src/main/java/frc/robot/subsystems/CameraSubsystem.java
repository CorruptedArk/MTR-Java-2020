package frc.robot.subsystems;

import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoSink;
 
public class CameraSubsystem extends SubsystemBase {

    private static CameraServer cameraServer;
    private static UsbCamera robotCamera1;
    private static UsbCamera robotCamera2;
    private static VideoSink frames;
        

    public void initCameras() {
        robotCamera1 = cameraServer.startAutomaticCapture(Constants.CAMERA_ID_1);
        robotCamera2 = cameraServer.startAutomaticCapture(Constants.CAMERA_ID_2);
        frames = cameraServer.getServer();
    }

    /*public void setUpCameraSource() {
        frames.setSource(robotCamera1);
    }
    */
    @Override
    public void periodic() {

    }
}




























