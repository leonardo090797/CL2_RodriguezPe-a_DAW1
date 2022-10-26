package com.cibertec.cl2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.cl2.entity.Libros;
import com.cibertec.cl2.services.AutoresService;
import com.cibertec.cl2.services.GeneroService;
import com.cibertec.cl2.services.LibrosService;

@Controller
@RequestMapping("/Libros")
public class LibrosController {
	@Autowired
	private LibrosService servicioLibro;
	@Autowired
	private AutoresService servicioAutores;
	@Autowired
	private GeneroService servicioGenero;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("genero",servicioGenero.listarGenero());
		model.addAttribute("autores",servicioAutores.listarAutores());
		return "cl2";
	}
	@RequestMapping("/consulta")
	@ResponseBody
	public List<Libros> consulta(@RequestParam("codAutor") int p){
		return servicioLibro.listarxAutor(p);
	}
	@RequestMapping("/eliminar")
	public String eliminar(@RequestParam("codigo") int cod,RedirectAttributes redirect){
		try {
			servicioLibro.eliminar(cod);
			redirect.addFlashAttribute("MENSAJE","LIBRO eliminado");
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE","Error en la eliminacion");
			e.printStackTrace();
		}
		
		return "redirect:/Libros/";
	}

}
