from random import randint
def partition(arr,pivot_loc,si,ei):
    j=si-1
    for i in range(si,ei):
        #print "current:%d"%arr[i]
        #print "pivot:%d"%arr[pivot_loc]
        #print "current j=%d"%j
        if(pivot_loc==i):
            i=i+1;
        else:
            if arr[i]<=arr[pivot_loc]:
                #print "swapping"
                j=j+1
                #swap i and j
                temp=arr[i]
                arr[i]=arr[j]
                arr[j]=temp
                if(i==pivot_loc):
                    pivot_loc=j
                elif(j==pivot_loc):
                    pivot_loc=i
        #print arr[si:ei]
    #swap last
    temp=arr[j+1]
    arr[j+1]=arr[pivot_loc]
    arr[pivot_loc]=temp
    #print arr[si:ei]
    return j+1
def sort(arr,si,ei):
    #print "calling sort for:"
    #print arr[si:ei]
    pivot_loc=randint(si,ei-2)
    pivot_loc=partition(arr,pivot_loc,si,ei)
    if(pivot_loc<(len(arr)-2)):
        sort(arr,pivot_loc+1,ei)
if __name__ == '__main__':
    n = int(raw_input())
    arr = map(int, raw_input().split())
    sort(arr,0,len(arr))
    i=len(arr)-1
    while(arr[i]==arr[i-1]):
        i=i-1
    print arr[i-1]