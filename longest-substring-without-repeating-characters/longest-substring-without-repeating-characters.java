class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int inputStringLength = s.length();
        int sizeOfSubstring = 1;
        
        while(inputStringLength>=sizeOfSubstring){
            
            if(inputStringLength==0){
                return 0;
            }else if(sizeOfSubstring==1){
                sizeOfSubstring+=1;
            }
            else{
                
                for(int i=0; i<inputStringLength - sizeOfSubstring + 1; i++){
                    
                String subStringOfInput = s.substring(i, i+sizeOfSubstring);
                int countOfRepeat = 0;
                    
                    for(int j=0; j<sizeOfSubstring-1; j++){
                        for(int k=j+1; k<sizeOfSubstring; k++){
                            if(subStringOfInput.charAt(j)==subStringOfInput.charAt(k)){
                                countOfRepeat+=1;
                            }
                        }
                    }
                    
                    if(countOfRepeat==0){
                        sizeOfSubstring+=1;
                        break;
                    }
                    
                    if(i+sizeOfSubstring == inputStringLength){
                        sizeOfSubstring-=1;
                        return sizeOfSubstring;
                    }
                    
                }
            }
                
        }
        
        sizeOfSubstring-=1; 
        return sizeOfSubstring;
    }
}
