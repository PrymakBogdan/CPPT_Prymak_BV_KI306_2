class VideoPlayer:
    def __init__(self, model, resolution):
        self.model = model
        self.resolution = resolution

    def play(self):
        print(f"Відео програється на {self.model} з розширенням: {self.resolution}p")