#include <stdbool.h>
int tempfunc(char* s, int x, int index);

bool isPalindrome(int x){
    bool result = false;
    char s[31];
    int count = 0;
    int index = 0;
    count = tempfunc(s, x, index);
    
    if(x>=0){
        for(int i=0; i<=count-1-i; i++){
            if(s[i] != s[count-1-i]){
                return result;
            }
        }
        result = true;
    } else {
        result = false;
    }
    
    return result;
}

int tempfunc(char* s, int x, int index){
        s[index] = (x % 10) + 48;
        if(x/10==0){
            return 1;
        }
        index++;
        return tempfunc(s, x/10, index) + 1;
}