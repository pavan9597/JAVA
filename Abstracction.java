abstract class Addition {
 
abstract int add(int a, int b);

public int subtract(int a, int b) {

return a-b;
}

}
 
public class Abstracction extends Addition

{

public int add(int a, int b) {

return a+b;

}

public static void main(String[] args) {

Addition m = new Abstracction();

System.out.println(m.add(10,20));

System.out.println(m.subtract(10,20));

}

}

