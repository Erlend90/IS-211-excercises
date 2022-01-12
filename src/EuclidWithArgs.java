public class EuclidWithArgs {
    public static void main(String[] args) {

        //sets up variables from method arguments
        int firstInt = Integer.parseInt(args[0]);
        int secondInt = Integer.parseInt(args[1]);
        int rem = 1;
        int k = 0;

        //swaps m and n if n is larger than m
        if (firstInt < secondInt) {
            int tempInt = firstInt;
            firstInt = secondInt;
            secondInt = tempInt;
        }

        //the algorithm
        while (rem > 0) {
            rem = firstInt % secondInt;
            k++;
            firstInt = secondInt;
            secondInt = rem;
        }
        //prints the time complexity
        System.out.println("Iterations before remainder is 0 = " + k);
    }
}

