package employees;
import java.util.ArrayList;
import java.util.Scanner;
public class Employees {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean flag;
        while (true) {            
    
            System.out.println(">>>Press 1 to Add Employee Details");
            System.out.println(">>>Press 2 to Search About Employee");
            System.out.println(">>>press 3 to Exit");
            int choice=input.nextInt();
        
        if(choice==1){    
        flag=false;    
        System.out.println("Please Enter Employee ID");
        int Id=input.nextInt();
         Scanner input1=new Scanner(System.in);
        System.out.println("Please Enter Employee Name");
        String Name=input1.nextLine();
         Scanner input2=new Scanner(System.in);
        System.out.println("Please Enter Employee Type");
        String EmpType=input2.nextLine();
        if(EmpType.equalsIgnoreCase("manager")||EmpType.equalsIgnoreCase("employee")||EmpType.equalsIgnoreCase("leader"))
        {
        flag=true;
        }
        if(!flag){
         System.out.println("Employee type not valid");
         continue;   
        }
         Scanner input3=new Scanner(System.in);
        System.out.println("Please Enter Employee Salary");
        Double Sal=input3.nextDouble();
         Scanner input4=new Scanner(System.in);
        System.out.println("Please Enter Employee Hours");
        Double hours=input4.nextDouble();
   
        GeneralClassEmployee GeneralEmp;             
        if(EmpType.equalsIgnoreCase("Manager")){
            GeneralEmp=new Manger();                  
            GeneralEmp.setId(Id);
            GeneralEmp.setName(Name);
            GeneralEmp.setEmpType(EmpType);
            GeneralEmp.setBasicSalary(Sal);
            GeneralEmp.setHoures(hours);
            
            SingleTonConnection stc=SingleTonConnection.getFileConnectionRef();
            stc.AddDataInFile(GeneralEmp.EmpDetails()+"#"+GeneralEmp.calBounsSalary());
            System.out.println("Additon Successfully");
            
        }
        
        if(EmpType.equalsIgnoreCase("Leader")){
            GeneralEmp=new Leader();              
            GeneralEmp.setId(Id);
            GeneralEmp.setName(Name);
            GeneralEmp.setEmpType(EmpType);
            GeneralEmp.setBasicSalary(Sal);
            GeneralEmp.setHoures(hours);
            
            SingleTonConnection stc=SingleTonConnection.getFileConnectionRef();
            stc.AddDataInFile(GeneralEmp.EmpDetails()+"#"+GeneralEmp.calBounsSalary());
            System.out.println("Additon Successfully");
        }

        if(EmpType.equalsIgnoreCase("Employee")){
            GeneralEmp=new Employee();                        
            GeneralEmp.setId(Id);
            GeneralEmp.setName(Name);
            GeneralEmp.setEmpType(EmpType);
            GeneralEmp.setBasicSalary(Sal);
            GeneralEmp.setHoures(hours);
            
            SingleTonConnection stc=SingleTonConnection.getFileConnectionRef();
            stc.AddDataInFile(GeneralEmp.EmpDetails()+"#"+GeneralEmp.calBounsSalary());
            System.out.println("Additon Successfully");
            
         }
        }
        else if(choice==2)
        {
           
           Scanner s=new Scanner(System.in);
           System.out.println("Please Enter Employee Name");     
           String Name=s.nextLine();
           SingleTonConnection stc=SingleTonConnection.getFileConnectionRef();
           ArrayList<String> Data=stc.GetDataFromFile();
            for (String row : Data) {
                String []arr=row.split("#");
                if(arr[1].equalsIgnoreCase(Name))
                {
                    System.out.println("Employee ID: "+arr[0]);
                    System.out.println("Employee Name: "+arr[1]);
                    System.out.println("Employee Type: "+arr[2]);
                    System.out.println("Employee Salary: "+arr[3]);
                    System.out.println("Employee Hours: "+arr[4]);
                    System.out.println("Employee Bouns: "+arr[5]);
                    break;
                }
            }
        }
        else if(choice==3)
        {
            break;
        }
      }
    }
}
