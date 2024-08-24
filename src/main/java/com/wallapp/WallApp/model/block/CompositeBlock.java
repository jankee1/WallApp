package com.wallapp.WallApp.model.block;

import java.util.List;

public interface CompositeBlock extends Block {
    List<Block> getBlocks();
}
