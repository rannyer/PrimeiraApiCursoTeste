package com.example.PrimeiraApi.controllers;

import com.example.PrimeiraApi.models.Aluno;
import com.example.PrimeiraApi.services.AlunoService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    AlunoService alunoService;

    public AlunoController(AlunoService alunoService){
       this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> buscarTodos(){
        return alunoService.buscarTodos();
    }

    @PostMapping
    public String adicionarAluno(@RequestBody Aluno aluno){
        String resposta = alunoService.salvarAluno(aluno);
        return resposta;
    }

    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable int id){
        return alunoService.buscarAlunoPorId(id);
    }
}
