/**
 * Input: arrivalTime = 15, delayedTime = 5
 * Output: 20 
 * Explanation: Reach at 15+5 = 20 (20:00).
 *
 */
public class JavaQuest11 {
  // You are given a positive integer arrivalTime denoting the arrival time of a
  // train in hours,
  // and another positive integer delayedTime denoting the amount of delay in
  // hours.
  // Calculate Delayed Arrival Time

    private int arrivalTime;
    private int delayedTime;

    public JavaQuest11 (int arrivalTime, int delayedTime) {
    this.arrivalTime = arrivalTime;
    this.delayedTime = delayedTime;
    }

    public int getArrivalTime() {
      return this.arrivalTime;
    }
    public int getDelayedTime() {
      return this.delayedTime;
    }

    public static int findDelayedArrivalTime (int arrivalTime, int delayedTime){
      if(arrivalTime + delayedTime <= 23) {
        return arrivalTime + delayedTime;
      //} else if (arrivalTime + delayedTime <=47) {
      //  return arrivalTime + delayedTime -24;
      } else {
        return ((arrivalTime + delayedTime) % 24);
      }
    }



  public static void main(String[] args) {
    int delayedArrivalTime1 = findDelayedArrivalTime(15, 5); // 20
    int delayedArrivalTime2 = findDelayedArrivalTime(23, 5); // 4
    int delayedArrivalTime3 = findDelayedArrivalTime(18, 6); // 0
    System.out.println(delayedArrivalTime1);
    System.out.println(delayedArrivalTime2);
    System.out.println(delayedArrivalTime3);
  }

  //public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    // code here ...

  //}
}