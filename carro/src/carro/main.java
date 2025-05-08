/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

/**
 *
 * @author CAMARGO
 */
public class main {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro meuCarro = new Carro("Fusca", "Verde", 80);

        // Exibindo a ficha técnica
        meuCarro.exibirFichaTecnica();

        // Ligando o carro
        meuCarro.ligar();

        // Acelerando
        meuCarro.acelerar(20);

        // Freando
        meuCarro.frear(10);

        // Desligando o carro
        meuCarro.desligar();

        // Exibindo a ficha técnica novamente
        meuCarro.exibirFichaTecnica();
    }
}

