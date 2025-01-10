package com.easybytes.cards.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class CardsDto {

    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number cannot be empty")
    private String mobileNumber;

    @NotEmpty(message = "Card Number cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{16})", message = "Card number must be of 16 digits")
    private String cardNumber;

    @NotEmpty(message = "Card Type cannot be empty")
    @Pattern(regexp = "(^$|Credit|Debit)", message = "Card type must be Credit or Debit")
    private String cardType;

    @NotEmpty(message = "Total Limit cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{6})", message = "Total limit must be of 6 digits")
    private int totalLimit;

    @NotEmpty(message = "Amount Used cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{6})", message = "Amount used must be of 6 digits")
    private int amountUsed;

    @NotEmpty(message = "Available Amount cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{6})", message = "Available amount must be of 6 digits")
    private int availableAmount;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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

    public int getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(int totalLimit) {
        this.totalLimit = totalLimit;
    }

    public int getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(int amountUsed) {
        this.amountUsed = amountUsed;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }
}
