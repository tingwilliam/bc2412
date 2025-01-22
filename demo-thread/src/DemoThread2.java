import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread2 {
  //private int x; // Primitive (Not thread-safe)
  private AtomicInteger x = new AtomicInteger(0); //Primitive (thread-safe)

  public int getX() {
    //return this.x;
    return this.x.get();
  }

  public void addOne() {
    //this.x++;
    this.x.getAndIncrement();
  }

  public static void main(String[] args) {
    DemoThread2 place = new DemoThread2();
    place.addOne();
    System.out.println(place.getX());

    DemoThread2 central = new DemoThread2();
    Runnable placeAddMillionTask = () -> {
      System.out.println("Thread ID: " + Thread.currentThread().getId());
      for (int i = 0; i < 1_000_000; i++) {
        central.addOne();
      }
    };

    Thread workerB = new Thread(placeAddMillionTask);
    workerB.start();

    Thread workerC = new Thread(placeAddMillionTask);
    workerC.start();

    try{
      workerB.join(); //main thread wait workerB complete the task
      workerC.join(); //main thread wait workerC complete the task
    } catch (InterruptedException e) {

    }

    System.out.println(central.getX()); //after using AtomicInteger 2000000
  }
}