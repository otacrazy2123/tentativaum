package br.com.desafiozup.tentativaum.model;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.Data;

@Data
@Entity
public class Sorteio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sorteio")
	private long id;
	
	
	@Column( name = "data_sorteio", nullable = false)
	private Date dataSorteio;
	
	@Column( name = "resultado_sorteio", nullable = false)
	private String resultadoSorteio;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_idtipo_aposta") ,
	nullable = false)
	private TipoAposta tipoAposta;
	
	
}

//, name = "tipo_aposta_idtipo_aposta"