import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj liczbe a: ");
    int liczba1 = scanner.nextInt();
    System.out.print("Podaj liczbe b: ");
    int liczba2 = scanner.nextInt();
    System.out.print("Wynik: "+ (liczba1+liczba2));
    

  }
}