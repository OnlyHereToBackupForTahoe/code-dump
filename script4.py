import os
print("## FILE RENAMER ## (WIPAPNWBNWIP (work in progress and probably will never be not work in progress")
#a recreation of a project i did
path = "placeholder"
while path != "exit":
    path = input("\nWhat is the path you would like to rename all files in? (type 'exit' to exit) ")
    rename = input("\nWhat would you like to rename all files to? ")
    if os.path.isdir(path) == False:
        print("Not a dir :(")
    else:
        renamenumber = 0
        os.chdir(path)
        for file in os.curdir:
            print(os.curdir)
#nevermind i have no idea what i am doing