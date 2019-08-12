package ejercicios;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cantactual;
        double cantidad;
        Cuenta cuenta1 = pedirDatosCuenta();
        System.out.println("Felicitaciones Sr."+cuenta1.getTitular()+" ,ha creado su cuenta. Su saldo actual es de: "+cuenta1.getCantidad() +" pesos ¿Desea continuar?(Y/N)");
        String continuar = teclado.next();
        while(continuar.equals("Y") || continuar.equals("y")) {
            if (continuar.equals("y") || continuar.equals("Y")) {
                System.out.println("Si desea extraer dinero escriba \"e\", si de lo contrario desea despositar dinero escriba \"d\".");
                continuar = teclado.next();
                switch (continuar) {
                    case "d":
                        System.out.println("Ingrese cantidad de dinero a depositar:");
                        cantidad = teclado.nextDouble();
                        cantactual = cuenta1.getCantidad();
                        cantidad = cuenta1.ingresar(cantidad, cantactual);
                        cuenta1.setCantidad(cantidad);
                        break;
                    case "e":
                        System.out.println("Ingrese cantidad de dinero a retirar:");
                        cantidad = teclado.nextDouble();
                        cantactual = cuenta1.getCantidad();
                        cantidad = cuenta1.retirar(cantidad, cantactual);
                        cuenta1.setCantidad(cantidad);
                        break;
                    default:
                        break;
                }
                System.out.println("Sr." + cuenta1.getTitular() + ". Su saldo es: " + cuenta1.getCantidad() + " pesos");
                teclado = new Scanner(System.in);
                System.out.println("¿Desea continuar?(Y/N)");
                continuar = teclado.next();
            }
        }

    }
    public static Cuenta pedirDatosCuenta() {
        Scanner teclado = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        System.out.println("Ingrese nombre de su nueva cuenta:");
        String titular = teclado.next();
        double cantidad = 0;
        cuenta1.setCantidad(cantidad);
        cuenta1.setTitular(titular);
        return cuenta1;
    }
}

