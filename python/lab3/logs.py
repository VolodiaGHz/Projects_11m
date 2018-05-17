import re


def search_logs():
    logs = 0
    file = open('lab_logs')
    for line in file:
        match = re.search('41\.202\.74\.145.*GET.*\.((png)|(jpeg)|(jpg)|(gif))', str(line))
        if match:
            print(match.group())
            logs += 1
    print(logs)
    file.close()


if __name__ == "__main__":
    search_logs()