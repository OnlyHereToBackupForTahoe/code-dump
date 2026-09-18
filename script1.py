emoticons = {
    ":(" : "Sad / 😭",
    ":)" : "Happy / 😃",
    ">:(" : "Angry / 😡",
    ">:)" : "Mischievous / 😈",
    ":/" : "Bored or disappointed / 🥱 😕",
    ";)" : "Wink / 😉",
    ":0" : "Shocked / 😲"
}
print("Emoticon translator!")
emoji = "STOP LOOKING AT MY CODE!"
while emoji != "exit":
    emoji = input("Type the emoticon : ")
    if emoji in emoticons:
        print(emoticons[emoji])
    elif emoji == "exit":
        print("")
    elif emoji == "STOP LOOKING AT MY CODE!":
        print("you either guessed the placeholder that i use (good job but probably by accident) or YOU LOOKED THROUGH MY CODE! I TOLD YOU NOT TO!")
    else:
        print("This program does not know that emotion.")
