package matrices;

public class Tmatriz {

    String[][] matriz;
    int _tam;
    String _c;
    
    public Tmatriz(int _tam, String _c) {
        this.matriz = new String[_tam][_tam];
        this._tam = _tam;
        this._c = _c;
    }

    //Dibujar Triángulo A
    public String[][] trianguloA() {
        for (int i = 0; i < _tam; i++) {
            for (int j = 0; j < _tam; j++) {
                if (j <= i) {
                    matriz[i][j] = _c;
                } else {
                    matriz[i][j] = " ";
                }
            }
        }
        return matriz;
    }

    //Dibuja Triángulo B
    public String[][] trianguloB() {
        for (int i = 0; i < _tam; i++) {
            for (int j = _tam - 1; j >= 0; j--) {
                if (j < _tam - i) {
                    matriz[i][j] = _c;
                } else {
                    matriz[i][j] = " ";
                }
            }
        }
        return matriz;
    }

    //Imprimir la matriz
    public void imprimirMatriz(String mensaje, String[][] m) {
        System.out.println("\n" + mensaje);
        for (int i = 0; i < _tam; i++) {
            for (int j = 0; j < _tam; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

        