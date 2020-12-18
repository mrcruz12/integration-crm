package br.com.dars.integrationcrm.domain.crm;

public class Boleto {


    private String cGerado;
    private String cNumBancario;
    private String cNumBoleto;
    private String dDtEmBol;
    private Integer nPerJuros;
    private Integer nPerMulta;

    public String getcGerado() {
        return cGerado;
    }

    public void setcGerado(String cGerado) {
        this.cGerado = cGerado;
    }

    public String getcNumBancario() {
        return cNumBancario;
    }

    public void setcNumBancario(String cNumBancario) {
        this.cNumBancario = cNumBancario;
    }

    public String getcNumBoleto() {
        return cNumBoleto;
    }

    public void setcNumBoleto(String cNumBoleto) {
        this.cNumBoleto = cNumBoleto;
    }

    public String getdDtEmBol() {
        return dDtEmBol;
    }

    public void setdDtEmBol(String dDtEmBol) {
        this.dDtEmBol = dDtEmBol;
    }

    public Integer getnPerJuros() {
        return nPerJuros;
    }

    public void setnPerJuros(Integer nPerJuros) {
        this.nPerJuros = nPerJuros;
    }

    public Integer getnPerMulta() {
        return nPerMulta;
    }

    public void setnPerMulta(Integer nPerMulta) {
        this.nPerMulta = nPerMulta;
    }
}
