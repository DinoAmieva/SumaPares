package sumapares;

/**
 *
 * 
@author
 maryse
 *
 * Ciclo for
 * Suma de los M primeros números pares.
 *
 */
public class SumaPares {
        final int M = 12;
        int suma = 0;
        
    public void CalculoSuma(String[] args) {

        for (int n = 1; n <= M; n++) {
            suma += 2 * n;
        }
        System.out.println("La suma de los " + M
                + " primeros números pares: " + suma);
    }
    public static void main(String[] args) {
        SumaPares llamar = new SumaPares();
        llamar.CalculoSuma(args);
    }
}