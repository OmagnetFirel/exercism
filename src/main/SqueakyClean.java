package main;

public class SqueakyClean {
    public String Clean(String identifier){
        String convertCtrl = convertCTRL(identifier);
        return convertCtrl.replace(" ", "_");
    }

    public String convertCTRL(String text){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isISOControl(c)) {
                sb.append("CTRL");
            } else if(Character.isWhitespace(c)) {
                sb.append("_");
            } else if(Character.toString(c).equals("-")) {
                char nextC = text.charAt(i+1);
                if(!Character.isLetter(nextC)){
                    while (true) {
                        nextC = text.charAt(i++);
                        if(Character.isLetter(nextC)){
                            break;
                        }
                        i++;
                    }
                }else{
                    i++;
                }
                sb.append(Character.toUpperCase(nextC));

            } else if(!Character.isLetter(c)){
                continue;
            } else if(isGreekLetter(c) && Character.isLowerCase(c)) {
                continue;
            }
            else {
                sb.append(c);
            }
        }


        return sb.toString();
    }

    public Boolean isGreekLetter(char c){
        return Character.UnicodeBlock.of(c) == Character.UnicodeBlock.GREEK;
    }
}
