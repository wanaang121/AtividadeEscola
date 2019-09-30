package qestaodaaula2;
public class QestaoDaAula2 {
    public static void main(String[] args) {
       Aluno aluno = new Aluno();
       aluno.nomeAluno = "CHRISTIAN";
       aluno.idadeAluno = 19;
       aluno.serieAluno = "9° ano";
       aluno.turmaAluno = "C";
       aluno.turnoAluno = "INTEGRAL";
       //aluno.verificarAlunoMatriculado();
       //aluno.statusAluno();

        Professor professor = new Professor();
       professor.nomeProfessor = "ALCEMIR";
       professor.idadeProfessor = 30;
       professor.turmaProfessor = aluno.turmaAluno;
       professor.disciplinaProfessor = "PROGRAMAÇÃO";
       professor.turnoProfessor = aluno.turnoAluno;
       //professor.verificarProfessorMatriculado();
       //professor.statusAluno();

       
       Turma turma = new Turma();
       turma.nomeTurma = aluno.turmaAluno;
       turma.professorTurma = professor.nomeProfessor;
       turma.quantidadeDeAlunos = 30;
       turma.salaTurma = 8;
       turma.serieTurma = aluno.serieAluno;
       turma.turnoTurma = aluno.turnoAluno;
       //turma.verificarDisponivelSalaParaTurma();
       //turma.statusTurma();
       
       Disciplina disciplina = new Disciplina();
       disciplina.cargaHoraria = 60;
       disciplina.cargaHorariaMinima = 90;
       disciplina.nomeDisciplina = professor.disciplinaProfessor;
       disciplina.professorDisciplina = professor.nomeProfessor;
       disciplina.turmaDisciplina = aluno.turmaAluno;
       disciplina.statusDisciplina();
       disciplina.verificarCargaHoraria();
    }
    
}
