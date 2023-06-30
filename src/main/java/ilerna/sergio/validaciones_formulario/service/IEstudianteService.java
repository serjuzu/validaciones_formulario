package ilerna.sergio.validaciones_formulario.service;

import ilerna.sergio.validaciones_formulario.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public void guardar(Estudiante estudiante);

    public List<Estudiante> listAllEstudents();
}
