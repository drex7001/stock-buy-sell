public class Stock {
    private String trade_id;
    private String stock_symbol;
    private String quantity;
    private String buy_sell;
    private String price;

    public Stock(String trade_id, String stock_symbol, String quantity, String buy_sell, String price) {
        this.trade_id = trade_id;
        this.stock_symbol = stock_symbol;
        this.quantity = quantity;
        this.buy_sell = buy_sell;
        this.price = price;
    }

    public void setTrade_id(String trade_id) {
        this.trade_id = trade_id;
    }

    public void setStock_symbol(String stock_symbol) {
        this.stock_symbol = stock_symbol;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setBuy_sell(String buy_sell) {
        this.buy_sell = buy_sell;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTrade_id() {
        return trade_id;
    }

    public String getStock_symbol() {
        return stock_symbol;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getBuy_sell() {
        return buy_sell;
    }

    public String getPrice() {
        return price;
    }
}
