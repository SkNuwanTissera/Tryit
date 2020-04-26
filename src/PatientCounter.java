import java.util.Scanner;

public class PatientCounter {
    public static void main(String[] args) {

        // create a scanner so we can read the command-line input
        Scanner input = new Scanner(System.in);

        //variable declaration
        String country = null;
        int patients = 0;
        String color = null;

        System.out.println("What is the country?");
        country = input.next();

        System.out.println("How many patients today?");
        patients = input.nextInt();

        System.out.println("Your country is "+country+ " and There are "+patients +" patients today.");

        // Program Logic
        if(patients>1000)
            color = "RED";
        else if (patients>500)
            color = "ORANGE";
        else if (patients>200)
            color = "YELLOW";
        else if (patients>100)
            color = "GREEN";
        else
            color = "LIGHT GREEN";

        // print the output
        System.out.println("Country name : "+country);
        System.out.println("Number of patients : "+patients);
        System.out.println("Warning color : "+color);


    }
}
