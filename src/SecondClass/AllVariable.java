package SecondClass;

public class AllVariable {
    long mobile;
    static String departmentName = "CSE";

    public void printIdcard(){
        String Name = "Md Sagar Hossen";
        int ID = 171151504;
        String advisorName = "Tohari"; //Local Variable
        System.out.println("My name is "+Name+".\nMy id is: "+ ID+"\nMobile: "+mobile);
        System.out.println("Advisor Name: "+advisorName);
    }

    public void markSheet(){
        String Occupation = "Student"; //Local Variable
        int mark= 80; //Local Variable
        System.out.println("Total Mark: "+mark);
        System.out.println("Occupation: "+Occupation);

    }
    public static void main(String[] args) {
        AllVariable printid = new AllVariable(); // Object creation
        printid.mobile=1252;
        printid.printIdcard(); //Call Method
        printid.mobile=1253;
        printid.printIdcard(); //Call Method
        System.out.println("Department Name: "+AllVariable.departmentName); //Call Static Variable
        AllVariable marksheet = new AllVariable(); //Object Creation
        marksheet.markSheet(); //Call Method


    }
}


