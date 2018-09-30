import java.time.LocalDate;

public class Variables {

    public static void main(String[] args) {
        // declaring a variable of type ArtihmeticOperation using constructor
        ArtihmeticOperation operation1  = new ArtihmeticOperation(5, 7);
        ArtihmeticOperation operation2  = new ArtihmeticOperation(50, 80);

        // type name = value;
        int value = 10;
        Integer value1 = new Integer(10);

        boolean test = true;
        Boolean test1 = new Boolean(true);

        LocalDate date = LocalDate.now();

        String name = "Monika";
        String name1 = new String("Monika");

        // assigning result of calculation to variable result
        int result1 = operation1.calculateSum();

        int resultOfSum = operation2.calculateSum();
        int resultOfSubstraction = operation2.calculateSubstraction();
        int resultOfMultiplication = operation2.calculateMultiplication();

        System.out.println("Hello world");
        System.out.println("Result1: " + result1);
        System.out.println("Result2 Sum: " + resultOfSum);
        System.out.println("Result2 Substraction: " + resultOfSubstraction);
        System.out.println("Result2 Multiplication: " + resultOfMultiplication);
    }
}
