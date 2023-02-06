package Package;

import java.sql.Array;
import java.sql.Statement;
import java.util.*;

public class Program {
    public static void main(String[] args){
        ArrayList<Integer> source = new ArrayList<Integer>();
        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();

        Random rnd = new Random();

        for(int i = 0; i < 50; i++){
            source.add(rnd.nextInt( -100, 100));
        }
        for(Integer i : source) {
            System.out.println(i);
            if (i < 0) {
                negative.add(i);
            } else if (i > 0){
                positive.add(i);
            }
        }
        Collections.sort(positive);
        Collections.reverse(positive);
        Collections.sort(negative);
        Collections.reverse(negative);
        for(Integer i : positive){
            System.out.print("Позя ");
            System.out.println(i);
        }
        for(Integer i : negative){
            System.out.print("Нига ");
            System.out.println(i);
        }

    }
    public void SplitArray(ArrayList<Integer> source, ArrayList<Integer> positive, ArrayList<Integer> negative) {


    }
}
