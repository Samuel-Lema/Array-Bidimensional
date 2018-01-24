package arraybidimensional;

import javax.swing.JOptionPane;

public class MetodosArray {
    
    // Creo Array 2D
    
    public static void crear(int[][] notas){
        
        for(int f = 0; f < notas.length; f++){
           
            for(int c = 0; c < notas[f].length; c++){
                
                notas[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Nota: "));
            }
        }
    }
    
    // Muestra el Array 2D
    
    public static void amosar(int[][] notas) {
        
        System.out.println("\n<- Notas Alumno ->");
        
        for(int f = 0; f < notas.length; f++){
                
            System.out.print("Notas Alumno " + (f + 1) + ": ");
            
            for(int c = 0; c < notas[f].length; c++){
                
                System.out.print(notas[f][c] + " | ");
            }
            System.out.print("\n");
        }
    }
    
    // Muestra el Array 2D con Nota Media
    
    public static void amosar(int[][] notas, int[] media) {
        
        System.out.println("\n<- Notas Alumno Total ->");
        
        for(int f = 0; f < notas.length; f++){
                
            System.out.print("Notas Alumno " + (f + 1) + ": ");
            
            for(int c = 0; c < notas[f].length; c++){
                
                System.out.print(notas[f][c] + " | ");
            }
            System.out.print(media[f]);
            System.out.print("\n");
        }
    }
    
    // Hace la media del Array 2D
    
    public static int[] mediaAlumno(int[][] notas) {
        int acu;
        int[] media = new int[notas.length];
        
        System.out.println("\n<- Media Notas ->");
        for(int f = 0; f < notas.length; f++){
            acu = 0;
            
            for(int c = 0; c < notas[f].length; c++){
                
                acu += notas[f][c];
            }
            
            System.out.println("Media Alumno " + (f + 1) + ": " + acu / notas[f].length);
            media[f] = acu / notas[f].length;
        }
        
        return media;
    }
    
    // Hace la media de las columnas del Array 2D
    
    public static int[][] mediaModulo(int[][] notas){
        
        int[] media = new int[notas.length -1];
        int contador = 0;
        
        for(int f = 0; f < notas[0].length; f++){
            
            for(int c = 0; c < notas.length; c++){
                media[f] = media[f] + notas[c][f];
            }
            
            media[f] = media[f] / notas.length;
        }
        
        System.out.println("\n<- Media Modulos ->");
        
        for(int i = 0; i < media.length; i++){
            
            System.out.println("Media Modulo " + (i + 1) + ": " + media[i]);
        }
        
        return notas;
    }
    
    // Sobrecarga para Ordenar el Array 2D (Descendente)
    
    public static int[] ordenDesc(int[] orden) {
        
        for (int i = 0 ; i < orden.length - 1 ; i++) {
            int max = i;
 
            for (int j = i + 1 ; j < orden.length ; j++) {
                if (orden[j] > orden[max]) {
                    max = j;
                    
                }
            }
 
            if (i != max) {
                
                int aux = orden[i];
                orden[i] = orden[max];
                orden[max] = aux;
            }
        }
        
        return orden;
    }
    
    // Ordena el Array 2D (Descendente)
    
    public static int[][] ordenDesc(int[][] orden) {

        for(int f = 0; f < orden.length; f++) {

            int max = f; 
        
            for(int i = f; i < orden.length; i++) {
                
                if(sumRow(orden, i) > sumRow(orden, max)) {
                    
                    max = i;
                }
            }

            int[] aux = orden[f];
            orden[f] = orden[max];
            orden[max] = aux;
        }
        
        return orden;
    }
    
    // Funciona para la funcion OrdenDesc
    
    public static int sumRow(int[][] orden, int row) {
        int total = 0;

        for (int c = 0; c < orden[0].length; c++) {
            total += orden[row][c];
        }

        return total;
    }
    
}
