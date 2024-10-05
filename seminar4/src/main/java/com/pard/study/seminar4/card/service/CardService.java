package com.pard.study.seminar4.card.service;

import com.pard.study.seminar4.card.dto.CardRequest;
import com.pard.study.seminar4.card.entity.Card;
import com.pard.study.seminar4.card.repository.CardRepository;
import com.pard.study.seminar4.user.entity.User;
import com.pard.study.seminar4.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;
    private final UserRepository userRepository;

    public void createCard(CardRequest.CardCreateRequest req){
        Optional<User> u = userRepository.findById(req.getUserId());
        User user = u.get();

        Card card = Card.builder()
                .id(null)
                .name(req.getName())
                .user(user)
                .build();
        card.assginUser(user);
        cardRepository.save(card);
        userRepository.save(user);
    }
}
