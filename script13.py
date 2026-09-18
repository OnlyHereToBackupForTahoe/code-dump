from shutil import disk_usage
from tabnanny import filename_only

DISK_AMOUNT = 7
DISKS = ["sda", "nvme0n1", "mmcblk0", "da0", "ada0", "nvme0", "hda"]
diskOutput = []
for i in range(DISK_AMOUNT):
    diskOutput.append("/dev/" + DISKS[i])
for i in diskOutput:
    try:
        output = str(disk_usage(i))
        outputSplit = output.split("=")
        outputSplitOutput = []
        finalOutput = []
        for i in outputSplit:
            outputSplitOutput.append(i.split(","))
        for i in outputSplitOutput:
            finalOutput.append(i.split(")"))
        for i in finalOutput:
            print(i + "\n")
    except:
        fillerOutput = 0
        output = str(disk_usage(i))
        outputSplit = output.split("=")
        outputSplitOutput = []
        finalOutput = []
        for j in outputSplit:
            outputSplitOutput.append(j.split(","))
        for k in outputSplitOutput:
            finalOutput.append(k.split(")"))
        for l in finalOutput:
            print(l + "\n")