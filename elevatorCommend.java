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

    boolean ledState = false; // LED state: false = off, true = on
    while (elevatorSubsystem.position > 0.0) {
        ledState = !ledState; // Toggle LED state
        elevatorSubsystem.positionupdate(elevatorSubsystem.speed, elevatorSubsystem.position);
        System.out.println("the LED color is: " + ledSubsystem.getColor());
    }
}

public static void main (String[] args) {
    elevatorCommend elevatorCommend = new elevatorCommend();
    elevatorCommend.elevatorGoUp();
}

}

