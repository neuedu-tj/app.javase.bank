package model;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {

	private String card;

	private BigDecimal amount;
	private Date transferTime;
	private String detail;

	public Transaction(String card, BigDecimal amount, Date transferTime, String detail) {
		super();
		this.card = card;
		this.amount = amount;
		this.transferTime = transferTime;
		this.detail = detail;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getTransferTime() {
		return transferTime;
	}

	public void setTransferTime(Date transferTime) {
		this.transferTime = transferTime;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return String.format("Transaction [card=%s, amount=%s, transferTime=%s, detail=%s]", card, amount, transferTime,
				detail);
	}
	
	

}
