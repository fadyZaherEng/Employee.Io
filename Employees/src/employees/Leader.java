/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

public class Leader extends GeneralClassEmployee{

    public Leader(int id, String name, String EmpType, Double BasicSalary) {
        super(id, name, EmpType, BasicSalary);
    }

    public Leader() {
    }
        @Override
    public double calBounsSalary() {
       return (((getBasicSalary()/30)/8)*getHoures())*2;
    }

    @Override
    public String EmpDetails() {
        return getId()+"#"+getName()+"#"+getEmpType()+"#"+getBasicSalary()+"#"+getHoures();
    }
}
