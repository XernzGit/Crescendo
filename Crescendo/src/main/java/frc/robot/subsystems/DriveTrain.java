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
    leftFollower.follow(leftLeader);
    rightFollower.follow(rightLeader);
    rightLeader.setInverted(true);
    rightFollower.setInverted(true);
    leftFollower.setNeutralMode(NeutralMode).break)






    nu
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void TankDrive(double leftSpeed, double rightSpeed){
    drive.tankDrive(leftSpeed, rightSpeed);
  }
}
