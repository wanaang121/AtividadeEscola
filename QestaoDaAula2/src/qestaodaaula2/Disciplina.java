package qestaodaaula2;
public class Disciplina {
       String nomeDisciplina;
       String professorDisciplina;
       String turmaDisciplina;
       int cargaHoraria;
       int cargaHorariaMinima;
       
       void statusDisciplina(){
           System.out.println("DADOS DA DISCIPLINA\nNOME:\t"+nomeDisciplina+"\nPROFESSOR:\t"+professorDisciplina+"TURMA:\t"+turmaDisciplina);
       }
       void verificarCargaHoraria(){
           if (cargaHoraria <= cargaHorariaMinima){
               System.out.println("DISCIPLINA ABERTA, RETAM AINDA:"+(cargaHorariaMinima - cargaHoraria)+"HORAS PARA SER ENCERRADA");
           }else{
               System.out.println("DISCIPLINA COMPLETA");
           }
       }
       
}
