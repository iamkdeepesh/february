public class Animal {
    private String voice = "meouww";
    public Animal() {
        System.out.println("Constructor running!");
    }
    public static void main(String [] args) {
        Animal animal = new Animal();
        animal.speak();
    }
    public void speak() {
        System.out.println(voice);
    }
}