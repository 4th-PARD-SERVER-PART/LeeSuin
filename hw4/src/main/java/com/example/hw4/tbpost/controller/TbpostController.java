package com.example.hw4.tbpost.controller;

import com.example.hw4.tbpost.dto.TbpostRequest;
import com.example.hw4.tbpost.service.TbpostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tbpost")
public class TbpostController {
    private final TbpostService tbpostService;

    @PostMapping("/{userId}")
    public void CreateTbpost(@PathVariable Long userId,
                           @RequestBody TbpostRequest.TbpostCreateRequest req){
        tbpostService.createTbpost(userId, req);
    }
}
