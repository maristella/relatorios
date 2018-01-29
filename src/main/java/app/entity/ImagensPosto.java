package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;


/**
 * Classe que representa a tabela IMAGENSPOSTO
 * @generated
 */
@Entity
@Table(name = "\"IMAGENSPOSTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ImagensPosto")
public class ImagensPosto implements Serializable {

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
  @Column(name = "tipo", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tipo;

  /**
  * @generated
  */
  @Column(name = "attribuimagem", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="bln1eJh9gHAAAAAAAAAAd4YnJTJYi-5Ow2smFZ_49eg1tUrU_5eVIZciX9unoag8")
  
  private java.lang.String imagem;

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
  public ImagensPosto(){
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
  public ImagensPosto setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém tipo
   * return tipo
   * @generated
   */
  
  public java.lang.String getTipo(){
    return this.tipo;
  }

  /**
   * Define tipo
   * @param tipo tipo
   * @generated
   */
  public ImagensPosto setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }

  /**
   * Obtém imagem
   * return imagem
   * @generated
   */
  
  public java.lang.String getImagem(){
    return this.imagem;
  }

  /**
   * Define imagem
   * @param imagem imagem
   * @generated
   */
  public ImagensPosto setImagem(java.lang.String imagem){
    this.imagem = imagem;
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
  public ImagensPosto setPosto(Posto posto){
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
    ImagensPosto object = (ImagensPosto)obj;
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
