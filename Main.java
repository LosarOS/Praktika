package workpractice;

public class Main {
    public static void main(String[] args) {
        Adres adres=new Adres();
        Avtorizaciya avtorizaciya=new Avtorizaciya();
        Histori histori=new Histori();
        Info info=new Info();
        Zakazi zakazi=new Zakazi();
        Marka marka=new Marka();
        
        System.out.println("Адрес");
        adres.adresOut();
        
        System.out.println();
        
        System.out.println("Ввод данных");
        avtorizaciya.avtorizaciyaOut();
        
        System.out.println();
        
        System.out.println("История заказов");
        histori.historiOut();
        
        System.out.println();
        
        System.out.println("Информация");
        info.infoOut();
        
        System.out.println();
        
        System.out.println("Заказы");
        zakazi.zakaziOut();
        
        System.out.println();
        
        System.out.println("Заказы");
        marka.markaOut();
    }
}