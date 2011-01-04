package test;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Formulario {
    @JsonProperty("_id")
    private String id;

    @JsonProperty("_rev")
    private String revision;
    private List<FormularioItem> itens;
    private String unidade;
    private String descricao;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<FormularioItem> getItens() {
		return itens;
	}
	public void setAtividadesEnsino(List<FormularioItem> itens) {
		this.itens = itens;
	}
    
    
}
