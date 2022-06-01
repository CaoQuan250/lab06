import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        Menu.mainMenu();
        int choose = scanner.nextInt();
        switch (choose) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("DANH SÁCH SẢN PHẨM");
                repository.show();
                break;
            case 2:
                System.out.println("Các sản phẩm có giá trên 10000: ");
                repository.filterProductByPrice();
                break;
            case 3:
                repository.contProductByAmountSale();
                break;
            case 4:
                Repository repository1 = new Repository();
                Scanner scanner1 = new Scanner(System.in);
                Menu.chooseCategory();
                int choose1 = scanner1.nextInt();
                switch (choose1){
                    case 1:
                        repository1.showCategoryFood();
                        break;
                    case 2:
                        repository1.showCategoryHouseWare();
                        break;
                    case 3:
                        repository1.showCategoryCometics();
                        break;
                    case 4:
                        repository1.showCategoryFashion();
                        break;
                }
                break;

            case 5:
                repository.sortProductByAmountSale();
                System.out.println("Sản phẩm sau khi sắp xếp: ");
                repository.show();
                break;
            case 6:
                repository.showMostAmountSale();
                break;
            case 7:
                repository.sortProductByName();
                System.out.println("Sản phẩm sau khi sắp xếp: ");
                repository.show();
        }

    }
}
