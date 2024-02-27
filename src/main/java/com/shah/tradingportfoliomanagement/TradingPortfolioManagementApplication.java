package com.shah.tradingportfoliomanagement;

import com.shah.tradingportfoliomanagement.PortfolioManagement.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradingPortfolioManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingPortfolioManagementApplication.class, args);
		RefData refData = new RefData();
		PorfolioUtil porfolioUtil = new PorfolioUtil();
		Portfolio shahPortfolio = new Portfolio(123L, "shahPortfolio");

		Equity tsla = refData.getGlobalStockList().get("TSLA");
		EquityTransaction tsla1 = new EquityTransaction(tsla.getTicker(), 10, 200, "BUY");
		EquityTransaction tsla2 = new EquityTransaction(tsla.getTicker(), 5, 180, "BUY");
		EquityTransaction tsla3 = new EquityTransaction(tsla.getTicker(), 7, 200, "SELL");

		Equity msft = refData.getGlobalStockList().get("MSFT");
		EquityTransaction msft1 = new EquityTransaction(msft.getTicker(), 20, 400, "BUY");

		Crypto btc = refData.getGlobalCryptoList().get("BTC");
		CryptoTransaction btc1 = new CryptoTransaction(btc.getTicker(), 20,50000, "BUY");



		porfolioUtil.addEquityTransaction(shahPortfolio, tsla.getTicker(), tsla1);
		porfolioUtil.addEquityTransaction(shahPortfolio, msft.getTicker(), msft1);
		porfolioUtil.addCryptoTransaction(shahPortfolio, btc.getTicker(), btc1);
		porfolioUtil.addEquityTransaction(shahPortfolio, tsla.getTicker(), tsla2);
		porfolioUtil.addEquityTransaction(shahPortfolio, tsla.getTicker(), tsla3);
		System.out.println(porfolioUtil.getPortfolioSummary(shahPortfolio));

	}

}
