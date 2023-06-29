package ilerna.sergio.validaciones_formulario.dao;

import ilerna.sergio.validaciones_formulario.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Autor:sjulvez
 * Fecha:29/06/2023
 */
@Repository
public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
}
