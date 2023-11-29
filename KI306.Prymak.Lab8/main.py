import math
import struct

def calculate_expression(x):
    try:
        result = (x - 4) / math.sin(3 * x - 1)
        return result
    except ZeroDivisionError:
        print("Ділення на нуль неможливе.")
        return None

def write_to_text_file(filename, data):
    with open(filename, 'w') as file:
        for item in data:
            file.write(str(item) + '\n')

def read_from_text_file(filename):
    data = []
    try:
        with open(filename, 'r') as file:
            for line in file:
                data.append(float(line.strip()))
    except FileNotFoundError:
        print("Файл не знайдено.")
    return data

def write_to_binary_file(filename, data):
    with open(filename, 'wb') as file:
        for item in data:
            file.write(struct.pack('d', item))

def read_from_binary_file(filename):
    data = []
    try:
        with open(filename, 'rb') as file:
            while True:
                binary_data = file.read(8)
                if not binary_data:
                    break
                value = struct.unpack('d', binary_data)[0]
                data.append(value)
    except FileNotFoundError:
        print("Файл не знайдено.")
    return data

def main():
    x = float(input("Введіть значення x: "))
    result = calculate_expression(x)

    if result is not None:
        print(f"Результат обчислення виразу для x = {x}: {result}")

        # Запис результатів у текстовий файл
        write_to_text_file("result.txt", [result])

        # Зчитування результатів з текстового файлу і виведення на екран
        read_text = read_from_text_file("result.txt")
        if read_text:
            print("Результати зчитані з текстового файлу:")
            for item in read_text:
                print(item)

        # Запис результатів у бінарний файл
        write_to_binary_file("result.bin", [result])

        # Зчитування результатів з бінарного файлу і виведення на екран
        read_binary = read_from_binary_file("result.bin")
        if read_binary:
            print("Результати зчитані з бінарного файлу:")
            for item in read_binary:
                print(item)

if __name__ == "__main__":
    main()
