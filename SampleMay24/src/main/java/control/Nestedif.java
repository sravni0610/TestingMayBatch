package control;

public class Nestedif {

    public static void main(String args[]) {

        int age = 19;
        int weight = 48;

        if (age >= 18) {

            if(weight > 50){
                System.out.println("Eligible to donate blood");
            }
            else {
                System.out.println("under weight to donate");
            }

        }
        else {
            System.out.println("Ineligible age to donate");
        }

    }

}
