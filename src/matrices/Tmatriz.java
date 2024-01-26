package matrices;

public class Tmatriz {

    int tam;
    String c;

    public Tmatriz(int tam, String c) {
        this.tam = tam;                                 /*1*/  //ta
        this.c = c;                                     /*2*/  //ta
    }
//    Tiempo de inicialización el constructor
//    T = ta + ta
//    T = 2ta

    //Dibujar Triángulo A
    public String[][] trianguloA() {
        String[][] matriz = new String[tam][tam];       /*1*/  //ta
        int i = 0;                                      /*2*/  //ta
        while (i < tam) {                               /*3*/  //tam*tc + tc
            int j = 0;                                  /*4*/  //tam*ta
            while (j < tam) {                           /*5*/  //tam*tc + tc
                if (j <= i) {                           /*6*/  //tam*tc
                    matriz[i][j] = c;                   /*7*/  //¿?
                }
                j++;                                    /*8*/  //tam*(ta + to)
            }
            i++;                                        /*9*/  //tam*(ta + to)
        }
        return matriz;                                  /*10*/
    }
//    Tiempo mejor esperado al dibujar Matriz A
//    Tm = 2ta + tam*(3tc + 3ta + 2to) + 2tc
//    Tm = (3tc + 3ta + 2to)*tam + (2tc + 2ta) = A*tam + B
    
//    Tiempo peor esperado al dibujar Matriz A
//    Tp = 2ta + tam*(3tc + 4ta + 2to) + 2tc
//    Tp = (3tc + 4ta + 2to)*tam + (2tc + 2ta) = A'*tam + B   

//    Tiempo promedio al dibujar Matriz A
//    Tu = (Tm + Tp)/2 
//    Tu = [(3tc + 3ta + 2to)*tam + (2tc + 2ta) + (3tc + 4ta + 2to)*tam + (2tc + 2ta)]/2
//    Tu = [(3tc + 3ta + 2to)*tam + (3tc + 4ta + 2to)*tam + 4tc + 4ta]/2  
//    Tu = [(6tc + 7ta + 4to)*tam + 4tc + 4ta]/2
    
    //Dibuja Triángulo B
    public String[][] trianguloB() {
        String[][] matriz = new String[tam][tam];       /*1*/  //ta
        int i = 0;                                      /*2*/  //ta
        while (i < tam) {                               /*3*/  //tam*tc + tc
            int j = tam - 1;                            /*4*/  //tam*(ta + to)
            while (j >= 0) {                            /*5*/  //tam*tc + tc
                if (j < tam - i) {                      /*6*/  //tam*(tc + to)
                    matriz[i][j] = c;                   /*7*/  //¿?
                }
                j--;                                    /*8*/  //tam*(ta + to)
            }
            i++;                                        /*9*/  //tam*(ta + to)
        }
        return matriz;                                  /*10*/
    }
//    Tiempo mejor esperado al dibujar Matriz B
//    Tm = 2ta + tam*(3tc + 3ta + 4to) + 2tc
//    Tm = (3tc + 3ta + 4to)*tam + (2tc + 2ta) = A*tam + B
    
//    Tiempo peor esperado al dibujar Matriz B
//    Tp = 2ta + tam*(3tc + 4ta + 4to) + 2tc
//    Tp = (3tc + 4ta + 4to)*tam + (2tc + 2ta) = A'*tam + B   

//    Tiempo promedio al dibujar Matriz B
//    Tu = (Tm + Tp)/2 
//    Tu = [(3tc + 3ta + 4to)*tam + (2tc + 2ta) + (3tc + 4ta + 4to)*tam + (2tc + 2ta)]/2
//    Tu = [(3tc + 3ta + 4to)*tam + (3tc + 4ta + 4to)*tam + 4tc + 4ta]/2  
//    Tu = [(6tc + 7ta + 8to)*tam + 4tc + 4ta]/2

    //Imprimir la matriz
    public void imprimirMatriz(String mensaje, String[][] m) {
        System.out.println("\n" + mensaje);           /*1*/
        for (int i = 0; i < tam; i++) {               /*2*/  //ta + tam*tc + tc + tam*(ta + to)     = ta + tam*(ta + tc + to) + tc
            for (int j = 0; j < tam; j++) {           /*3*/  //tam*ta + tam*tc + tc + tam*(ta + to) = tam*(2ta + tc + to) + tc
                if (m[i][j] != null) {                /*4*/  //tam*tc
                    System.out.print(m[i][j] + " ");  /*5*/
                }
            }
            System.out.println();                     /*6*/
        }
    }
//    Tiempo de imprimir Matriz
//    T = ta + tam*(ta + tc to) + tc + tam*(2ta + tc + to) + tam*tc + tc
//    T = ta + tam*(3ta + 3tc + 2to) + 2tc
    
}


//Tiempo mejor esperado del Proyecto
//Tm(ejercicio) = T(Inicializar Constructor) + Tm(Dibujar Matriz A) + Tm(Dibujar Matriz B) + T(Imprimir Matriz)
//Tm(ejercicio)= [2ta] + [(3tc + 3ta + 2to)*tam + (2tc + 2ta)] + [(3tc + 3ta + 4to)*tam + (2tc + 2ta)] + [ta + tam*(3ta + 3tc + 2to) + 2tc]

//Tiempo peor esperado del Proyecto
//Tp(ejercicio) = T(Inicializar Constructor) + Tp(Dibujar Matriz A) + Tp(Dibujar Matriz B) + T(Imprimir Matriz)
//Tp(ejercicio)= [2ta] + [(3tc + 4ta + 2to)*tam + (2tc + 2ta)] + [(3tc + 4ta + 4to)*tam + (2tc + 2ta)] + [ta + tam*(3ta + 3tc + 2to) + 2tc]

//Tiempo promedio del Proyecto
//Tu(ejercicio) = T(Inicializar Constructor) + Tu(Dibujar Matriz A) + Tu(Dibujar Matriz B) + T(Imprimir Matriz)
//Tu(ejercicio)= [2ta] + [[(6tc + 7ta + 4to)*tam + 4tc + 4ta]/2] + [[(6tc + 7ta + 8to)*tam + 4tc + 4ta]/2] + [ta + tam*(3ta + 3tc + 2to) + 2tc]
