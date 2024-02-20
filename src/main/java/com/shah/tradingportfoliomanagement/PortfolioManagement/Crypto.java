package com.shah.tradingportfoliomanagement.PortfolioManagement;

import java.util.Objects;

public class Crypto {
    private String ticker;
    private String name;
    private double pricePerShare;


    public Crypto(String ticker, String name) {
        this.ticker = ticker;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crypto crypto = (Crypto) o;
        return Objects.equals(ticker, crypto.ticker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticker);
    }

    @Override
    public String toString() {
        return "Crypto{" +
                "ticker = '" + ticker + '\'' +
                ", name = '" + name + '\'' +
                '}';
    }
}
