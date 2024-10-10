
 import java.util.Scanner;

 public class lota {

  public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
double[] notas = new double[5];

for (int i=0; i <5; i++){
    System.out.println("digite a nota");
    notas[i] = scanner.nextDouble();
}
System.out.println("imprimindo os elementos do vertor");
for (int i =0; i<5; i++){
    System.out.println(notas[i]);
}
scanner.close();
  }
}
