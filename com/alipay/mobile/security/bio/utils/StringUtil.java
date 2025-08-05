package com.alipay.mobile.security.bio.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.riy;

/* loaded from: classes3.dex */
public class StringUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INT_20 = 20;

    public static boolean isNullorEmpty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a63f780e", new Object[]{str})).booleanValue() : str == null || "".equals(str.trim());
    }

    public static int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        if (isNullorEmpty(str)) {
            return 0;
        }
        String str2 = "";
        for (int i2 = 0; i2 < str.length() && str2.length() < i; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt)) {
                str2 = str2 + charAt;
            }
        }
        if (isNullorEmpty(str2)) {
            return 0;
        }
        return Integer.parseInt(str2);
    }

    public static String data2String(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e9a8ab9", new Object[]{bArr});
        }
        if (bArr != null && bArr.length > 20) {
            StringBuilder sb = new StringBuilder(120);
            sb.append('[');
            sb.append((int) bArr[0]);
            for (int i = 1; i < 20; i++) {
                sb.append(", ");
                sb.append((int) bArr[i]);
            }
            sb.append(']');
            return sb.toString();
        }
        return Arrays.toString(bArr);
    }

    public static String data2String(short[] sArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8059c708", new Object[]{sArr});
        }
        if (sArr != null && sArr.length > 20) {
            StringBuilder sb = new StringBuilder(120);
            sb.append('[');
            sb.append((int) sArr[0]);
            for (int i = 1; i < 20; i++) {
                sb.append(", ");
                sb.append((int) sArr[i]);
            }
            sb.append(']');
            return sb.toString();
        }
        return Arrays.toString(sArr);
    }

    public static String data2String(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74076752", new Object[]{iArr});
        }
        if (iArr != null && iArr.length > 20) {
            StringBuilder sb = new StringBuilder(120);
            sb.append('[');
            sb.append(iArr[0]);
            for (int i = 1; i < 20; i++) {
                sb.append(", ");
                sb.append(iArr[i]);
            }
            sb.append(']');
            return sb.toString();
        }
        return Arrays.toString(iArr);
    }

    public static <K, V> String map2String(Map<K, V> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41381ec9", new Object[]{map}) : (map == null || map.isEmpty()) ? "" : collection2String(map.entrySet());
    }

    public static <T> String collection2String(Collection<T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cba37d03", new Object[]{collection});
        }
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[size=" + collection.size() + ResponseProtocolType.COMMENT);
        for (T t : collection) {
            if (t != null) {
                sb.append(t.toString());
                sb.append(",");
            }
        }
        int lastIndexOf = sb.lastIndexOf(",");
        if (-1 != lastIndexOf) {
            sb.deleteCharAt(lastIndexOf);
        }
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    public static <T> String array2String(T[] tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccd13300", new Object[]{tArr});
        }
        if (tArr == null || tArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[size=" + tArr.length + ResponseProtocolType.COMMENT);
        for (T t : tArr) {
            if (t != null) {
                sb.append(t.toString());
                sb.append(",");
            }
        }
        int lastIndexOf = sb.lastIndexOf(",");
        if (-1 != lastIndexOf) {
            sb.deleteCharAt(lastIndexOf);
        }
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    public static <T> String join(T[] tArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd8ae536", new Object[]{tArr, str});
        }
        if (tArr == null || tArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (T t : tArr) {
            if (t != null) {
                sb.append(t.toString());
                sb.append(str);
            }
        }
        int lastIndexOf = sb.lastIndexOf(str);
        if (-1 != lastIndexOf) {
            sb.delete(lastIndexOf, sb.length());
        }
        return sb.toString();
    }

    public static <T> String join(Collection<T> collection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4402534", new Object[]{collection, str});
        }
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (T t : collection) {
            if (t != null) {
                sb.append(t.toString());
                sb.append(str);
            }
        }
        int lastIndexOf = sb.lastIndexOf(str);
        if (-1 != lastIndexOf) {
            sb.delete(lastIndexOf, sb.length());
        }
        return sb.toString();
    }
}
