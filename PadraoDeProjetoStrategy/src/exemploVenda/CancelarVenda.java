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
public class CancelarVenda implements ICommand{
    private Venda venda;
    
    public CancelarVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public void execute() {
        this.venda.CancelarVenda();
    }
}
