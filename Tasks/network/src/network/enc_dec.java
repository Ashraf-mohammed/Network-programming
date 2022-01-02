/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;

import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class enc_dec {
    public static void main(String[] args) {
        int p,q,n,z,d = 0,e,i;
        int msg = 12;
        double c;
        BigInteger msgback;
        p = 17;
        q = 11;
        n = p * q;
        z = (p - 1) * (q - 1);
        int j;
        System.out.println("value of z" + z);
        for ( j = 2; j < z; j++) {
            if(gcd(j, z) == 1)
                break;
        }
        System.out.println("value of e :"+j);
        for (int k = 0; k <= 9; k++) {
            int x = 1+(k * z);
            if(x % j == 0){
            d = x / j;
            break;
            }
        }
        System.out.println("value of d :"+d);
        c = (Math.pow(msg, j))%n;
        System.out.println("encrypt msg "+c);
        BigInteger N = BigInteger.valueOf(n);
        BigInteger C = BigDecimal.valueOf(c).toBigInteger();
        msgback = (C.pow(d).mod(N));
        System.out.println("decrypt "+msgback);
        
    }
    public static int gcd(int e, int z){
    if(e == 0)
        return z;
    else
        return gcd(z % e, e);
    }
}
