package com.th4mz0.models
import com.th4mz0.models.Aluno
import com.th4mz0.enums.Nivel

class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val matriculados = mutableListOf<Aluno>()

    fun matricular(vararg alunos: Aluno) {
        matriculados.addAll(alunos)
        println("Matrícula(s) realizada(s) com sucesso na formação ${nome}")
    }

    fun desmatricular(aluno: Aluno) {
        if (matriculados.contains(aluno)) {
            matriculados.remove(aluno)
            println("${aluno.nome} foi desmatriculado com sucesso da formação ${nome}")
        } else {
            println("${aluno.nome} não está matriculado na formação ${nome}")
        }
    }
}