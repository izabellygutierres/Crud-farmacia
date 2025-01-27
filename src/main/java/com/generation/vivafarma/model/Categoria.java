package com.generation.vivafarma.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@NotNull(message = "O Nome é obrigatório")
	@Size(min = 5, max = 50, message = "O Nome deve conter no mínimo 5 e no máximo 50 caracteres.")
	@Column(length = 50, nullable = false)
	private String nome;
	
    @NotNull(message = "O Atributo Descrição é obrigatório")
    @Size(min = 5, max = 150, message = "Descrição deve conter de 5 a 150 caracteres. ")
    @Column(length = 150, nullable = false)
    private String descricao;

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
	
    
}
