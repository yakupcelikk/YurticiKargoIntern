public class Main {
    public static void main(String[] args) {
        String [][] sehirler = new String[3][3];
        sehirler[0][0] = "Istanbul";
        sehirler[0][1] = "Tekirdağ";
        sehirler[0][2] = "Çanakkale";
        sehirler[1][0] = "İzmir";
        sehirler[1][1] = "Aydın";
        sehirler[1][2] = "Muğla";
        sehirler[2][0] = "Sivas";
        sehirler[2][1] = "Malatya";
        sehirler[2][2] = "Ankara";

        for(int i = 0; i<=2; i++){
            System.out.println("--------------------");
            for (int j = 0; j<=2;j++){

                System.out.println(sehirler[i][j]);
            }
        }
    }
}