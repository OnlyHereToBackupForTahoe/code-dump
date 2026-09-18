#text corruptor
import random
#you are free to share this and/or fork it i do not care
print("Welcome to my text messer-upper-er!")
r = random.Random()
chars = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', ']', '{', '}', '\\', '|', ';', ':', "'", '"', ',', '<', '.', '>', '/', '?', ' ']
scale = 1
def corrupt(textt, scale):
    textlist = list(textt)
    output = ""
    textcount = 0
    charcount = 0
    for i in textlist:
        textcount += 1
    textcount -= 1
    for i in chars:
         charcount += 1
    charcount -= 1
    corruptlist = []
    charcoals = []
    charsToUse = []
    for i in range(scale * 2):
        tempint = r.randint(0, textcount)
        corruptlist.append(tempint)
        tempint = r.randint(0, charcount)
        charcoals.append(tempint)
    for i in range(scale * 2):
        charsToUse.append(charcoals[i])
    for i in range(scale * 2):
        textlist[corruptlist[i]] = chars[charsToUse[i]]
    for i in textlist:
        output += i
    return output
text = "placeholder"
while(text != "exit"):
    check = 0
    checked = 0
    text = input("What would you like to mess up? (input and also type 'exit' to exit) ")
    if text != "exit":
        scale = input("Type the number of times you want to mess it up : ")
        try:
            check = int(scale)
        except:
            print("Not an int.")
            checked = 1
        if checked != 1:
            print(corrupt(text, int(scale)))
