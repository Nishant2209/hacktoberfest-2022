#include <iostream>

using namespace std;

int main()
{
   int n;
   cin >> n;

   int i = 1;

   while (i <= n)
   {

      int j = 1;

      while (j <= n - i + 1)
      {

         cout << j;
         j = j + 1;
      }

      int st1 = i - 1;
      while (st1)
      {
         cout << "*";
         st1 = st1 - 1;
      }

      int st2 = i - 1;
      while (st2)
      {
         cout << "*";
         st2 = st2 - 1;
      }

      int k = 1;
      while (k <= n - i + 1)
      {

         cout << k;
         k = k + 1;
      }

      cout << endl;
      i = i + 1;
   }
}