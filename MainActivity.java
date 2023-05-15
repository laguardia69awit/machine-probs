//========== MACHINE PROBLEM 1 ========== Tao

// import java.util.Scanner;

// public class MainActivity {
//     public static void main(String[] args) throws Exception{

//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter ur name: ");
//         String n1 = scan.nextLine();
//         System.out.print("enter ur age: ");
//         int a2 = scan.nextInt();
//         scan.nextLine();
    
//         Tao random = new Tao(n1,a2);
//         System.out.println("your name is " + random.getName() + " and you are " + random.getAge() + "years old");
            
//         scan.close();
//         }
//     }

//========== MACHINE PROBLEM 2 ========== Animal

// import ClassPack.Animal;
// import java.util.Scanner;

// public class MainActivity {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Animal animal = new Animal("Dog", "Max", "Labrador");

//         System.out.println("Initial values:");
//         System.out.println("Type: " + animal.getType());
//         System.out.println("Name: " + animal.getName());
//         System.out.println("Breed: " + animal.getBreed());

//         System.out.print("\nnew type: ");
//         String newType = scanner.nextLine();
//         System.out.print("new name: ");
//         String newName = scanner.nextLine();
//         System.out.print("new breed: ");
//         String newBreed = scanner.nextLine();
 
//         animal.setType(newType);
//         animal.setName(newName);
//         animal.setBreed(newBreed);

//         System.out.println("\nThe new updated values:");
//         System.out.println("Type: " + animal.getType());
//         System.out.println("Name: " + animal.getName());
//         System.out.println("Breed: " + animal.getBreed());
//         scanner.close();
//     }
// }

//========== MACHINE PROBLEM 3 ========== Employee

// import ClassPack.Employee;
// import java.util.Scanner;

// public class MainActivity {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         Employee employee = new Employee("Luis Laguardia", "IT STUDENT SA NU", 100);

//         System.out.println("Initial values:");
//         System.out.println("Name: " + employee.getName());
//         System.out.println("Job Title: " + employee.getJobTitle());
//         System.out.println("Salary: " + employee.getSalary());

//         System.out.print("\nEnter new name: ");
//         String newName = scanner.nextLine();
//         employee.setName(newName);

//         System.out.print("Enter new job title: ");
//         String newJobTitle = scanner.nextLine();
//         employee.setJobTitle(newJobTitle);

//         System.out.print("Enter new salary: ");
//         double newSalary = scanner.nextDouble();
//         employee.setSalary(newSalary);


//         System.out.print("\nEnter number of attendance: ");
//         int attendance = scanner.nextInt();

//         employee.updateSalary(attendance);

//         System.out.println("\nNew updated values:");
//         System.out.println("Name: " + employee.getName());
//         System.out.println("Job Title: " + employee.getJobTitle());
//         System.out.println("Salary: " + employee.getSalary());

//         scanner.close();
//     }
// }

//========== MACHINE PROBLEM 4 ========== Circle

// import java.util.Scanner;
// import ClassPack.Circle;

// public class MainActivity {
//     public static void main(String[] args) {
//         Scanner enter = new Scanner(System.in);
//         System.out.print("Enter the radius of the circle: ");
//         double radius = enter.nextDouble();

//         Circle circle = new Circle(radius);

//         System.out.println("Area of the circle:");
//         for(int i=0; i<20; i++) {
//             System.out.print("-");
//         }
//         System.out.println("\n" + circle.getArea());

//         System.out.println("\nCircumference of the circle:");
//         for(int i=0; i<30; i++) {
//             System.out.print("*");
//         }
//         System.out.println("\n" + circle.getCircumference());

//         enter.close();
//     }
// }

//========== MACHINE PROBLEM 5 ========== TrafficLight

import ClassPack.TrafficLight;
import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {
        Scanner sccc = new Scanner(System.in);

        System.out.print("Enter the color of the traffic light: ");
        String color = sccc.nextLine();

        System.out.print("Enter the duration of the traffic light (in seconds): ");
        int duration = sccc.nextInt();

        TrafficLight trafficLight = new TrafficLight(color, duration);

        System.out.print("The traffic light status is: ");
        trafficLight.printStatus();

        sccc.close();
    }
}
