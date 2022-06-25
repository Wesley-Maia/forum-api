package br.com.project.forum.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.project.forum.dto.TopicoDTO;
import br.com.project.forum.modelo.Curso;
import br.com.project.forum.modelo.Topico;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

  @GetMapping
  public List<TopicoDTO> lista() {
     Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));
     return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
  }
  
}
