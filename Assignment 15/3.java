class Base {

    public String name = "Base";
    protected int id = 5323;
    private boolean isDefined = true;
}

class Derived extends Base {

    public void info() {
        
        System.out.println("This is Derived class");
        System.out.println("Members inherited:");
        System.out.println(this.name);
        System.out.println(this.id);
        // System.out.println(this.isDefined);
    }
}

public class ProtectedMember {

    public static void main(String[] args) {
        
        Derived drv = new Derived();
        drv.info();
    }
}