/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploVenda;

/**
 *
 * @author Cleide
 */
public class Cartao implements IFormaDePagamento{

    @Override
    public double CalcularDesconto(double valorVenda) {
        double desconto = 0;
        desconto = valorVenda * 0.1;
        return valorVenda - desconto;
    }
    
}
