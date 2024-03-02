package com.shah.tradingportfoliomanagement.PortfolioManagement.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Portfolio {
    Long accountID;
    String portfolioName;
    Map<String, List<EquityTransaction>> equityList;
    Map<String, List<CryptoTransaction>> cryptoList;

    public Portfolio(Long accountID, String portfolioName) {
        this.accountID = accountID;
        this.portfolioName = portfolioName;
        this.equityList = new HashMap<>();
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

    public Map<String, List<EquityTransaction>> getEquityList() {
        return equityList;
    }

    public void setEquityList(Map<String, List<EquityTransaction>> equityList) {
        this.equityList = equityList;
    }

    public Map<String, List<CryptoTransaction>> getCryptoList() {
        return cryptoList;
    }

    public void setCryptoList(Map<String, List<CryptoTransaction>> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "accountID = " + accountID +
                ", portfolioName = '" + portfolioName + '\'' +
                ", stockList = " + equityList +
                ", cryptoList = " + cryptoList +
                '}';
    }
}
