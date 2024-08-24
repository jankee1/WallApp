package com.wallapp.WallApp.service;

import com.wallapp.WallApp.model.block.Block;
import com.wallapp.WallApp.repository.WallRepositoryMock;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WallService {

    private final WallRepositoryMock wallRepositoryMock;

    public WallService(WallRepositoryMock wallRepositoryMock) {
        this.wallRepositoryMock = wallRepositoryMock;
    }

    public Optional<Block> findBlockByColor(String color) {
        var result = this.wallRepositoryMock.getOne();
        return result.findBlockByColor(color);
    }

    public List<Block> findBlocksByMaterial(String material) {
        var result = this.wallRepositoryMock.getOne();
        return result.findBlocksByMaterial(material);
    }

    public int getNumberOfBlocks() {
        var result = this.wallRepositoryMock.getOne();
        return result.count();
    }
}
