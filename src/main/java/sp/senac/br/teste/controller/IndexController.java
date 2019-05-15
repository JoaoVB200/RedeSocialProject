package sp.senac.br.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sp.senac.br.teste.entity.Usuario;
import sp.senac.br.teste.repositories.UsuarioRepository;

@Controller
public class IndexController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public ModelAndView home() {

        ModelAndView mv = new ModelAndView("/index");

        Usuario usuario = new Usuario("ari","baatata@gmail.com","153654","ADMIN");

        usuarioRepository.save(usuario);

        return mv;

    }

}
