package com.nt.service;

import org.springframework.stereotype.Service;

@Service("bankService")
public class BankService {

	public double calcSimpleInterestAmount(double pamt,double rate,double time) {
		System.out.println("BankService.calcSimpleInterestAmount()");
		return pamt*rate*time/100.0;
	}
	public double calcCompoundInterestAmount(double pamt,double rate,double time) {
		System.out.println("BankService.calcSimpleInterestAmount()");
		return (pamt* Math.pow(1+rate/100, time))-pamt;
}
}
