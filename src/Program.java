import java.util.Date;

public class Program {
    public static void main(String args[]) {
        Golybi golybi = new Golybi("Гуля", new Date(2023, 1, 1), Env.GROUND, Food.GRASS);
        Turtle turtle = new Turtle("ЧереПавел", new Date(2023, 1, 1), Env.GROUND, Food.GRASS);

        System.out.println(golybi.getName());
        System.out.println(golybi.getDateB());
    }
}
