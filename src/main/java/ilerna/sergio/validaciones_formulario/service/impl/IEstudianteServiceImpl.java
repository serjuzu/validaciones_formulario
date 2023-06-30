package ilerna.sergio.validaciones_formulario.service.impl;

import ilerna.sergio.validaciones_formulario.dao.IEstudianteDao;
import ilerna.sergio.validaciones_formulario.entity.Estudiante;
import ilerna.sergio.validaciones_formulario.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IEstudianteServiceImpl implements IEstudianteService {
    @Autowired
    IEstudianteDao estudianteDao;
    @Override
    public void guardar(Estudiante estudiante) {
        estudianteDao.save(estudiante);
    }

    @Override
    public List<Estudiante> listAllEstudents() {
        return estudianteDao.findAll();
    }
}
