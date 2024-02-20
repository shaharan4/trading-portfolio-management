package com.shah.tradingportfoliomanagement.PortfolioManagement;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    Long accountID;
    String portfolioName;
    Map<Stock, Double> stockList;
    Map<Crypto, Double> cryptoList;

    public Portfolio(Long accountID, String portfolioName) {
        this.accountID = accountID;
        this.portfolioName = portfolioName;
        this.stockList = new HashMap<>();
        this.cryptoList = new HashMap<>();

    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public Map<Stock, Double> getStockList() {
        return stockList;
    }

    public void setStockList(Map<Stock, Double> stockList) {
        this.stockList = stockList;
    }

    public Map<Crypto, Double> getCryptoList() {
        return cryptoList;
    }

    public void setCryptoList(Map<Crypto, Double> cryptoList) {
        this.cryptoList = cryptoList;
    }

    public void addStockRecord(Stock stock, Double shares){
        if(this.stockList.containsKey(stock)){
            this.stockList.put(stock, this.stockList.get(stock) + shares);
        }
        else{
            this.stockList.put(stock, shares);
        }
    }

    public void addCryptoRecord(Crypto crypto, Double coins) {
        if (this.cryptoList.containsKey(crypto)) {
            this.cryptoList.put(crypto, this.cryptoList.get(crypto) + coins);
        } else {
            this.cryptoList.put(crypto, coins);
        }
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "accountID = " + accountID +
                ", portfolioName = '" + portfolioName + '\'' +
                ", stockList = " + stockList +
                ", cryptoList = " + cryptoList +
                '}';
    }
}
