package com.wallapp.WallApp.model.wall;

import com.wallapp.WallApp.model.block.Block;
import com.wallapp.WallApp.model.block.CompositeBlock;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private int numberOfBlocks = 0;
    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    private void performCounting() {
        this.blocks.forEach(block->{
            if(block instanceof CompositeBlock) {
                this.numberOfBlocks += ((CompositeBlock) block).getBlocks().size();
            } else {
                this.numberOfBlocks++;
            }
        });
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return this.blocks
                    .stream()
                    .filter(singleBlock -> singleBlock.getColor().equalsIgnoreCase(color))
                    .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return this.blocks
                    .stream()
                    .filter(singleBlock -> singleBlock.getMaterial().equalsIgnoreCase(material))
                    .toList();
    }

    @Override
    public int count() {
        // assuming that blocks number is declared only during object instantiation
        // therefore, no need to perform calculation every single time when count() method is invoked
        if(this.numberOfBlocks == 0) {
            this.performCounting();
        }
        return this.numberOfBlocks;
    }
}
