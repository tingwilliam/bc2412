import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item {
  private String name;
  private double price;
  private int quantity;

  // constructor
  public Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  // Constructor
  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity() {
    this.quantity++;
  }

  public double totalAmount() {
    //BigDecimal
    return this.quantity;
  }

  public static String getName(Item item) {
    return item.getName();
  }

  // instance method

  public double priceOfQuantity() {
    return BigDecimal.valueOf(this.quantity) //
        .multiply(BigDecimal.valueOf(this.price))
        .setScale(2, RoundingMode.HALF_DOWN)//
        .doubleValue();
  }

  public static void main(String[] args) {
      //Item[] items = new Items[3];
      //items[0] = new Item();
      //items[1] = new Item();
      //oitems[2] = new Item();

      Item i1 =new Item("apple", 3.0, 5);
      i1.priceOfQuantity();
      System.out.println(i1.priceOfQuantity());

    }


}
