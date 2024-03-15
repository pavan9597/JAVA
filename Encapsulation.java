class studentDTO{

private String name;
 
private int DOB;

private String course;

private String department;

private String mentor;



public String getName(){

return name;

}
public void setNane(String name){
    this.name = name;
    
}

} 

public class Main {

public static void main(String[] args) {

StudentDTO one = new Student();

one.setName("pavan");

System.out.println(one.getName());



Student two  = new Student();

two.setName("meiy");

System.out.println(two.getName());




}