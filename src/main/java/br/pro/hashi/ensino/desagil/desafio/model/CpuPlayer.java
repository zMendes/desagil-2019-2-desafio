package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Stack;

public class CpuPlayer extends Player {

    private final int numRows;
    private final int numCols;
    // Por outro lado, o conceito de nó também existe no caso do tabuleiro porque
    // precisamos de algum tipo de objeto para ser guardado na pilha. Veja no final
    // deste arquivo a definição de Node: serve apenas para guardar linha e coluna.
    private final Stack<Node> stack;
    // Uma das principais diferenças entre a busca na árvore e a busca no tabuleiro
    // é o conceito de localização: no primeiro caso, a localização é representada
    // por um nó da árvore, enquanto no segundo ela é representada por um índice de
    // linha e um índice de coluna. Na árvore podemos registrar no próprio nó se
    // ele foi visitado ou não. No tabuleiro, criamos uma matriz extra para isso.
    private boolean[][] visited;


    // Outra diferença fundamental entre o código do Estudo Individual 1 e este:
    // enquanto no EI havia um loop explícito criado por um while, aqui há um loop
    // implícito criado pelo relógio. A inicialização desse loop é o construtor.
    public CpuPlayer(int row, int col, Board board) {
        super(row, col, board);

        numRows = board.getNumRows();
        numCols = board.getNumCols();

        stack = new Stack<>();
    }


    // O corpo do loop implícito mencionado acima é este método.
    public void move() {
        // Se não tem próximo, reinicializamos a matriz de visitados.
        if (stack.isEmpty()) {
            visited = new boolean[numRows][numCols];

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {

                    // Uma parede não pode ser visitada, então já começa como true.
                    visited[i][j] = board.isWall(i, j);
                }
            }

            // O conceito de salvar é simples: marcar a posição atual como visitada
            // e registrar essa posição como um novo nó inserido na pilha. Esses dois
            // passos podem ser isolados em um método privado, que está definido abaixo.
            save();
        }
        // Na árvore, precisávamos dar um peek na pilha para descobrir a
        // localização atual. Aqui não precisamos fazer isso, pois já
        // sabemos essa localização: ela é dada pelos atributos row e col.

        if (row > 0 && !visited[row - 1][col]) {
            move(-1, 0);
            save();
        } else if (col < numCols - 1 && !visited[row][col + 1]) {
            move(0, 1);
            save();
        } else if (row < numRows - 1 && !visited[row + 1][col]) {
            move(1, 0);
            save();
        } else if (col > 0 && !visited[row][col - 1]) {
            move(0, -1);
            save();
        } else {
            stack.pop();

            // Por outro lado, quando queremos dar um passo para trás, temos
            // que dar um peek para descobrir qual era a localização anterior.

            if (!stack.isEmpty()) {
                Node node = stack.peek();

                row = node.getRow();
                col = node.getCol();
            }
        }
    }

    private void save() {
        visited[row][col] = true;
        stack.push(new Node(row, col));
    }


    // Aqui temos um exemplo de classe aninhada, ou seja, classe dentro de classe.
    // Estamos fazendo isso porque ninguém além de CpuPlayer precisa usar Node.
    // Parece estranho, mas CpuPlayer acessa tudo o que é privado de Node.
    private class Node {
        private final int row;
        private final int col;

        private Node(int row, int col) {
            this.row = row;
            this.col = col;
        }

        private int getRow() {
            return row;
        }

        private int getCol() {
            return col;
        }
    }
}
