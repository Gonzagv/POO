package ejercicios;

import com.google.gson.Gson;
import modelo.Banco;
import modelo.Cuenta;
import persistence.BancoRepository;

import java.util.Scanner;

public class App
{
    public static void main (String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double cantactual;
        double cantidad;
        BancoRepository banco = new BancoRepository();
        Object banco1 = banco.readFile();
        Banco banco2 = new Banco();
        String txt = banco2.toString();
        System.out.println(txt);
        /*Banco banco = new Banco();
        Cuenta cuenta1 = pedirDatosCuenta();
        System.out.println("Felicitaciones Sr."+cuenta1.getTitular()+" ,ha creado su cuenta. Su saldo actual es de: "+cuenta1.getSaldo() +" pesos ¿Desea continuar?(Y/N)");
        String continuar = teclado.next();
        while(continuar.equals("Y") || continuar.equals("y")) {
            if (continuar.equals("y") || continuar.equals("Y")) {
                System.out.println("Si desea extraer dinero escriba \"e\", si de lo contrario desea despositar dinero escriba \"d\".");
                continuar = teclado.next();
                switch (continuar) {
                    case "d":
                        System.out.println("Ingrese cantidad de dinero a depositar:");
                        cantidad = teclado.nextDouble();
                        cuenta1.ingresar(cantidad);
                        break;
                    case "e":
                        System.out.println("Ingrese cantidad de dinero a retirar:");
                        cantidad = teclado.nextDouble();
                        cuenta1.retirar(cantidad);
                        break;
                    default:
                        break;
                }
                System.out.println("Sr." + cuenta1.getTitular() + ". Su saldo es: " + cuenta1.getSaldo() + " pesos");
                teclado = new Scanner(System.in);
                System.out.println("¿Desea continuar?(Y/N)");
                continuar = teclado.next();
            }

        }
        Gson cuentaGson = new Gson();
        String repGson = cuentaGson.toJson(cuenta1);
        String path = "GsonBase/datos.txt";
        try {
            banco.agregarCuentaGson(repGson);

            }
        }catch (Exception ex){
            System.out.println(ex);
            ex.printStackTrace();
        }
        */

    }
    public static Cuenta pedirDatosCuenta() {
        Scanner teclado = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        System.out.println("Ingrese nombre de su nueva cuenta:");
        String titular = teclado.next();
        double cantidad = 0;
        cuenta1.setSaldo(cantidad);
        cuenta1.setTitular(titular);
        return cuenta1;
    }
}

