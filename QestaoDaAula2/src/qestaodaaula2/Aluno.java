package qestaodaaula2;
class Aluno {
    String nomeAluno;
    int idadeAluno;
    String turmaAluno;
    String serieAluno;
    String turnoAluno;
    boolean alunoMatriculado;
    
    
    boolean verificarAlunoMatriculado(){
      return alunoMatriculado = true; 
    }
    
    void statusAluno(){
        if (alunoMatriculado == true){
        System.out.println("DADOS DO ALUNO\nNOME:\t"+nomeAluno+"\nIDADE:\t"+idadeAluno+"\nSÉRIE:\t"+serieAluno+"\nTURMA:\t"+turmaAluno+"\nTURNO:\t"+turnoAluno);
    }else{
            System.out.println(". . .  . ERRO .  . . .");
        }
    }
}
