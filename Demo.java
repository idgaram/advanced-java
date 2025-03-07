class Car{

    public void playMusic(){
        System.out.println("playing music");
    }
}

abstract class AbstractCar extends Car{
    public abstract void drive();    

}

class Wagon extends AbstractCar{
    public void drive(){
        System.out.println("driving");
    }

}


public class Demo{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.playMusic();

        Wagon obj2 = new Wagon();
        obj2.drive();
        obj2.playMusic();




    }
}