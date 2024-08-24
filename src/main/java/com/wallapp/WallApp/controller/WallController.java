package com.wallapp.WallApp.controller;

import com.wallapp.WallApp.model.block.Block;
import com.wallapp.WallApp.service.WallService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Validated
@RestController
@RequestMapping("/wall")
public class WallController {

    private final WallService wallService;

    public WallController(WallService wallService) {
        this.wallService = wallService;
    }

    @GetMapping("/total")
    public int getNumberOfBlocks() {
        return this.wallService.getNumberOfBlocks();
    }

    @GetMapping("/color/{colorName}")
    public Optional<Block> findBlockByColor(@PathVariable("colorName") @Valid @Size( min = 3) String color) {
       return this.wallService.findBlockByColor(color);
    }

    @GetMapping("/material/{materialName}")
    public List<Block> findBlocksByMaterial(@PathVariable("materialName") @Valid @Size( min = 3) String material) {
        return this.wallService.findBlocksByMaterial(material);
    }
}
