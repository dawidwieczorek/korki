public class Person {

    private String firstName;

    private String lastName;

    private boolean male;

    private Integer age;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, boolean male, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.male = male;
        this.age = age;
    }

    public Person() {
        this.firstName = "Homer";
        this.lastName = "Wieczorek";
        this.male = false;
        this.age = 56;
    }

    public boolean isLegalAge() {
        return age > 18;
    }
}
