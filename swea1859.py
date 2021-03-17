import sys;

T = int(input())

for t in range(1, T + 1):
    N = int(input())
    arr = list(map(int,input().split()))
    arr.reverse()
    max = 0
    flag = 0
    total = 0
    for a in arr :
        if a > max :
            max = a
            flag = 1
        if flag == 0 :
            total += max - a
        else :
            flag = 0
    print("#{0} {1}".format(t,total))
    