
package employees;

public abstract class GeneralClassEmployee {

    private int id;
    private String name;
    private String EmpType;
    private Double BasicSalary;
    private double Houres;


    public GeneralClassEmployee(int id, String name, String EmpType, Double BasicSalary) {
        this.id = id;
        this.name = name;
        this.EmpType = EmpType;
        this.BasicSalary = BasicSalary;
    }

    public GeneralClassEmployee() {
    }
    public abstract double calBounsSalary();
    public abstract String EmpDetails();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpType() {
        return EmpType;
    }

    public void setEmpType(String EmpType) {
        this.EmpType = EmpType;
    }

    public Double getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(Double BasicSalary) {
        this.BasicSalary = BasicSalary;
    }

    public double getHoures() {
        return Houres;
    }

    public void setHoures(double Houres) {
        this.Houres = Houres;
    }    
}

