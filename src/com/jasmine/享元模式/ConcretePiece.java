package com.jasmine.享元模式;

public class ConcretePiece implements Piece {
    String color;
    @Override
    public void add() {

    }

    @Override
    public String getType() {
        System.out.println("棋子的颜色是"+this.color);
        return color;
    }

    public ConcretePiece(String color) {
        this.color = color;
    }
}
