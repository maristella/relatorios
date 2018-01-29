package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PROMOCAO
 * @generated
 */
@Entity
@Table(name = "\"PROMOCAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Promocao")
public class Promocao implements Serializable {

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
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "inicio", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date inicio;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "fim", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date fim;

  /**
  * @generated
  */
  @Column(name = "precopromo", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double precopromo;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_histPrecos", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private HistPrecos histPrecos;

  /**
   * Construtor
   * @generated
   */
  public Promocao(){
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
  public Promocao setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém inicio
   * return inicio
   * @generated
   */
  
  public java.util.Date getInicio(){
    return this.inicio;
  }

  /**
   * Define inicio
   * @param inicio inicio
   * @generated
   */
  public Promocao setInicio(java.util.Date inicio){
    this.inicio = inicio;
    return this;
  }

  /**
   * Obtém fim
   * return fim
   * @generated
   */
  
  public java.util.Date getFim(){
    return this.fim;
  }

  /**
   * Define fim
   * @param fim fim
   * @generated
   */
  public Promocao setFim(java.util.Date fim){
    this.fim = fim;
    return this;
  }

  /**
   * Obtém precopromo
   * return precopromo
   * @generated
   */
  
  public java.lang.Double getPrecopromo(){
    return this.precopromo;
  }

  /**
   * Define precopromo
   * @param precopromo precopromo
   * @generated
   */
  public Promocao setPrecopromo(java.lang.Double precopromo){
    this.precopromo = precopromo;
    return this;
  }

  /**
   * Obtém histPrecos
   * return histPrecos
   * @generated
   */
  
  public HistPrecos getHistPrecos(){
    return this.histPrecos;
  }

  /**
   * Define histPrecos
   * @param histPrecos histPrecos
   * @generated
   */
  public Promocao setHistPrecos(HistPrecos histPrecos){
    this.histPrecos = histPrecos;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Promocao object = (Promocao)obj;
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
