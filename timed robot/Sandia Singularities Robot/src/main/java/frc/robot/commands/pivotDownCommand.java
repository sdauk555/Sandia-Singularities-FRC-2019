// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package frc.robot.commands;

// import edu.wpi.first.wpilibj.command.Command;
// import frc.robot.Robot;
// import java.util.concurrent.TimeUnit;

// public class pivotDownCommand extends Command {
// public static final boolean limitSwitchClosed = false;

//   public pivotDownCommand() {
//     // Use requires() here to declare subsystem dependencies
//     // eg. requires(chassis);
//     requires(Robot.pivotSubsystem);
//   }

//   // Called just before this Command runs the first time
//   @Override
//   protected void initialize() {
//     Robot.pivotSubsystem.pivotDown();
//   }

//   // Called repeatedly when this Command is scheduled to run
//   @Override
//   protected void execute() {
//   }

//   // Make this return true when this Command no longer needs to run execute()
//   @Override
//   protected boolean isFinished() {
//     try {
//       TimeUnit.SECONDS.sleep(1);
//       } catch (InterruptedException e) {}
//       return false;
//   }

//   // Called once after isFinished returns true
//   @Override
//   protected void end() {
//     Robot.pivotSubsystem.pivotStop();
//   }

//   // Called when another command which requires one or more of the same
//   // subsystems is scheduled to run
//   @Override
//   protected void interrupted() {
//     end();
//   }
// }
