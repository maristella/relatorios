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
@Repository("HistPrecosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface HistPrecosDAO extends JpaRepository<HistPrecos, java.lang.String> {

  /**
   * Obtém a instância de HistPrecos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HistPrecos entity WHERE entity.id = :id")
  public HistPrecos findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de HistPrecos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HistPrecos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


      
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Promocao entity WHERE entity.histPrecos.id = :id AND (:search = :search)")
  public Page<Promocao> findPromocaoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Promocao entity WHERE entity.histPrecos.id = :id AND (:inicio is null OR entity.inicio = :inicio) AND (:fim is null OR entity.fim = :fim) AND (:precopromo is null OR entity.precopromo = :precopromo)")
  public Page<Promocao> findPromocaoSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="inicio") java.util.Date inicio, @Param(value="fim") java.util.Date fim, @Param(value="precopromo") java.lang.Double precopromo, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Promocao entity WHERE entity.histPrecos.id = :id")
  public Page<Promocao> findPromocao(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM HistPrecos entity WHERE entity.combustivel like concat('%',coalesce(:search,''),'%')")
  public Page<HistPrecos> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM HistPrecos entity WHERE (:combustivel is null OR entity.combustivel like concat('%',:combustivel,'%')) AND (:inicioVigencia is null OR entity.inicioVigencia = :inicioVigencia) AND (:preco is null OR entity.preco = :preco)")
  public Page<HistPrecos> specificSearch(@Param(value="combustivel") java.lang.String combustivel, @Param(value="inicioVigencia") java.util.Date inicioVigencia, @Param(value="preco") java.lang.Double preco, Pageable pageable);
  
  /**
   * Foreign Key posto
   * @generated
   */
  @Query("SELECT entity FROM HistPrecos entity WHERE entity.posto.id = :id")
  public Page<HistPrecos> findHistPrecossByPosto(@Param(value="id") java.lang.String id, Pageable pageable);

}
