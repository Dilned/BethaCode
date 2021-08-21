import model.Diretor;
import model.Funcionario;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Funcionario

        Funcionario funcionario = new Funcionario(1,"Dilnei","123456789",1000.00);

        FuncionarioService service = new FuncionarioService();

        service.save(funcionario);

        funcionario.setNome(funcionario.getNome() + " - alterado");

        service.update(funcionario);

        FuncionarioRepository repository = new FuncionarioRepository();

        repository.findAll();

        repository.findById(1);

//        //Diretor
//
//        Diretor diretor = new Diretor(1,"Davi","123456711",2000.00, 500.00);
//
//        DiretorService service2 = new DiretorService();
//
//        service2.save(diretor);
//
//        diretor.setNome(funcionario.getNome() + " - alterado");
//
//        service2.update(diretor);
//
//        DiretorRepository repository2 = new DiretorRepository();
//
//        repository.findAll();
//
//        repository.findById(1);

    }
}