package model;

import java.math.BigDecimal;

public class Account {

	private Customer customer;

	private String card;
	private String pwd;

	private BigDecimal balance;

	public Account() {	}

	public Account(Customer customer, String card, String pwd) {
		this.customer = customer;
		this.card = card;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + ", card=" + card + ", pwd=" + pwd + "]";
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getPwd() {

		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
