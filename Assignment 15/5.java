import java.io.*;
class GetSet {
 
    // Member variable of this class
    private String name;
    public String getName() { return name; }
    public void setName(String N)
    {
        this.name = N;
    }
}
class Main{
    public static void main(String[] args)
    {
        GetSet obj = new GetSet();
        obj.setName("Geeks for Geeks");
        System.out.println(obj.getName());
    }
}