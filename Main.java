import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word:");
    String word=scan.nextLine();
    
    int count = word.length();

    System.out.println(count);
    //Your code will return the length of the entered String
  }
}
