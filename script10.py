import playsound3
import gtts
print("TTS For generating audiobooks and other uses!")
openfile = ""
while openfile != "@":
    openfile = input("Would you like to (r)ead a .txt or (c)reate your own? (type @ to exit)")
    if openfile == "c":
        ttsGen = gtts.gTTS(input("What would you like to say? : "))
        try:
            fileSave = input("Where will you save this file? ")
            ttsGen.save(fileSave)
            playsound3.playsound(fileSave)
        except:
            print("Not a dir.")
    elif openfile == "r":
        filepath = input("What file do you want to open? ")
        try:
            ttsGen = gtts.gTTS(open(filepath).read())
            try:
                fileSave = input("Where will you save this file? ")
                ttsGen.save(fileSave)
                playsound3.playsound(fileSave)
            except:
                print("Not a dir.")
        except:
            print("Not a dir.")