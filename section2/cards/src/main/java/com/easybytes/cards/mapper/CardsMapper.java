package com.easybytes.cards.mapper;

import com.easybytes.cards.dto.CardsDto;
import com.easybytes.cards.entity.Cards;

public class CardsMapper {

    public static CardsDto mapToCardsDto(Cards cards, CardsDto cardsDto) {

        cardsDto.setMobileNumber(cards.getMobileNumber());
        cardsDto.setCardNumber(cards.getCardNumber());
        cardsDto.setCardType(cards.getCardType());
        cardsDto.setTotalLimit(cards.getTotalLimit());
        cardsDto.setAmountUsed(cards.getAmountUsed());
        cardsDto.setAvailableAmount(cards.getAvailableAmount());
        return cardsDto;
    }

    public static Cards mapToCard(CardsDto cardsDto, Cards cards) {

        cards.setMobileNumber(cardsDto.getMobileNumber());
        cards.setCardType(cardsDto.getCardType());
        cards.setCardNumber(cardsDto.getCardNumber());
        cards.setAmountUsed(cardsDto.getAmountUsed());
        cards.setAvailableAmount(cardsDto.getAvailableAmount());
        cards.setTotalLimit(cardsDto.getTotalLimit());
        return cards;
    }
}
