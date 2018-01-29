package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HISTPRECOS
 * @generated
 */
@Entity
@Table(name = "\"HISTPRECOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.HistPrecos")
public class HistPrecos implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "combustivel", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String combustivel;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "inicioVigencia", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date inicioVigencia;

  /**
  * @generated
  */
  @Column(name = "preco", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double preco;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_posto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Posto posto;

  /**
   * Construtor
   * @generated
   */
  public HistPrecos(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public HistPrecos setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém combustivel
   * return combustivel
   * @generated
   */
  
  public java.lang.String getCombustivel(){
    return this.combustivel;
  }

  /**
   * Define combustivel
   * @param combustivel combustivel
   * @generated
   */
  public HistPrecos setCombustivel(java.lang.String combustivel){
    this.combustivel = combustivel;
    return this;
  }

  /**
   * Obtém inicioVigencia
   * return inicioVigencia
   * @generated
   */
  
  public java.util.Date getInicioVigencia(){
    return this.inicioVigencia;
  }

  /**
   * Define inicioVigencia
   * @param inicioVigencia inicioVigencia
   * @generated
   */
  public HistPrecos setInicioVigencia(java.util.Date inicioVigencia){
    this.inicioVigencia = inicioVigencia;
    return this;
  }

  /**
   * Obtém preco
   * return preco
   * @generated
   */
  
  public java.lang.Double getPreco(){
    return this.preco;
  }

  /**
   * Define preco
   * @param preco preco
   * @generated
   */
  public HistPrecos setPreco(java.lang.Double preco){
    this.preco = preco;
    return this;
  }

  /**
   * Obtém posto
   * return posto
   * @generated
   */
  
  public Posto getPosto(){
    return this.posto;
  }

  /**
   * Define posto
   * @param posto posto
   * @generated
   */
  public HistPrecos setPosto(Posto posto){
    this.posto = posto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HistPrecos object = (HistPrecos)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
