public class elevatorSubsystem {
protected double MAX_SPEED=0.85 ;
protected double MAX_HEIGHT = 0.6;
protected double speed;
protected double position = 0.0;

protected double setspeed(double power){
speed = power*MAX_SPEED;
return speed;
}

protected double positionupdate(double currectspeed, double currectposition){
    double distance = currectspeed*0.02;
    position = currectposition+distance ;
    return position;
}

protected boolean isup(double currectposition){
    boolean isup = currectposition>=MAX_HEIGHT;
    position = 0.6;
    return isup;
}
protected boolean isdown(double currectposition){
    boolean isdown = currectposition<=MAX_HEIGHT;
    position = 0.0;
    return isdown;
}
}