package br.edu.infnet.yahoo.financas.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "result")
public class FinancesDTO {
	
	private String language;
	private String region;
	private String quoteType;
	private String quoteSourceName;
	private String triggerable;
	private String currency;
	private String exchange;
	private String shortName;
	private String longName;
	private String messageBoardId;
	private String exchangeTimezoneName;
	private String exchangeTimezoneShortName;
	private String gmtOffSetMilliseconds;
	private String market;
	private String esgPopulated;
	private String marketState;
	private String firstTradeDateMilliseconds;
	private String priceHint;
	private String regularMarketChange;
	private String regularMarketChangePercent;
	private String regularMarketTime;
	private String regularMarketPrice;
	private String regularMarketDayHigh;
	private String regularMarketDayRange;
	private String regularMarketDayLow;
	private String regularMarketVolume;
	private String regularMarketPreviousClose;
	private String bid;
	private String ask;
	private String bidSize;
	private String askSize;
	private String fullExchangeName;
	private String financialCurrency;
	private String regularMarketOpen;
	private String averageDailyVolume3Month;
	private String averageDailyVolume10Day;
	private String fiftyTwoWeekLowChange;
	private String fiftyTwoWeekLowChangePercent;
	private String fiftyTwoWeekRange;
	private String fiftyTwoWeekHighChange;
	private String fiftyTwoWeekHighChangePercent;
	private String fiftyTwoWeekLow;
	private String fiftyTwoWeekHigh;
	private String earningsTimestamp;
	private String earningsTimestampStart;
	private String earningsTimestampEnd;
	private String trailingAnnualDividendRate;
	private String trailingPE;
	private String trailingAnnualDividendYield;
	private String epsTrailingTwelveMonths;
	private String epsForward;
	private String sharesOutstanding;
	private String bookValue;
	private String fiftyDayAverage;
	private String fiftyDayAverageChange;
	private String fiftyDayAverageChangePercent;
	private String twoHundredDayAverage;
	private String twoHundredDayAverageChange;
	private String twoHundredDayAverageChangePercent;
	private String marketCap;
	private String forwardPE;
	private String priceToBook;
	private String sourceInterval;
	private String exchangeDataDelayedBy;
	private String tradeable;
	private String symbol;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getQuoteType() {
		return quoteType;
	}
	public void setQuoteType(String quoteType) {
		this.quoteType = quoteType;
	}
	public String getQuoteSourceName() {
		return quoteSourceName;
	}
	public void setQuoteSourceName(String quoteSourceName) {
		this.quoteSourceName = quoteSourceName;
	}
	public String getTriggerable() {
		return triggerable;
	}
	public void setTriggerable(String triggerable) {
		this.triggerable = triggerable;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getMessageBoardId() {
		return messageBoardId;
	}
	public void setMessageBoardId(String messageBoardId) {
		this.messageBoardId = messageBoardId;
	}
	public String getExchangeTimezoneName() {
		return exchangeTimezoneName;
	}
	public void setExchangeTimezoneName(String exchangeTimezoneName) {
		this.exchangeTimezoneName = exchangeTimezoneName;
	}
	public String getExchangeTimezoneShortName() {
		return exchangeTimezoneShortName;
	}
	public void setExchangeTimezoneShortName(String exchangeTimezoneShortName) {
		this.exchangeTimezoneShortName = exchangeTimezoneShortName;
	}
	public String getGmtOffSetMilliseconds() {
		return gmtOffSetMilliseconds;
	}
	public void setGmtOffSetMilliseconds(String gmtOffSetMilliseconds) {
		this.gmtOffSetMilliseconds = gmtOffSetMilliseconds;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getEsgPopulated() {
		return esgPopulated;
	}
	public void setEsgPopulated(String esgPopulated) {
		this.esgPopulated = esgPopulated;
	}
	public String getMarketState() {
		return marketState;
	}
	public void setMarketState(String marketState) {
		this.marketState = marketState;
	}
	public String getFirstTradeDateMilliseconds() {
		return firstTradeDateMilliseconds;
	}
	public void setFirstTradeDateMilliseconds(String firstTradeDateMilliseconds) {
		this.firstTradeDateMilliseconds = firstTradeDateMilliseconds;
	}
	public String getPriceHint() {
		return priceHint;
	}
	public void setPriceHint(String priceHint) {
		this.priceHint = priceHint;
	}
	public String getRegularMarketChange() {
		return regularMarketChange;
	}
	public void setRegularMarketChange(String regularMarketChange) {
		this.regularMarketChange = regularMarketChange;
	}
	public String getRegularMarketChangePercent() {
		return regularMarketChangePercent;
	}
	public void setRegularMarketChangePercent(String regularMarketChangePercent) {
		this.regularMarketChangePercent = regularMarketChangePercent;
	}
	public String getRegularMarketTime() {
		return regularMarketTime;
	}
	public void setRegularMarketTime(String regularMarketTime) {
		this.regularMarketTime = regularMarketTime;
	}
	public String getRegularMarketPrice() {
		return regularMarketPrice;
	}
	public void setRegularMarketPrice(String regularMarketPrice) {
		this.regularMarketPrice = regularMarketPrice;
	}
	public String getRegularMarketDayHigh() {
		return regularMarketDayHigh;
	}
	public void setRegularMarketDayHigh(String regularMarketDayHigh) {
		this.regularMarketDayHigh = regularMarketDayHigh;
	}
	public String getRegularMarketDayRange() {
		return regularMarketDayRange;
	}
	public void setRegularMarketDayRange(String regularMarketDayRange) {
		this.regularMarketDayRange = regularMarketDayRange;
	}
	public String getRegularMarketDayLow() {
		return regularMarketDayLow;
	}
	public void setRegularMarketDayLow(String regularMarketDayLow) {
		this.regularMarketDayLow = regularMarketDayLow;
	}
	public String getRegularMarketVolume() {
		return regularMarketVolume;
	}
	public void setRegularMarketVolume(String regularMarketVolume) {
		this.regularMarketVolume = regularMarketVolume;
	}
	public String getRegularMarketPreviousClose() {
		return regularMarketPreviousClose;
	}
	public void setRegularMarketPreviousClose(String regularMarketPreviousClose) {
		this.regularMarketPreviousClose = regularMarketPreviousClose;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getAsk() {
		return ask;
	}
	public void setAsk(String ask) {
		this.ask = ask;
	}
	public String getBidSize() {
		return bidSize;
	}
	public void setBidSize(String bidSize) {
		this.bidSize = bidSize;
	}
	public String getAskSize() {
		return askSize;
	}
	public void setAskSize(String askSize) {
		this.askSize = askSize;
	}
	public String getFullExchangeName() {
		return fullExchangeName;
	}
	public void setFullExchangeName(String fullExchangeName) {
		this.fullExchangeName = fullExchangeName;
	}
	public String getFinancialCurrency() {
		return financialCurrency;
	}
	public void setFinancialCurrency(String financialCurrency) {
		this.financialCurrency = financialCurrency;
	}
	public String getRegularMarketOpen() {
		return regularMarketOpen;
	}
	public void setRegularMarketOpen(String regularMarketOpen) {
		this.regularMarketOpen = regularMarketOpen;
	}
	public String getAverageDailyVolume3Month() {
		return averageDailyVolume3Month;
	}
	public void setAverageDailyVolume3Month(String averageDailyVolume3Month) {
		this.averageDailyVolume3Month = averageDailyVolume3Month;
	}
	public String getAverageDailyVolume10Day() {
		return averageDailyVolume10Day;
	}
	public void setAverageDailyVolume10Day(String averageDailyVolume10Day) {
		this.averageDailyVolume10Day = averageDailyVolume10Day;
	}
	public String getFiftyTwoWeekLowChange() {
		return fiftyTwoWeekLowChange;
	}
	public void setFiftyTwoWeekLowChange(String fiftyTwoWeekLowChange) {
		this.fiftyTwoWeekLowChange = fiftyTwoWeekLowChange;
	}
	public String getFiftyTwoWeekLowChangePercent() {
		return fiftyTwoWeekLowChangePercent;
	}
	public void setFiftyTwoWeekLowChangePercent(String fiftyTwoWeekLowChangePercent) {
		this.fiftyTwoWeekLowChangePercent = fiftyTwoWeekLowChangePercent;
	}
	public String getFiftyTwoWeekRange() {
		return fiftyTwoWeekRange;
	}
	public void setFiftyTwoWeekRange(String fiftyTwoWeekRange) {
		this.fiftyTwoWeekRange = fiftyTwoWeekRange;
	}
	public String getFiftyTwoWeekHighChange() {
		return fiftyTwoWeekHighChange;
	}
	public void setFiftyTwoWeekHighChange(String fiftyTwoWeekHighChange) {
		this.fiftyTwoWeekHighChange = fiftyTwoWeekHighChange;
	}
	public String getFiftyTwoWeekHighChangePercent() {
		return fiftyTwoWeekHighChangePercent;
	}
	public void setFiftyTwoWeekHighChangePercent(String fiftyTwoWeekHighChangePercent) {
		this.fiftyTwoWeekHighChangePercent = fiftyTwoWeekHighChangePercent;
	}
	public String getFiftyTwoWeekLow() {
		return fiftyTwoWeekLow;
	}
	public void setFiftyTwoWeekLow(String fiftyTwoWeekLow) {
		this.fiftyTwoWeekLow = fiftyTwoWeekLow;
	}
	public String getFiftyTwoWeekHigh() {
		return fiftyTwoWeekHigh;
	}
	public void setFiftyTwoWeekHigh(String fiftyTwoWeekHigh) {
		this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
	}
	public String getEarningsTimestamp() {
		return earningsTimestamp;
	}
	public void setEarningsTimestamp(String earningsTimestamp) {
		this.earningsTimestamp = earningsTimestamp;
	}
	public String getEarningsTimestampStart() {
		return earningsTimestampStart;
	}
	public void setEarningsTimestampStart(String earningsTimestampStart) {
		this.earningsTimestampStart = earningsTimestampStart;
	}
	public String getEarningsTimestampEnd() {
		return earningsTimestampEnd;
	}
	public void setEarningsTimestampEnd(String earningsTimestampEnd) {
		this.earningsTimestampEnd = earningsTimestampEnd;
	}
	public String getTrailingAnnualDividendRate() {
		return trailingAnnualDividendRate;
	}
	public void setTrailingAnnualDividendRate(String trailingAnnualDividendRate) {
		this.trailingAnnualDividendRate = trailingAnnualDividendRate;
	}
	public String getTrailingPE() {
		return trailingPE;
	}
	public void setTrailingPE(String trailingPE) {
		this.trailingPE = trailingPE;
	}
	public String getTrailingAnnualDividendYield() {
		return trailingAnnualDividendYield;
	}
	public void setTrailingAnnualDividendYield(String trailingAnnualDividendYield) {
		this.trailingAnnualDividendYield = trailingAnnualDividendYield;
	}
	public String getEpsTrailingTwelveMonths() {
		return epsTrailingTwelveMonths;
	}
	public void setEpsTrailingTwelveMonths(String epsTrailingTwelveMonths) {
		this.epsTrailingTwelveMonths = epsTrailingTwelveMonths;
	}
	public String getEpsForward() {
		return epsForward;
	}
	public void setEpsForward(String epsForward) {
		this.epsForward = epsForward;
	}
	public String getSharesOutstanding() {
		return sharesOutstanding;
	}
	public void setSharesOutstanding(String sharesOutstanding) {
		this.sharesOutstanding = sharesOutstanding;
	}
	public String getBookValue() {
		return bookValue;
	}
	public void setBookValue(String bookValue) {
		this.bookValue = bookValue;
	}
	public String getFiftyDayAverage() {
		return fiftyDayAverage;
	}
	public void setFiftyDayAverage(String fiftyDayAverage) {
		this.fiftyDayAverage = fiftyDayAverage;
	}
	public String getFiftyDayAverageChange() {
		return fiftyDayAverageChange;
	}
	public void setFiftyDayAverageChange(String fiftyDayAverageChange) {
		this.fiftyDayAverageChange = fiftyDayAverageChange;
	}
	public String getFiftyDayAverageChangePercent() {
		return fiftyDayAverageChangePercent;
	}
	public void setFiftyDayAverageChangePercent(String fiftyDayAverageChangePercent) {
		this.fiftyDayAverageChangePercent = fiftyDayAverageChangePercent;
	}
	public String getTwoHundredDayAverage() {
		return twoHundredDayAverage;
	}
	public void setTwoHundredDayAverage(String twoHundredDayAverage) {
		this.twoHundredDayAverage = twoHundredDayAverage;
	}
	public String getTwoHundredDayAverageChange() {
		return twoHundredDayAverageChange;
	}
	public void setTwoHundredDayAverageChange(String twoHundredDayAverageChange) {
		this.twoHundredDayAverageChange = twoHundredDayAverageChange;
	}
	public String getTwoHundredDayAverageChangePercent() {
		return twoHundredDayAverageChangePercent;
	}
	public void setTwoHundredDayAverageChangePercent(String twoHundredDayAverageChangePercent) {
		this.twoHundredDayAverageChangePercent = twoHundredDayAverageChangePercent;
	}
	public String getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}
	public String getForwardPE() {
		return forwardPE;
	}
	public void setForwardPE(String forwardPE) {
		this.forwardPE = forwardPE;
	}
	public String getPriceToBook() {
		return priceToBook;
	}
	public void setPriceToBook(String priceToBook) {
		this.priceToBook = priceToBook;
	}
	public String getSourceInterval() {
		return sourceInterval;
	}
	public void setSourceInterval(String sourceInterval) {
		this.sourceInterval = sourceInterval;
	}
	public String getExchangeDataDelayedBy() {
		return exchangeDataDelayedBy;
	}
	public void setExchangeDataDelayedBy(String exchangeDataDelayedBy) {
		this.exchangeDataDelayedBy = exchangeDataDelayedBy;
	}
	public String getTradeable() {
		return tradeable;
	}
	public void setTradeable(String tradeable) {
		this.tradeable = tradeable;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	@Override
	public String toString() {
		return "FinancesDTO [quoteSourceName=" + quoteSourceName + ", currency=" + currency + ", shortName=" + shortName
				+ ", longName=" + longName + ", marketState=" + marketState + ", priceHint=" + priceHint
				+ ", regularMarketChange=" + regularMarketChange + ", regularMarketChangePercent="
				+ regularMarketChangePercent + ", regularMarketTime=" + regularMarketTime + ", regularMarketPrice="
				+ regularMarketPrice + ", financialCurrency=" + financialCurrency + ", regularMarketOpen="
				+ regularMarketOpen + ", averageDailyVolume3Month=" + averageDailyVolume3Month
				+ ", averageDailyVolume10Day=" + averageDailyVolume10Day + ", fiftyTwoWeekLowChange="
				+ fiftyTwoWeekLowChange + ", fiftyTwoWeekLowChangePercent=" + fiftyTwoWeekLowChangePercent
				+ ", fiftyTwoWeekRange=" + fiftyTwoWeekRange + ", fiftyTwoWeekHighChange=" + fiftyTwoWeekHighChange
				+ ", marketCap=" + marketCap + ", forwardPE=" + forwardPE + ", priceToBook=" + priceToBook + "]";
	}
	
	

	
	
		
	
}
