

import java.util.Random;

public class array3D {
    public static void main (String[]args){
        int [][][] array = new int [4][5][5];
        preencher(array);
        imprimir(array);
    }
    public static void preencher (int [][][] array){
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[i][j].length; k++){
                    array [i][j][k] = rand.nextInt(100);
                }

            }

        }
        
    }
    public static void imprimir (int [][][] array) {
        for (int i=0; i< array.length;i++){
            System.out.println("Tridimensional"+ i);
            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[i][j].length; k++){
                    System.out.printf("%02d", array [i][j][k]);
        }
        System.err.println();
    }
    System.err.println();
}

}
}
			