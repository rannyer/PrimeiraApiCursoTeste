package com.example.PrimeiraApi.services;

import com.example.PrimeiraApi.models.Aluno;
import com.example.PrimeiraApi.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno buscarAlunoPorId(int id){
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return aluno.get();
    }

    public String salvarAluno(Aluno aluno){
        alunoRepository.save(aluno);
        return "Criado com Sucesso";
    }

    public List<Aluno> buscarTodos(){
        return alunoRepository.findAll();
    }





}
