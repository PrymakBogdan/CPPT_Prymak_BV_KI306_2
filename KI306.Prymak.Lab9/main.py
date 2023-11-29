from models.video_player import VideoPlayer
from models.video_recorder import VideoRecorder
from models.vide_all import VideoAll


def main():
    print("Введіть модель Відеоплеєру:", end=" ")
    model = input()
    print("Розширення Відеоплеєра:", end=" ")
    resolution = input()

    recording_format = "mp4"
    al = VideoAll(model, resolution, "Name")
    recorder = VideoRecorder(recording_format)

    al.get_all()

if __name__ == "__main__":
    main()