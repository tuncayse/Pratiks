import java.util.ArrayList;
import java.util.Scanner;

public class PhoneOperations {
    public PhoneOperations(){

    }
    Scanner input = new Scanner(System.in);

    public void cellphoneOperationsMake(ArrayList<Phone> cellphonesArrayList){

        while (true){
            System.out.println();
            System.out.println("====================================");
            System.out.println("Cep Telefonu islemleri :");
            System.out.println("1 - Cep Telefonunu ekle ");
            System.out.println("2 - Cep telefonunu cikar");
            System.out.println("3 - Cep telefonu listesini goster");
            System.out.println("0 - Ana Menuye don");
            System.out.println("====================================");
            System.out.println();


            System.out.println("Lutfen yapmak istediginiz islemi seciniz :");
            int selectedProcess = input.nextInt();

            switch (selectedProcess){
                case 1:
                    while (true){
                        System.out.print("Kimlik Numarasini giriniz : ");
                        int ID = input.nextInt();

                        System.out.print("Cep telefonu adinigiriniz : ");
                        String cellphoneName = input.next();

                        System.out.print("Cep telefonunun fiyatiıni giriniz : ");
                        int cellphonePrice = input.nextInt();

                        System.out.print("Cep telefonunun markasini giriniz : ");
                        String cellphoneBrand = input.next();

                        System.out.print("Cep telefonunun hafızasini giriniz : ");
                        int cellphoneMemory = input.nextInt();

                        System.out.print("Cep telefonunun ekran boyutunu giriniz : ");
                        float cellphoneScreen = input.nextFloat();

                        System.out.print("Cep telefonunun kamera kalitesini giriniz : ");
                        int cellphoneCameraQuality = input.nextInt();

                        System.out.print("Cep telefonunun pilini giriniz : ");
                        int cellphoneBattery = input.nextInt();

                        System.out.print("Cep telefonunun RAM'ini giriniz : ");
                        int cellphoneRAM = input.nextInt();

                        System.out.print("Cep telefonu renklerini giriniz : ");
                        String cellphoneColor = input.next();

                        System.out.print("Cep Telefonu miktarini giriniz");
                        int cellphoneStockQuantity = input.nextInt();

                        Phone cellphones = new Phone(ID,cellphonePrice,cellphoneStockQuantity,cellphoneName,cellphoneBrand,cellphoneRAM,cellphoneScreen,cellphoneMemory,cellphoneBattery,cellphoneColor, cellphoneCameraQuality);
                        cellphonesArrayList.add(cellphones);

                        System.out.println("Baska bir Urun eklemek ister misiniz ? (1 -> Yes)");
                        int select = input.nextInt();
                        if (select == 1){
                            continue;
                        }
                        else {
                            break;
                        }
                    }
                    break;
                case 2:
                    int selectedID = input.nextInt();
                    cellphonesArrayList.remove(selectedID -1);
                    break;
                case 3:
                    printCellphoneList(cellphonesArrayList);
                    break;
                case 0:
                    PatikaStore.Run();
                    break;
            }

        }
    }
    public void printCellphoneList(ArrayList<Phone> cellphonesArrayList){
        System.out.format("| %3s | %-20s | %6s | %-10s | %8s | %12s | %8s | %8s | %4s | %-10s |%n",
                "ID", "PRODUCT NAME", "PRICE", "BRAND", "STORAGE", "SCREEN SIZE","CAMERA QUALITIY","BATTERY", "RAM", "COLOR");
        System.out.println("========================================================================================");

        for (Phone cellphones : cellphonesArrayList){
            System.out.format("| %3s | %-20s | %6s | %-10s | %8s | %12s | %8s | %8s | %4s | %-10s |%n",cellphones.getID(),cellphones.getName(),cellphones.getPrice(),cellphones.getBrand(),
                    cellphones.getPhoneMemory(),cellphones.getScreenSize(),cellphones.getCameraQuality(),cellphones.getBattery(),cellphones.getRam(),cellphones.getColor());
        }
    }
}

