package Model;





import java.time.LocalDate;

public class Customer {
    private String name;
    private long panNumber;
    private LocalDate dateOfBirth;
    private String password;

    public String getName() {
        return name;
    }

    public long getPanNumber() {
        return panNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    private long phoneNumber;

    public Customer(String name,long panNumber,LocalDate dateOfBirth,long phoneNumber,String password)
    {
        this.name=name;
        this.panNumber=panNumber;
        this.dateOfBirth=dateOfBirth;
        this.phoneNumber=phoneNumber;

        this.password=password;
    }



}
