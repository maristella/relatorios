package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


import org.eclipse.persistence.annotations.*;
/**
 * Classe que representa a tabela POSTO
 * @generated
 */
@Entity
@Table(name = "\"POSTO\"")
@XmlRootElement
@CronappSecurity
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "fk_company", contextProperty = "tenant")
@JsonFilter("app.entity.Posto")
public class Posto implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_company", nullable = true, referencedColumnName = "id", insertable=false, updatable=false)
  
  private Company company;

  /**
  * @generated
  */
  @Column(name = "cep", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cep;

  /**
  * @generated
  */
  @Column(name = "logradouro", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String logradouro;

  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer numero;

  /**
  * @generated
  */
  @Column(name = "bairro", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String bairro;

  /**
  * @generated
  */
  @Column(name = "cidade", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cidade;

  /**
  * @generated
  */
  @Column(name = "uf", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String uf;

  /**
  * @generated
  */
  @Column(name = "cnpj", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double cnpj;

  /**
  * @generated
  */
  @Column(name = "latitude", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double latitude;

  /**
  * @generated
  */
  @Column(name = "longitude", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double longitude;

  /**
   * Construtor
   * @generated
   */
  public Posto(){
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
  public Posto setId(java.lang.String id){
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
  public Posto setName(java.lang.String name){
    this.name = name;
    return this;
  }

  /**
   * Obtém company
   * return company
   * @generated
   */
  
  public Company getCompany(){
    return this.company;
  }

  /**
   * Define company
   * @param company company
   * @generated
   */
  public Posto setCompany(Company company){
    this.company = company;
    return this;
  }

  /**
   * Obtém cep
   * return cep
   * @generated
   */
  
  public java.lang.String getCep(){
    return this.cep;
  }

  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public Posto setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }

  /**
   * Obtém logradouro
   * return logradouro
   * @generated
   */
  
  public java.lang.String getLogradouro(){
    return this.logradouro;
  }

  /**
   * Define logradouro
   * @param logradouro logradouro
   * @generated
   */
  public Posto setLogradouro(java.lang.String logradouro){
    this.logradouro = logradouro;
    return this;
  }

  /**
   * Obtém numero
   * return numero
   * @generated
   */
  
  public java.lang.Integer getNumero(){
    return this.numero;
  }

  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public Posto setNumero(java.lang.Integer numero){
    this.numero = numero;
    return this;
  }

  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  
  public java.lang.String getBairro(){
    return this.bairro;
  }

  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public Posto setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * Obtém cidade
   * return cidade
   * @generated
   */
  
  public java.lang.String getCidade(){
    return this.cidade;
  }

  /**
   * Define cidade
   * @param cidade cidade
   * @generated
   */
  public Posto setCidade(java.lang.String cidade){
    this.cidade = cidade;
    return this;
  }

  /**
   * Obtém uf
   * return uf
   * @generated
   */
  
  public java.lang.String getUf(){
    return this.uf;
  }

  /**
   * Define uf
   * @param uf uf
   * @generated
   */
  public Posto setUf(java.lang.String uf){
    this.uf = uf;
    return this;
  }

  /**
   * Obtém cnpj
   * return cnpj
   * @generated
   */
  
  public java.lang.Double getCnpj(){
    return this.cnpj;
  }

  /**
   * Define cnpj
   * @param cnpj cnpj
   * @generated
   */
  public Posto setCnpj(java.lang.Double cnpj){
    this.cnpj = cnpj;
    return this;
  }

  /**
   * Obtém latitude
   * return latitude
   * @generated
   */
  
  public java.lang.Double getLatitude(){
    return this.latitude;
  }

  /**
   * Define latitude
   * @param latitude latitude
   * @generated
   */
  public Posto setLatitude(java.lang.Double latitude){
    this.latitude = latitude;
    return this;
  }

  /**
   * Obtém longitude
   * return longitude
   * @generated
   */
  
  public java.lang.Double getLongitude(){
    return this.longitude;
  }

  /**
   * Define longitude
   * @param longitude longitude
   * @generated
   */
  public Posto setLongitude(java.lang.Double longitude){
    this.longitude = longitude;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Posto object = (Posto)obj;
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
