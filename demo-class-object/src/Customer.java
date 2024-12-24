public class Customer { //Person"has name, age
  private long id;
  private Order[] orders;


  //constructor
  //1. Normally Customer can be created without order.
  //public Customer(long id, Order[] order) { //String name, int age
    //this.id = id;
    //this.order = order;
    //this.name = name;
    //this.age = age;
  //}
///////////////////////////////////////////////////////////
  public Customer(long id) {
    this.id = id;
    this.orders = new Order[0];
  }

  // order id -> item[]
  public Item[] getItem(long orderId) {

  }

  
  // totalOrderAmount by order id
  public double getTotalOrderAmount(long orderId) {

  }

  // isVIP() -> 100_000 (total amount af all orders)
  public boolean isVip() {

  }
////////////////////////////////////////////////////////////////
  //2. Customer can place order after become creating the customer account.
  public void placeOrder(Order order) {
    Order[] newOrders = new Order[this.orders.length +1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i]; 
    }
    newOrders[newOrders.length-1] = order;
    this.orders = newOrders;
  } 

  // getOrders

    public static void main(String[] args) {
      //Order[] orders = new Order[3];
      //orders[0] = new Order();
      //orders[1] = new Order();
      //orders[2] = new Order();

    Customer c1 = new Customer(1);
    c1.placeOrder(new Order());
    c1.placeOrder(new Order());
    c1.placeOrder(new Order());
    }
  
}
