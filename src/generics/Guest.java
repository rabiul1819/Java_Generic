package generics;

public class Guest {
    public static void main(String[] args) {

        Glass <Juice> g = new Glass <Juice>();
        Juice juice = new Juice();
        g.liquid = juice;

        Glass<Water>waterGlass = new Glass<Water>();
        waterGlass.liquid = new Water();

        //retrieve
        Juice j =  g.liquid;

        Water water = waterGlass.liquid;

    }
}
