package com.wallapp.WallApp.model.block;

public abstract class AbstractBlock implements Block {
    private final String color;
    private final String material;

    public AbstractBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }
}