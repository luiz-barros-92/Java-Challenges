package sandBox;

public class Employee {
     private Integer id;
     private String name;
     private Double salary;
     
     public Employee() {        
     }
     
     public Employee(Integer id, String name, Double salary) {
         this.id = id;
         this.name = name;
         this.salary = salary;
     }
     
     public Integer getId(){
         return id;
     }
     
     public String getName(){
         return name;
     }
     
     public Double getSalary(){
         return salary;
     }
     
     public void increaseSalary(double percentage){
         this.salary += this.salary * (percentage / 100);
     }
     
     public String toString() {
 		return id + ", " + name + ", " + salary;
 } 

 }