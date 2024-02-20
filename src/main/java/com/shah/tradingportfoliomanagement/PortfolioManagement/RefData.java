package com.shah.tradingportfoliomanagement.PortfolioManagement;

import java.util.*;

public final class RefData {
    private Map<String, Stock> globalStockList;
    private Map<String, Crypto> globalCryptoList;

    public RefData() {
        this.globalStockList = new HashMap<>();
        this.globalCryptoList = new HashMap<>();

        //Stocks
        globalStockList.put("AAPL", (new Stock("AAPL", "Apple")));
        globalStockList.put("TSLA", (new Stock("TSLA", "Tesla")));
        globalStockList.put("MSFT", (new Stock("MSFT", "Microsoft")));

        //Cryptos
        globalCryptoList.put("BTC", (new Crypto("BTC", "Bitcoin")));
        globalCryptoList.put("ETH", (new Crypto("ETH", "Ethereum")));
        globalCryptoList.put("SOL", (new Crypto("SOL", "Solana")));
    }

    public Map<String, Stock> getGlobalStockList() {
        return globalStockList;
    }

    public void setGlobalStockList(Map<String, Stock> globalStockList) {
        this.globalStockList = globalStockList;
    }

    public Map<String, Crypto> getGlobalCryptoList() {
        return globalCryptoList;
    }

    public void setGlobalCryptoList(Map<String, Crypto> globalCryptoList) {
        this.globalCryptoList = globalCryptoList;
    }
}
