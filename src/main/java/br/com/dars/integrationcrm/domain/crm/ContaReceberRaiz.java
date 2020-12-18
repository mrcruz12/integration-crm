package br.com.dars.integrationcrm.domain.crm;

import java.util.ArrayList;
import java.util.List;

public class ContaReceberRaiz extends PaginacaoRaiz {

    private List<ContaReceber> conta_receber_cadastro = new ArrayList<>();

    public List<ContaReceber> getConta_receber_cadastro() {
        return conta_receber_cadastro;
    }

    public void setConta_receber_cadastro(List<ContaReceber> conta_receber_cadastro) {
        this.conta_receber_cadastro = conta_receber_cadastro;
    }
}
