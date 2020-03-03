package proxy.staticproxy;

public class Purchasing implements IShop{

    private IShop shop;

    public Purchasing(IShop shop) {
        this.shop = shop;
    }

    @Override
    public void buy() {
        shop.buy();
    }
}
