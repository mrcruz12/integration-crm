package br.com.dars.integrationcrm.domain.crm;

import java.util.ArrayList;
import java.util.List;

public class ContaReceber {

    private Character bloqueado;
    private Character bloquear_baixa;
    private Boleto boleto;
    private List<Categoria> categorias = new ArrayList<>();

    private String codigo_categoria;
    private Long codigo_cliente_fornecedor;
    private String codigo_lancamento_integracao;
    private Long codigo_lancamento_omie;
    private String codigo_tipo_documento;
    private Long codigo_vendedor;

    private String data_emissao;
    private String data_previsao;
    private String data_registro;
    private String data_vencimento;

    private List<Distribuicao> distribuicao = new ArrayList<>();

    private Long id_conta_corrente;
    private String id_origem;
    private String nsu;
    private String numero_documento;
    private String numero_documento_fiscal;
    private String observacao;
    private String operacao;
    private String status_titulo;
    private String tipo_agrupamento;
    private Long valor_documento;

    private Info info;





}
