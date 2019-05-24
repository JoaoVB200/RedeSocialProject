//package sp.senac.br.teste;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import sp.senac.br.teste.entity.Usuario;
//import sp.senac.br.teste.repositories.UsuarioRepository;
//import sp.senac.br.teste.service.UsuarioService;
//
//import java.util.Collection;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UsuarioServiceTest {
//
//    @Autowired
//    private UsuarioRepository usuarioRepository;
//    @Autowired
//    private UsuarioService UserService;
//
//    @Before
//    public void populaBanco() {
//        for (int i = 0; i < 20; i++) {
//            Usuario usuario = new Usuario("Ari" + (i + 1), "ari@ari", "12312313213", "ADMIN");
//            usuarioRepository.save(usuario);
//        }
//    }
//
//    @Test
//    public void listandoUsuarioSalvosTeste() {
//
//        {
//            Assert.assertEquals(20, ((Collection<?>) UserService.listarTodos()).size());
//        }
//    }
//
//    @Test
//    public void salvarUsuarioTeste() {
//        Usuario salvarUS = new Usuario("Joao", "Email@email","123123","ADMIN");
//
//        Assert.assertEquals(UserService.salvar(salvarUS);
//    }
//
//
//}