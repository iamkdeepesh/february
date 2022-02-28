class Person {

    public String name;
    private int age;

    public int getAge() {
        
        return this.age;
    }

    public void setAge(int age) {
        
        this.age = age;
    }
}

public class AccessModifiers {

    public static void main(String[] args) {

        Person p = new Person();
        p.name = "Jane";

        p.setAge(17);

        System.out.println(String.format("%s is %d years old",
                p.name, p.getAge()));
    }
}