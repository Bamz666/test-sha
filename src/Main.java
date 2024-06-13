public class Main {
    public static void main(String[] args) {
        String input = "pemrogramanDasarJava1";

        int jumlahHurufBesar = 0;
        int jumlahHurufKecil = 0;
        int jumlahAngka = 0;
        int jumlahSimbol = 0;

        for (int i = 0; i < input.length(); i++) {
            char karakter = input.charAt(i);

            if (Character.isUpperCase(karakter)) {
                jumlahHurufBesar++;
            } else if (Character.isLowerCase(karakter)) {
                jumlahHurufKecil++;
            } else if (Character.isDigit(karakter)) {
                jumlahAngka++;
            } else {
                jumlahSimbol++;
            }
        }

        System.out.println("uppercase : " + jumlahHurufBesar);
        System.out.println("lowecase : " + jumlahHurufKecil);
        System.out.println("angka : " + jumlahAngka);
        System.out.println("symbol : " + jumlahSimbol);
    }
}