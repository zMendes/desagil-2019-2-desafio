package br.pro.hashi.ensino.desagil.desafio;

import java.io.IOException;

public class Desafio {
    public static void main(String[] args) throws IOException {
        Board board = new Board();
        board.load("board.txt");

        Target target = new Target();
        target.row = 4;
        target.col = 14;

        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.row = 0;
        humanPlayer.col = 0;
        humanPlayer.board = board;

        CpuPlayer cpuPlayer = new CpuPlayer();
        cpuPlayer.row = 8;
        cpuPlayer.col = 18;
        cpuPlayer.board = board;
    }
}
