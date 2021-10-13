package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;

public class IntakeSubsystem {
  PWMVictorSPX intakeMotor = new PWMVictorSPX(4); 

  public void intakeMove(){
    intakeMotor.set(0.5);
  }
  public void intakeStop(){
    intakeMotor.set(0);
  }
  public void intakeReverse(){
    intakeMotor.set(-0.5);
  }

}