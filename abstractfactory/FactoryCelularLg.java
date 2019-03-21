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
public class FactoryCelularLg implements FactoryCelular{

    @Override
    public CelularBarato createCelularBarato() {
        return new Lg1();
    }

    @Override
    public CelularCaro createCelularCaro() {
        return new Lg10();
    }
    
}
