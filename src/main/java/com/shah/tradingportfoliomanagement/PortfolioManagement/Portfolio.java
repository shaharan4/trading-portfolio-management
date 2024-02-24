package com.shah.tradingportfoliomanagement.PortfolioManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Portfolio {
    Long accountID;
    String portfolioName;
    Map<String, List<EquityRecord>> equityList;
    Map<String, List<CryptoRecord>> cryptoList;

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

    public Map<String, List<EquityRecord>> getEquityList() {
        return equityList;
    }

    public void setEquityList(Map<String, List<EquityRecord>> equityList) {
        this.equityList = equityList;
    }

    public Map<String, List<CryptoRecord>> getCryptoList() {
        return cryptoList;
    }

    public void setCryptoList(Map<String, List<CryptoRecord>> cryptoList) {
        this.cryptoList = cryptoList;
    }

    public void addEquityRecord(String ticker, EquityRecord equityRecord){
        if (this.equityList.containsKey(ticker)) {
            this.equityList.get(ticker).add(equityRecord);
        }
        else {
            List<EquityRecord> equityRecordList = new ArrayList<>();
            equityRecordList.add(equityRecord);
            this.equityList.put(ticker, equityRecordList);
        }
    }

    public void addCryptoRecord(String ticker, CryptoRecord cryptoRecord) {
        if (this.cryptoList.containsKey(ticker)) {
            this.cryptoList.get(ticker).add(cryptoRecord);
        }
        else {
            List<CryptoRecord> cryptoRecordList = new ArrayList<>();
            cryptoRecordList.add(cryptoRecord);
            this.cryptoList.put(ticker, cryptoRecordList);
        }
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
