package Entities;

import model.Exception.DomainExceptions;

public class Account{
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;

	
	
	public Account() {
		super();
	}	
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	public void  depositAmount(Double amount) {
		balance += amount;
	}
	public void	withDraw(double amount) throws DomainExceptions{
		if(withDrawLimit < amount) {
			throw new DomainExceptions("The amount exceeds withdraw limit");
		}else if(amount > balance) {
			throw new DomainExceptions("Not enough balance");
		}	
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "New balance: "
				+ String.valueOf(getBalance());
	}

}
