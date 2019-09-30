package qestaodaaula2;
public class Professor {
    String nomeProfessor;
    int idadeProfessor;
    String turmaProfessor;
    String disciplinaProfessor;
    String turnoProfessor;
    boolean professorMatriculado;
    
    boolean verificarProfessorMatriculado(){
      return professorMatriculado = true; 
    }
    
    void statusAluno(){
        if (professorMatriculado == true){
        System.out.println("DADOS DO PROFESSOR\nNOME:\t"+nomeProfessor+"\nIDADE:\t"+idadeProfessor+"\nTURMA:\t"+turmaProfessor+"\nDISCIPLINA:\t"+disciplinaProfessor+"\nTURNO:\t"+turnoProfessor);
    }else{
            System.out.println(". . .  . ERRO .  . . .");
        }
    }
}
