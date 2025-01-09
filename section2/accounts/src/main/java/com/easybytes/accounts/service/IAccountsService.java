package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * Create Accounts for Customers
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
