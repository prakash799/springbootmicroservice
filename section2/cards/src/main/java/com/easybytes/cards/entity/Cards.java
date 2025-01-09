package com.easybytes.cards.entity;

import jakarta.persistence.*;

@Entity
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @Column(name = "card_id")
    private Long cardId;

    @Column(name = "card_number")
    private String cardNumber;


    @Column(name = "card_type")
    private String cardType;

    @Column(name = "total_limit")
    private Long totalLimit;

    @Column(name = "amount_used")
    private Long amountUsed;

    @Column(name = "available_amount")
    private Long availableAmount;

    public Cards() {
    }

    public Cards(Long cardId, String cardNumber, String cardType, Long totalLimit,
                 Long amountUsed, Long availableAmount) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.totalLimit = totalLimit;
        this.amountUsed = amountUsed;
        this.availableAmount = availableAmount;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Long getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(Long totalLimit) {
        this.totalLimit = totalLimit;
    }

    public Long getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(Long amountUsed) {
        this.amountUsed = amountUsed;
    }

    public Long getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Long availableAmount) {
        this.availableAmount = availableAmount;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cardId=" + cardId +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardType='" + cardType + '\'' +
                ", totalLimit='" + totalLimit + '\'' +
                ", amountUsed='" + amountUsed + '\'' +
                ", availableAmount='" + availableAmount + '\'' +
                '}';
    }
}
