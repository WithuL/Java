//第三个任务
public class Test{

}


//第二个任务
class Phone{
    private int price;
    private String name;
    private String country;
    public Phone (){
        this.price = -1;
        this.name = "NO NAME";
        this.country = "No COUNTRY";
    }
    public Phone(int price,String name,String country) {
        this.price = price;
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
class Test1 {
    public static void main1(String[] args) {
        Phone phone = new Phone(2999,"OnePlus7","China");
        System.out.println(phone);
    }
}