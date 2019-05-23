package sp.senac.br.teste.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sp.senac.br.teste.entity.Usuario;
import sp.senac.br.teste.repositories.UsuarioRepository;
import sp.senac.br.teste.service.UsuarioService;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;


    @GetMapping("/cadastroUsuario")
    public String usuario() {
        return "/cadastro_usuario";
    }

    @PostMapping("/salvar")
    public  String salvarUsuario(@RequestParam String nome,@RequestParam String email,@RequestParam String senha,@RequestParam String perfil){

        Usuario usuario = new Usuario(nome,email,senha,perfil);

        usuarioService.salvar(usuario);

        return "/cadastro_usuario";
    }


    @PostMapping("/listar")
    public ModelAndView listarUsuario(){

        Iterable<Usuario> usuarios = usuarioService.listarTodos();

        ModelAndView mv = new ModelAndView("/listar_usuario");

        mv.addObject("usuarios",usuarios);

        return mv;
    }

}
