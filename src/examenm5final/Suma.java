/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenm5final;

/**
 *
 * @author Ruben
 */
public class Suma {
        private int num1;
    private int num2;

    public Suma(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumar() {
        return num1 + num2;
    }

    public int getNum1() {
        return num1;
    }

    public int sumaValorAbsolut() {
        return Math.abs(num1) + Math.abs(num2);
    }
}

