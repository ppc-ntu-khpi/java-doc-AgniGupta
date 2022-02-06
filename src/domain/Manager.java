package domain;
/**
 * Менеджер
 */
public class Manager extends Employee {

    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }
    /**
     * Робітники менеджера
     */
    private Employee[] employees;
    
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * Встановлення робітників
     * @param employees 
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * Повернення робітників
     * @return 
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
