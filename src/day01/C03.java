package day01;

public class C03 {
    public static void main(String[] args) {
        System.out.println("2.gün ilk class");
        System.out.println("aciklama");
        /*
        kisisel kullanimda eski commitlere donmek istedigimizde tek bir git komutu
        yeterli olur. Ancak islemi yapmadan once commit yaparak son halini git'e gönderebiliriz

       senaryo:eski bir commit'e gidip orada inceleme yaptıktan sonra projenin son haline geri dönün
        1- projenin son halini commit yapın
        2- git log --oneline diyerek commit gecmisini görun
        3- istediginiz commit'e gitmek icin git checkout 123456
        (istenenn commit'in hash kodunun ilk 7 hanesi)
        4- istedigimiz commit'i inceledik ve projenin son haline donmek istiyorsak
        git checkout 1234567(son commit'in hash kodu)


        senaryo: son yapilan commit'i gecersiz kıllıp, bir onceki commit'e donun

        bu yazi yanlislikla yazildi, bir onceki commit'e donelim

        not: geriye donme islemlerinde local repo ile remote repo birbirinden farklılasacagı
        icin geriye dondugumuzde baska islem yapmadan remote repo'yu guncellemek gerekir

        checkout :commitler arasinda gecis yapar(bakip gecmek icin)
        revert :geriye dondurur ve o halini otomatik olarak commit yapar
        yani kalici olarak geriye dondurmus olur.


         */
    }
}
