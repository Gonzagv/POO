package ejercicios;

import java.util.InputMismatchException;

public class Cuenta {
    private String titular;
    private double cantidad;

    public void Cuenta() {
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double retirar (double cantidad, double cantactual) {
        if (cantactual<cantidad){
            System.err.println("Usted no dispone de saldo para retirar ese monto.");
        }else{
            if (cantactual==cantidad){
                cantactual = 0;
            }else{
                cantactual -= cantidad;
            }
        }
        return cantactual;
    }

    public double ingresar (double cantidad, double cantactual) {
        try {
            if (cantidad > 0) {
                cantactual += cantidad;
            } else {
                System.err.println("Debe ingresar un importe positivo.");
            }
        }catch(InputMismatchException e){
            System.err.println("Debe ingresar numero correcto.");
        }
        return cantactual;
    }
}
