package com.nexeo.kata.services;

import com.nexeo.kata.checked.exception.InsufficientBalanceException;
import com.nexeo.kata.checked.exception.InvalidAccountException;
import com.nexeo.kata.checked.exception.InvalidRequestedMoney;
import com.nexeo.kata.model.Account;

public interface IAccountService {
	boolean depositMoney(double money, Long accountID)
			throws InsufficientBalanceException, InvalidAccountException, InvalidRequestedMoney;
	
	Account saveAccount(Account account);
	Account findByAccountID(Long accountId);
	
	boolean withdrawalMoney(double money, Long accountID)
			throws InsufficientBalanceException, InvalidAccountException, InvalidRequestedMoney;
}
