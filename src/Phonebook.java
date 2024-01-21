import java.util.Scanner;

public class Phonebook {

    public static Scanner sc = null;
    public static void main(String[] args) {

        sc = new Scanner(System.in);

        String userLastName = getUserInput("Entrez votre nom de famille");
        String userFirstName = getUserInput("Entrez votre prénom");
        String userPhoneNumber = getUserInput("Entrez votre numéro de téléphone");
        /*
        System.out.println("Entrez un nom de famille: ");
        String userLastName = sc.nextLine();

        System.out.println("Entrez un prénom: ");
        String userFirstName = sc.nextLine();

        System.out.println("Entrez un numéro de téléphone: ");
        String userPhoneNumber = sc.nextLine();
        */

        //-------Factoriser en Méthode ligne 27----------


        Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber);

        System.out.println(userLastName);
        System.out.println(userFirstName);
        System.out.println(userPhoneNumber);
        System.out.println(newContact.toString());
        sc.close();
    }
    public static String getUserInput(String UserRequest) {

        System.out.println(UserRequest);
        return sc.nextLine();
    }
}