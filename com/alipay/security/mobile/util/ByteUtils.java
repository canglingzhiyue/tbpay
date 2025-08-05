package com.alipay.security.mobile.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class ByteUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    public static final String HEX_DIGITS = "0123456789ABCDEF";

    public static String toHexString(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecf228e1", new Object[]{bArr});
        }
        char[] cArr = new char[bArr.length << 1];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i << 1;
            char[] cArr2 = HEX_ARRAY;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static byte[] hexToBytes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2e13f9b7", new Object[]{str});
        }
        if ((str.length() & 1) != 0) {
            str = "0" + str;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) (hexChartoByte(charArray[i2 + 1]) | (hexChartoByte(charArray[i2]) << 4));
        }
        return bArr;
    }

    private static byte hexChartoByte(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbc3dece", new Object[]{new Character(c)})).byteValue() : (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static int toInt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96edc7f5", new Object[]{bArr})).intValue() : toInt(bArr, 0);
    }

    public static int toInt(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46cbab34", new Object[]{bArr, new Integer(i)})).intValue() : ((bArr[i + 3] & 255) << 24) + ((bArr[i + 2] & 255) << 16) + ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
    }

    public static int toUInt16(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("489a013b", new Object[]{bArr})).intValue() : toUInt16(bArr, 0);
    }

    public static int toUInt16(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("caa69aae", new Object[]{bArr, new Integer(i)})).intValue() : ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
    }

    public static void writeUInt16(int i, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23171bde", new Object[]{new Integer(i), bArr, new Integer(i2)});
            return;
        }
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
    }

    public static void write(int i, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3a931f", new Object[]{new Integer(i), bArr, new Integer(i2)});
            return;
        }
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void write(byte[] bArr, int i, byte[] bArr2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a366ae6", new Object[]{bArr, new Integer(i), bArr2, new Integer(i2)});
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i2 + i3] = bArr[i3];
        }
    }

    public static void copy(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9b7559", new Object[]{bArr, new Integer(i), new Integer(i2), bArr2, new Integer(i3)});
            return;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i3 + i4] = bArr[i + i4];
        }
    }

    public static byte[] toBytes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("822c3fb1", new Object[]{new Integer(i)});
        }
        byte[] bArr = new byte[4];
        write(i, bArr, 0);
        return bArr;
    }

    public static BigInteger toBigInteger(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigInteger) ipChange.ipc$dispatch("a6718b46", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        byte[] bArr2 = new byte[i2];
        write(bArr, i2, bArr2, i);
        return new BigInteger(bArr2);
    }

    public static BigInteger toBigInteger(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BigInteger) ipChange.ipc$dispatch("3ea0b1e6", new Object[]{bArr}) : new BigInteger(bArr);
    }
}
