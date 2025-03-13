interface  Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run fast");
    }
}


class Developper{
    public void devApps(Computer lap){
        lap.code();
    }
}
public class Demo{
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();


        Developper Lorys = new Developper();
        Lorys.devApps(lap);
    }
}