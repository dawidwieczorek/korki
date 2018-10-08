import java.math.BigInteger;
import java.sql.Connection;
import java.util.Scanner;

public class UsingArithmeticOperation {

    private Integer number;

    public Integer getNumber(){
        return number;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter first number: ");
//
//        Integer firstNumber = scanner.nextInt();
//
//        System.out.println("Enter second number: ");
//
//        //type name = value
//
//        Integer secondNumber = scanner.nextInt();

        // int numer = 10;
        //Integer numer;
        // numer = 10;
        Integer numer = 10;


        String name = "Dawid";
        String name1 = new String("Dawid");

        Integer a = 10;
        Integer b = 20;

        BigInteger c = new BigInteger("10");
        BigInteger d = new BigInteger("10");

        Integer result = a + b;
        BigInteger res = c.add(d);

        Integer result1 = a.compareTo(b);

        //ArtihmeticOperation test = new String();
        ArtihmeticOperation operation = new ArtihmeticOperation("operation1",1,1);


        //Integer c = new String("test");
        //Integer d = new ArtihmeticOperation("operation4",10, 20);

        //Integer result = c + d;

        Person basia = new Person("Barbara", "Wieczorek", false, 20);
        Person dawid = new Person("Dawid", "Wieczorek", false, 30);
        Person jan = new Person("Jan", "Wieczorek", false, 40);

        System.out.println(basia.describePerson());
        System.out.println(dawid.describePerson());
        System.out.println(jan.describePerson());

        ArtihmeticOperation arOpWith10and20 = new ArtihmeticOperation("operation2",10, 20);

    }
}
