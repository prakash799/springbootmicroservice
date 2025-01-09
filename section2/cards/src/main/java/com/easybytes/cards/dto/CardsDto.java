package com.easybytes.cards.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class CardsDto {

    @NotEmpty(message = "Card Number cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{16})", message = "Card number must be of 16 digits")
    private String cardNumber;

    @NotEmpty(message = "Card Type cannot be empty")
    @Pattern(regexp = "(^$|Credit|Debit)", message = "Card type must be Credit or Debit")
    private String cardType;

    @NotEmpty(message = "Total Limit cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{6})", message = "Total limit must be of 6 digits")
    private Long totalLimit;

    @NotEmpty(message = "Amount Used cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{6})", message = "Amount used must be of 6 digits")
    private Long amountUsed;

    @NotEmpty(message = "Available Amount cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{6})", message = "Available amount must be of 6 digits")
    private Long availableAmount;

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
}
