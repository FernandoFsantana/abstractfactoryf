/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author fernando
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FactoryCelular celular1 = new FactoryCelularApple();
        FactoryCelular celular2 = new FactoryCelularLg();
        FactoryCelular celular3 = new FactoryCelularXiaomi();
      
    // Celular Appple
    
        CelularBarato celularbarato = celular1.createCelularBarato();
        celularbarato.exibirInfoCelularMaisEmConta();
        
        CelularCaro celularcaro = celular1.createCelularCaro();
        celularcaro.exibirInfoCelularMaisCaro();
        
        
    // Celular LG
    
        CelularBarato celularbaratoLg = celular2.createCelularBarato();
        celularbaratoLg.exibirInfoCelularMaisEmConta();
        
        CelularCaro celularcaroLg = celular2.createCelularCaro();
        celularcaroLg.exibirInfoCelularMaisCaro();
    
    //Celular Xiaomi
    
        CelularBarato celularbaratoxiaomi = celular3.createCelularBarato();
        celularbaratoxiaomi.exibirInfoCelularMaisEmConta();
    
        CelularCaro celularcaroxiaomi = celular3.createCelularCaro();
        celularcaroxiaomi.exibirInfoCelularMaisCaro();
    }
    
}
