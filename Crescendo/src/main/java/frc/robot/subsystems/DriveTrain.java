// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  private WPI_TalonFX leftLeader;
  private WPI_TalonFX rightLeader;
  private WPI_TalonFX leftFollower;
  private WPI_TalonFX rightFollower;

  private DifferentialDrive drive;

  /** Creates a new DriveTrain. */
  public DriveTrain() {
    leftLeader = new WPI_TalonFX(1);
    rightLeader = new WPI_TalonFX(2);
    leftFollower = new WPI_TalonFX(3);
    rightFollower = new WPI_TalonFX(4);
    drive = new DifferentialDrive(leftLeader, rightLeader);

    leftFollower.follow(leftLeader);
    rightFollower.follow(rightLeader);

    rightLeader.setInverted(true);

    leftLeader.setBrakeMode(ControlMode.Brake);
    rightLeader.setBrakeMode(ControlMode.Brake);
    leftFollower.setBrakeMode(ControlMode.Brake);
    rightFollower.setBrakeMode(ControlMode.Brake);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void TankDrive(double leftSpeed, double rightSpeed){
    drive.tankDrive(leftSpeed, rightSpeed);
  }
}
