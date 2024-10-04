package com.pard.study.hw3.bugerking.service;

import com.pard.study.hw3.bugerking.dto.BugerDto;
import com.pard.study.hw3.bugerking.entity.Buger;
import com.pard.study.hw3.bugerking.repository.BugerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BugerService {
    private final BugerRepository bugerRepository;

    public void save(BugerDto bugerDto){
        Buger buger = Buger.builder()
                .name(bugerDto.getName())
                .type(bugerDto.getType())
                .price(bugerDto.getPrice())
                .build();
        bugerRepository.save(buger);
    }
    public BugerDto read(Long bugerId){
        Buger buger = bugerRepository.findById(bugerId).get();
        return BugerDto.builder()
                .name(buger.getName())
                .type(buger.getType())
                .price(buger.getPrice())
                .build();
    }
    public List<BugerDto> readAll(){
        List<Buger> bugers = bugerRepository.findAll();
        List<BugerDto> bugerDtos = bugers.stream().map(buger ->
                BugerDto.builder()
                        .name(buger.getName())
                        .type(buger.getType())
                        .price(buger.getPrice())
                        .build()).toList();
        return bugerDtos;
    }

    public void update(Long bugerId, BugerDto bugerDto){
        Buger buger = bugerRepository.findById(bugerId).get();
        buger.setName(bugerDto.getName());
        buger.setType(bugerDto.getType());
        buger.setPrice(bugerDto.getPrice());
    }

    public void delete(Long bugerId){
        bugerRepository.deleteById(bugerId);
    }

}
