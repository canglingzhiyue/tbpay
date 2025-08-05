package anet.channel.util;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;
import tb.kge;

/* loaded from: classes.dex */
public class StringUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final char[] DIGITS_LOWER;
    private static final String TAG = "awcn.StringUtils";

    public static String stringNull2Empty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef729f5c", new Object[]{str}) : str == null ? "" : str;
    }

    public static String concatString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31c86340", new Object[]{str, str2});
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String concatString(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62f45eb6", new Object[]{str, str2, str3});
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + str3.length());
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String buildKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11f1d3f4", new Object[]{str, str2});
        }
        if (str == null || "".equals(str)) {
            str = "https";
        }
        return concatString(str, HttpConstant.SCHEME_SPLIT, str2);
    }

    public static String simplifyString(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea68c8", new Object[]{str, new Integer(i)}) : str.length() <= i ? str : concatString(str.substring(0, i), "......");
    }

    public static String md5ToHex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("453b582d", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return bytesToHexString(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static MessageDigest getDigest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageDigest) ipChange.ipc$dispatch("40049313", new Object[]{str});
        }
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception e) {
            ALog.e(TAG, "[getDigest] " + str + " error=" + e.toString(), null, new Object[0]);
            return null;
        }
    }

    public static MessageDigest getMd5Digest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MessageDigest) ipChange.ipc$dispatch("573ebfb", new Object[0]) : getDigest("MD5");
    }

    public static boolean calculateMD5(String str, MessageDigest messageDigest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d508f4d3", new Object[]{str, messageDigest})).booleanValue();
        }
        if (messageDigest != null && str != null && !str.isEmpty()) {
            try {
                return bytesToHexString(Base64.decode(str, 0)).equals(bytesToHexString(messageDigest.digest()));
            } catch (Exception e) {
                ALog.e(TAG, "[calculateMD5] error=" + e.toString(), null, new Object[0]);
            }
        }
        return false;
    }

    static {
        kge.a(-1042884334);
        DIGITS_LOWER = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    private static String bytesToHexString(byte[] bArr, char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6dae024", new Object[]{bArr, cArr});
        }
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return new String(cArr2);
    }

    public static String bytesToHexString(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("33bf8aac", new Object[]{bArr}) : bArr == null ? "" : bytesToHexString(bArr, DIGITS_LOWER);
    }

    public static boolean isNotBlank(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("447819e0", new Object[]{str})).booleanValue() : !isBlank(str);
    }

    public static boolean isBlank(String str) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6cf455f", new Object[]{str})).booleanValue();
        }
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isStringEqual(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b55c8b38", new Object[]{str, str2})).booleanValue() : (str == null && str2 == null) || (str != null && str.equals(str2));
    }
}
