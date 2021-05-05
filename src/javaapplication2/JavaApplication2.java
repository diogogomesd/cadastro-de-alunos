/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;



import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author diogo
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {	
        // TODO code application logic here
	
	List<Alunos> alunos = new ArrayList<Alunos>();
	    
	for(int qtd = 1; qtd <=2; qtd ++){    
	
		Alunos aluno = new Alunos();
		aluno.setNome(JOptionPane.showInputDialog("digite o nome do aluno "+qtd+""));/*
		aluno.setIdade(Integer.valueOf(JOptionPane.showInputDialog("digite sua idade")));
		aluno.setNomeEscola(JOptionPane.showInputDialog("digite o nome da escola"));
		aluno.setDataNascimento(JOptionPane.showInputDialog("digite a sua date de nacimento"));
		aluno.setRegistroGeral(JOptionPane.showInputDialog("digite o seu rg"));
		aluno.setNumeroCpf(JOptionPane.showInputDialog("digite o seu CPF"));
		aluno.setNomeMae(JOptionPane.showInputDialog("digite o nome da sua mãe"));
		aluno.setNomePai(JOptionPane.showInputDialog("digite o nome do seu Pai"));
		aluno.setDataMatricula(JOptionPane.showInputDialog("digite a data de sua matricula"));
		aluno.setSerieMatriculado(JOptionPane.showInputDialog("Digite qual a a Serie que está matriculado"));*/


		for(int pos = 1; pos <=4; pos ++){
			String nomeDisciplina = JOptionPane.showInputDialog("digite aqui a disciplina "+pos+"");
			double nota = Double.parseDouble(JOptionPane.showInputDialog("digite aqui a nota"+pos+""));
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(nota);

			aluno.getDisciplinas().add(disciplina);		
		}

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

		if(escolha == 0){
			int continuaRemover = 0;
			int posicao = 1;
			while(continuaRemover == 0){
				int remover = Integer.parseInt(JOptionPane.showInputDialog
	                        ("Qual disciplina deja remover, 1, 2, 3 ou 4 ? "));
				aluno.getDisciplinas().remove((remover)-1);
				posicao ++;
				continuaRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover disciplinas");

			}
		}



		alunos.add(aluno);
		}
		for (Alunos aluno : alunos) {
		    JOptionPane.showMessageDialog(null, "a media é: "+aluno.getMedia());
		    if(aluno.getMedia() >=6 && aluno.getMedia() <= 8){
			JOptionPane.showMessageDialog(null, "Estude um pouco mais: "+aluno.getNome()+ " voce está em recuperação");
		    }
		    else if(aluno.getMedia()> 8.1){
			JOptionPane.showMessageDialog(null, "Parabens: "+aluno.getNome()+" voce está aprovado");
		    }
		    else if(aluno.getMedia()< 5.9){
			JOptionPane.showMessageDialog(null, "Pena: "+aluno.getNome()+" Voce esta reptovado");
		    }
		    else{
			JOptionPane.showMessageDialog(null, "Caro: "+aluno.getNome()+" voce não possui notas");
		}
	    }
	    
    }

}

    

