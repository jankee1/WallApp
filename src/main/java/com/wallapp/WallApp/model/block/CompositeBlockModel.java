package com.wallapp.WallApp.model.block;

import java.util.List;

public class CompositeBlockModel extends AbstractBlock implements CompositeBlock {

    private final List<Block> blocks;

    public CompositeBlockModel(String color, String material, List<Block> blocks) {
        super(color, material);
        this.blocks = blocks;
    }

    @Override
    public List<Block> getBlocks() {
        return this.blocks;
    }
}