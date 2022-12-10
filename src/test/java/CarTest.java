import org.junit.jupiter.api.Test;

public class CarTest {

    // Nested Class
    class Car{

        boolean ifTurnOn;
        boolean ifOpenDoor;
        double length;
        double width;
        String make;


        void turnOn() {
            System.out.println("Car is turned on.");
            ifTurnOn = true;
        }
        void turnOff() {
            System.out.println("Car is turned off.");
            ifTurnOn = false;
        }
        void openDoor() {
            System.out.println("The door is opened.");
            ifOpenDoor = true;
        }
        void closeDoor() {
            System.out.println("The door is closed.");
            ifOpenDoor = false;
        }
        void move(){
            if (!ifOpenDoor && ifTurnOn){
                System.out.println("Car is moving.");
            }
            else{
                System.out.println("Car is parked.");
            }
        }
    }
}
