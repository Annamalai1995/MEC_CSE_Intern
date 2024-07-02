package Basic.OOPS;

public class sample {
    public int price;
    public String location;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        sample ss= new sample();
        ss.setPrice(1500);
        ss.setLocation("salem");
        System.out.println(ss.getPrice());
        System.out.println(ss.getLocation());
    }

}
