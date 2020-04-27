package sample;

// Person
public class Person {
    String name;
    String adress;
    String city;
    String zip;
    Dato birthday;
    String email;
    String phoneNumber;

    public Person(String name, String adress, String city, String zip, Date birthday, String email, String phoneNumber){
        this.name = name;
        this.adress = adress;
        this.city = city;
        this.zip = zip;
        this.alder = alder;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public Date getBirthday() {
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

    public Customer(String name, String adress, String city, String zip, Date birthday, String email, String phoneNumber, int customerId){

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

    public Admin(String name, String adress, String city, String zip, Date birthday, String email, String phoneNumber, int adminId){

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
                    "Adress: " + adress + "\n" +
                    "City: " + city + "\n" +
                    "Zip: " + zip + "\n" +
                    "Birthday: " + birthday + "\n" +
                    "Email: " + email + "\n" +
                    "Phone Number " + phoneNumber + "\n" +
                    "Customer ID: " + customerId;
}



// String out Admin

    @Override
    public String toString(){
        String ut = "Name: " + name + "\n" +
                    "Adress: " + adress + "\n" +
                    "City: " + city + "\n" +
                    "Zip: " + zip + "\n" +
                    "Birthday: " + birthday + "\n" +
                    "Email: " + email + "\n" +
                    "Phone Number " + phoneNumber + "\n" +
                    "Admin ID: " + adminId;
    }

