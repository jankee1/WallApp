package com.wallapp.WallApp.repository;

import com.wallapp.WallApp.model.block.Block;
import com.wallapp.WallApp.model.block.BlockModel;
import com.wallapp.WallApp.model.block.CompositeBlockModel;
import com.wallapp.WallApp.model.wall.Wall;

import java.util.ArrayList;
import java.util.Arrays;

public class WallDataMock {
    private final Wall wall;

    public WallDataMock() {
        var basicBlocks = Arrays.asList(
                new BlockModel("grey", "concrete"),
                new BlockModel("brown", "wood"),
                new BlockModel("black", "wood"),
                new BlockModel("red", "brick")
        );

        var compositeBlock = new CompositeBlockModel(
                "red", "brick",
                Arrays.asList(basicBlocks.get(3), basicBlocks.get(3))
        );

        var wallsElements = new ArrayList(basicBlocks);
        wallsElements.add(compositeBlock);

        this.wall = new Wall(wallsElements);
    }

    public Wall get() {
        return this.wall;
    }
}
