public class sixmonthmember extends member implements İnterface1 {
    private double cost=100;
    private final double discount = 10;

    public double getCost() {
        return cost;
    }

    public double getDiscount() {
        return discount;
    }

    public void CalculateCostSix() {
        System.out.println("Original Cost Value: " +getCost());
        cost = cost - ((cost * discount)/100);
        System.out.println("Discounted Cost Value: " +getCost());
    }

    @Override
    public void PrintTicket() {
        System.out.println("                ");
    }

    public void PrintInfo() {
        System.out.println("Customer's name: " +getName());
        System.out.println("Customer's surname: " +getSurname());
        System.out.println("Customer's ID: " +getID());
        System.out.println("Customer's license plate: " +getCitycode()+" "+getLetters()+" "+getFourint());
        System.out.println("Customer's special discount rate: %" +getDiscount());
        CalculateCostSix();
    }
}
