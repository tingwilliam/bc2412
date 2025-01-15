public class LinkedList1 { // A list of integers
  private Node head;

  public LinkedList1() {
  }

  public void add(int value){ //add to tail
    if (this.head == null) {
      this.head = new Node(value);
      return;
    }
    Node first= head;
    while(first.next() !=null) {
      first = first.next();
    }
    first.setNode(new Node(value));
    }

public void remove() { //remove the head node.
  //10->20->30->40
  if(this.head == null)
  return;
  this.head = this.head.next();
  }


  public int size() {
    int count = 0;
    Node first = this.head;
    while(first !=null) {
    first = first.next();
    count++;
    }
    return count;
  }

  @Override
  public String toString() {
    Node first = this.head;
    String str = "LinkedList1[";
    while (first != null) {
      str += first.getValue() + ",";
      first = first.next();
    }
    return str.substring(0, str.length() - 1) + "]";
  }

  public static void main(String[] args) {

    LinkedList1 ll = new LinkedList1();
    System.out.println(ll.size()); //0
    ll.add(10);
    ll.add(20);
    System.out.println(ll.size()); //2
    ll.remove();
    System.out.println(ll.size()); //1
    ll.add(100);
    System.out.println(ll); //LinkedList[20,100]




  }
}
