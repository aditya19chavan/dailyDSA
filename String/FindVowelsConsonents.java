package String;


class FindVowelsConsonents  {
    
    public static void VowelsCount(String str) {
        int vowels = 0, consonants = 0, spaces = 0;
        str = str.toLowerCase();
        
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (c == ' ') { // Check spaces separately
                spaces++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
    }
    
    public static void main(String[] args) {
        String str = "Hello World";
        VowelsCount(str);
    }
}
