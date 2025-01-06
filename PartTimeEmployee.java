public class PartTimeEmployee extends Employee {
    
    private int hoursWorked;
    private double amountPerHour;

    
    public PartTimeEmployee() {
    }

    
    public PartTimeEmployee(int id, String firstName, String lastName, String address, int hoursWorked, double amountPerHour) {
        super(id, firstName, lastName, address); 
        this.hoursWorked = hoursWorked;
        this.amountPerHour = amountPerHour;
    }

    
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getAmountPerHour() {
        return amountPerHour;
    }

    public void setAmountPerHour(double amountPerHour) {
        this.amountPerHour = amountPerHour;
    }

    
    public double computeSal() {
        return hoursWorked * amountPerHour;
    }

    
    public void showDetails() {
        System.out.println("ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Address: " + getAddress());
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Amount per Hour: " + amountPerHour);
        System.out.println("Total Salary: " + computeSal());
    }
}
