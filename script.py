import time
patience = 0
def ragebait():
    global patience
    entertocont = input("Press enter to continue...\n")
    if entertocont == "":
        print("Well done! You did it!")
        patience = 7
    else:
        print(
            "WHY, I HAVE GIVEN YOU THIS SIMPLE REQUEST YET YOU CHOOSE TO IGNORE IT! YOU ARE NOT EVEN A USER, YOU ARE JUST TESTING MY BOUNDARIES.")
        time.sleep(0.5)
        print("Press enter to continue...\n")
        time.sleep(0.75)
        print("Well done! You did it!")
        time.sleep(1)
        print("SEE? IT WAS'NT THAT HARD, TRY AGAIN")
        patience += 1
while patience != 5:
    ragebait()
    if patience == 5:
        print("I HATE YOU SO MUCH I WISH EVERY PROGRAM YOU OPEN CRASHES, JUST LEAVE!!!")
    if patience == 7:
        patience = 5