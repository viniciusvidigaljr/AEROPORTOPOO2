/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisão.oo.aeroporto;

/**
 *
 * @author 20132bsi0230
 */
public class Aviao {
    private String prefixo;
    private String modelo;
    private String fabricante;
    private String totalAssentos;
    private String ocupadosAssentos;

    public Aviao(String prefixo, String modelo, String fabricante, String totalAssentos, String ocupadosAssentos) {
        this.prefixo = prefixo;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.totalAssentos = totalAssentos;
        this.ocupadosAssentos = ocupadosAssentos;
    }
    
    void visualizarPrefixo(){
        System.out.println("Prefixo: "+this.prefixo);
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTotalAssentos() {
        return totalAssentos;
    }

    public void setTotalAssentos(String totalAssentos) {
        this.totalAssentos = totalAssentos;
    }

    public String getOcupadosAssentos() {
        return ocupadosAssentos;
    }

    public void setOcupadosAssentos(String ocupadosAssentos) {
        this.ocupadosAssentos = ocupadosAssentos;
    }
}
