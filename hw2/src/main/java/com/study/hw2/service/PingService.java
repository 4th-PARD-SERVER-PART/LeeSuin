package com.study.hw2.service;

import com.study.hw2.dto.PingDto;
import com.study.hw2.repository.PingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PingService {
    private final PingRepository pingRepository;

    public void savePing(PingDto pingDto){
        pingRepository.save(pingDto);
    }

    public PingDto findById(Long pingId){
        return pingRepository.findById(pingId);
    }

    public List<PingDto> findAll(){
        return pingRepository.findAll();
    }

    public void update(Long pingId, PingDto pingDto){
        pingRepository.update(pingId, pingDto);
    }

    public void delete(Long pingId){
        pingRepository.delete(pingId);
    }
}
