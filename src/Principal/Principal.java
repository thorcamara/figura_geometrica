/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Model.Circulo;
import Model.Triangulo;

/**
 *
 * @author User
 */
public class Principal {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.leitura();
        triangulo.imprimir();
        Circulo circulo = new Circulo("Branco",3);
        System.out.println(circulo.paraString());
}
}