import java.io.Serializable;

public class member implements Serializable {

    private String name;
    private String surname;
    private int password;
    private int ID;
    private int citycode;
    private String letters;
    private int fourint;
    private int parkinglot;

    public int getParkinglot() {
        return parkinglot;
    }

    public void setParkinglot(int parkinglot) {
        this.parkinglot = parkinglot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCitycode() {
        return citycode;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public int getFourint() {
        return fourint;
    }

    public void setFourint(int fourint) {
        this.fourint = fourint;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

}
