package ptdat7;
import java.util.ArrayList;
import java.util.Scanner;

public class bankaccount233 {

    private String name;
    private int age;
    private String designation;
    private double salary;

    bankaccount233(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    // Create Employee
    static bankaccount233 createEmployee(Scanner sc) {

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        int age;

        do {
            System.out.print("Enter age (19-59): ");
            age = sc.nextInt();

            if (age < 19 || age > 59) {
                System.out.println("Age must be between 19 and 59.");
            }

        } while (age < 19 || age > 59);

        sc.nextLine();

        String designation;
        double salary;

        while (true) {

            System.out.println("\n1. Programmer");
            System.out.println("2. Manager");
            System.out.println("3. Tester");

            System.out.print("Choose designation: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    designation = "Programmer";
                    salary = 20000;
                    break;

                case 2:
                    designation = "Manager";
                    salary = 25000;
                    break;

                case 3:
                    designation = "Tester";
                    salary = 15000;
                    break;

                default:
                    System.out.println("Invalid designation!");
                    continue;
            }

            break;
        }

        System.out.println("\nEmployee created successfully!");

        return new bankaccount233(name, age, designation, salary);
    }

    // Display employee
    void display() {

        System.out.println("-------------------------");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Designation : " + designation);
        System.out.printf("Salary      : %.2f%n", salary);
        System.out.println("-------------------------");
    }

    // Increase salary
    void increaseSalary(Scanner sc) {

        System.out.print("Enter increase percentage (1-10): ");
        double percentage = sc.nextDouble();
        sc.nextLine();

        if (percentage >= 1 && percentage <= 10) {

            salary = salary + (salary * percentage / 100);

            System.out.println("Salary increased successfully!");

        } else {

            System.out.println("Percentage must be between 1 and 10.");
        }
    }

    // Find employee
    static bankaccount233 findEmployee(ArrayList<bankaccount233> employees,
                                 String name) {

        for (bankaccount233 e : employees) {

            if (e.name.equalsIgnoreCase(name)) {
                return e;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<bankaccount233> employees = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT =====");
            System.out.println("1. Create Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Increase Salary");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    bankaccount233 emp = createEmployee(sc);

                    employees.add(emp);

                    break;

                case 2:

                    if (employees.size() == 0) {

                        System.out.println("No employees available.");

                    } else {

                        System.out.println("\n===== EMPLOYEE LIST =====");

                        for (bankaccount233 e : employees) {
                            e.display();
                        }
                    }

                    break;

                case 3:

                    if (employees.isEmpty()) {

                        System.out.println("No employees available.");

                    } else {

                        System.out.print("Enter employee name: ");
                        String searchName = sc.nextLine();

                        bankaccount233 found = findEmployee(
                            employees,
                            searchName
                        );

                        if (found != null) {

                            found.increaseSalary(sc);

                        } else {

                            System.out.println("Employee not found.");
                        }
                    }

                    break;

                case 4:

                    System.out.println("Thank you!");

                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}


