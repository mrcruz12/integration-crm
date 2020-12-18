package br.com.dars.integrationcrm.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String razaoSocial;
    private String cnpj;

    //OMIE_APP_KEY
    private String omieAppKey;
    // OMIE_APP_SECRET
    private String omieAppSecret;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getOmieAppKey() {
        return omieAppKey;
    }

    public void setOmieAppKey(String omieAppKey) {
        this.omieAppKey = omieAppKey;
    }

    public String getOmieAppSecret() {
        return omieAppSecret;
    }

    public void setOmieAppSecret(String omieAppSecret) {
        this.omieAppSecret = omieAppSecret;
    }
}
