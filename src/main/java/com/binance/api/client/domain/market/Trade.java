package com.binance.api.client.domain.market;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * An aggregated trade event for a symbol.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trade {

  @JsonProperty("t")
  private long tradeId;

  @JsonProperty("p")
  private String price;

  @JsonProperty("q")
  private String quantity;

  @JsonProperty("b")
  private long buyer;

  @JsonProperty("a")
  private long seller;

  @JsonProperty("T")
  private long tradeTime;

  @JsonProperty("m")
  private boolean isBuyerMaker;

  public long getTradeId() {
    return tradeId;
  }

  public void setTradeId(long tradeId) {
    this.tradeId = tradeId;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public long getBuyer() {
    return buyer;
  }

  public void setBuyer(long buyer) {
    this.buyer = buyer;
  }

  public long getSeller() {
    return seller;
  }

  public void setSeller(long seller) {
    this.seller = seller;
  }

  public long getTradeTime() {
    return tradeTime;
  }

  public void setTradeTime(long tradeTime) {
    this.tradeTime = tradeTime;
  }

  public boolean isBuyerMaker() {
    return isBuyerMaker;
  }

  public void setBuyerMaker(boolean buyerMaker) {
    isBuyerMaker = buyerMaker;
  }

  @Override
  public String toString() {
    return "Trade{" +
            "tradeId=" + tradeId +
            ", price='" + price + '\'' +
            ", quantity='" + quantity + '\'' +
            ", buyer=" + buyer +
            ", seller=" + seller +
            ", tradeTime=" + tradeTime +
            ", isBuyerMaker=" + isBuyerMaker +
            '}';
  }

}
