package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Random;

public class Model {
    private final Board board;
    private final HumanPlayer humanPlayer;
    private final CpuPlayer cpuPlayer;
    private Element target;

    public Model() {
        board = new Board("board.txt");

        humanPlayer = new HumanPlayer(0, 0, board);

        cpuPlayer = new CpuPlayer(8, 18, board);

        target = new Element(0, 0);

        chooseRandomTarget();
    }

    public Board getBoard() {
        return board;
    }

    public Element getTarget() {
        return target;
    }

    public HumanPlayer getHumanPlayer() {
        return humanPlayer;
    }

    public CpuPlayer getCpuPlayer() {
        return cpuPlayer;
    }

    public void chooseRandomTarget() {
        int positions[][] = {
                {2, 2},
                {2, 16},
                {6, 16},
                {8, 6},
                {6, 6},
                {4, 14}
        };
        int randomIndex = new Random().nextInt(positions.length);
        target.setRow(positions[randomIndex][0]);
        target.setCol(positions[randomIndex][1]);
    }
}
