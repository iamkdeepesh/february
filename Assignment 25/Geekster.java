import java.io.*;
  
class Geekster {
    int num;
    String name;
  
    // this would be invoked while an object
    // of that class is created.
    Geekster() { System.out.println("Constructor called"); }
}
  
class GFG {
    public static void main(String[] args)
    {
        // this would invoke default constructor.
        Geekster geek1 = new Geekster();
  
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(geek1.name);
        System.out.println(geek1.num);
    }
}