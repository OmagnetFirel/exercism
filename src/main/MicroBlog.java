package main;

import java.io.UnsupportedEncodingException;
import  java.nio.charset.StandardCharsets;

public class MicroBlog {
    int MAX_LENGTH = 5;
    public String truncate(String input) {
        //  byte[] utf8Bytes = input.getBytes(StandardCharsets.UTF_8);
        //  if(utf8Bytes.length <= MAX_LENGTH ){
        //      return input;
        //  }
        // int length = MAX_LENGTH;
        //  while ((utf8Bytes[length] & 0xC0) == 0x80) {
        //      length--;
        //  }
        //  return new String(utf8Bytes, 0, MAX_LENGTH, StandardCharsets.UTF_8);
        return input.length() < 6 ? input: input.substring(0,input.offsetByCodePoints(0,5));
    }
}
