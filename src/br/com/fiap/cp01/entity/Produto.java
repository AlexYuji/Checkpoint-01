package br.com.fiap.cp01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
@SequenceGenerator(name="produto", sequenceName="SQ_PRODUTO", allocationSize = 1 )
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
	@Column(name="cd_codigo")
	private int codigo;
	
	@Column(name="nm_produto", length = 50, nullable = false)
	private String nomeProduto;
	
	@Column(name="nr_quantidade_estoque", nullable = false)
	private int qntEstoque;
	
	@Column(name="vl_venda", nullable = false)
	private double valorVenda;
	
	@Column(name="vl_custo", nullable = false)
	private double valorCusto;

	public Produto() {
		super();
	}

	public Produto(String nomeProduto, int qntEstoque, double valorVenda, double valorCusto) {
		super();
		this.nomeProduto = nomeProduto;
		this.qntEstoque = qntEstoque;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
	}

	public Produto(int codigo, String nomeProduto, int qntEstoque, double valorVenda, double valorCusto) {
		super();
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.qntEstoque = qntEstoque;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getQntEstoque() {
		return qntEstoque;
	}

	public void setQntEstoque(int qntEstoque) {
		this.qntEstoque = qntEstoque;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}
	
	
	
}
