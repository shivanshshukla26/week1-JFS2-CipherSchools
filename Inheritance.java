import java.util.concurrent.FutureTask;

public class Inheritance {
    int width;
    int height;

    void display(String item){
        System.out.println(item +"Width "+width+" Height "+height);
    }

    public static void main(String[] args){
        Chair blue = new Chair();
        blue.show();

    }
}
class Chair extends Inheritance{
    void show(){
        width = 10;
        height=20;
        display("Chair");
    }
}
class Table extends Inheritance{
    void show(){
        width = 40;
        height=80;
        display("Table");
    }
}

class Almira extends Inheritance{
    void show(){
        width = 400;
        height=800;
        display("Table");
    }
}