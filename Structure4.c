#include <stdio.h>

struct Point
{
    int x, y;
};

int main()
{
    struct Point arr[10]; 

    arr[0].x = 69; 
    arr[0].y = 20; 

    printf("%d %d\n", arr[0].x, arr[0].y); 

    return 0;
}