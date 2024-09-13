import java.util.Scanner;
public class CarTester{
    public Car addCar(){
        Car car = new Car();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the car's name: ");
        car.setCarName(scanner.nextLine());
        System.out.println("Please enter cars miles: ");
        car.setMilesDriven(scanner.nextInt());
        System.out.println("Please enter cars gallons: ");
        car.setGallonsUsed(scanner.nextInt());
        return car;
    }
    public static void main (String args[]){
        CarTester cartest = new CarTester();
        Car car1=cartest.addCar();
        System.out.println(car1.toString());
        System.out.println("----NEXT CAR------------------------------");
        Car car2=cartest.addCar();
        System.out.println(car2.toString());
    }
}

