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
public interface FactoryCelular {    
    CelularBarato createCelularBarato();
    CelularCaro createCelularCaro();
}
