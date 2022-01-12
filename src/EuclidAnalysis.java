import java.util.ArrayList;
import java.util.Random;

public class EuclidAnalysis {
    public static void main(String[] args) {
        //sets up the max m number
        int mRange = Integer.parseInt(args[0]);

        //generates a random n
        Random random = new Random();
        int n = random.nextInt(mRange-1) + 1;

        //creates arraylist to store all results for time complexity of each computation
        ArrayList<Integer> kResults = new ArrayList<>();

        //initializes the first m value
        int m = 1;

        //while loop to run the algorithm for every m value within the 1 to m-max range
        while(m < mRange+1) {
            //sets up new variables to avoid the algorithm messing up how far through the cycle we have come,
            //as we need to change the variables around to run the algorithm. This way we always have control of
            //the current m and n, and the algorithm can do its thing on these other variables
            int firstInt = m;
            int secondInt = n;
            int rem = 1;
            int k = 0;
            m++;

            //the algorithm itself
            while (rem > 0) {
                rem = firstInt % secondInt;

                //this k is the number of cycles for the alorithm,or the time complexity
                k++;

                //swaps around the variables for the next cycle
                firstInt = secondInt;
                secondInt = rem;
            }
            //System.out.println("m = " + m + ", n = " + n + ", k = " + k);
            //adds results to arraylist
            kResults.add(k);

        }
        //adds together all the k's for calculation of average
        Integer totalK = 0;
        for (Integer value:kResults) {
            totalK += value;
        }
        //calculates average k
        double averageK = (float)totalK / kResults.size();

        //sets up equations for comparison
        double logN = Math.log(n);
        double formula = Math.log(n)*(12*Math.log(2)/Math.pow(Math.PI,2));

        //prints results
        System.out.println("m-range = "+ mRange);
        System.out.println("n = " + n);
        System.out.println("avg k = " + averageK);
        System.out.println("ln n = " + Math.log(n)  + " (% of actual k: " + logN*100/averageK + ")");
        System.out.println("ln(n)*(12*ln(2)/π2) = " + formula + " (% of actual k: " + formula*100/averageK + ")");
    }
}

