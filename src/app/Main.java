package app;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Diego Cordillera",
                "Software Engineer", "diego@gmail.com",
                "+12345678910", 28);

        System.out.println("Full Name: " + employee.getFullName()
        + "\nPosition: " + employee.getPosition()
        + "\nEmail: " + employee.getEmail()
        + "\nPersonal Phone number: " + employee.getPhoneNumber()
        + "\nAge: " + employee.getAge());

        Car car = new Car();
        System.out.println("\nCar is starting... ");
        car.start();
    }
}
