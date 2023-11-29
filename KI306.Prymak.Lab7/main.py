def main():
    n = 0
    arr = []
    filler = ""
    filler1 = ""


    print("Enter size of matrix:", end=" ")
    n = int(input())

    r = n // 4
    arr = [[] for _ in range(n)]

    print("Enter the placeholder:", end=" ")
    filler = input()

    print("Enter the placeholder:", end=" ")
    filler1 = input()

    fil1 = ""
    fil2 = ""
    for i in range (n):
        if i%2==0:
            fil1+=filler + ' '
        else:
            fil1+=filler1 + ' '

    for i in range(r*2):
        if i % 2 == 0:
            fil2 += filler + ' '
        else:
            fil2 += filler1 + ' '


    if len(filler) == 1:
        for i in range(n):
            if i < r or i >= n - r:
                if i % 2 == 0:
                    for j in range (n):
                        if j%2==0:
                            arr[i] += [filler1]
                        else:
                            arr[i] += [filler]
                else:
                    arr[i] = [filler] * n
            else:
                if i%2==0:
                    for j in range(r*2):
                        if j % 2 == 0:
                            arr[i] += [filler1]
                        else:
                            arr[i] += [filler]
                else:
                    arr[i] = [filler] * (r * 2)

        for i in range(n):
            for j in range(len(arr[i])):
                print(arr[i][j], end=" ")
            print()

        print("=====================================================")

        for i in range(n):
            jk = 0
            for j in range(n):
                if i < r or i >= n - r:
                    print(arr[i][jk], end=" ")

                    jk += 1
                else:
                    if j < r or j >= n - r:
                        print(arr[i][jk], end=" ")

                        jk += 1
                    else:
                        print("  ", end="")

            print()

    elif len(filler) == 0:
        print("No character entered filler")
    else:
        print("Too many characters aggregates")

if __name__ == "__main__":
    main()
