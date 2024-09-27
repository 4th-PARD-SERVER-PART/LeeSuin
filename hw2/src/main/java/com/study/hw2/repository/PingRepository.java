package com.study.hw2.repository;

import com.study.hw2.dto.PingDto;
import com.study.hw2.entity.Ping;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PingRepository {
    private static final Map<Long, Ping> hachu = new HashMap<>();
    public void save(PingDto pingDto){
        Ping ping = Ping.builder()
                .pingId(pingDto.getPingId())
                .pingName(pingDto.getPingName())
                .color(pingDto.getColor())
                .build();
        hachu.put(pingDto.getPingId(), ping);
    }
    public PingDto findById(Long pingId){
        Ping ping = hachu.get(pingId);
        return PingDto.builder()
                .pingId(ping.getPingId())
                .pingName(ping.getPingName())
                .color(ping.getColor())
                .build();
    }

    public List<PingDto> findAll(){
       return hachu.values().stream()
                .map(ping -> PingDto.builder()
                        .pingId(ping.getPingId())
                        .pingName(ping.getPingName())
                        .color(ping.getColor())
                        .build()).toList();
    }

    public void update(Long pingId, PingDto pingDto){
        Ping ping = hachu.get(pingId);
        ping.setPingName(pingDto.getPingName());
        ping.setPingId(pingDto.getPingId());
        ping.setColor(pingDto.getColor());
    }

    public void delete(Long pingId){
        hachu.remove(pingId);
    }
}
