/**
 * Created by vinoth on 17-Sep-17.
 * This program is to understand method overloading
 *
 */
public class CalcFeetAndInchesToCentimetres {
    public static void main(String[] args){
        System.out.println("In Main Method");
        double cms;
        double feet = 0;
        double inches = 12;
        if(feet == 0){
            System.out.println("Given Input: " + inches + " inches");
            cms = calcFeetAndInchesToCms(inches);
        }
        else{
            System.out.println("Given Input: " + feet + " feet and " + inches + " inches");
            cms = calcFeetAndInchesToCms(feet,inches);
        }

        if(cms != -1){
            System.out.println(feet + " feet and " + inches + " inches = " + cms + " cm.");
        }
        else{
            System.out.println("!!! ERROR !!!");
        }


    }

    public static double calcFeetAndInchesToCms(double feet, double inches){

        // Checking validity of inputs
        if (feet < 0 || inches > 12 || inches < 0){
            System.out.println("Invalid inputs.");
            return -1;
        }

        //Conversion logic
        double cms = (feet * 12 + inches) * 2.54;
        return cms;
    }

    public static double calcFeetAndInchesToCms(double inches){

        // Checking validity of inputs
        if (inches < 0){
            System.out.println("Invalid inputs.");
            return -1;
        }

        //Conversion logic
        double feet = (inches - (inches%12))/12;
        inches = inches%12;
        System.out.println("Derived Inputs: " + feet + " feet and " + inches + " inches");
        double cms = calcFeetAndInchesToCms(feet,inches);
        return cms;

    }
}
