public class EuclidAnalysis {
    public static void main(String[] args) {
        int firstInt = Integer.parseInt(args[0]);
        int secondInt = Integer.parseInt(args[1]);
        int rem = 1;
        int k = 0;

        if (firstInt < secondInt) {
            int tempInt = firstInt;
            firstInt = secondInt;
            secondInt = tempInt;
        }
        while (rem > 0) {
            rem = firstInt % secondInt;
            k++;
            firstInt = secondInt;
            secondInt = rem;
        }
        System.out.println("Iterations before remainder is 0 = " + k);
    }
}

