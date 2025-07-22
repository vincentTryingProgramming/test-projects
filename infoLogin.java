import java.util.*;
class infoLogin { 
    public static void main(String[] args) {

        Scanner dataIn = new Scanner(System.in);

        String firstName = askFirstname(dataIn);
        String middleName = askMiddlename(dataIn);
        String lastName = askLastname(dataIn);
        int age = askAge(dataIn);
        double contact = askContact(dataIn);
        String pAddress = askPaddress(dataIn);
        String cAddress = askCaddress(dataIn);

        displaySummary(firstName, middleName, lastName, age, contact, pAddress, cAddress);

        dataIn.close();

    }
    public static String askFirstname(Scanner dataIn) {
        System.out.print("First Name: ");
        return dataIn.nextLine();
    }
    public static String askMiddlename(Scanner dataIn) {
        System.out.print("Middle Name: ");
        return dataIn.nextLine();
    }
    public static String askLastname(Scanner dataIn) {
        System.out.print("Last Name: ");
        return dataIn.nextLine();
    }
    public static int askAge(Scanner dataIn) {
        System.out.print("Age: ");
        return dataIn.nextInt();
    }
    public static double askContact(Scanner dataIn) {
        System.out.print("Contact: ");
        return dataIn.nextDouble();
    }
    public static String askPaddress(Scanner dataIn) {
        dataIn.nextLine();
        System.out.print("Permanent Address: ");
        return dataIn.nextLine();
    }
    public static String askCaddress(Scanner dataIn) {
        System.out.print("Current Address: ");
        return dataIn.nextLine();
    }
    public static void displaySummary(String firstName, String middleName, String lastName, int age, double contact, String pAddress, String cAddress) {
        System.out.println("\nSummary");
        System.out.println("\nName: "+ firstName +"\s"+middleName+"\s"+lastName);
        System.out.println("Age: " + age);
        System.out.println("Contact: "+ contact);
        System.out.println("Permanent Address: "+pAddress);
        System.out.println("Current Address: "+ cAddress);
        System.out.println("\nThank you for your time!");

    }
}