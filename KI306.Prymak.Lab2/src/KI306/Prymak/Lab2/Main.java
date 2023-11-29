package KI306.Prymak.Lab2;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Який диск вносите? ");
        String muv = scanner.nextLine();

        System.out.print("Введіть бренд: ");

        String name = scanner.nextLine();

        System.out.print("Введіть розмір екрану: ");
        int dig = scanner.nextInt();

        //int l[]={0,0};



        VideoPlayer player = new VideoPlayer(name, dig);

        //l[player.Q1()]++;

        VideoPlayer player1 = new VideoPlayer(name, dig);
        //l[player1.Q1()]++;

        VideoPlayer player2 = new VideoPlayer(name);
        //l[player2.Q1()]++;

        main1();

        player.Qout1();
        player.Qout2();
        //System.out.print("Одна"+l[0]+"\n Два"+l[1]+"\n");

        player.openDiscTray();



        player.insertDisc(muv);

        System.out.print("Диск внесено!\n");

        player.closeDiscTray();
        player.play();


        int f=1;
        while (f != 0)
        {
            player.out();
            System.out.print("Виберіть дію: ");
            f = scanner.nextInt();

            switch (f) {
                case 1: {
                    player.play();
                    System.out.print("Програється!\n ");
                    break;
                }
                case 2: {
                    System.out.print("Пауза!\n ");
                    player.pause();
                    break;
                }
                case 3: {
                    System.out.print("Виберіть uexyscnm 1-100: ");
                    int v = scanner.nextInt();
                    System.out.print("гучність змінено на: "+v+"\n");
                    player.adjustVolume(v);
                    break;
                }
                case 4: {
                    System.out.print("КІНЕЦЬ!\n ");
                    player.stop();
                    break;
                }
                case 0:{
                    System.out.print("Перегляд завершено! \n");
                    break;
                }
                default:{
                    System.out.print("Помилкове число! \n");
                    break;
                }

            }


        }

        player.ejectDisc();




        scanner.close();
    }
    public static void main1()
    {

        VideoPlayer player2 = new VideoPlayer("name");
        VideoPlayer player3 = new VideoPlayer("name",42);
    }
}