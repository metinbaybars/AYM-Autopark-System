
public class ordinaryuser implements İnterface1{
    private int citycode;
    private String letters;
    private int fourint;
    private final int cost = 100;

    public int getcost() {
        return cost;
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


    @Override
    public void PrintTicket() {
        System.out.println("---------------------------------");
        System.out.println("| WELCOME TO THE A.Y.M. SYSTEMS |");
        System.out.println("|                               |");
        System.out.println("|         "+getCitycode()+" "+getLetters()+" "+getFourint()+"            |");
        System.out.println("|           "+getcost()+" TL              |");
        System.out.println("|                               |");
        System.out.println("|       Have a Nice Day!!       |");
        System.out.println("---------------------------------");
    }

    @Override
    public void PrintInfo() {
        System.out.println("           ");
    }
}
