package br.edu.famper.escolaapi.service;

import br.edu.famper.escolaapi.model.Funcionario;
import br.edu.famper.escolaapi.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario cadastrarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> buscarFuncionarioPorId(Long id) {
        return funcionarioRepository.findById(id);
    }

    public Funcionario atualizarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public void excluirFuncionario(Long id) {
        funcionarioRepository.deleteById(id);
    }
}
