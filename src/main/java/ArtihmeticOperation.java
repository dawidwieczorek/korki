public class ArtihmeticOperation {

    // variables
    private Integer a;
    private Integer b;

    // constructor
    public ArtihmeticOperation(Integer a, Integer b) {
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
