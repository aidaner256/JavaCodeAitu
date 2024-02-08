public class task5 {

    public static void main(String[] args) {
        double[] pop = {25.3, 34.5, 25.2, 23.1, 21.6};
        String[] city = {"Jakarta", "Tokyo", "Seoul", "Delhi", "New York City"};
        int size = pop.length;
        //call func to get max index
        int maxind = max(pop, size);
        print(pop, city, size, maxind);
    }
    //func to print
    public static void print(double pop[], String[] city, int size, int maxind) {
        for (int i = 0; i < size; i++) {
            // this statment to avoid case: The population of Tokyo is 34.5 million people. 
            // While the most populous city of Tokyo has a population of 34.5 million people. 
            if (i != maxind) {
                System.out.println("The population of " + city[i] + " is " + pop[i] + " million people.");
                System.out.println("While the most populous city of " + city[maxind] + " has a population of " + pop[maxind] + " million people");
            }
        }
    }
    // func to find max index and from index get max population
    public static int max(double pop[], int size) {
        double maxnum = 0.0;
        int maxIndex = 0;
        // loop to find max 
        for (int i = 0; i < size; i++) {
            if (pop[i] > maxnum) {
                maxnum = pop[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
