package banco;

import javax.swing.*;
import java.util.Scanner;

public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo = 0;

    public String getTitular() {
        JOptionPane.showMessageDialog(null, titular);
        return titular;
    }

    public void setTitular() {
        this.titular = JOptionPane.showInputDialog("Digite o nome do titular");
    }

    public int getNumeroConta() {

        JOptionPane.showMessageDialog(null, numeroConta);
        return numeroConta;
    }

    public void setNumeroConta() {
        String numeroContatemp = JOptionPane.showInputDialog("Digite o número da conta");
        this.numeroConta = Integer.parseInt(numeroContatemp);
    }

    public double getSaldo() {
        JOptionPane.showMessageDialog(null, saldo);
        return saldo;
    }

    public void depositar() {
        String valorTemp = JOptionPane.showInputDialog("Digite o quanto deseja adicionar");
        double valor = Integer.parseInt(valorTemp);
        if (valor >= 0) {
            this.saldo += valor;
        }else{
            System.out.println("Inválido.");
        }
    }
    public void sacar(){
        String valorTemp = JOptionPane.showInputDialog("Digite o quanto deseja sacar");
        double valor = Integer.parseInt(valorTemp);
        if(this.saldo - valor > -1) {
            this.saldo -= valor;
        }else{
            System.out.println("saldo insuficiente.");
        }
    }
}
