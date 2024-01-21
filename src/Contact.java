public class Contact {
    private String LastName;
    private String FirstName;
    private String PhoneNumber;

    // getter et setter avec constructeur à PhoneBook
    public Contact(String LastName, String FirstName, String PhoneNumber) {
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.PhoneNumber = PhoneNumber;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }
    public String getFirstName(){
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
    this.PhoneNumber = PhoneNumber;
    }
   @Override
    public String toString() {

       return "Hola la casa";
   }
}
