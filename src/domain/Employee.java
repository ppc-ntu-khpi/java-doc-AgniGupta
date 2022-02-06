package domain;

/**
 * Опис співробітників
 */
public class Employee {
    /**
     * @return інформація про співробітника компанії
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= "
                + dept;
    }

    /**
     * ім'я співробітника
     */
    private String name;
    /**
     * посада
     */
    private String jobTitle;
    /**
     * ID співробітника
     */
    private int ID;
    /**
     * розряд
     */
    private int level;
    /**
     * відділ
     */
    private String dept;

    /**
     * 
     * @param name     ім'я співробітника
     * @param jobTitle посада 
     * @param level    розряд 
     * @param dept     відділ 
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням
     * @deprecated
     */
    public Employee() {
        ID = (int) (Math.random() * 1000);
    }

    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Метод, що повертає посаду співробітника
     * 
     * @return 
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Ім'я співробітника
     * 
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Розряд співробітника
     * 
     * @param level
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Розряд співробітника
     * 
     * @return 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Відділ співробітника
     * 
     * @return 
     */
    public String getDept() {
        return dept;
    }

    /**
     * Відділ співробітника
     * 
     * @param dept
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлення ім'я співробітника
     * 
     * @param name
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
