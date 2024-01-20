package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int _tam;
        String _c;
        
        //Ingresar el tamaño de la matriz MxM
        do {
            System.out.print("Ingrese el tamaño de la matriz MxM (Minimo de 2):  ");
            _tam = sc.nextInt();
        } while (_tam < 2);
        System.out.print("Ingrese el carácter con el que se dibujara la matriz:  ");
        _c = sc.next();
        
        Tmatriz m = new Tmatriz(_tam, _c);
        
        System.out.println("Cmbio de prueba");
        System.out.println("Por si aca");
        //Triángulo A
        String[][] _tA = m.trianguloA();
        m.imprimirMatriz("Triángulo A:", _tA);

        //Triángulo B
        String[][] _tB = m.trianguloB();
        m.imprimirMatriz("Triángulo B:", _tB);

    }

}
