package br.com.dars.integrationcrm.domain.crm;

public class Categoria {


    private String codigo_categoria;
    private Integer percentual;
    private Long valor;

    public String getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(String codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public Integer getPercentual() {
        return percentual;
    }

    public void setPercentual(Integer percentual) {
        this.percentual = percentual;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }
}
