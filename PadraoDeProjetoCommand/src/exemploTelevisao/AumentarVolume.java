/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploTelevisao;

/**
 *
 * @author Cleide
 */
public class AumentarVolume implements ICommand{
    
    private Televisao tv;

    public AumentarVolume(Televisao tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.AumentarVolume();
    }
}
