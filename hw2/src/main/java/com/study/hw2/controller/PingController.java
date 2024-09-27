package com.study.hw2.controller;

import com.study.hw2.dto.PingDto;
import com.study.hw2.service.PingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ping")
public class PingController {
    private final PingService pingService;

    //CRUD
    //save
    @PostMapping("/save")
    public String save(@RequestBody PingDto pingDto){
        pingService.savePing(pingDto);
        return "New Tiniping is saved well";
    }

    //findById
    @GetMapping("/find/{pingId}")
    public PingDto findById(@PathVariable Long pingId){
       return pingService.findById(pingId);
    }

    //findAll
    @GetMapping("/findAll")
    public List<PingDto> findAll(){
        return pingService.findAll();
    }

    //update
    @PatchMapping("/update/{pingId}")
    public String updateById(@PathVariable Long pingId, @RequestBody PingDto pingDto){
        pingService.update(pingId, pingDto);
        return "티니핑 정보가 수정되었습니다";
    }
    //delete
    @DeleteMapping("/delete/{pingId}")
    public String deleteById(@PathVariable Long pingId){
        pingService.delete(pingId);
        return pingId + "번 티니핑이 삭제되었습니다.";
    }

}
