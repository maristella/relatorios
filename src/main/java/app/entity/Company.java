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
 * Classe que representa a tabela COMPANY
 * @generated
 */
@Entity
@Table(name = "\"COMPANY\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Company")
public class Company implements Serializable {

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
  @Column(name = "name", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String name;

  /**
  * @generated
  */
  @Column(name = "logotipo", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="bln1eJh9gHAAAAAAAAAAd4YnJTJYi-5Ow2smFZ_49eg1tUrU_5eVIZciX9unoag8")
  
  private java.lang.String logotipo;

  /**
   * Construtor
   * @generated
   */
  public Company(){
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
  public Company setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém name
   * return name
   * @generated
   */
  
  public java.lang.String getName(){
    return this.name;
  }

  /**
   * Define name
   * @param name name
   * @generated
   */
  public Company setName(java.lang.String name){
    this.name = name;
    return this;
  }

  /**
   * Obtém logotipo
   * return logotipo
   * @generated
   */
  
  public java.lang.String getLogotipo(){
    return this.logotipo;
  }

  /**
   * Define logotipo
   * @param logotipo logotipo
   * @generated
   */
  public Company setLogotipo(java.lang.String logotipo){
    this.logotipo = logotipo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Company object = (Company)obj;
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
