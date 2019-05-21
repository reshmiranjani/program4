#include<stdio.h>
void main()
{
    int n,i,j,arr[50],temp;
    for(i=0;i<10;i++)
    {
      scanf("%d",&arr[i]);
    }
    for(i=0;i<10;i++)
    {
       for(j=i+1;j<10;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    printf("%d",arr[9]);
}
    
