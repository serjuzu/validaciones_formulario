package ilerna.sergio.validaciones_formulario.controller;

import ilerna.sergio.validaciones_formulario.dao.IEstudianteDao;
import ilerna.sergio.validaciones_formulario.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Autor:sjulvez
 * Fecha:29/06/2023
 */
@Controller
public class FormController {
    @Autowired
    private IEstudianteDao estudianteDao;

    @GetMapping("/")
    public String form(Map<String,Object> model){
        Estudiante estudiante = new Estudiante();
        model.put("estudiantes", estudiante);
        model.put("titulo", "Formulario de estudiantes");
        return "form";
    }
}
