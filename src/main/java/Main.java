import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины №" + (i + 1) + ": ");
            String name = scanner.nextLine();

            int speed;
            while (true) {
                System.out.println("Введите скорость машины №" + (i + 1) + ": ");
                speed = scanner.nextInt();
                if (speed > 0 && speed < 250) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Некоректная скороть машины, попробуй ещё раз");
                }
            }
            Car car = new Car(name, speed);
            cars.add(car);
        }

        Car winerCar = null;

        int maxDistance = 0;

        for (Car car : cars) {
            int distance = car.scoreKillometrs24();
            System.out.println("Машина: " + car.getName() + ", Скорость: " + car.getSpeed() + " км/ч" + " Проехала за 24 часа: " + distance);

            if (distance > maxDistance) {
                maxDistance = distance;
                winerCar = car;
            }
        }
        System.out.println("Победила машина: " + winerCar.name);
    }
}