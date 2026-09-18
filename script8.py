gameOption = input("Bad Burger simulator\nP - Play\nC- Controls\nI - Ingredients\n>>")
dayCount = 1
import random
foods = ["Hamburger", "Cheeseburger", "Big Scam", "Poka cola", "Fries"]
foodRecipes = {"Hamburger": "BPPiPiOKMT", "Cheeseburger": "BPCPiPiOKMT", "Big Scam": "BPPPiPiPiOOKMRT", "Fries": "PoOiOi", "Poka cola": "WSuSuSuFC"}
recipeBook = ["Hamburger : 1x bun, 1x patty, 2x pickles, 1x diced onions, 1x ketchup, 1x mustard, 1x top bun", "Cheeseburger : 1x bun, 1x patty, 1x cheese, 2x pickles, 1x diced onions, 1x ketchup, 1x mustard, 1x top bun", "Big Scam : 1x bun, 2x patty, 3x pickles, 2x diced onions, 1x ketchup, 1x mustard, 1x ranch, 1x top bun", "Fries : 1x potatoes, 2x oil", "Poka cola : 1x water, 3x sugar, 1x food colouring"]
badBurgers = 0
customers = ["John", "Jane", "Ava", "George", "Scott", "Jackson", "Will", "Ana", "Hans", "Jade", "Emily", "Olivia", "Lily", "Maria", "Ruby", "Ian"]
easterEgg = ["Bacon", "Cheese"]
money = 0
while(gameOption != "P"):
    if gameOption == "C":
        print(
            "Re Bo : Recipe book\nS : Serve\nType all ingredients without space then add a space and type 'S' to serve it!\n\nEnjoy this game! :)\n")
    elif gameOption == "I":
        print(
            "Bun - B, Patty - P, Pickles - Pi, Diced onions - O, Ketchup - K, Mustard - M, Top bun - T, Water - W, Cheese - C, Ranch - R, Food colouring - FC, Sugar - Su, Potatoes - Po, Oil - Oi")
    gameOption = input("Bad Burger simulator\nP - Play\nC- Controls\nI - Ingredients\n>>")
while badBurgers != 10:
    print(f"Day {dayCount}\n")
    for i in range(10):
        rnd = random.Random()
        customer = rnd.randint(0, 17)
        customerName = ""
        food = rnd.randint(0, 4)
        if customer == 16:
            customerName = easterEgg[0]
        elif customer == 17:
            customerName = easterEgg[1]
        else:
            customerName = customers[customer]
        print(f"{customerName}: \nHello, can i have a {foods[food]}, please?")
        money += 1.5
        recipeInput = ""
        recipeInputSplit = ["", ""]
        while recipeInputSplit[1] != "S":
            recipeInput = input("Type the recipe to cook! ('Re Bo' for recipe book) ")
            if recipeInput == "Re Bo":
                for i in recipeBook:
                    print(i + "\n")
            recipeInputSplit = recipeInput.split(" ")
            if len(recipeInputSplit) != 2:
                recipeInputSplit.append("S")
        if(recipeInputSplit[0] != foodRecipes[foods[food]]):
            print(f"{customerName} : \nThis is disgusting! I think this is cooked wrong!\n")
            badBurgers += 1
    dayCount += 1
    print(f"You have £{money} so far!\n")
print("Game over, you have made too many bad burgers")