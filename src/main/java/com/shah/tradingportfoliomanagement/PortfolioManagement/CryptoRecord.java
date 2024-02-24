package com.shah.tradingportfoliomanagement.PortfolioManagement;

public class CryptoRecord {

    private Long transactionId;

    private String ticker;

    private double coins;

    private double pricePerShare;

    private String side;

    public CryptoRecord(String ticker, double coins, double pricePerShare, String side) {
        this.ticker = ticker;
        this.coins = coins;
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

    public double getCoins() {
        return coins;
    }

    public void setCoins(double coins) {
        this.coins = coins;
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
        return "CryptoRecord{" +
                "transactionId=" + transactionId +
                ", ticker='" + ticker + '\'' +
                ", coins=" + coins +
                ", pricePerShare=" + pricePerShare +
                ", side='" + side + '\'' +
                '}';
    }
}
