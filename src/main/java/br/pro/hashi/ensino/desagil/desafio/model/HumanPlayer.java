package br.pro.hashi.ensino.desagil.desafio.model;

public class HumanPlayer extends Player {
    public HumanPlayer(int row, int col, Board board) {
        super(row, col, board);
    }

    public void moveUp() {
        System.out.println("up");
    }

    public void moveRight() {
        System.out.println("right");
    }

    public void moveDown() {
        System.out.println("down");
    }

    public void moveLeft() {
        System.out.println("left");
    }
}
