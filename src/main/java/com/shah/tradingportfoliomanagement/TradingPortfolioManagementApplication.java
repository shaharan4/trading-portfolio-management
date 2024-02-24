package com.shah.tradingportfoliomanagement;

import com.shah.tradingportfoliomanagement.PortfolioManagement.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradingPortfolioManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingPortfolioManagementApplication.class, args);
		RefData refData = new RefData();
		Portfolio shahPortfolio = new Portfolio(123L, "shahPortfolio");

		Equity tsla = refData.getGlobalStockList().get("TSLA");
		EquityRecord tsla1 = new EquityRecord(tsla.getTicker(), 10, 200, "BUY");
		EquityRecord tsla2 = new EquityRecord(tsla.getTicker(), 5, 180, "BUY");

		Equity msft = refData.getGlobalStockList().get("MSFT");
		EquityRecord msft1 = new EquityRecord(msft.getTicker(), 20, 400, "BUY");

		Crypto btc = refData.getGlobalCryptoList().get("BTC");
		CryptoRecord btc1 = new CryptoRecord(btc.getTicker(), 20,50000, "BUY");



		shahPortfolio.addEquityRecord(tsla.getTicker(), tsla1);
		shahPortfolio.addEquityRecord(msft.getTicker(), msft1);
		shahPortfolio.addCryptoRecord(btc.getTicker(), btc1);
		shahPortfolio.addEquityRecord(tsla.getTicker(), tsla2);
		System.out.println(shahPortfolio);

	}

}
