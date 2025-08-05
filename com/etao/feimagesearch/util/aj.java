package com.etao.feimagesearch.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.YuvImage;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class aj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final x f7010a;

    static {
        kge.a(1558518734);
    }

    public aj(Context context) {
        this.f7010a = new x(context);
    }

    public Bitmap a(int i, int i2, int i3, byte[] bArr, RectF rectF, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c930c1d1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), bArr, rectF, new Integer(i4), new Integer(i5)});
        }
        YuvImage a2 = a(new YuvImage(bArr, 17, i2, i3, null), i, rectF, i4, i5);
        return this.f7010a.a(a2.getYuvData(), a2.getWidth(), a2.getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.YuvImage a(android.graphics.YuvImage r16, int r17, android.graphics.RectF r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.util.aj.a(android.graphics.YuvImage, int, android.graphics.RectF, int, int):android.graphics.YuvImage");
    }

    public static YuvImage a(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = i4;
        IpChange ipChange = $ipChange;
        int i9 = 0;
        if (ipChange instanceof IpChange) {
            return (YuvImage) ipChange.ipc$dispatch("f204397b", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i8), new Integer(i5), new Integer(i6)});
        }
        if (i3 > i || i8 > i2) {
            return null;
        }
        int i10 = (i3 / 2) << 1;
        int i11 = (i8 / 2) << 1;
        int i12 = (i5 / 2) << 1;
        int i13 = (i6 / 2) << 1;
        int i14 = i12 * i13;
        byte[] bArr2 = new byte[(i14 / 2) + i14];
        int i15 = 0;
        while (true) {
            i7 = i13 + i11;
            if (i8 >= i7) {
                break;
            }
            System.arraycopy(bArr, (i8 * i) + i10, bArr2, i15 * i12, i12);
            i15++;
            i8++;
        }
        for (int i16 = i11 / 2; i16 < i7 / 2; i16++) {
            System.arraycopy(bArr, (i * i2) + i10 + (i16 * i), bArr2, (i9 * i12) + i14, i12);
            i9++;
        }
        return new YuvImage(bArr2, 17, i12, i13, null);
    }

    private static byte[] a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b1ec42ee", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        int i3 = i * i2;
        int i4 = (i3 * 3) / 2;
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            for (int i7 = i2 - 1; i7 >= 0; i7--) {
                bArr2[i5] = bArr[(i7 * i) + i6];
                i5++;
            }
        }
        int i8 = i4 - 1;
        int i9 = i - 1;
        while (i9 > 0) {
            int i10 = i8;
            for (int i11 = 0; i11 < i2 / 2; i11++) {
                int i12 = (i11 * i) + i3;
                bArr2[i10] = bArr[i12 + i9];
                int i13 = i10 - 1;
                bArr2[i13] = bArr[i12 + (i9 - 1)];
                i10 = i13 - 1;
            }
            i9 -= 2;
            i8 = i10;
        }
        return bArr2;
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a635b40d", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        int i3 = i * i2;
        byte[] bArr2 = new byte[(i3 * 3) / 2];
        int i4 = i - 1;
        int i5 = i4;
        int i6 = 0;
        while (i5 >= 0) {
            int i7 = i6;
            for (int i8 = 0; i8 < i2; i8++) {
                bArr2[i7] = bArr[(i8 * i) + i5];
                i7++;
            }
            i5--;
            i6 = i7;
        }
        int i9 = i3;
        while (i4 > 0) {
            int i10 = i9;
            for (int i11 = 0; i11 < i2 / 2; i11++) {
                int i12 = (i11 * i) + i3;
                bArr2[i10] = bArr[(i4 - 1) + i12];
                int i13 = i10 + 1;
                bArr2[i13] = bArr[i12 + i4];
                i10 = i13 + 1;
            }
            i4 -= 2;
            i9 = i10;
        }
        return bArr2;
    }
}
