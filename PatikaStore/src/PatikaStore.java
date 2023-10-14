import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PatikaStore {
    private static Scanner scan = new Scanner(System.in);
    static ArrayList<Brand> brandList = new ArrayList<Brand>();
    static ArrayList<Notebook> notebooksArrayList = new ArrayList<Notebook>();
    static ArrayList<Phone> cellphonesArrayList = new ArrayList<Phone>();
    static NotebookOperations notebookOperations = new NotebookOperations();
    static PhoneOperations cellphoneOperations = new PhoneOperations();

    public static void Run() {
        System.out.println();
        System.out.println("Patika Store Hosgeldiniz !");
        addAllBrand();

        while (true) {
            System.out.println();
            System.out.println("====================================");
            System.out.println("Patika Store Urun Yönetim Paneli ! ");
            System.out.println("1 - Notebook islemleri");
            System.out.println("2 - Cep Telefonu islemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Cikis Yap");
            System.out.println("====================================");
            System.out.println();

            System.out.print("Gerceklestirmek istediginiz islemi seciniz : ");
            int selectedProcess = scan.nextInt();

            switch (selectedProcess) {
                case 0:
                    System.out.println("Cikis Yapildi.");
                    return;
                case 1:
                    notebookOperations.notebookOperationsMake(notebooksArrayList);
                    break;
                case 2:
                    cellphoneOperations.cellphoneOperationsMake(cellphonesArrayList);
                    break;
                case 3:
                    printBrand(brandList);
                    break;
            }
        }
    }

    public static void addAllBrand() {
        brandList.add(new Brand(1, "Xiaomi"));
        brandList.add(new Brand(2, "Lenovo"));
        brandList.add(new Brand(3, "Asus"));
        brandList.add(new Brand(4, "Casper"));
        brandList.add(new Brand(5, "HP"));
        brandList.add(new Brand(6, "Huawei"));
        brandList.add(new Brand(7, "Apple"));
        brandList.add(new Brand(8, "Samsung"));
        brandList.add(new Brand(9, "Monster"));
    }
    public static void printBrand(ArrayList<Brand> brandsArrayList) {
        Collections.sort(brandsArrayList, new Comparator<Brand>() {
            @Override
            public int compare(Brand brand1, Brand brand2) {
                return brand1.getName().compareTo(brand2.getName());
            }
        });

        for (Brand brand : brandsArrayList) {
            System.out.println(brand.getName());
        }
    }
}
