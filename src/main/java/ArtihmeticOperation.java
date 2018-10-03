public class ArtihmeticOperation {

    // variables
    private String nameOfOperation;
    private Integer a;
    private Integer b;

    // constructor
    public ArtihmeticOperation(String nameOfOperation, Integer a, Integer b) {
        this.nameOfOperation  = nameOfOperation;
        this.a = a;
        this.b = b;
    }

    // methods
    public Integer calculateSum() {
        return a + b;
    }

    public Integer calculateSubstraction() {
        return a - b;
    }

    public Integer calculateMultiplication() {
        return a * b;
    }
}
