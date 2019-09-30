package qestaodaaula2;
public class Turma {
    String nomeTurma;
    String serieTurma;
    String professorTurma;
    int quantidadeDeAlunos;
    String turnoTurma;
    int salaTurma;
    boolean salaDisponivel;
     boolean verificarDisponivelSalaParaTurma(){
      return salaDisponivel= true; 
    }
    
    void statusTurma(){
        if (salaDisponivel == true){
            System.out.println("DADOS DA TURMA\nNOME:\t"+nomeTurma+"\nSERIE:\t"+serieTurma+"\nPROFESSOR:\t"+professorTurma+"\n:QUANTIDADE DE ALUNOS:\t"+quantidadeDeAlunos+"\nTURNO:\t"+turnoTurma+"\nSALA:\t"+salaTurma);
        }else{
            System.out.println(". . .  . ERRO .  . . .");
        }
    }
}
