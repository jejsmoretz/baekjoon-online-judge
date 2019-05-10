#include <cstdio>
 
int main()
{
    int n, num, n1 = 0, n2 = 0;
    
    scanf("%d", &n);
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &num);
        n1 += (num / 30 + 1) * 10;
        n2 += (num / 60 + 1) * 15;
    }
    if(n1 > n2) printf("M %d", n2);
    else if(n1 < n2) printf("Y %d", n1);
    else printf("Y M %d", n1);
}
