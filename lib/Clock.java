package lib;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Clock {
  public static void main(String[] args) {
    LocalTime time = LocalTime.now();
    System.out.println(time.toString());
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm:ss");
    String formattedDate = time.format(formatter);
    System.out.println("The current time is: " + formattedDate);
  }
}
