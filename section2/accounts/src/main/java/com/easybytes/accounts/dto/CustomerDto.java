package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Schema(
        name = "Customer",
        description = "Schema to hold customer and Account Information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer",example = "Eazy Bytes"
    )
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 5, max = 30, message = "Customer name should be between 5 or 30")
    private String name;

    @Schema(
            description = "Email address of the customer",example = "tutor@gmail.com"
    )
    @Email(message = "Email address should be a valid value")
    @NotEmpty(message = "Email address cannot be empty")
    private String email;

    @Schema(
            description = "Mobile number of the customer",example = "1234567890"
    )
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be of 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;


    public CustomerDto() {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.accountsDto = accountsDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public AccountsDto getAccountsDto() {
        return accountsDto;
    }

    public void setAccountsDto(AccountsDto accountsDto) {
        this.accountsDto = accountsDto;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", accountsDto='" + accountsDto + '\'' +
                '}';
    }
}
