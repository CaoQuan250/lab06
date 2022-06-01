import java.text.DecimalFormat;

public class Product {
    private String id;
    private String name;
    private Catergory category;
    private long amount;
    private long price;
    private long amountSale;

    public Product (String id, String name, Catergory category, long amount, long price, long amountSale) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.amount = amount;
        this.price = price;
        this.amountSale = amountSale;
    }

    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Catergory getCategory() {
        return category;
    }

    public void setCategory(Catergory category) {
        this.category = category;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getAmountSale() {
        return amountSale;
    }

    public void setAmountSale(long amountSale) {
        this.amountSale = amountSale;
    }
    public static String formatMoney(long money){
        DecimalFormat formattter = new DecimalFormat("###,###,##0.00");
        return formattter.format(money);
    }
    @Override
    public String toString(){
        return  id+ " - " + name + " - " + category.getValue() + " - " + amount + " - " + formatMoney(price) + " - " + amountSale;
    }
}
