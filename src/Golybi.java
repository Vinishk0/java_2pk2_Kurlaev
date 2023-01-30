import java.util.Date;

public class Golybi extends Animal { // extends - расширять
    Food food = Food.GRASS;
    Env env = Env.GROUND;

//    public Turtle() {
//        super: ();
//    }

    public Golybi(String name, Date dateB, Env env, Food food) {
        super(name, dateB, env, food);
    }

    @Override
    public void move() {
        System.out.println(this.name + " полетела");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " поела");
    }
}