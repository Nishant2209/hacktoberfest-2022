//SCANLINE ALGORITHM 
#include <bits/stdc++.h>
using namespace std;

int
main ()
{

  int n, q;
  cin >> n >> q; //n is the size of the array and q is the the number of queries
  int arr[n] = { 0 };
  int value = 2; //value is the variable that should be added from arr[l] to arr[r]
  while (q-- > 0)
    {
      int l, r; // l is the left index and r is the right index
      cin >> l >> r;
      arr[l] += value;
      arr[r + 1] -= value;
    }

  for (int i = 0; i < n; i++) //Displaying the resultant array
    {
      if (i > 0)
	arr[i] += arr[1 - 1];
      cout << arr[i] << " ";
    }


  return 0;
}
