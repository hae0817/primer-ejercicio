//EJERCICIO 1

package ejercicios.primer_ejercicio;

public class AmbitoVariable {
    //definir variable global
    static int variableGlobal = 10;
    int prueva = 12;

    //definir acción con metodo
    public static int metodoAmbito() {
        //definir variable local
        int variableLocalMetodo = 7;

        return variableLocalMetodo;
    }

    public static void main(String[] args) {
        int variableLocal = 20;
        if (true) {
            int variableInterna = 30;
            System.out.println(variableInterna);
        }

        System.out.println(variableLocal);
        System.out.println(variableGlobal);
        System.out.println(metodoAmbito());
    }
}


