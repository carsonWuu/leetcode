package leetcode;
/*
 * 
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: "III"
Output: 3
Example 2:

Input: "IV"
Output: 4
Example 3:

Input: "IX"
Output: 9
Example 4:

Input: "LVIII"
Output: 58
Explanation: C = 100, L = 50, XXX = 30 and III = 3.
Example 5:

Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class _13_Roman_to_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_13_Roman_to_Integer o =new _13_Roman_to_Integer();
		String s="MCMXCIV";
		int ret = o.romanToInt(s);
		System.out.println(ret);
	}
	public int romanToInt(String s) {
        int ret=0;
        for(int i =0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='M')ret+=1000;
            else if(c=='C'){
                if((i+1<s.length())&&s.charAt(i+1)=='M'){
                    ret+=900;
                    i++;
                }
                else if((i+1<s.length())&&s.charAt(i+1)=='D'){
                    ret+=400;
                    i++;
                }
                else ret+=100;
            }
            else if(c=='D')ret+=500;
            else if(c=='X'){
                if((i+1<s.length())&&s.charAt(i+1)=='C'){
                    ret+=90;
                    i++;
                }
                else if((i+1<s.length())&&s.charAt(i+1)=='L'){
                    ret+=40;
                    i++;
                }
                else ret+=10;
            }
            else if(c=='C')
                ret+=100;
            else if(c=='L')
                ret+=50;
            else if(c=='I'){
                if((i+1<s.length())&&s.charAt(i+1)=='X'){
                    ret+=9;
                    i++;
                }
                else if((i+1<s.length())&&s.charAt(i+1)=='V'){
                    ret+=4;
                    i++;
                }
                else ret+=1;
            }
            else if(c=='V')
                ret+=5;
        }
        return ret;
    }

}
