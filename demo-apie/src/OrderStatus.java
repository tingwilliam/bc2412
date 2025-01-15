public enum OrderStatus {
  PAID(1), READY_FOR_SHIP(2), DELIVERING(3), DELIVERED(4),;


  private int value;

  private OrderStatus(int value){
    this.value = value;
  }


  //DELIVED.next( -> null)
  public OrderStatus next() {
    for (OrderStatus o : values()) {
      if (o.value == this.value +1)
      return o;
    }
    return null;
  }
  public static void main(String[] args) {
    System.out.println(OrderStatus.PAID.next());
    System.out.println(OrderStatus.DELIVERED.name());

    System.out.println(OrderStatus.valueOf("PAID") == OrderStatus.PAID); //true


}
}
