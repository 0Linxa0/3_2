import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Podaj rozmiar");
    Scanner sk =new Scanner(System.in);
    int i = sk.nextInt();
    for(int x=1; x<=i; x++){
      for(int y=1; y<=i; y++){
        System.out.print("*");
      }
      System.out.println();
    }}}
