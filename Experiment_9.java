class ReservationThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                "Reservation Process : Ticket " + i + " Reserved"
            );
            try {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class StatusThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                "Status Check : Ticket " + i + " Confirmed"
            );
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ReservationThread reservation = new ReservationThread();
        StatusThread status =
            new StatusThread();
        Thread statusThread =
            new Thread(status);
        reservation.start();
        statusThread.start();
    }
}
