package com.example.hw4.tbpost.service;

import com.example.hw4.tbpost.dto.TbpostRequest;
import com.example.hw4.tbpost.dto.TbpostResponse;
import com.example.hw4.tbpost.entity.Tbpost;
import com.example.hw4.tbpost.repository.TbpostRepository;
import com.example.hw4.user.entity.User;
import com.example.hw4.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TbpostService {
    private final UserRepository userRepository;
    private final TbpostRepository tbpostRepository;

    public void createTbpost(Long userId, TbpostRequest.TbpostCreateRequest req){
        Optional<User> u = userRepository.findById(userId);
        User user = u.get();
        Tbpost tbpost = Tbpost.from(req.getTitle(), req.getContent(), user);
        tbpostRepository.save(tbpost);
    }

    public TbpostResponse.TbpostReadResponse readTbpost(Long tbpostId){
        Optional<Tbpost> b = tbpostRepository.findById(tbpostId);
        Tbpost tbpost = b.get();
        return new TbpostResponse.TbpostReadResponse(tbpostId, tbpost.getTitle(), tbpost.getContent());
    }

}
