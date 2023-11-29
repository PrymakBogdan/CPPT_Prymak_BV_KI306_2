package KI306.Prymak.Lab3;

import java.io.FileWriter;
import java.io.IOException;

public abstract class VideoPlayer {
    private String brand;
    private int screenSizeInInches;
    private boolean isPlaying;

    private static int playerCount = 0;





    public VideoPlayer(String brand, int screenSizeInInches) {
        this.brand = brand;
        this.screenSizeInInches = screenSizeInInches;
        this.isPlaying = false;
        log("Фірма:"+ brand);
        log("Діагональ:"+ screenSizeInInches);
        playerCount++;
    }

    public VideoPlayer(String brand) {
        this.brand = brand;
        this.screenSizeInInches = 32;
        this.isPlaying = false;
        log("Фірма:"+ brand);
        log("Діагональ:32");
    }




    public void play() {
        if (!isPlaying) {
            isPlaying = true;
            log("Відтворення відео");
        }
    }

    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            log("Пауза");
        }
    }

    public void stop() {
        if (isPlaying) {
            isPlaying = false;
            log("Зупинка відтворення");
        }
    }

    public void adjustVolume(int volume) {
        log("Зміна гучності на " + volume);
    }

    public void openDiscTray() {
        log("Відкриття лотка для диска");
    }

    public void closeDiscTray() {
        log("Закриття лотка для диска");
    }

    public void ejectDisc() {
        log("Завершення перегляду\n");
    }

    public void insertDisc(String discName) {
        log("Вставлення диска: " + discName);
    }

    private void log(String message) {
        String logMessage = message;

        try (FileWriter writer = new FileWriter("video_player_log.txt", true)) {
            writer.write(logMessage + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Помилка запису в журнал: " + e.getMessage());
        }
    }




    public void out(){
        System.out.println("Програвати - 1");
        System.out.println("Пауза - 2");
        System.out.println("Змінити гучність - 3");
        System.out.println("Закрити фільм - 4");
        System.out.println("Записати фільм - 5");
        System.out.println("Завершити перегляд - 0");
    }


    public static int getPlayerCount() {
        return playerCount;
    }
}

// Інтерфейс "Касетний запис"
interface CassetteRecorder {
    void recordVideo();

}
interface CassetteRecorder1{
    void stopRecording();
}