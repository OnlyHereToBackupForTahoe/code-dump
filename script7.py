print("Message translator to binary!")
t = True
while t == True:
    hex = input("Type the message : (type @ to exit) ")
    if hex == "@":
        t = False
    else:
        import string

        binary = {
            "A": "1010",
            "B": "1011",
            "C": "1100",
            "D": "1101",
            "E": "1110",
            "F": "1111",
        }
        tenten = {
            "1": "0001",
            "2": "0010",
            "3": "0011",
            "4": "0100",
            "5": "0101",
            "6": "0110",
            "7": "0111",
            "8": "1000",
            "9": "1001",
            "0": "0000"
        }
        hexupper = ["41", "42", "43", "44", "45", "46", "47", "48", "49", "4A", "4B", "4C", "4D", "4E", "4F", "50",
                    "51",
                    "52", "53", "54", "55", "56", "57", "58", "59", "5A"]
        hexlower = ["61", "62", "63", "64", "65", "66", "67", "68", "69", "6A", "6B", "6C", "6D", "6E", "6F", "70",
                    "71",
                    "72", "73", "74", "75", "76", "77", "78", "79", "7A"]
        misc = ["20"]
        asciii = string.printable
        lower = []
        higher = []
        hexoutput = []
        output = ""
        lowernum = 10
        highernum = 36
        for i in range(26):
            lower.append(asciii[lowernum])
            lowernum += 1
            higher.append(asciii[highernum])
            highernum += 1
        messagesplit = list(hex)
        for i in messagesplit:
            if i in lower:
                hexoutput.append(hexlower[lower.index(i)])
            elif i in higher:
                hexoutput.append(hexupper[higher.index(i)])
            elif i in misc:
                hexoutput.append("20")
        for j in hexoutput:
            hexsplit = list(j)
            isorder = True
            outputbinary = ["0000", "0000"]
            try:
                hexsplit[1] = hexsplit[1].capitalize()
            except:
                isorder = False
            if (hexsplit[1] in binary) == False:
                isorder = False
            if isorder == True:
                if (hexsplit[1] in binary) == False:
                    outputbinary[1] = tenten[hexsplit[1]]
                else:
                    outputbinary[1] = binary[hexsplit[1].capitalize()]
                outputbinary[0] = tenten[hexsplit[0]]
            else:
                outputbinary[1] = tenten[hexsplit[1]]
                if (hexsplit[0] in binary) == False:
                    outputbinary[0] = tenten[hexsplit[0]]
                else:
                    outputbinary[0] = binary[hexsplit[0].capitalize()]
            output += outputbinary[0] + outputbinary[1] + " "
        print(output)