/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class LiftSystemLvl1Command extends Command {
  private static final double level1 = 0;

  public LiftSystemLvl1Command() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.liftSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.liftSubsystem.moveTowardsPosition1();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    double position1 = 0;
    if  (level1 < position1+0.1 && level1 > position1-0.1)
       return true;
    else
      return false;

  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.liftSubsystem.liftStop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
