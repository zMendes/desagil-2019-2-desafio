package br.pro.hashi.ensino.desagil.desafio.model;

public abstract class Player extends Element {
    protected final Board board;
    private int points;

    protected Player(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }

    protected void move(int rowShift, int colShift) {
        row += rowShift;
        col += colShift;
    }

    public int getPoints() {
    	return points;
	}

	public void incrementPoints() {
    	this.points++;
	}
}
