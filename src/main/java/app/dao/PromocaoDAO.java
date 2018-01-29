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
@Repository("PromocaoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PromocaoDAO extends JpaRepository<Promocao, java.lang.String> {

  /**
   * Obtém a instância de Promocao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Promocao entity WHERE entity.id = :id")
  public Promocao findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Promocao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Promocao entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



    
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Promocao entity WHERE :search = :search")
  public Page<Promocao> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Promocao entity WHERE (:inicio is null OR entity.inicio = :inicio) AND (:fim is null OR entity.fim = :fim) AND (:precopromo is null OR entity.precopromo = :precopromo)")
  public Page<Promocao> specificSearch(@Param(value="inicio") java.util.Date inicio, @Param(value="fim") java.util.Date fim, @Param(value="precopromo") java.lang.Double precopromo, Pageable pageable);
  
  /**
   * Foreign Key histPrecos
   * @generated
   */
  @Query("SELECT entity FROM Promocao entity WHERE entity.histPrecos.id = :id")
  public Page<Promocao> findPromocaosByHistPrecos(@Param(value="id") java.lang.String id, Pageable pageable);

}
