package com.taobao.browser.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.gbx;
import tb.kge;
import tb.tof;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f16843a;
    private static final byte[] b;

    static {
        kge.a(421495495);
        f16843a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 43, gbx.OP_MINIFY_CALL_FUNC};
        b = new byte[128];
        for (int i = 0; i < 128; i++) {
            b[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            b[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            b[i3] = (byte) ((i3 - 97) + 26);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            b[i4] = (byte) ((i4 - 48) + 52);
        }
        byte[] bArr = b;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{bArr});
        }
        byte[] c = c(bArr);
        if (c[c.length - 2] == 61) {
            bArr2 = new byte[(((c.length / 4) - 1) * 3) + 1];
        } else if (c[c.length - 1] == 61) {
            bArr2 = new byte[(((c.length / 4) - 1) * 3) + 2];
        } else {
            bArr2 = new byte[(c.length / 4) * 3];
        }
        int i2 = 0;
        while (i < c.length - 4) {
            byte[] bArr3 = b;
            byte b2 = bArr3[c[i]];
            byte b3 = bArr3[c[i + 1]];
            byte b4 = bArr3[c[i + 2]];
            byte b5 = bArr3[c[i + 3]];
            bArr2[i2] = (byte) ((b2 << 2) | (b3 >> 4));
            bArr2[i2 + 1] = (byte) ((b3 << 4) | (b4 >> 2));
            bArr2[i2 + 2] = (byte) (b5 | (b4 << 6));
            i += 4;
            i2 += 3;
        }
        if (c[c.length - 2] == 61) {
            byte[] bArr4 = b;
            bArr2[bArr2.length - 1] = (byte) ((bArr4[c[c.length - 3]] >> 4) | (bArr4[c[c.length - 4]] << 2));
        } else if (c[c.length - 1] == 61) {
            byte[] bArr5 = b;
            byte b6 = bArr5[c[c.length - 4]];
            byte b7 = bArr5[c[c.length - 3]];
            byte b8 = bArr5[c[c.length - 2]];
            bArr2[bArr2.length - 2] = (byte) ((b6 << 2) | (b7 >> 4));
            bArr2[bArr2.length - 1] = (byte) ((b8 >> 2) | (b7 << 4));
        } else {
            byte[] bArr6 = b;
            byte b9 = bArr6[c[c.length - 4]];
            byte b10 = bArr6[c[c.length - 3]];
            byte b11 = bArr6[c[c.length - 2]];
            byte b12 = bArr6[c[c.length - 1]];
            bArr2[bArr2.length - 3] = (byte) ((b9 << 2) | (b10 >> 4));
            bArr2[bArr2.length - 2] = (byte) ((b10 << 4) | (b11 >> 2));
            bArr2[bArr2.length - 1] = (byte) (b12 | (b11 << 6));
        }
        return bArr2;
    }

    public static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr}) : new String(a(bArr));
    }

    private static byte[] c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f6d5d94c", new Object[]{bArr});
        }
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (a(bArr[i2])) {
                bArr2[i] = bArr[i2];
                i++;
            }
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        return bArr3;
    }

    private static boolean a(byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8217958", new Object[]{new Byte(b2)})).booleanValue();
        }
        if (b2 == 61) {
            return true;
        }
        return b2 >= 0 && b2 < 128 && b[b2] != -1;
    }
}
