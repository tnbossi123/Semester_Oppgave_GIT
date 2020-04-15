package sample;

// Person
public class Person {
    String name;
    Dato birthday;
    String email;
    String phoneNumber;

    public Person(String name, Dato birthday, String email, String phoneNumber){
        this.name = name;
        this.alder = alder;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dato getBirthday() {
        return birthday;
    }

    public void setBirthday(Dato birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

//Customer
class Customer extends Person{

    int customerId;

    public Customer(String name, Dato birthday, String email, String phoneNumber, int customerId){

        super(name, birthday, email, phoneNumber);
        this.customerId = customerId;

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

}

// Admin user
class Admin extends Person {

    int adminId;

    public Admin(String name, Dato birthday, String email, String phoneNumber, int adminId){

        super(name, birthday, email, phoneNumber);
        this.adminId = adminId;

    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }



}

// String out Customer

    @Override
    public String toString(){
        String ut = "Name: " + name + "\n" +
                    "Birthday: " + birthday + "\n" +
                    "Email: " + email + "\n" +
                    "Phone Number " + phoneNumber + "\n" +
                    "Customer ID: " + customerId;
}



// String out Customer

    @Override
    public String toString(){
        String ut = "Name: " + name + "\n" +
                    "Birthday: " + birthday + "\n" +
                    "Email: " + email + "\n" +
                    "Phone Number " + phoneNumber + "\n" +
                    "Admin ID: " + adminId;
    }

