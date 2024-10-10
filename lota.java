import java.util.Scanner;

 public class lota {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int cod = 1;
        while (cod < 100){
            System.out.println (cod +1) ;
            notas [cod]= scanner.nextDouble();
            cod++;
        }
        scanner.close();
        
    }
    
 }