package lib;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date {
  public static void main(String[] args) {
    LocalDateTime myObj1 = LocalDateTime.now();
    System.out.println("Before formatting: "+ myObj1);

    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy H:mm:ss");
    String formattedDate = myObj1.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);

    

  }
}
