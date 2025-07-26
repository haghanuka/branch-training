public class elevatorSubsystem {
protected double MAX_SPEED=0.85 ;
protected double MAX_HEIGHT = 0.6;
protected double speed;
protected double position = 0.0;

protected double setspeed(double power){
speed = power*MAX_SPEED;
return speed;
}

protected double setposition(double currectspeed, double currectposition){
    double distance = currectspeed*0.02;
    position = currectposition+distance ;
    return position;
}

}