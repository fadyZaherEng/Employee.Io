
package employees;

public class Manger extends GeneralClassEmployee{

    public Manger(int id, String name, String EmpType, Double BasicSalary) {
        super(id, name, EmpType, BasicSalary);
    }

    public Manger() {
    }


    @Override
    public double calBounsSalary() {
       return (((getBasicSalary()/30)/8)*getHoures())*5;
    }

    @Override
    public String EmpDetails() {
        return getId()+"#"+getName()+"#"+getEmpType()+"#"+getBasicSalary()+"#"+getHoures();
    }
    
}
