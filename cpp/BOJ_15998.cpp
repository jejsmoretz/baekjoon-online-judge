#include <cstdio>
typedef long long ll;
ll gcd(ll a, ll b) { return b ? gcd(b, a % b) : a; }
int n;
ll res, a[300003], b[300003];
int main()
{
    scanf("%d", &n);
    for(int i = 1; i <= n; i++)
    {
        scanf("%lld %lld", &a[i], &b[i]);
        res = gcd(res, b[i] - b[i - 1] - a[i]);
    }
    for(int i = 1; i <= n; i++)
    {
        if(b[i] - b[i - 2] == a[i]) continue;
        if(res && res <= b[i] || a[i] > 0 || a[i] < 0 && -a[i] < b[i - 1]) return !puts("-1");
    }
    printf("%lld\n", res ? res : 1);
    return 0;
}
