package com.pard.study.hw3.burgerking.service;

import com.pard.study.hw3.burgerking.dto.BurgerDto;
import com.pard.study.hw3.burgerking.entity.Burger;
import com.pard.study.hw3.burgerking.repository.BurgerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BurgerService {
    private final BurgerRepository burgerRepository;

    public void save(BurgerDto burgerDto){
        Burger burger = Burger.builder()
                .name(burgerDto.getName())
                .type(burgerDto.getType())
                .price(burgerDto.getPrice())
                .build();
        burgerRepository.save(burger);
    }
    public BurgerDto read(Long burgerId){
        Burger burger = burgerRepository.findById(burgerId).get();
        return BurgerDto.builder()
                .name(burger.getName())
                .type(burger.getType())
                .price(burger.getPrice())
                .build();
    }
    public List<BurgerDto> read(String type){
        List<Burger> burgers = burgerRepository.findByType(type);
        List<BurgerDto> burgerDtos = burgers.stream()
                .map(burger -> BurgerDto.builder()
                .name(burger.getName())
                .type(burger.getType())
                .price(burger.getPrice())
                .build()).toList();
        return burgerDtos;
    }

    public List<BurgerDto> readAllByNameAsc(){
        List<Burger> burgers = burgerRepository.findAllByOrderByNameAsc();
        List<BurgerDto> burgerDtos = burgers.stream()
                .map(burger -> BurgerDto.builder()
                        .name(burger.getName())
                        .type(burger.getType())
                        .price(burger.getPrice())
                        .build()).toList();
        return burgerDtos;
    }

    public List<BurgerDto> readAllByPriceAsc(){
        List<Burger> burgers = burgerRepository.findAllByOrderByPriceAsc();
        List<BurgerDto> burgerDtos = burgers.stream()
                .map(burger -> BurgerDto.builder()
                        .name(burger.getName())
                        .type(burger.getType())
                        .price(burger.getPrice())
                        .build()).toList();
        return burgerDtos;
    }


    public List<BurgerDto> readAll(){
        List<Burger> burgers = burgerRepository.findAll();
        List<BurgerDto> burgerDtos = burgers.stream().map(burger ->
                BurgerDto.builder()
                        .name(burger.getName())
                        .type(burger.getType())
                        .price(burger.getPrice())
                        .build()).toList();
        return burgerDtos;
    }

    public void update(Long burgerId, BurgerDto burgerDto){
        Burger burger = burgerRepository.findById(burgerId).get();
        burger.setName(burgerDto.getName());
        burger.setType(burgerDto.getType());
        burger.setPrice(burgerDto.getPrice());
    }

    public void delete(Long burgerId){
        burgerRepository.deleteById(burgerId);
    }

}
