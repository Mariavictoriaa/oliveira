package com.aprende.oliveira.Controle;


import com.aprende.oliveira.Model.Aluno;
import com.aprende.oliveira.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }
    @GetMapping
    public List<Aluno> buscarAlunos(){
        return service.ListaAluno()
    }
    @PostMapping
    public Aluno salvarAluno(@RequestBody Aluno novoAluno){
        return service.criarAluno(novoAluno);
    }
    @DeleteMapping("/id")
    public void excluirAluno(@PathVariable Long id){
         service.deletarAluno(id);
    }

    @GetMapping("/id")
    public Aluno buscaAlunoporId(@PathVariable Long id){
        return service.buscarAlunoporId(id);
    }

}
