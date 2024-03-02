package com.shah.tradingportfoliomanagement.PortfolioManagement.Model;

public class EquityTransaction {

    private Long transactionId;

    private String ticker;

    private double shares;

    private double pricePerShare;

    private String side;

    public EquityTransaction(String ticker, double shares, double pricePerShare, String side) {
        this.ticker = ticker;
        this.shares = shares;
        this.pricePerShare = pricePerShare;
        this.side = side;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getShares() {
        return shares;
    }

    public void setShares(double shares) {
        this.shares = shares;
    }

    public double getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(double pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "EquityRecord{" +
                "transactionId=" + transactionId +
                ", ticker='" + ticker + '\'' +
                ", shares=" + shares +
                ", pricePerShare=" + pricePerShare +
                ", side='" + side + '\'' +
                '}';
    }
}
