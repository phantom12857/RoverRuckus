package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;


@TeleOp(name="Phantom Teleop",group="Teleop")
public class PhantomTeleop extends OpMode {
    PhantomConfig robot = new PhantomConfig();

    @Override
    public void init() {
        robot.init(hardwareMap);
    }

    @Override
    public void init_loop() {}

    @Override
    public void start() {}

    @Override
    public void loop() {

        double left;
        double right;
        double climb;

        left  = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;
        climb = -gamepad2.left_stick_y;

        robot.leftDrive.setPower(left);
        robot.rightDrive.setPower(right);

        robot.climbMotor.setPower(climb);
    }

    @Override
    public void stop() {}
}
