/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode; 

/**
 * Add your docs here.
 * This makes the claw go up and down... woah...
 */
public class LiftSystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private static final WPI_TalonSRX liftmotor = new WPI_TalonSRX(RobotMap.liftMotor);
  private static final XboxController logitech2 = new XboxController(1);

  public void liftStop() {
    // Stops motor when finished
  }

  public double getCurrentPosition() {
    // get the saved current position
    return 0;
  }

  public void setCurrentPosition(double desiredPosition) {
    // make sure that position is valid
    // save it
  }

  public void moveTowardsPosition() {
    // set the motor to move towards the current position
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  //public double calcDiff(double curr, double des) {
  //  double diff = des - curr;
  //  return diff;
  //}

  // public double desiredPos(double des) {
  //   /* Convert rotations to distance
  //   double tickDistance = 0;
  //   encoder1.setDistancePerPulse(tickDistance);
  //   encoder2.setDistancePerPulse(tickDistance);
  //   double distance = encoder1.getDistancePerPulse();
  //   double level1Dist = 0;
  //   double level2Dist = 10*distance;
  //   double level3Dist = 20*distance;
  //   double level4Dist = 30*distance;
  //   */
  //   // Get desired distance from buttonz
  //   if (logitech2.getAButton() == true)
  //      return 0;
  //   else if (logitech2.getBButton() == true)
  //     return 10;
  //   else if (logitech2.getXButton() == true)
  //     return 20;
  //   else if (logitech2.getYButton() == true)
  //     return 30;
  //   else
  //     return currentLvl;
  // }

  //public double getCurrentLvl() {
  //  return currentLvl;
  //}
  // 
  //public void updateCurrentLvl(double diff) {
  //  double temp = currentLvl + diff;
  //  currentLvl = temp;
  //}
}
