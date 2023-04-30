package pe.edu.cibertec.appbasedatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.appbasedatos.service.EstadoService;

@Controller
@RequestMapping("/Estado")

public class EstadoController {
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping("/frmManEstado")
	public String frmManEstado(Model model) {
		model.addAttribute("listadoEstado",estadoService.listarEstados());
		return "Estado/frmManEstado";
	}
}