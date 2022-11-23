package batalhanavel;

import javax.swing.JOptionPane;

public class BatalhaNavel {

    public static void main(String[] args) {
    String [][] mostrar = new String[5][5];
    String exibir = "";
    int ponto = 0;
    
    int[] cont = {0,0};
    
    int[][] posicoes = new int[5][5];
    
    int a = 0, b = 0;
    
    for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++){
            mostrar[i][j] = "  -  ";
            exibir += mostrar[i][j];
            posicoes[i][j] = 0;
        }
        exibir += "\n";
    }
    posicoes[1][1] = 1;
    posicoes[4][0] = 1;
    posicoes[2][4] = 1;
    posicoes[0][3] = 2;
    posicoes[0][4] = 2;
    posicoes[3][2] = 3;
    posicoes[3][3] = 3;
    posicoes[3][4] = 3;
    
    JOptionPane.showMessageDialog(null, exibir);
    
    for(int i = 0; i < 10; i++){
        exibir ="";
            String x = JOptionPane.showInputDialog(null, "Insira a linha: ");
            a = Integer.parseInt(x);
            
            String y = JOptionPane.showInputDialog(null, "Insira a coluna: ");
            b = Integer.parseInt(y);
            
        //userPosicoes[a][b] = 1;
        switch (posicoes[a][b]) {
            
            case 1:
                mostrar[a][b] = " X ";
                posicoes[a][b] = 5;
                ponto++;
                break;
            case 2:
                mostrar[a][b] = " X ";
                posicoes[a][b] = 5;
                cont[0]++;
                break;
            case 3:
                mostrar[a][b] = " X ";
                posicoes[a][b] = 5;
                cont[1]++;
                break;
                
            default:
                mostrar[a][b] = " ~ ";
                break;
               
        }
            for(int j = 0; j < 5; j++){
                for(int k = 0; k < 5; k++){
                    exibir += mostrar[j][k];
                }
                    exibir += "\n";
            }
            
            if(cont[0] == 2) ponto = 1;
            
            if(cont[1] == 3) ponto = 1;
            
            if(ponto == 1) break;
            
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    if(ponto == 1){
        JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou");
    }
    else{
        JOptionPane.showMessageDialog(null, "Que pena :( \n Não foi dessa vez");
    }
}
    }
    
