package modelo;

import java.io.Serializable;
import java.util.InputMismatchException;

public class Cuenta implements Serializable {
    private static final long serialVersionUID = -1L;
    private String titular;
    private double saldo;
    private String cbu;

    public Cuenta() {

    }

    public void Cuenta() {
    }

    public Cuenta(String titular, double saldo, String cbu) {
        this.titular = titular;
        this.saldo = saldo;
        this.cbu = cbu;
    }

    public void retirar(double cantidadARetirar) {
        if (this.saldo >= cantidadARetirar) {
            this.saldo -= cantidadARetirar;
        } else {
            System.err.println("Usted no dispone de saldo para retirar ese monto.");
        }
    }

    public void ingresar(double cantidadADepositar) {
        try {
            if (cantidadADepositar > 0) {
                saldo += cantidadADepositar;
            } else {
                System.err.println("Debe ingresar un importe positivo.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Debe ingresar numero correcto.");
            throw e;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }
}
