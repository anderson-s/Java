
public class matriz {
    public static void main(String[] args) {
        int matriz[][] = new int[4][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 1;
            }
        }
    
           for (int i = 0; i < matriz.length; i++) {
            for (int c = 0; c < matriz[0].length; c++) {
               System.out.print(matriz[i][c]+"\t");
                
            }
            System.out.println("");
                }   

           
}
}
