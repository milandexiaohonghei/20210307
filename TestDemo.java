import java.util.ArrayList;
import java.util.List;

class Animal {
    public String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public Animal(String name) {
        this.name = name;
    }
    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}
class Bird extends Animal {
    public int g = 15;


    public Bird(String name) {
        super(name);
        System.out.println(this.name);
    }
    public void fly() {
        System.out.println(this.name + "正在飞 ︿(￣︶￣)︿");
    }
}

class B {
    public B() {
        // do nothing
        //func();
        System.out.println("duanjiawei");
    }
    public void func() {
        System.out.println("B.func()");
    }
}
class D extends B {
    private int num = 1;
    public D(){
        System.out.println("duan");
    }

    @Override
    public void func() {

        System.out.println("D.func() " + num);
    }
}



public class TestDemo {
    public static void main(String[] args) {



        Animal bird = new Bird("fgfg");
        bird.name = "15";

        int a = 10;
        D d = new D();
        d.func();
        System.out.println(bird);

    }




}
