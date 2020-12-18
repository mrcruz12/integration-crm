package br.com.dars.integrationcrm.domain.crm;

public class Distribuicao {

    private String cCodDep;
    private String cDesDep;
    private Integer nPerDep;
    private Long nValDep;

    public String getcCodDep() {
        return cCodDep;
    }

    public void setcCodDep(String cCodDep) {
        this.cCodDep = cCodDep;
    }

    public String getcDesDep() {
        return cDesDep;
    }

    public void setcDesDep(String cDesDep) {
        this.cDesDep = cDesDep;
    }

    public Integer getnPerDep() {
        return nPerDep;
    }

    public void setnPerDep(Integer nPerDep) {
        this.nPerDep = nPerDep;
    }

    public Long getnValDep() {
        return nValDep;
    }

    public void setnValDep(Long nValDep) {
        this.nValDep = nValDep;
    }
}
