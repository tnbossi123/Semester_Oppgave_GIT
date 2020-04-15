package sample;

// Person
public class Person {
    String name;
    Dato age;
    String email;
    String phoneNumber;

    public Person(String name, Dato age, String email, String phoneNumber){
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

    public Dato getAge() {
        return age;
    }

    public void setAge(Dato age) {
        this.age = age;
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

    int kundeId;

    public Customer(String name, Dato age, String email, String phoneNumber, int kundeId){

        super(name, age, email, phoneNumber);
        this.kundeId = kundeId;

    }

    public int getKundeId() {
        return kundeId;
    }

    public void setKundeId(int kundeId) {
        this.kundeId = kundeId;
    }

}

// Admin user
class Admin extends Person {

    int adminId;

    public Admin(String name, Dato age, String email, String phoneNumber, int adminId){

        super(name, age, email, phoneNumber);
        this.adminId = adminId;

    }

}



