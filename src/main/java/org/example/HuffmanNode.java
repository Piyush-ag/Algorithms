package org.example;

public class HuffmanNode {
    int data;
    Character c;
    public HuffmanNode left;
    public HuffmanNode right;

    public HuffmanNode(Character c, int i) {
        this.c =c;
        this.data = i;
    }

    public HuffmanNode(int i) {
        this.data = i;
    }
}
