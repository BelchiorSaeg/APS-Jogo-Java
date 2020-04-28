package apsJogo;

import javax.swing.JFrame; //Importa��o do pacote para mexer com o gr�fico

import apsJogo.Modelo.Fase;

public class Container extends JFrame{
    
    public Container (){ //Construtor
    	add(new Fase());
        setTitle("Nome do jogo"); //Titulo que aparece�a  l� em cima na barra (onde tem minizar, max ou fechar)
        setSize(1024,728); //Declara��o do tamanho da tela, no caso 1024x728
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //FAz com que a aplica��o se encerre ao Clicar no 'X'
        setLocationRelativeTo(null); //Declara onde a tela iria iniciar, no caso Null ser� no centro
        this.setResizable(false); //Impede o usuario de mudar a resolu��o ou full Screen
        setVisible(true); //Faz com que toda aplica��o feita at� agora, seja visivel.
    }
    
    public static void main(String []args){
        new Container();
    }
}
