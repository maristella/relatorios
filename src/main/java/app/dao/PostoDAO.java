package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("PostoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PostoDAO extends JpaRepository<Posto, java.lang.String> {

  /**
   * Obtém a instância de Posto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Posto entity WHERE entity.id = :id")
  public Posto findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Posto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Posto entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ImagensPosto entity WHERE entity.posto.id = :id")
  public Page<ImagensPosto> findImagensPosto(@Param(value="id") java.lang.String id, Pageable pageable);
    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM HistPrecos entity WHERE entity.posto.id = :id AND (entity.combustivel like concat('%',coalesce(:search,''),'%'))")
  public Page<HistPrecos> findHistPrecosGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM HistPrecos entity WHERE entity.posto.id = :id AND (:combustivel is null OR entity.combustivel like concat('%',:combustivel,'%')) AND (:inicioVigencia is null OR entity.inicioVigencia = :inicioVigencia) AND (:preco is null OR entity.preco = :preco)")
  public Page<HistPrecos> findHistPrecosSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="combustivel") java.lang.String combustivel, @Param(value="inicioVigencia") java.util.Date inicioVigencia, @Param(value="preco") java.lang.Double preco, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM HistPrecos entity WHERE entity.posto.id = :id")
  public Page<HistPrecos> findHistPrecos(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Posto entity WHERE entity.name like concat('%',coalesce(:search,''),'%') OR entity.cep like concat('%',coalesce(:search,''),'%') OR entity.logradouro like concat('%',coalesce(:search,''),'%') OR entity.bairro like concat('%',coalesce(:search,''),'%') OR entity.cidade like concat('%',coalesce(:search,''),'%') OR entity.uf like concat('%',coalesce(:search,''),'%')")
  public Page<Posto> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Posto entity WHERE (:name is null OR entity.name like concat('%',:name,'%')) AND (:cep is null OR entity.cep like concat('%',:cep,'%')) AND (:logradouro is null OR entity.logradouro like concat('%',:logradouro,'%')) AND (:bairro is null OR entity.bairro like concat('%',:bairro,'%')) AND (:cidade is null OR entity.cidade like concat('%',:cidade,'%')) AND (:uf is null OR entity.uf like concat('%',:uf,'%'))")
  public Page<Posto> specificSearch(@Param(value="name") java.lang.String name, @Param(value="cep") java.lang.String cep, @Param(value="logradouro") java.lang.String logradouro, @Param(value="bairro") java.lang.String bairro, @Param(value="cidade") java.lang.String cidade, @Param(value="uf") java.lang.String uf, Pageable pageable);
  
  /**
   * Foreign Key company
   * @generated
   */
  @Query("SELECT entity FROM Posto entity WHERE entity.company.id = :id")
  public Page<Posto> findPostosByCompany(@Param(value="id") java.lang.String id, Pageable pageable);

}
