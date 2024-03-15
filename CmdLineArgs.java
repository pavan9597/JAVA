public class CmdLineArgs{
public static void main(String[] args){

String name = args[0];
int age = Integer.parseInt(args[1]);


System.out.println(name + " is " + (age>=18 ? "eligible" : "Not eligible"));


if(age>=18) {
System.out.println(name + ",you are eligible to vote.");
}
else{
System.out.println(name + ",you are not eligible to vote."); 
}
}
} 
