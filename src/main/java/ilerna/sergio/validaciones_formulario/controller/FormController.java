package ilerna.sergio.validaciones_formulario.controller;

import ilerna.sergio.validaciones_formulario.dao.IEstudianteDao;
import ilerna.sergio.validaciones_formulario.entity.Estudiante;
import ilerna.sergio.validaciones_formulario.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String guardar(@Valid  Estudiante estudiante, BindingResult result, RedirectAttributes flash){
        if (result.hasErrors()){
            return "form";
        }
        estudianteService.guardar(estudiante);
        flash.addFlashAttribute("success", "Estudiante guardado con éxito");
        return "redirect:/";
    }
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("estudiantes", estudianteService.listAllEstudents());
        model.addAttribute("titulo", "Listado de estudiantes");
        model.addAttribute("encabezado", "Tabla de estudiantes");
        return "list";
    }

}
