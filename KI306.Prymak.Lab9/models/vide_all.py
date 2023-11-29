from models.video_player import VideoPlayer
from models.video_recorder import VideoRecorder

class VideoAll(VideoPlayer, VideoRecorder):
    def __init__(self, model, resolution,  name):
        super().__init__(model, resolution)
        self.name = name
    def get_all(self):
        super().record()
        print(f"Виклик з класу з множинним наслідуванням\nМодель: {self.model}, розширення: {self.resolution}")