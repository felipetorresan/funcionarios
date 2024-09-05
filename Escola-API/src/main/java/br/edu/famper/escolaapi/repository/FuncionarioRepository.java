package br.edu.famper.escolaapi.repository;

import br.edu.famper.escolaapi.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
