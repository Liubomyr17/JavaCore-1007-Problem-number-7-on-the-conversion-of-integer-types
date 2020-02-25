package com.company;

/*

1007 Problem number 7 on the conversion of integer types
Remove unnecessary typecast operators to get the answer: 1234567
long l = (byte) 111_1111_111_110L;
int x = (byte) 0b1000_1100_1010;
double m = (byte) 110_987_654_6299.123_34;
float f = (byte) l ++ + 10 + ++ x - (float) m;
l = (long) f / 1000;

Requirements:
1. The program should display the text on the screen.
2. You cannot change the display command.
3. The main () method must contain a variable l of type long.
4. The main () method must contain an int variable x.
5. The main () method must contain a variable m of type double.
6. The main () method must contain a variable f of type float.
7. The initial value of the variables during initialization cannot be changed. You can add only cast operators.
8. The program should output the text 1234567.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        long l = 111_1111_111_110L;
        int x =  0b1000_1100_1010;
        double m = 110_987_654_6299.123_34;
        float f =  l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
    }
}















