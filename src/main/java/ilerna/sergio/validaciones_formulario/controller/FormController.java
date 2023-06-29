package ilerna.sergio.validaciones_formulario.controller;

import ilerna.sergio.validaciones_formulario.dao.IEstudianteDao;
import ilerna.sergio.validaciones_formulario.entity.Estudiante;
import ilerna.sergio.validaciones_formulario.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

/**
 * Autor:sjulvez
 * Fecha:29/06/2023
 */
@Controller
public class FormController {
    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping("/")
    public String form(Map<String,Object> model){
        Estudiante estudiante = new Estudiante();
        model.put("estudiante", estudiante);
        model.put("titulo", "Formulario de estudiantes");
        return "form";
    }
    @PostMapping("/")
    public String guardar(@Valid  Estudiante estudiante, BindingResult result){
        if (result.hasErrors()){
            return "form";
        }
        estudianteService.guardar(estudiante);
        return "redirect:/list";
    }
    @GetMapping("/list")
    public String list(){
        return "list";
    }

}
