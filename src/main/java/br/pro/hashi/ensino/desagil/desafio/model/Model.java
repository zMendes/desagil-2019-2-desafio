package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Random;

public class Model {
    private final Board board;
    private Element target;
    private final HumanPlayer humanPlayer;
    private final CpuPlayer cpuPlayer;

    public Model() {
        board = new Board("board.txt");

        humanPlayer = new HumanPlayer(0, 0, board);

        cpuPlayer = new CpuPlayer(8, 18, board);

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
    	Element elements[] = {
    		new Element(2, 2),
			new Element(2, 16),
			new Element(6, 16),
			new Element(8, 6),
			new Element(6, 6),
			new Element(4, 14)
    	};
		int randomIndex = new Random().nextInt(elements.length);
		target = elements[randomIndex];
	}
}
