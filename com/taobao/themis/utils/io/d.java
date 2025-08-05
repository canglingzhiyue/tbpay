package com.taobao.themis.utils.io;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Charset DEFAULT_CHARSET;
    public static final String DEFAULT_CHARSET_NAME = "UTF-8";

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f22882a;
    private static final char[] b;
    private final Charset c;

    static {
        kge.a(127089689);
        DEFAULT_CHARSET = Charset.forName("UTF-8");
        f22882a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', com.taobao.tao.image.d.LEVEL_D, com.taobao.tao.image.d.LEVEL_E, 'F'};
    }

    public static char[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (char[]) ipChange.ipc$dispatch("27137f8f", new Object[]{bArr}) : a(bArr, true);
    }

    public static char[] a(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("bb71fff9", new Object[]{bArr, new Boolean(z)});
        }
        return a(bArr, z ? f22882a : b);
    }

    public static char[] a(byte[] bArr, char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("b2e72fc7", new Object[]{bArr, cArr});
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
        return cArr2;
    }

    public static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr}) : new String(a(bArr));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + "[charsetName=" + this.c + riy.ARRAY_END_STR;
    }
}
