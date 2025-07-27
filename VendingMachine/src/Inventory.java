public class Inventory {

    ItemShelf[] products = null;

    Inventory(int itemCount){
        products = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    public ItemShelf[] getProducts() {
        return products;
    }

    public void setProducts(ItemShelf[] products) {
        this.products = products;
    }

    public void initialEmptyInventory() {
        int startCode = 101;
        for(int i=0;i<products.length;i++){
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSold(true);
            products[i] = space;
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception{
        for(ItemShelf itemShelf: products){
            if(itemShelf.code == codeNumber) {
                if(itemShelf.isSold()){
                    itemShelf.item = item;
                    itemShelf.setSold(false);
                } else {
                    throw new Exception("Item is already present here.");
                }
            }
        }
    }
    public Item getItem(int codeNumber) throws Exception {

        for (ItemShelf itemShelf : products) {
            if (itemShelf.code == codeNumber) {
                if (itemShelf.isSold()) {
                    throw new Exception("item already sold out");
                } else {
                    return itemShelf.item;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber){
        for (ItemShelf itemShelf : products) {
            if (itemShelf.code == codeNumber) {
                itemShelf.setSold(true);
            }
        }
    }

}
