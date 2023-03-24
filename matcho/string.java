class StringCount {
    
    public static void main(String[] args) {
        String str = "Hello world, hello universe, hello java!";
        String subStr = "hello";
        
        int count = countSubstringOccurrences(str, subStr);
        
        System.out.println("The substring \"" + subStr + "\" occurs " + count + " times in the string \"" + str + "\".");
    }
    
    public static int countSubstringOccurrences(String str, String subStr) {
        int count = 0;
        int lastIndex = 0;
        
        while (lastIndex != -1) {
            lastIndex = str.indexOf(subStr, lastIndex);
            
            if (lastIndex != -1) {
                count++;
                lastIndex += subStr.length();
            }
        }
        
        return count;
    }
    }
