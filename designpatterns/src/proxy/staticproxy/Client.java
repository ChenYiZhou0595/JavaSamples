package proxy.staticproxy;

public class Client {

    public static void main(String[] args) {
        IShop chen = new Chen();
        IShop purchasing = new Purchasing(chen);
        purchasing.buy();
    }
}
