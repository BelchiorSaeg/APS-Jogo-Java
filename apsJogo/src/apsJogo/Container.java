package apsJogo;

import javax.swing.JFrame; //Importação do pacote para mexer com o gráfico

import apsJogo.Modelo.Fase;

public class Container extends JFrame{
    
    public Container (){ //Construtor
    	add(new Fase());
        setTitle("Nome do jogo"); //Titulo que apareceça  lá em cima na barra (onde tem minizar, max ou fechar)
        setSize(1024,728); //Declaração do tamanho da tela, no caso 1024x728
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //FAz com que a aplicação se encerre ao Clicar no 'X'
        setLocationRelativeTo(null); //Declara onde a tela iria iniciar, no caso Null será no centro
        this.setResizable(false); //Impede o usuario de mudar a resolução ou full Screen
        setVisible(true); //Faz com que toda aplicação feita até agora, seja visivel.
    }
    
    public static void main(String []args){
        new Container();
    }
}
