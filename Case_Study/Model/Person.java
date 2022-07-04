package Case_Study.Model;

public abstract class Person {
    private String name;
    private int birth;
    private String email;
    private int numberCMND;
    private int phoneNumber;
    private String gender;

    public Person(String name, int birth, String email, int numberCMND, int phoneNumber, String gender) {
        this.name = name;
        this.birth = birth;
        this.email = email;
        this.numberCMND = numberCMND;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberCMND() {
        return numberCMND;
    }

    public void setNumberCMND(int numberCMND) {
        this.numberCMND = numberCMND;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", birth=" + birth +
                ", email='" + email + '\'' +
                ", numberCMND=" + numberCMND +
                ", phoneNumber=" + phoneNumber +
                ", gender='" + gender + '\'' +
                '}';
    }

}
