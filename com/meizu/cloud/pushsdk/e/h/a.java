package com.meizu.cloud.pushsdk.e.h;

import tb.gbx;
import tb.tof;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f7932a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 43, gbx.OP_MINIFY_CALL_FUNC};
    private static final byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, gbx.OP_CALL_FUNC, 95};

    public static byte[] a(String str) {
        int i;
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt2 = str.charAt(i6);
            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                i = charAt2 - 'A';
            } else if (charAt2 >= 'a' && charAt2 <= 'z') {
                i = charAt2 - 'G';
            } else if (charAt2 >= '0' && charAt2 <= '9') {
                i = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i5 = (i5 << 6) | ((byte) i);
            i3++;
            if (i3 % 4 == 0) {
                int i7 = i4 + 1;
                bArr[i4] = (byte) (i5 >> 16);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (i5 >> 8);
                bArr[i8] = (byte) i5;
                i4 = i8 + 1;
            }
        }
        int i9 = i3 % 4;
        if (i9 == 1) {
            return null;
        }
        if (i9 == 2) {
            bArr[i4] = (byte) ((i5 << 12) >> 16);
            i4++;
        } else if (i9 == 3) {
            int i10 = i5 << 6;
            int i11 = i4 + 1;
            bArr[i4] = (byte) (i10 >> 16);
            i4 = i11 + 1;
            bArr[i11] = (byte) (i10 >> 8);
        }
        if (i4 == i2) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }
}
