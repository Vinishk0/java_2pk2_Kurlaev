import java.util.Date;

public class Turtle extends Animal { // extends - расширять
    Food food = Food.GRASS;
    Env env = Env.GROUND;

//    public Turtle() {
//        super: ();
//    }

    public Turtle(String name, Date dateB, Env env, Food food) {
        super (name, dateB, env, food);
    }

    @Override
    public void move() {
        System.out.println(this.name + " поползла");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " поела");
    }
}