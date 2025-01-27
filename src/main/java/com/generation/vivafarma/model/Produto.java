package com.generation.vivafarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	   
	   @NotNull(message = "O Nome do Produto é obrigatório")
	    @Size(min = 3, max = 50, message = "O Nome deve conter no mínimo 3 e no máximo 50 caracteres")
	    private String nome;

	    @NotNull(message = "A Descrição do Produto é obrigatória")
	    @Size(min = 5, max = 255, message = "A Descrição deve conter no mínimo 5 e no máximo 255 caracteres")
	    private String descricao;

	    @NotNull(message = "O Preço do Produto é obrigatório")
	    @Positive(message = "O preço deve ser maior que zero")
	    private Double preco;

	    @NotNull(message = "A Quantidade do Produto é obrigatória")
	    @Positive(message = "A Quantidade deve ser maior que zero")
	    private Integer quantidade;

	    @ManyToOne
	    @JoinColumn(name = "categoria_id", nullable = false)
	    private Categoria categoria;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Double getPreco() {
			return preco;
		}

		public void setPreco(Double preco) {
			this.preco = preco;
		}

		public Integer getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
	    
	    

}
