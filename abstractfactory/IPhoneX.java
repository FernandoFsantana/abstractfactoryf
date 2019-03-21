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
public class IPhoneX implements CelularCaro{
    
      @Override
    public void exibirInfoCelularMaisCaro() {
        System.out.println("Marca:Apple Linha:iPhonex");
    }
}
