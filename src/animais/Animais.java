/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animais;

/**
 *
 * @author giovannipds
 */
public class Animais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal javali = new Javali();
        javali.movimentar();
        javali.comunicar();
        
        System.out.println(javali instanceof Animal);
        
        Animal gaivota = new Passarinho();
        gaivota.movimentar();
        gaivota.comunicar();
        
        System.out.println(gaivota instanceof Animal);
    }
    
}
