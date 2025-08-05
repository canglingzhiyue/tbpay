package com.alibaba.ut.abtest.internal.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import java.util.Set;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EMPTY = "";
    public static final String WHITE_SPACES = " \r\n\t\u3000   ";

    /* renamed from: a  reason: collision with root package name */
    private static char[] f4203a;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : str == null ? "" : str;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return null;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(str.charAt(i2))) {
                cArr[i] = str.charAt(i2);
                i++;
            }
        }
        return i == length ? str : new String(cArr, 0, i);
    }

    static {
        kge.a(-1208713384);
        f4203a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr}) : a(bArr, (Character) null);
    }

    public static String a(byte[] bArr, Character ch) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7936a8a3", new Object[]{bArr, ch});
        }
        int length = bArr.length;
        if (ch != null) {
            i = 3;
        }
        StringBuffer stringBuffer = new StringBuffer(length * i);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = (bArr[i2] >>> 4) & 15;
            int i4 = bArr[i2] & 15;
            if (i2 > 0 && ch != null) {
                stringBuffer.append(ch.charValue());
            }
            stringBuffer.append(f4203a[i3]);
            stringBuffer.append(f4203a[i4]);
        }
        return stringBuffer.toString();
    }

    private static byte[] a(String str, Charset charset) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f43ae0dd", new Object[]{str, charset});
        }
        if (str != null) {
            return str.getBytes(charset);
        }
        return null;
    }

    public static byte[] d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("7527e788", new Object[]{str}) : a(str, Charset.forName("UTF-8"));
    }

    public static String a(Set<Long> set) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b491829", new Object[]{set});
        }
        if (set == null || set.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.BRACKET_START_STR);
        for (Long l : set) {
            if (!z) {
                sb.append(",");
            }
            sb.append(l);
            z = false;
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
