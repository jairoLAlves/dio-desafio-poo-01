package com.th4mz0

import com.th4mz0.enums.Nivel
import com.th4mz0.models.Aluno
import com.th4mz0.models.Formacao
import com.th4mz0.models.ConteudoEducacional


fun main() {
    // Criando alguns alunos
    val aluno1 = Aluno("João", 25)
    val aluno2 = Aluno("Maria", 30)
    val aluno3 = Aluno("Pedro", 20)

    // Criando alguns conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução à programação", "Conceitos básicos de programação")
    val conteudo2 = ConteudoEducacional("Estrutura de dados", "Tipos de dados e estruturas de armazenamento")
    val conteudo3 = ConteudoEducacional("Algoritmos avançados", "Algoritmos de busca e ordenação")

    // Criando uma formação e adicionando conteúdos
    val formacao = Formacao("Formação em programação", Nivel.DIFICIL, listOf(conteudo1, conteudo2, conteudo3))

    // Matriculando alunos na formação
    formacao.matricular(aluno1, aluno2)

    // Desmatriculando um aluno
    formacao.desmatricular(aluno1)

    // Matriculando outro aluno na formação
    formacao.matricular(aluno3)
}