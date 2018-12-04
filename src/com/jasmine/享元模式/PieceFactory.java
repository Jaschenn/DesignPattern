package com.jasmine.享元模式;

import java.util.HashMap;

public class PieceFactory {
    HashMap pieces = new HashMap();

    public PieceFactory() {

    }
    public Piece getPiece(String color){
       if(pieces.containsKey(color)){
           return (Piece)pieces.get(color);
       }else {
           Piece piece = new ConcretePiece(color);
           System.out.println("新建了"+color+"棋子");
           pieces.put(color,piece);
           return piece;
       }
    }
}
