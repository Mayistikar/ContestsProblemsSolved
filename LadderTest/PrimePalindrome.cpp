#include <iostream>
#include <stdio.h>

 bool palind(string palabra){
	if(palabra.length()==1||palabra.length()==0){
	    return true;
	}else{
	    if(palabra.charAt(0)==palabra.charAt(palabra.length()-1)){
		return palind(palabra.substring(1,palabra.length()-1));
            }
	}
	return false;
}

bool prime(long long x){
	if(x==1||x==0){
	    return false;
	}else if(x%2==0){
	    return false;
	}else if(x>7){
	    for(long long z=3; (z*z)<=x; z+=2){
		if(x%z==0){
		    return false;
		}
	    }
	}
	return true;
}

int main ()
{
  cin >> n;
	bool man = true;
	
	while(man){
	    String pal = Long.toString(n);
	    if(pal.length()%2!=0 && palind(Long.toString(n))){
		//		System.out.println("palind: "+n);
		if(prime(n)){
		    //		    System.out.println("prime: "+n);
		    System.out.print(n);
		    man=false;
		}
	    }
	    n++;
	}
  
  return 0;
}
