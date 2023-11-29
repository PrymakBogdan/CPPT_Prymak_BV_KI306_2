package KI306.Prymak.Lab3;
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


        VideoPlayer videoPlayer = new VideocassetteRecorder(name, dig);



        videoPlayer.openDiscTray();



        videoPlayer.insertDisc(muv);

        System.out.print("Диск внесено!\n");

        videoPlayer.closeDiscTray();
        videoPlayer.play();


        int f=1;
        while (f != 0)
        {
            videoPlayer.out();
            System.out.print("Виберіть дію: ");
            f = scanner.nextInt();

            switch (f) {
                case 1: {
                    videoPlayer.play();
                    System.out.print("Програється!\n ");
                    break;
                }
                case 2: {
                    System.out.print("Пауза!\n ");
                    videoPlayer.pause();
                    break;
                }
                case 3: {
                    System.out.print("Виберіть uexyscnm 1-100: ");
                    int v = scanner.nextInt();
                    System.out.print("гучність змінено на: "+v+"\n");
                    videoPlayer.adjustVolume(v);
                    break;
                }
                case 4: {
                    System.out.print("КІНЕЦЬ!\n ");
                    videoPlayer.stop();
                    break;
                }
                case 0:{
                    System.out.print("Перегляд завершено! \n");
                    break;
                }


                case 5:{
                    // Запис на касету
                    if (videoPlayer instanceof CassetteRecorder) {
                        CassetteRecorder cassetteRecorder = (CassetteRecorder) videoPlayer;
                        CassetteRecorder1 cassetteRecorder1 = (CassetteRecorder1) videoPlayer;
                        cassetteRecorder.recordVideo();
                        cassetteRecorder1.stopRecording();
                    }
                }

                default:{
                    System.out.print("Помилкове число! \n");
                    break;
                }

            }


        }

        videoPlayer.ejectDisc();




        scanner.close();
    }

}