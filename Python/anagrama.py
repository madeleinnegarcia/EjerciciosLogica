def anagrama(x, y):
    if x[::-1] == y and y[::-1] == x:
        return True
    else:
        return False


word_1 = input("Ingresa una palabra: ")

word_2 = input("Ingresa una palabra: ")

if word_1 != word_2:
    print(anagrama(word_1, word_2))
else:
    print("Las palabras son iguales, así que no sonn anagrams")
