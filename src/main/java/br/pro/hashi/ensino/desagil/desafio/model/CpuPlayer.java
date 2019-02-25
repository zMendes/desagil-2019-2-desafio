package br.pro.hashi.ensino.desagil.desafio.model;

public class CpuPlayer {
    private int row;
    private int col;
    private Board board;

    public CpuPlayer(int row, int col, Board board) {
        this.row = row;
        this.col = col;
        this.board = board;
    }

    public void move() {
        System.out.println("move");
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
