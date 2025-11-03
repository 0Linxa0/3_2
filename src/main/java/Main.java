import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Podaj rozmiar");
    Scanner sk =new Scanner(System.in);
    int i = sk.nextInt();
    for(int x=1; x<=i; x++){
      if(x==1|| x==i){
      for(int y=1; y<=i; y++){
        System.out.print("*");
      }
      System.out.println();
      }
      else{
        for(int y=1; y<=i; y++){
          if(y==1||y==i){
          System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
      
    }}}
