package com.shah.tradingportfoliomanagement.PortfolioManagement.RefData;

import com.shah.tradingportfoliomanagement.PortfolioManagement.Model.Crypto;
import com.shah.tradingportfoliomanagement.PortfolioManagement.Model.Equity;

import java.util.HashMap;
import java.util.Map;
public final class RefData {
    private Map<String, Equity> globalStockList;
    private Map<String, Crypto> globalCryptoList;

    public RefData() {
        this.globalStockList = new HashMap<>();
        this.globalCryptoList = new HashMap<>();

        //Stocks
        globalStockList.put("AAPL", (new Equity("AAPL", "Apple")));
        globalStockList.put("TSLA", (new Equity("TSLA", "Tesla")));
        globalStockList.put("MSFT", (new Equity("MSFT", "Microsoft")));

        //Cryptos
        globalCryptoList.put("BTC", (new Crypto("BTC", "Bitcoin")));
        globalCryptoList.put("ETH", (new Crypto("ETH", "Ethereum")));
        globalCryptoList.put("SOL", (new Crypto("SOL", "Solana")));
    }

    public Map<String, Equity> getGlobalStockList() {
        return globalStockList;
    }

    public void setGlobalStockList(Map<String, Equity> globalStockList) {
        this.globalStockList = globalStockList;
    }

    public Map<String, Crypto> getGlobalCryptoList() {
        return globalCryptoList;
    }

    public void setGlobalCryptoList(Map<String, Crypto> globalCryptoList) {
        this.globalCryptoList = globalCryptoList;
    }
}
