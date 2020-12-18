package br.com.dars.integrationcrm.domain.crm;

public class PaginacaoRaiz {

    private Long pagina;
    private Long total_de_paginas;
    private Integer registros;
    private Long total_de_registros;


    public Long getPagina() {
        return pagina;
    }

    public void setPagina(Long pagina) {
        this.pagina = pagina;
    }

    public Long getTotal_de_paginas() {
        return total_de_paginas;
    }

    public void setTotal_de_paginas(Long total_de_paginas) {
        this.total_de_paginas = total_de_paginas;
    }

    public Integer getRegistros() {
        return registros;
    }

    public void setRegistros(Integer registros) {
        this.registros = registros;
    }

    public Long getTotal_de_registros() {
        return total_de_registros;
    }

    public void setTotal_de_registros(Long total_de_registros) {
        this.total_de_registros = total_de_registros;
    }
}
