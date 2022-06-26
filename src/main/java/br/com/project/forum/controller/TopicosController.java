package br.com.project.forum.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.project.forum.dto.TopicoDTO;
import br.com.project.forum.modelo.Topico;
import br.com.project.forum.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

  @Autowired
  private TopicoRepository topicoRepository;

  @GetMapping
  public List<TopicoDTO> lista(String nomeCurso) {
    
    if (nomeCurso == null) {
      System.out.println("null");
      List<Topico> topicos = topicoRepository.findAll();
      return TopicoDTO.converter(topicos);
    } else {
      System.out.println(nomeCurso);
      List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso); 
      return TopicoDTO.converter(topicos);
    }
    
  }

}
