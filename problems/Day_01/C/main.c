// Problem: Given a list of integers and a target value, find two distinct indices whose values sum up to the target. Return the pair of indices.

// Solution:
#include <stdio.h>
#include <stdlib.h>
void solution(int a[], int b[],int target);

int main() {
	int target = 0, i = 0; 
	int aSize = 0; 
	int bSize = 0;
	printf("Enter a size value for Array a : \n");
	scanf("%d",&aSize);
	printf("Enter a target value for Array b : \n");
	scanf("%d",&bSize);
	int *a = malloc(aSize * sizeof(int));
	int *b = malloc(bSize * sizeof(int));
	printf("Enter a elements for Array a : \n");
	for(i=0;i<aSize;i++){
		scanf("%d",&a[i]);
	}
	printf("Enter a elements for Array b : \n");
	for(i=0;i<bSize;i++){
		scanf("%d",&b[i]);
	}
	printf("Enter a target value to search : \n");
	scanf("%d",&target);
	printf("\nSearching.......\n");
	solution(a,b,target);
	return 0;
}

void solution(int a[], int b[],int target){
	int i=0, j=0, flag = 0;
	for(i=0;i<sizeof(a);i++){
		for(j=0;j<sizeof(b);j++){
			if((a[i]+b[j]) == target){
				if(flag == 0 ){
					printf("\nMatch Found:\n");
				}
				flag = 1;
				printf("a[%d] = %d , b[%d] = %d \n",i,a[i],j,b[j]);
			}
		}
	}
	if(flag == 0 ){
		printf("\nNo match found\n");
	}
	printf("\n");
}