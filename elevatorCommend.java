public interface elevatorCommend {
public void elevatorGoUp () {
    elevatorSubSystem.setSpeed(0.6);
    int i = 0;
    while (elevatorSubSystem.position < elevatorSubSystem.MAX_HEIGHT) {
        i++;
        System.out.println("the cycle number is: " + i);
        System.out.println("the time is: " + i*0.02);
        elevatorSubSystem.setposition(speed, elevatorSubSystem.position)
        System.out.println("the posision is: " + position);
    }
}
public static void main (String[] args) {
    elevatorCommend.elevatorGoUp;
}
}
