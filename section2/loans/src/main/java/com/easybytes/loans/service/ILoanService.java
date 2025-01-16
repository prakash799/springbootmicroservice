package com.easybytes.loans.service;

import com.easybytes.loans.dto.LoansDto;

public interface ILoanService {

    void createLoan(String mobileNumber);

    LoansDto fetchLoanDetails(String mobileNumber);

    boolean updateLoan(LoansDto loansDto);

    boolean deleteLoan(String mobileNumber);



}
