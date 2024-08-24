package com.wallapp.WallApp.model.wall;

import com.wallapp.WallApp.repository.WallDataMock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {
    private final Wall mockWall;

    public WallTest() {
        this.mockWall = new WallDataMock().get();
    }

    @Test
    @DisplayName("findBlockByColor")
    void findsGreyBlock() {
        var greyBlock = this.mockWall.findBlockByColor("grey").get(); // mocked data, no checking

        assertNotNull(greyBlock);
        assertEquals("grey",greyBlock.getColor());
        assertEquals("concrete",greyBlock.getMaterial());
    }

    @Test
    @DisplayName("findBlockByColor")
    void findsGreyBlockByUpperAndLowerCase() {
        var greyBlock = this.mockWall.findBlockByColor("GrEy").get(); // mocked data, no checking

        assertNotNull(greyBlock);
        assertEquals("grey",greyBlock.getColor());
        assertEquals("concrete",greyBlock.getMaterial());
    }

    @Test
    void findBlocksByMaterial() {
        var woodMaterials = this.mockWall.findBlocksByMaterial("wood");
        var brown = woodMaterials.get(0);
        var black = woodMaterials.get(1);

        assertEquals(2, woodMaterials.size());

        assertNotNull(brown);
        assertEquals("brown",brown.getColor());
        assertEquals("wood",brown.getMaterial());

        assertNotNull(black);
        assertEquals("black",black.getColor());
        assertEquals("wood",black.getMaterial());
    }

    @Test
    void countsAllBlocksInWallObject() {
        var num = this.mockWall.count();

        assertEquals(6, num);
    }
}