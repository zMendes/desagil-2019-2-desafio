package br.pro.hashi.ensino.desagil.desafio.model;

public class HumanPlayer {
    private int row;
    private int col;
    private Board board;

    public HumanPlayer(int row, int col, Board board) {
        this.row = row;
        this.col = col;
        this.board = board;
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

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
