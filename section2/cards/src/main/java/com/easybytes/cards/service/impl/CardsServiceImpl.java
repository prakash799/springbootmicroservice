package com.easybytes.cards.service.impl;

import com.easybytes.cards.constants.CardsConstant;
import com.easybytes.cards.dto.CardsDto;
import com.easybytes.cards.entity.Cards;
import com.easybytes.cards.exception.CardAlreadyExistsException;
import com.easybytes.cards.exception.ResourceNotFoundException;
import com.easybytes.cards.mapper.CardsMapper;
import com.easybytes.cards.repository.CardsRepository;
import com.easybytes.cards.service.ICardsService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class CardsServiceImpl implements ICardsService {

    private CardsRepository cardsRepository;

    public CardsServiceImpl(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    public void createCard(String mobileNumber) {
        Optional<Cards> optionalCards = cardsRepository.findByMobileNumber(mobileNumber);
        if (optionalCards.isPresent()) {
            throw new CardAlreadyExistsException("Card already exists for given mobile number " + mobileNumber);
        }
        cardsRepository.save(createNewCard(mobileNumber));
    }

    private Cards createNewCard(String mobileNumber) {
        Cards cards = new Cards();
        long cardId = 10000000L + new Random().nextInt(1000000);
        cards.setCardNumber(Long.toString(cardId));
        cards.setMobileNumber(mobileNumber);
        cards.setAmountUsed(0);
        cards.setTotalLimit(CardsConstant.NEW_CARD_LIMIT);
        cards.setCardType(CardsConstant.CREDIT_CARD);
        cards.setAvailableAmount(CardsConstant.NEW_CARD_LIMIT);
        return cards;
    }

    @Override
    public CardsDto fetchCard(String mobileNumber) {
        Cards cards = cardsRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Card", "mobileNumber", mobileNumber)
        );
        return CardsMapper.mapToCardsDto(cards, new CardsDto());
    }


    @Override
    public boolean updateCard(CardsDto cardsDto) {
        cardsRepository.findByCardNumber(cardsDto.getCardNumber()).orElseThrow(
                () -> new ResourceNotFoundException("Card", "cardNumber", cardsDto.getCardNumber())
        );
        Cards cards = CardsMapper.mapToCard(cardsDto, new Cards());
        cardsRepository.save(cards);
        return true;
    }

    @Override
    public boolean deleteCard(String mobileNumber) {
        Cards cards = cardsRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Card", "mobileNumber", mobileNumber)
        );
        cardsRepository.deleteById(cards.getCardId());
        return true;
    }


}
