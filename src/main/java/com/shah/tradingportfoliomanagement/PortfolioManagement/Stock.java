package com.shah.tradingportfoliomanagement.PortfolioManagement;

import java.util.Objects;

public class Stock {
    private String ticker;
    private String name;
    private double pricePerShare;


    public Stock(String ticker, String name) {
        this.ticker = ticker;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(ticker, stock.ticker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticker);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "ticker = '" + ticker + '\'' +
                ", name = '" + name + '\'' +
                '}';
    }
}
