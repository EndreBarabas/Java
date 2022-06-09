package lib;
public class Classpractice {
  int x;

  public Classpractice(int y){
    x = y;
  }
  public static void main(String[] args){
    Classpractice app = new Classpractice(5);
    System.out.println(app.x);
    System.out.println(prints(15, 16));
  }

  public static Integer prints(Integer int1, Integer int2) {
    return int1+int2;
  }
}

