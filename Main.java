import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    for(int i=50;i<=100;i++)
      {
      if(i%2==1){System.out.println(i);}
      }
    System.out.println("Podaj liczbę :");
    int liczba;
    Scanner sc = new Scanner(System.in);
    liczba = sc.nextInt();
    if(liczba%2 == 0){System.out.println("liczba ta jest parzysta");}
    else{System.out.println("liczba ta jest nieparzysta");}
    sc.close();
  }
}