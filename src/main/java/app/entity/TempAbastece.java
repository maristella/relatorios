package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TEMPABASTECE
 * @generated
 */
@Entity
@Table(name = "\"TEMPABASTECE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TempAbastece")
public class TempAbastece implements Serializable {

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
  @Column(name = "ano", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer ano;

  /**
  * @generated
  */
  @Column(name = "placa", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String placa;

  /**
  * @generated
  */
  @Column(name = "email_user", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String email_user;

  /**
  * @generated
  */
  @Column(name = "marca", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String marca;

  /**
  * @generated
  */
  @Column(name = "modelo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String modelo;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @Column(name = "id_abastece", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String id_abastece;

  /**
  * @generated
  */
  @Column(name = "id_posto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String id_posto;

  /**
  * @generated
  */
  @Column(name = "nome_posto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome_posto;

  /**
  * @generated
  */
  @Column(name = "km", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double km;

  /**
  * @generated
  */
  @Column(name = "precolitro", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double precolitro;

  /**
  * @generated
  */
  @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double valor;

  /**
   * Construtor
   * @generated
   */
  public TempAbastece(){
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
  public TempAbastece setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém ano
   * return ano
   * @generated
   */
  
  public java.lang.Integer getAno(){
    return this.ano;
  }

  /**
   * Define ano
   * @param ano ano
   * @generated
   */
  public TempAbastece setAno(java.lang.Integer ano){
    this.ano = ano;
    return this;
  }

  /**
   * Obtém placa
   * return placa
   * @generated
   */
  
  public java.lang.String getPlaca(){
    return this.placa;
  }

  /**
   * Define placa
   * @param placa placa
   * @generated
   */
  public TempAbastece setPlaca(java.lang.String placa){
    this.placa = placa;
    return this;
  }

  /**
   * Obtém email_user
   * return email_user
   * @generated
   */
  
  public java.lang.String getEmail_user(){
    return this.email_user;
  }

  /**
   * Define email_user
   * @param email_user email_user
   * @generated
   */
  public TempAbastece setEmail_user(java.lang.String email_user){
    this.email_user = email_user;
    return this;
  }

  /**
   * Obtém marca
   * return marca
   * @generated
   */
  
  public java.lang.String getMarca(){
    return this.marca;
  }

  /**
   * Define marca
   * @param marca marca
   * @generated
   */
  public TempAbastece setMarca(java.lang.String marca){
    this.marca = marca;
    return this;
  }

  /**
   * Obtém modelo
   * return modelo
   * @generated
   */
  
  public java.lang.String getModelo(){
    return this.modelo;
  }

  /**
   * Define modelo
   * @param modelo modelo
   * @generated
   */
  public TempAbastece setModelo(java.lang.String modelo){
    this.modelo = modelo;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public TempAbastece setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém id_abastece
   * return id_abastece
   * @generated
   */
  
  public java.lang.String getId_abastece(){
    return this.id_abastece;
  }

  /**
   * Define id_abastece
   * @param id_abastece id_abastece
   * @generated
   */
  public TempAbastece setId_abastece(java.lang.String id_abastece){
    this.id_abastece = id_abastece;
    return this;
  }

  /**
   * Obtém id_posto
   * return id_posto
   * @generated
   */
  
  public java.lang.String getId_posto(){
    return this.id_posto;
  }

  /**
   * Define id_posto
   * @param id_posto id_posto
   * @generated
   */
  public TempAbastece setId_posto(java.lang.String id_posto){
    this.id_posto = id_posto;
    return this;
  }

  /**
   * Obtém nome_posto
   * return nome_posto
   * @generated
   */
  
  public java.lang.String getNome_posto(){
    return this.nome_posto;
  }

  /**
   * Define nome_posto
   * @param nome_posto nome_posto
   * @generated
   */
  public TempAbastece setNome_posto(java.lang.String nome_posto){
    this.nome_posto = nome_posto;
    return this;
  }

  /**
   * Obtém km
   * return km
   * @generated
   */
  
  public java.lang.Double getKm(){
    return this.km;
  }

  /**
   * Define km
   * @param km km
   * @generated
   */
  public TempAbastece setKm(java.lang.Double km){
    this.km = km;
    return this;
  }

  /**
   * Obtém precolitro
   * return precolitro
   * @generated
   */
  
  public java.lang.Double getPrecolitro(){
    return this.precolitro;
  }

  /**
   * Define precolitro
   * @param precolitro precolitro
   * @generated
   */
  public TempAbastece setPrecolitro(java.lang.Double precolitro){
    this.precolitro = precolitro;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public java.lang.Double getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public TempAbastece setValor(java.lang.Double valor){
    this.valor = valor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TempAbastece object = (TempAbastece)obj;
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
