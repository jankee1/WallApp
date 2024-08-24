package com.wallapp.WallApp.repository;

import com.wallapp.WallApp.model.wall.Wall;
import org.springframework.stereotype.Repository;

@Repository
public class WallRepositoryMock {
    private final Wall wall;

    public WallRepositoryMock() {
        this.wall = new WallDataMock().get();
    }

    public Wall getOne() {
        return this.wall;
    }
}
