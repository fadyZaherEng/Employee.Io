
package employees;


public class Employee extends GeneralClassEmployee{

    public Employee(int id, String name, String EmpType, Double BasicSalary) {
        super(id, name, EmpType, BasicSalary);
    }

    public Employee() {
    }

    @Override
    public double calBounsSalary() {
       return (((getBasicSalary()/30)/8)*getHoures());
    }

    @Override
    public String EmpDetails() {
        return getId()+"#"+getName()+"#"+getEmpType()+"#"+getBasicSalary()+"#"+getHoures();
    }
    
    
}
