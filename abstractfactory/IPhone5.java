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
public class IPhone5 implements CelularBarato {
      
    @Override
    public void exibirInfoCelularMaisEmConta() {
        System.out.println("Marca:Apple Linha:iPhone5");
    }
}
