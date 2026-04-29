public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello My name is "+name+" and i am "+age +" years old");
    }
}
