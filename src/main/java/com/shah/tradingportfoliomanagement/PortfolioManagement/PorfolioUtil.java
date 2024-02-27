package com.shah.tradingportfoliomanagement.PortfolioManagement;

import java.util.ArrayList;
import java.util.List;

public class PorfolioUtil {

    public void addEquityTransaction(Portfolio portfolio, String ticker, EquityTransaction equityTransaction){
        if (portfolio.equityList.containsKey(ticker)) {
            portfolio.equityList.get(ticker).add(equityTransaction);
        }
        else {
            List<EquityTransaction> equityTransactionList = new ArrayList<>();
            equityTransactionList.add(equityTransaction);
            portfolio.equityList.put(ticker, equityTransactionList);
        }
    }

    public void addCryptoTransaction(Portfolio portfolio, String ticker, CryptoTransaction cryptoTransaction) {
        if (portfolio.cryptoList.containsKey(ticker)) {
            portfolio.cryptoList.get(ticker).add(cryptoTransaction);
        }
        else {
            List<CryptoTransaction> cryptoTransactionList = new ArrayList<>();
            cryptoTransactionList.add(cryptoTransaction);
            portfolio.cryptoList.put(ticker, cryptoTransactionList);
        }
    }

    public double getEquityCurrentShares (Portfolio portfolio, String ticker) {
        double currentShares = 0;
        for (String stockTicker : portfolio.getEquityList().keySet()) {
            if (stockTicker.equalsIgnoreCase(ticker)) {
                for (EquityTransaction equityTransaction: portfolio.getEquityList().get(stockTicker)) {
                    if (equityTransaction.getSide().equalsIgnoreCase("BUY")) {
                        currentShares += equityTransaction.getShares();
                    }
                    else {
                        currentShares -= equityTransaction.getShares();
                    }
                }
            }
        }
        return currentShares;
    }

    public double getEquityMarketValue (Portfolio portfolio, String ticker) {
        double marketValue = 0;
        for (String stockTicker : portfolio.getEquityList().keySet()) {
            if (stockTicker.equalsIgnoreCase(ticker)) {
                for (EquityTransaction equityTransaction : portfolio.getEquityList().get(stockTicker)) {
                    if (equityTransaction.getSide().equalsIgnoreCase("BUY")) {
                        marketValue += (equityTransaction.getPricePerShare() * equityTransaction.getShares());
                    }
                    else {
                        marketValue -= (equityTransaction.getPricePerShare() * equityTransaction.getShares());
                    }
                }
            }
        }
        return marketValue;
    }

    public double getEquityAverageCost (Portfolio portfolio, String ticker) {
        double runningCost = 0;
        double sharesBought = 0;
        for (String stockTicker : portfolio.getEquityList().keySet()) {
            if (stockTicker.equalsIgnoreCase(ticker)) {
                for (EquityTransaction equityTransaction : portfolio.getEquityList().get(stockTicker)) {
                    if (equityTransaction.getSide().equalsIgnoreCase("BUY")) {
                        runningCost += (equityTransaction.getPricePerShare() * equityTransaction.getShares());
                        sharesBought += equityTransaction.getShares();
                    }
                }
            }
        }
        return runningCost / sharesBought;
    }

    public double getCryptoCurrentCoins (Portfolio portfolio, String ticker) {
        double currentCoins = 0;
        for (String cryptoTicker : portfolio.getCryptoList().keySet()) {
            if (cryptoTicker.equalsIgnoreCase(ticker)) {
                for (CryptoTransaction cryptoTransaction: portfolio.getCryptoList().get(cryptoTicker)) {
                    if (cryptoTransaction.getSide().equalsIgnoreCase("BUY")) {
                        currentCoins += cryptoTransaction.getCoins();
                    }
                    else {
                        currentCoins -= cryptoTransaction.getCoins();
                    }
                }
            }
        }
        return currentCoins;
    }

    public double getCryptoMarketValue (Portfolio portfolio, String ticker) {
        double marketValue = 0;
        for (String cryptoTicker : portfolio.getCryptoList().keySet()) {
            if (cryptoTicker.equalsIgnoreCase(ticker)) {
                for (CryptoTransaction cryptoTransaction : portfolio.getCryptoList().get(cryptoTicker)) {
                    if (cryptoTransaction.getSide().equalsIgnoreCase("BUY")) {
                        marketValue += (cryptoTransaction.getPricePerShare() * cryptoTransaction.getCoins());
                    }
                    else {
                        marketValue -= (cryptoTransaction.getPricePerShare() * cryptoTransaction.getCoins());
                    }
                }
            }
        }
        return marketValue;
    }

    public double getCryptoAverageCost (Portfolio portfolio, String ticker) {
        double runningCost = 0;
        double coinsBought = 0;
        for (String cryptoTicker : portfolio.getCryptoList().keySet()) {
            if (cryptoTicker.equalsIgnoreCase(ticker)) {
                for (CryptoTransaction cryptoTransaction : portfolio.getCryptoList().get(cryptoTicker)) {
                    if (cryptoTransaction.getSide().equalsIgnoreCase("BUY")) {
                        runningCost += (cryptoTransaction.getPricePerShare() * cryptoTransaction.getCoins());
                        coinsBought += cryptoTransaction.getCoins();
                    }
                }
            }
        }
        return runningCost / coinsBought;
    }

    public String getPortfolioSummary(Portfolio portfolio) {
        StringBuilder outputSB = new StringBuilder();
        outputSB.append("\n");
        outputSB.append("Account  ID: " + portfolio.getAccountID() + "  Portfolio Name: " + portfolio.getPortfolioName()  + "\n");
         outputSB.append("Stock List = \n{\n");

         for (String stockTicker : portfolio.getEquityList().keySet()) {
            outputSB.append("\t[Ticker: " + stockTicker + ", Shares: " + this.getEquityCurrentShares(portfolio, stockTicker) + ", Average Cost: "
            + this.getEquityAverageCost(portfolio, stockTicker) + ", Total Market Value " + this.getEquityMarketValue(portfolio, stockTicker) + "]\t \n");
         }
         outputSB.append("} \nCrypto List = \n{\n");
         for (String cryptoTicker : portfolio.getCryptoList().keySet()) {
            outputSB.append("\t[Ticker: " + cryptoTicker + ", Coins: " + this.getCryptoCurrentCoins(portfolio, cryptoTicker) + ", Average Cost: "
                    + this.getCryptoAverageCost(portfolio, cryptoTicker) + ", Total Market Value " + this.getCryptoMarketValue(portfolio, cryptoTicker) + "]\t \n");
         }
         outputSB.append("}");
         return outputSB.toString();
    }

}
