import java.util.*;
abstract class Vehicle {int hours;Vehicle(int h){hours=h;}abstract double calculate();abstract String getType();}
class Bike extends Vehicle {Bike(int h){super(h);}double calculate(){return hours*10.0;}String getType(){return "BIKE";}}
class Car extends Vehicle {Car(int h){super(h);}double calculate(){return 30+(hours-1)*20.0;}String getType(){return "CAR";}}
class Truck extends Vehicle {Truck(int h){super(h);}double calculate(){return Math.max(hours*50.0,100.0);}String getType(){return "TRUCK";}}
public class CampusParkingChargeCalculator {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String type=sc.next();int h=sc.nextInt();Vehicle v;switch(type){case "BIKE":v=new Bike(h);break;case "CAR":v=new Car(h);break;default:v=new Truck(h);}double charge=v.calculate();System.out.printf("%s: %.2f%n",v.getType(),charge);total+=charge;}System.out.printf("Total: %.2f%n",total);sc.close();}}