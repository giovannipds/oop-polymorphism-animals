/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;

/**
 *
 * @author giovannipds
 */
public class Passarinho extends Animal{

    @Override
    public void comunicar() {
        System.out.println("Pio, pio, pio");
    }

    @Override
    public void movimentar() {
        System.out.println("Voar");
    }
    
}
