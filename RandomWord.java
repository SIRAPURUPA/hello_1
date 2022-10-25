import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord{

    public static void main(String[] args)
    {
       String champion = "";
        boolean flag = false;
       double counter =0.0;
       while(!StdIn.isEmpty())
       {
           counter++;
           flag = StdRandom.bernoulli(1/counter);
           if(!flag)
           {
               champion = StdIn.readString();
           }
       }
       StdOut.println("\n The Winner is: "+champion);

    }
}
