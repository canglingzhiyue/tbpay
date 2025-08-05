package com.alibaba.ability.impl.file;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final g INSTANCE;

    static {
        kge.a(519851744);
        INSTANCE = new g();
    }

    private g() {
    }

    public final String a(byte[] bytes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{this, bytes});
        }
        q.d(bytes, "bytes");
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        String sb2 = sb.toString();
        q.b(sb2, "sb.toString()");
        return sb2;
    }

    public final byte[] a(String str) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 2 == 1) {
            length++;
            bArr = new byte[length / 2];
            str = '0' + str;
        } else {
            bArr = new byte[length / 2];
        }
        int i2 = 0;
        while (i < length) {
            int i3 = i + 2;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = str.substring(i, i3);
            q.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            bArr[i2] = b(substring);
            i2++;
            i = i3;
        }
        return bArr;
    }

    public final byte b(String hex) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e55f", new Object[]{this, hex})).byteValue();
        }
        q.d(hex, "hex");
        try {
            return (byte) Integer.parseInt(hex, kotlin.text.a.a(16));
        } catch (Exception unused) {
            return (byte) 0;
        }
    }
}
