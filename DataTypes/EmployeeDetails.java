package DataTypes;

public class EmployeeDetails {
    public static void main(String[] args) {
        String name = "Raghunadha Reddy";
        int age = 35;
        double basicSalary = 45000.50;
        double bonus = 5000.75;

        double totalSalary = basicSalary + bonus;

        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Salary: ₹" + totalSalary);
    }
}

