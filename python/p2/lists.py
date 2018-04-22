if __name__ == '__main__':
    N = int(raw_input())
    mylist=[]
    for i in range(0,N):
        command=str(raw_input())
        cmd=command.split(" ")[0]
        if cmd=="insert":
            mylist.insert(int(command.split(" ")[1]),int(command.split(" ")[2]))
        elif cmd=="print":
            print mylist
        elif cmd=="pop":
            del mylist[-1]
        elif cmd=="reverse":
            mylist.reverse()
        elif cmd=="append":
            mylist.append(int(command.split(" ")[1]))
        elif cmd=="sort":
            mylist.sort()
        elif cmd=="remove":
            mylist.remove(int(command.split(" ")[1]))