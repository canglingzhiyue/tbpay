package com.taobao.pexode.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import tb.kge;
import tb.qol;
import tb.tof;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int FIXED_JPG_LENGTH;

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f18685a;
    private static final byte[] b;

    static {
        kge.a(-1118147181);
        f18685a = new byte[]{-1, -40, -1, -37, 0, 67, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -64, 0, 17, 8};
        b = new byte[]{3, 1, 34, 0, 2, 17, 0, 3, 17, 0, -1, -60, 0, 31, 0, 0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 16, 0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125, 1, 2, 3, 0, 4, 17, 5, 18, 33, tof.LF_LINK, 65, 6, 19, 81, 97, 7, 34, 113, 20, tof.LF_SYMLINK, -127, -111, -95, 8, 35, 66, -79, -63, 21, 82, -47, -16, 36, tof.LF_CHR, 98, 114, -126, 9, 10, 22, 23, 24, 25, 26, 37, 38, 39, 40, 41, 42, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -60, 0, 31, 1, 0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 17, 0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119, 0, 1, 2, 3, 17, 4, 5, 33, tof.LF_LINK, 6, 18, 65, 81, 7, 97, 113, 19, 34, tof.LF_SYMLINK, -127, 8, 20, 66, -111, -95, -79, -63, 9, 35, tof.LF_CHR, 82, -16, 21, 98, 114, -47, 10, 22, 36, tof.LF_BLK, -31, 37, -15, 23, 24, 25, 26, 38, 39, 40, 41, 42, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -126, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -38, 0, 12, 3, 1, 0, 2, 17, 3, 17, 0, 63, 0, -114, -118, 40, -96, 15, -1, -39};
        FIXED_JPG_LENGTH = f18685a.length + b.length + 4;
    }

    public static byte[] a(int i, int i2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6a87d2e", new Object[]{new Integer(i), new Integer(i2), bArr});
        }
        if (bArr != null) {
            try {
                if (bArr.length >= FIXED_JPG_LENGTH) {
                    System.arraycopy(f18685a, 0, bArr, 0, f18685a.length);
                    bArr[f18685a.length] = (byte) (i2 >> 8);
                    bArr[f18685a.length + 1] = (byte) i2;
                    bArr[f18685a.length + 2] = (byte) (i >> 8);
                    bArr[f18685a.length + 3] = (byte) i;
                    System.arraycopy(b, 0, bArr, f18685a.length + 4, b.length);
                    return bArr;
                }
            } catch (Exception e) {
                qol.h(com.taobao.pexode.d.TAG, "generate fixed size jpg bytes failed, error=%s", e);
                return null;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FIXED_JPG_LENGTH);
        byteArrayOutputStream.write(f18685a);
        byteArrayOutputStream.write((byte) (i2 >> 8));
        byteArrayOutputStream.write((byte) i2);
        byteArrayOutputStream.write((byte) (i >> 8));
        byteArrayOutputStream.write((byte) i);
        byteArrayOutputStream.write(b);
        return byteArrayOutputStream.toByteArray();
    }
}
