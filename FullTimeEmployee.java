class Employee {
    private int empId;
    private String name;

    public Employee() {
        this.empId = 0;
        this.name = "";
    }

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    private double basic;
    private double bonus;

    public FullTimeEmployee() {
        super();
        this.basic = 0.0;
        this.bonus = 0.0;
    }

    public FullTimeEmployee(int empId, String name, double basic, double bonus) {
        super(empId, name);
        this.basic = basic;
        this.bonus = bonus;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double computeSal() {
        return basic + bonus;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Basic Salary: " + basic);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + computeSal());
    }


 
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee(101, "John Doe", 50000, 10000);
        fte.showDetails();
    }

}