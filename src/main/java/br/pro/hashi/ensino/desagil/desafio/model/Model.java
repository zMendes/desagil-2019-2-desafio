package br.pro.hashi.ensino.desagil.desafio.model;

import java.io.IOException;

public class Model {
    private final Board board;
    private final Target target;
    private final HumanPlayer humanPlayer;
    private final CpuPlayer cpuPlayer;

    public Model() throws IOException {
        board = new Board("board.txt");

        target = new Target(4, 14);

        humanPlayer = new HumanPlayer(0, 0, board);

        cpuPlayer = new CpuPlayer(8, 18, board);
    }

    public Board getBoard() {
        return board;
    }

    public Target getTarget() {
        return target;
    }

    public HumanPlayer getHumanPlayer() {
        return humanPlayer;
    }

    public CpuPlayer getCpuPlayer() {
        return cpuPlayer;
    }
}
