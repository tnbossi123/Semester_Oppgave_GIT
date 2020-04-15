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

    //Getters
    public String getName() {
        return name;
    }

    public Dato getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

//Customer
class Customer extends Person{

    int customerId;

    public Customer(String name, Dato birthday, String email, String phoneNumber, int customerId){

        super(name, birthday, email, phoneNumber);
        this.customerId = customerId;

    }

    //Getter
    public int getCustomerId() {
        return customerId;
    }
}

// Admin user
class Admin extends Person {

    int adminId;

    public Admin(String name, Dato birthday, String email, String phoneNumber, int adminId){

        super(name, birthday, email, phoneNumber);
        this.adminId = adminId;

    }

    //Getter
    public int getAdminId() {
        return adminId;
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



// String out Admin

    @Override
    public String toString(){
        String ut = "Name: " + name + "\n" +
                    "Birthday: " + birthday + "\n" +
                    "Email: " + email + "\n" +
                    "Phone Number " + phoneNumber + "\n" +
                    "Admin ID: " + adminId;
    }

