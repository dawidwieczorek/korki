public class Test {


    public static void main(String[] args) {
        DBConnection connection = new DBConnection("jdbc:mysql:mydatabase");

        Person dawid = new Person(args[0], args[0], args[0], args[0]);
        Person basia = new Person("Basia", "Wieczorek", false, 56);

        connection.save(dawid);
    }
}
