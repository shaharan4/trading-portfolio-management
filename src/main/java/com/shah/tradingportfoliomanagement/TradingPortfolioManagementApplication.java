package com.shah.tradingportfoliomanagement;

import com.shah.tradingportfoliomanagement.PortfolioManagement.Crypto;
import com.shah.tradingportfoliomanagement.PortfolioManagement.Portfolio;
import com.shah.tradingportfoliomanagement.PortfolioManagement.RefData;
import com.shah.tradingportfoliomanagement.PortfolioManagement.Stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.sampled.Port;

@SpringBootApplication
public class TradingPortfolioManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingPortfolioManagementApplication.class, args);
		RefData refData = new RefData();
		Portfolio shahPortfolio = new Portfolio(123L, "shahPortfolio");

		Stock TSLA = refData.getGlobalStockList().get("TSLA");
		Stock MSFT = refData.getGlobalStockList().get("MSFT");
		Crypto BTC = refData.getGlobalCryptoList().get("BTC");
		shahPortfolio.addStockRecord(TSLA, 10.0);
		shahPortfolio.addStockRecord(MSFT, 5.0);
		shahPortfolio.addCryptoRecord(BTC, 1.0);
		shahPortfolio.addStockRecord(TSLA, 5.0);

		System.out.println(shahPortfolio.toString());

	}

}
