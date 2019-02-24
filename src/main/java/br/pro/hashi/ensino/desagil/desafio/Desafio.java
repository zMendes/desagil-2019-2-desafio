package br.pro.hashi.ensino.desagil.desafio;

import java.io.IOException;

public class Desafio {
    public static void main(String[] args) throws IOException {
        Board board = new Board("board.txt");

        Target target = new Target(4, 14);

        HumanPlayer humanPlayer = new HumanPlayer(0, 0, board);

        CpuPlayer cpuPlayer = new CpuPlayer(8, 18, board);
    }
}
