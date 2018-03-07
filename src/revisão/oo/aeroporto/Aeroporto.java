/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisão.oo.aeroporto;

import java.util.ArrayList;

/**
 *
 * @author 20132bsi0230
 */
public class Aeroporto {
    String codigo;
    String nome;
    private boolean internacional;
    ArrayList<Aeroporto> listaAeroportosIda = new ArrayList();
    ArrayList<Aeroporto> listaAeroportosVinda = new ArrayList();
    ArrayList<Aviao> avioesPatio = new ArrayList();

    public Aeroporto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public boolean getInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }
    
    public boolean equal(Aeroporto aeroporto){
       if(aeroporto.codigo == this.codigo){
           return true;
       }else{
           return false;
       } 
       
    
    }
}
