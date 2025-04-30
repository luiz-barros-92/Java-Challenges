package salary;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;
    
    public Employee (String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }
    
    public String getName() {
        return name;
    }
    
    public double getGrossSalary() {
        return grossSalary;
    }
    
    public double getTax() {
        return tax;
    }

public double netSalary() {
    return this.grossSalary - this.tax;    
}

public void increaseSalary(double percentage) {
    this.grossSalary = this.grossSalary + (this.grossSalary * (percentage / 100));
    printNameAndSalary("Updated data: ");
}

public void printNameAndSalary(String nameSalary) {
    System.out.printf("%s%s, $ %.2f%n", nameSalary, this.getName(), this.netSalary());
}
}
