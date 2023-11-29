package KI306.Prymak.Lab3;

import java.io.FileWriter;
import java.io.IOException;

class VideocassetteRecorder extends VideoPlayer implements CassetteRecorder, CassetteRecorder1 {
    private boolean isRecording;

    public VideocassetteRecorder(String brand, int screenSizeInInches) {
        super(brand, screenSizeInInches);
        this.isRecording = false;
    }


    public void recordVideo() {
        if (!isRecording) {
            isRecording = true;
            log("Розпочато запис відео на касету");
        }
    }


    public void stopRecording() {
        if (isRecording) {
            isRecording = false;
            log("Зупинено запис на касету");
        }
    }


    public void insertCassette(String cassetteName) {
        log("Вставлено касету: " + cassetteName);
    }

    private void log(String message) {
        String logMessage = message;

        try (FileWriter writer = new FileWriter("video_player_log.txt", true)) {
            writer.write(logMessage + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Помилка запису в журнал: " + e.getMessage());
        }
    }




}

