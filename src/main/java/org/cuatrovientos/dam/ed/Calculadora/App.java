package org.cuatrovientos.dam.ed.Calculadora;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String operacion = args[0];
        double numero1 = Double.parseDouble(args[1]);
        double numero2 = Double.parseDouble(args[2]);

        switch (operacion.toLowerCase()) {
            case "suma":
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case "resta":
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case "multiplicacion":
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case "division":
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                }
            default:
                System.out.println("Operación no válida. Las opciones son: suma, resta, multiplicacion o division.");
        }
    }

    }

