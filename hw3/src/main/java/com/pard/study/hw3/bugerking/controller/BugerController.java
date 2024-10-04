package com.pard.study.hw3.bugerking.controller;

import com.pard.study.hw3.bugerking.dto.BugerDto;
import com.pard.study.hw3.bugerking.service.BugerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buger")
public class BugerController {
    private final BugerService bugerService;

    @PostMapping("/save")
    public void save(@RequestBody BugerDto bugerDto){
        bugerService.save(bugerDto);
    }
    @GetMapping("/{bugerId}")
    public BugerDto readById(@PathVariable Long bugerId){
        return bugerService.read(bugerId);
    }

    @GetMapping("/readAll")
    public List<BugerDto> readAll(){
        return bugerService.readAll();
    }

    @PatchMapping("/{bugerId}")
    public void update(@PathVariable Long bugerId, @RequestBody BugerDto bugerDto){
        bugerService.update(bugerId, bugerDto);
    }

    @DeleteMapping("/{bugerId}")
    public void delete(@PathVariable Long bugerId){
        bugerService.delete(bugerId);
    }

}
