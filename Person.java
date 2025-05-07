public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {

        this.name = name;

        this.age = age;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

    // Add this main method to test

    public static void main(String[] args) {

        Person p = new Person("Benedicta", 12);

        System.out.println("Name: " + p.getName());

        System.out.println("Age: " + p.getAge());

    }

} 