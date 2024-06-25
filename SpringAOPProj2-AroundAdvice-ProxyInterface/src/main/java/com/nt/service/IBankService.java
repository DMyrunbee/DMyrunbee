package com.nt.service;

public interface IBankService {

	public double calcSimpleInterestAmount(double pamt,double rate,double time);
	public double calcCompoundInterestAmount(double pamt,double rate,double time);
}
