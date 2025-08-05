package android.taobao.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.crd;
import tb.gbx;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f1536a;
    private static byte[] b;
    private static byte[] c;

    static {
        int i;
        int i2;
        kge.a(-2072064933);
        f1536a = "\r\n".getBytes();
        b = new byte[255];
        c = new byte[64];
        int i3 = 0;
        for (int i4 = 0; i4 < 255; i4++) {
            b[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            b[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            b[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            b[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        byte[] bArr = b;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i8 = 0; i8 <= 25; i8++) {
            c[i8] = (byte) (i8 + 65);
        }
        int i9 = 0;
        while (i <= 51) {
            c[i] = (byte) (i9 + 97);
            i++;
            i9++;
        }
        while (i2 <= 61) {
            c[i2] = (byte) (i3 + 48);
            i2++;
            i3++;
        }
        byte[] bArr2 = c;
        bArr2[62] = 43;
        bArr2[63] = gbx.OP_MINIFY_CALL_FUNC;
    }

    private static boolean a(byte b2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8217958", new Object[]{new Byte(b2)})).booleanValue() : b2 == 61 || b[b2] != -1;
    }

    public static byte[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{bArr}) : a(bArr, false);
    }

    public static byte[] a(byte[] bArr, boolean z) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        int i4 = 2;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bb71fff8", new Object[]{bArr, new Boolean(z)});
        }
        int length = bArr.length << 3;
        int i5 = length % 24;
        int i6 = length / 24;
        int i7 = i5 != 0 ? (i6 + 1) << 2 : i6 << 2;
        if (z) {
            i = f1536a.length == 0 ? 0 : (int) Math.ceil(i7 / 76.0f);
            i7 += f1536a.length * i;
        } else {
            i = 0;
        }
        byte[] bArr2 = new byte[i7];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 76;
        while (i8 < i6) {
            int i12 = i8 * 3;
            byte b2 = bArr[i12];
            byte b3 = bArr[i12 + 1];
            byte b4 = bArr[i12 + i4];
            byte b5 = (byte) (b3 & 15);
            byte b6 = (byte) (b2 & 3);
            byte b7 = (byte) ((b2 & Byte.MIN_VALUE) == 0 ? b2 >> 2 : (b2 >> 2) ^ crd.DETECT_WIDTH);
            byte b8 = (byte) ((b3 & Byte.MIN_VALUE) == 0 ? b3 >> 4 : (b3 >> 4) ^ 240);
            if ((b4 & Byte.MIN_VALUE) == 0) {
                i2 = i6;
                i3 = b4 >> 6;
            } else {
                i2 = i6;
                i3 = (b4 >> 6) ^ 252;
            }
            byte[] bArr3 = c;
            bArr2[i9] = bArr3[b7];
            bArr2[i9 + 1] = bArr3[b8 | (b6 << 4)];
            bArr2[i9 + 2] = bArr3[((byte) i3) | (b5 << 2)];
            bArr2[i9 + 3] = bArr3[b4 & 63];
            i9 += 4;
            if (z && i9 == i11) {
                byte[] bArr4 = f1536a;
                System.arraycopy(bArr4, 0, bArr2, i9, bArr4.length);
                i10++;
                byte[] bArr5 = f1536a;
                i9 += bArr5.length;
                i11 = ((i10 + 1) * 76) + (bArr5.length * i10);
            }
            i8++;
            i6 = i2;
            i4 = 2;
        }
        int i13 = i8 * 3;
        if (i5 == 8) {
            byte b9 = bArr[i13];
            byte b10 = (byte) (b9 & 3);
            int i14 = (b9 & Byte.MIN_VALUE) == 0 ? b9 >> 2 : (b9 >> 2) ^ crd.DETECT_WIDTH;
            byte[] bArr6 = c;
            bArr2[i9] = bArr6[(byte) i14];
            bArr2[i9 + 1] = bArr6[b10 << 4];
            bArr2[i9 + 2] = 61;
            bArr2[i9 + 3] = 61;
        } else if (i5 == 16) {
            byte b11 = bArr[i13];
            byte b12 = bArr[i13 + 1];
            byte b13 = (byte) (b12 & 15);
            byte b14 = (byte) (b11 & 3);
            byte b15 = (byte) ((b11 & Byte.MIN_VALUE) == 0 ? b11 >> 2 : (b11 >> 2) ^ crd.DETECT_WIDTH);
            int i15 = (b12 & Byte.MIN_VALUE) == 0 ? b12 >> 4 : (b12 >> 4) ^ 240;
            byte[] bArr7 = c;
            bArr2[i9] = bArr7[b15];
            bArr2[i9 + 1] = bArr7[((byte) i15) | (b14 << 4)];
            bArr2[i9 + 2] = bArr7[b13 << 2];
            bArr2[i9 + 3] = 61;
        }
        if (z && i10 < i) {
            byte[] bArr8 = f1536a;
            System.arraycopy(bArr8, 0, bArr2, i7 - bArr8.length, bArr8.length);
        }
        return bArr2;
    }

    public static byte[] b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8ef4ac6d", new Object[]{bArr});
        }
        byte[] c2 = c(bArr);
        if (c2.length == 0) {
            return new byte[0];
        }
        int length = c2.length / 4;
        int length2 = c2.length;
        while (c2[length2 - 1] == 61) {
            length2--;
            if (length2 == 0) {
                return new byte[0];
            }
        }
        byte[] bArr2 = new byte[length2 - length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 2;
            byte b2 = c2[i3 + 2];
            byte b3 = c2[i3 + 3];
            byte[] bArr3 = b;
            byte b4 = bArr3[c2[i3]];
            byte b5 = bArr3[c2[i3 + 1]];
            if (b2 != 61 && b3 != 61) {
                byte b6 = bArr3[b2];
                byte b7 = bArr3[b3];
                bArr2[i] = (byte) ((b4 << 2) | (b5 >> 4));
                bArr2[i + 1] = (byte) (((b5 & 15) << 4) | ((b6 >> 2) & 15));
                bArr2[i + 2] = (byte) ((b6 << 6) | b7);
            } else if (b2 == 61) {
                bArr2[i] = (byte) ((b5 >> 4) | (b4 << 2));
            } else if (b3 == 61) {
                byte b8 = b[b2];
                bArr2[i] = (byte) ((b4 << 2) | (b5 >> 4));
                bArr2[i + 1] = (byte) (((b5 & 15) << 4) | ((b8 >> 2) & 15));
            }
            i += 3;
        }
        return bArr2;
    }

    public static byte[] c(byte[] bArr) {
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
}
