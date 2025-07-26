public class elevatorCommend {
public elevatorSubsystem elevatorSubsystem = new elevatorSubsystem();
public ledSubsystem ledSubsystem = new ledSubsystem();
public void elevatorGoUp () {
    elevatorSubsystem.setspeed(0.6);
    int i = 0;
    while (elevatorSubsystem.position < elevatorSubsystem.MAX_HEIGHT) {
        i++;
        System.out.println("the cycle number is: " + i);
        System.out.println("the time is: " + i*0.02);
        elevatorSubsystem.positionupdate(elevatorSubsystem.speed, elevatorSubsystem.position);
        System.out.println("the posision is: " + elevatorSubsystem.position);
    }
}

public void elevatorGoDownWithLED() {
    elevatorSubsystem.setspeed(-0.6);
    boolean ledState = false; 
    while (elevatorSubsystem.position > 0.0) {
        ledState = !ledState; 
        elevatorSubsystem.positionupdate(elevatorSubsystem.speed, elevatorSubsystem.position);
        System.out.println("the LED color is: " + ledSubsystem.getColor());
    }
}

public void elevatordownorup() {
    if (elevatorSubsystem.isup(elevatorSubsystem.position)) {
        for (int i = 0 ; i<50; i++) {
        elevatorSubsystem.setspeed(0);}
        elevatorSubsystem.setspeed(0);
    } else if (elevatorSubsystem.isdown(elevatorSubsystem.position)) {
        System.out.println("the elevator is down");
    } else {
        System.out.println("the elevator is in the middle");
    }
}

public void elevatorSequence() {
    System.out.println("Waiting for 1 second...");
    int cyclesForOneSecond = (int) (1 / 0.02); 
    for (int i = 0; i < cyclesForOneSecond; i++) {

    }
    System.out.println("Raising the elevator...");
    elevatorGoUp();
    System.out.println("Waiting for 2 seconds...");
    int cyclesForTwoSeconds = (int) (2 / 0.02); 
    for (int i = 0; i < cyclesForTwoSeconds; i++) {

    }
    System.out.println("Lowering the elevator...");
    elevatorGoDownWithLED();
}

public static void main (String[] args) {
    elevatorCommend elevatorCommend = new elevatorCommend();
    elevatorCommend.elevatorGoUp();
}

}

