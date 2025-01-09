package com.easybytes.cards.mapper;

import com.easybytes.cards.dto.CardsDto;
import com.easybytes.cards.entity.Cards;

public class CardsMapper {

    public static CardsDto mapToCardsDto(Cards cards, CardsDto cardsDto) {

        cardsDto.setCardNumber(cards.getCardNumber());
        cardsDto.setCardType(cards.getCardType());
        cardsDto.setTotalLimit(cards.getTotalLimit());
        cardsDto.setAmountUsed(cards.getAmountUsed());
        cardsDto.setAvailableAmount(cards.getAvailableAmount());
        return cardsDto;
    }
}
