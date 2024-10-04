package com.pard.study.hw3.burgerking.controller;

import com.pard.study.hw3.burgerking.dto.BurgerDto;
import com.pard.study.hw3.burgerking.service.BurgerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/burger")
public class BurgerController {
    private final BurgerService burgerService;

    @PostMapping("/save")
    public void save(@RequestBody BurgerDto burgerDto){
        burgerService.save(burgerDto);
    }
    @GetMapping("/{burgerId}")
    public BurgerDto readById(@PathVariable Long burgerId){
        return burgerService.read(burgerId);
    }

    @GetMapping("/{type}")
    public List<BurgerDto> readByType(@PathVariable String type){
        return burgerService.read(type);
    }

    @GetMapping("/readAll")
    public List<BurgerDto> readAll(){
        return burgerService.readAll();
    }
    @GetMapping("/readByName")
    public List<BurgerDto> readByNameAsc(){
        return burgerService.readAllByNameAsc();
    }

    @GetMapping("/readByPrice")
    public List<BurgerDto> readByPrice(){
        return burgerService.readAllByPriceAsc();
    }

    @PatchMapping("/{burgerId}")
    public void update(@PathVariable Long burgerId, @RequestBody BurgerDto burgerDto){
        burgerService.update(burgerId, burgerDto);
    }

    @DeleteMapping("/{burgerId}")
    public void delete(@PathVariable Long burgerId){
        burgerService.delete(burgerId);
    }

}
