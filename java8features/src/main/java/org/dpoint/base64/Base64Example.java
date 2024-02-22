package org.dpoint.base64;
import java.util.Base64;

public class Base64Example {
    public void base64EncoderDecoder(){
        // Encoding Byte Array
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] byteArr = {1,2};
        byte[] byteArr2 = encoder.encode(byteArr);
        System.out.println("Encoded byte array " + byteArr2);

        byte[] byteArr3 = new byte[5];
        int x = encoder.encode(byteArr,byteArr3);
        System.out.println("Encoded byte array written to another array: "+byteArr3);
        System.out.println("Number of bytes written: "+x);

        // Encoding String
        String str = encoder.encodeToString("dpoint".getBytes());
        System.out.println("Encoded string :" + str);
        Base64.Decoder decoder = Base64.getDecoder();
        String dStr = new String(decoder.decode(str));
        System.out.print("Decoded string " + dStr);

    }
}