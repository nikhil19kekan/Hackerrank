#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int* solve(int a0, int a1, int a2, int b0, int b1, int b2, int *result_size){
    *result_size = 2;
    int a=0;
    int b=0;
    
    if(a0 < b0){
        b++;
    }else{
        if(a0>b0){
            a++;
        }
    }
    if(a1 < b1){
        b++;
    }else{
        if(a1>b1){
            a++;
        }
    }
    if(a2 < b2){
        b++;
    }else{
        if(a2>b2){
            a++;
        }
    }
    int *result;
    //printf("a:%d",a);
    //printf("b:%d\n",b);
    (result) = (int*)malloc(2*sizeof(int));
    *(result) = a;
    *(result + (sizeof(int))) = b;
    return result;
}

int main() {
    int a0; 
    int a1; 
    int a2; 
    scanf("%d %d %d", &a0, &a1, &a2);
    int b0; 
    int b1; 
    int b2; 
    scanf("%d %d %d", &b0, &b1, &b2);
    int result_size;
    int* result = solve(a0, a1, a2, b0, b1, b2, &result_size);
    //printf("result size %d\n",result_size);
    for(int result_i = 0; result_i < result_size; result_i++) {
        
        printf("%d ", *(result + (result_i*sizeof(int))));
    }
    

    return 0;
}

