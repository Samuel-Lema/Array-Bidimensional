package arraybidimensional;

import javax.swing.JOptionPane;

public class ArrayBidimensional {
    
    
    
    public static void main(String[] args) {
        
        int[][] notas = new int[4][3];
        
        // Pide datos para crear el Array 2D
        MetodosArray.crear(notas);
        
        // Muestra el Array 2D
        MetodosArray.amosar(notas);
        
        // Recoge la media del Array 2D
        int[] media = MetodosArray.mediaAlumno(notas);
        
        // Muestra la media de cada Modulo en el Array 2D
        MetodosArray.mediaModulo(notas);
        
        // Muestra el Array 2D ya ordenado (Descendente) y con la Media de cada Alumno
        MetodosArray.amosar(MetodosArray.ordenDesc(notas), MetodosArray.ordenDesc(media));
    }
    
}
