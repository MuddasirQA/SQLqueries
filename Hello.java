package anotherpackage;

public class Hello {


    public static void main(String[] args) {


        Results.displayPercentage(Results.displayResults(40, 100, 150));
        Results.displayPercentage(290);


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static class Results {


        int phys;
        int chem;
        int bio;
        int total;
        int percentage;

        public static int displayResults(int chem, int bio, int phys) {
            int total = chem + bio + phys;
            System.out.println("This person scored " + chem + " In Chemistry, " + bio + " In Bio, and " + phys + " in physics");
            System.out.println("Total result: " + total);


            return total;
        }

        public static int displayPercentage(int score) {

            return score * 100 / 450;

        }


    }

}
