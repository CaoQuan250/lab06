import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Repository {
    List<Product> listProduct = new ArrayList<>();
    public Repository() {
        listProduct.add(new Product("01","Bánh Doraemon 3 vị", Catergory.FOOD, 100, 3500, 57));
        listProduct.add(new Product("02","Xúc xích sườn non", Catergory.FOOD, 150, 3500, 12));
        listProduct.add(new Product("03","Thanh cua", Catergory.FOOD, 100, 5000, 85));
        listProduct.add(new Product("04","Bánh khoai môn", Catergory.FOOD, 200, 42000, 78));
        listProduct.add(new Product("05","Thìa ăn cơm inox mạ vàng", Catergory.HOUSEWARE, 50, 8000, 4));
        listProduct.add(new Product("06","Bát đựng gia vị", Catergory.HOUSEWARE, 65, 4000, 44));
        listProduct.add(new Product("07","Nước Hoa Hồng Soothing Facial Toner Simple",Catergory.COMETICS,140,92000,
                57));
        listProduct.add(new Product("08","Combo gội xã HAIRBURST", Catergory.COMETICS, 100, 639000, 7));
        listProduct.add(new Product("09","Tinh chất dưỡng ẩm sâu Klairs Rich Moist Soothing Serum", Catergory.COMETICS, 50,
                249000, 24));
        listProduct.add(new Product("10","Kem dưỡng thể Paula's Choise RESIST WEIGHTLESS BODY TREATMENT", Catergory.COMETICS,
                80, 715000, 63));
        listProduct.add(new Product("11","Áo thun TSUN", Catergory.FASHION, 250, 320000, 146));
    }
    public void show(){
        listProduct.forEach(product -> System.out.println(product));
    }

    public void sortProductByName(){
        listProduct.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
    }
    public void sortProductByAmountSale(){
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return new Long(o2.getAmountSale()).compareTo(o1.getAmountSale());
            }
        });
    }
    public void filterProductByPrice(){
        listProduct.stream()
                .filter(product -> product.getPrice()> 10000)
                .forEach(product -> System.out.println(product));
    }

    public void contProductByAmountSale(){
        long count = listProduct.stream()
                .filter(product -> product.getAmountSale() >= 50)
                .count();
        System.out.println("Số lượng sản phẩm bán được từ 50 trở lên là: "+count);

    }
    public void showMostAmountSale(){
        listProduct.stream()
                .filter(product -> product.getAmountSale()>= 146)
                .forEach(product -> System.out.println(product));

    }
    public void showCategoryFood(){
        for (Product a:listProduct ){
            if (Catergory.FOOD == a.getCategory()){
                System.out.println(a);
            }
        }
    }

    public void showCategoryHouseWare(){
        for (Product b:listProduct){
            if (Catergory.HOUSEWARE == b.getCategory()) {
                System.out.println(b);
            }
        }
    }

    public void showCategoryCometics(){
        for (Product c:listProduct) {
            if (Catergory.COMETICS == c.getCategory()) {
                System.out.println(c);
            }
        }
    }

    public void showCategoryFashion(){
        for (Product d:listProduct) {
            if (Catergory.FASHION == d.getCategory()) {
                System.out.println(d);
            }
        }
    }







}
