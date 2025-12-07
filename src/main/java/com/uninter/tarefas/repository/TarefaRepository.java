package com.uninter.tarefas.repository;

import com.uninter.tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // O JpaRepository já contém métodos prontos para salvar, deletar, listar e buscar por ID.
}