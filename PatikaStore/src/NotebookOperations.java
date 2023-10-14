import java.util.ArrayList;
import java.util.Scanner;

public class NotebookOperations {
    public NotebookOperations() {
    }

    Scanner input = new Scanner(System.in);

    public void notebookOperationsMake(ArrayList<Notebook> notebooksArrayList){
        while (true){
            System.out.println();
            System.out.println("====================================");
            System.out.println("Notebook islemleri :");
            System.out.println("1 - Notebook ekle");
            System.out.println("2 - Notebok cikar");
            System.out.println("3 - Notebook listesini goruntule");
            System.out.println("0 - Ana menüye don");
            System.out.println("====================================");
            System.out.println();

            System.out.println("Lutfen yapmak istediginiz islemi seciniz :");
            int selectedProcess = input.nextInt();

            switch (selectedProcess){
                case 1:
                    while (true){
                        System.out.print("ID Numarasi :");
                        int ID = input.nextInt();
                        System.out.print("Ürün Adı: ");
                        String notebookName = input.next();
                        System.out.print("Birim Fiyati :  ");
                        int notebookPrice = input.nextInt();
                        System.out.print("Marka : ");
                        String notebookBrand = input.next();
                        System.out.print("Hafıza : ");
                        int notebookMemory = input.nextInt();
                        System.out.print("Ekran Boyutu : ");
                        float notebookScreen = input.nextFloat();
                        System.out.print("Ram : ");
                        int notebookRam = input.nextInt();
                        System.out.print("Stok :");
                        int stockQuantity = input.nextInt();
                        Notebook notebooks = new Notebook(ID,notebookPrice,stockQuantity,notebookName,notebookBrand,notebookRam,notebookScreen,notebookMemory);
                        notebooksArrayList.add(notebooks);
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Ürün başarılı bir şekilde eklendi!");
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Baska bir notebook eklemek ister misiniz? (1 ---> Evet)");
                        int select = input.nextInt();
                        if (select == 1){
                            continue;
                        }
                        else {
                            break;
                        }
                    }
                    break;
                case 2 :
                    int selectedID = input.nextInt();
                    notebooksArrayList.remove(selectedID -1);
                    break;
                case 3 :
                    printNotebooksList(notebooksArrayList);
                case 0 :
                    PatikaStore.Run();
                    break;
            }

        }
    }


    public void printNotebooksList(ArrayList<Notebook> notebooksArrayList){
        System.out.format("| %3s | %-20s | %6s | %-10s | %8s | %12s | %4s |%n",
                "ID", "PRODUCT NAME", "PRICE", "BRAND", "STORAGE", "SCREEN SIZE", "RAM");
        System.out.println("========================================================================================");

        for (Notebook notebooks : notebooksArrayList){
            System.out.format("| %3s | %-20s | %6s | %-10s | %8s | %12s | %4s |%n", notebooks.getID(), notebooks.getName(), notebooks.getPrice(),
                    notebooks.getBrand(), notebooks.getStorage(), notebooks.getScreenSize(), notebooks.getRam());
        }

    }

}

