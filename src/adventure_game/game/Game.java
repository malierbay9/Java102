package adventure_game.game;

import adventure_game.maps.*;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        boolean gameEnd = true;
        System.out.println("Macera oyununa hoşgeldiniz !");
        System.out.println("Lütfen isminizi giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli vadiye hoş geldniz !");
        System.out.println("Burada yaşananların hepsi gerçek.");
        System.out.println("Lütfen bir karakter seçiniz : ");
        player.selectChar();

        Location location = null;

        //LOKASYON SEÇİMİ
        while (gameEnd) {
            Location[] locationList =
                    {new SafeHouse(player), new ToolStore(player), new Cave(player), new Forest(player), new River(player), new Mine(player)};
            System.out.println();
            player.printInfo();
            System.out.println();
            System.out.println("########### Bölgeler ############# : ");
            System.out.println();

            for (int i = 0; i < locationList.length; i++) {
                System.out.println(i+1 + "\t" + locationList[i].getName());
            }
            System.out.println();
            System.out.println("0 - Oyunu Sonlandır.");
            System.out.println();
            System.out.println("Nereye gitmek istersin ? ");

            while (true) {
                int selectLoc = input.nextInt();
                if (selectLoc < 0 || selectLoc > locationList.length) {
                    System.out.println("Geçerli seçim giriniz !");
                    continue;
                } else if (selectLoc == 0) {
                    System.out.println("Bu karanlık ve sisli vadiden kaçmayı tercih ettin.. :)))");
                    location = null;
                    gameEnd = false;
                    break;
                } else {
                    location = locationList[selectLoc - 1];
                    break;
                }
            }
            if (location != null) {
                if (!location.onLocation()) {
                    System.out.println("ÖLDÜNÜZ !!! Oyun Bitti...");
                    break;
                }
            }

        }

    }
}
