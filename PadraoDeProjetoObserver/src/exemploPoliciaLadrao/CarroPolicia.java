/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploPoliciaLadrao;

/**
 *
 * @author Cleide
 */
public class CarroPolicia implements Observador{

    @Override
    public void atualizar(Object obj) {
        System.out.println("Policial andou para " + obj);
    }
    
}
