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
@Repository("ImagensPostoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ImagensPostoDAO extends JpaRepository<ImagensPosto, java.lang.String> {

  /**
   * Obtém a instância de ImagensPosto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ImagensPosto entity WHERE entity.id = :id")
  public ImagensPosto findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ImagensPosto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ImagensPosto entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key posto
   * @generated
   */
  @Query("SELECT entity FROM ImagensPosto entity WHERE entity.posto.id = :id")
  public Page<ImagensPosto> findImagensPostosByPosto(@Param(value="id") java.lang.String id, Pageable pageable);

}
