public class elevatorSubsystem extends ledSubsystem  {
    protected double MAX_SPEED=0.85 ;
    protected double MAX_HEIGHT = 0.6;
    protected double speed;
    protected double position = 0.0;
    
    protected double setspeed(double power){
    speed = power*MAX_SPEED;
    return speed;
    }
    
    protected double positionupdate(double currectspeed, double currectposition){
        double distance = currectspeed*0.02; //מרחק=מהירות*זמן
        position = currectposition+distance;
        if (position>currectposition){
            oneColorBlink("red");
        }
        else if (position<currectposition){
            oneColorBlink("green");
        }
        return position;
    }
    
    protected boolean isup(double currectposition){
        boolean isup = currectposition>=MAX_HEIGHT;
        if (isup){
            position = 0.6;
            super.setColor("red");
        }
        return isup;
    }
    protected boolean isdown(double currectposition){
        boolean isdown = currectposition<=0;
        if (isdown){
        position = 0.0;
        super.setColor("green");
    }
        return isdown;
    }
    }