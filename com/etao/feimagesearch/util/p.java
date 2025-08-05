package com.etao.feimagesearch.util;

import android.media.Image;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import tb.cot;
import tb.kge;

/* loaded from: classes4.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f7031a;

    static {
        kge.a(1785287039);
        f7031a = !p.class.desiredAssertionStatus();
    }

    public static int a(byte[] bArr, int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1eca9c4", new Object[]{bArr, new Integer(i), new Integer(i2), new Float(f)})).intValue() : a(bArr, i, i2) < f ? 1 : 2;
    }

    public static int a(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1ecb507", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int i4 = i * i2;
        if (i4 <= 0 || bArr.length == 0) {
            return 2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            try {
                i5 += bArr[i6] & 255;
            } catch (Exception unused) {
                return 2;
            }
        }
        return i5 / i4 < i3 ? 1 : 2;
    }

    public static float a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb6ab7bf", new Object[]{bArr, new Integer(i), new Integer(i2)})).floatValue() : b(bArr, i, i2);
    }

    private static float b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4faf26c0", new Object[]{bArr, new Integer(i), new Integer(i2)})).floatValue();
        }
        if (bArr != null) {
            try {
                if (bArr.length != 0 && (i & 1) != 1) {
                    int i3 = 0;
                    float f = 0.0f;
                    while (i3 < i2) {
                        int i4 = i3 * i;
                        float f2 = f;
                        for (int i5 = 0; i5 < i; i5 += 4) {
                            f2 += bArr[i4 + i5] & 255;
                        }
                        i3++;
                        f = f2;
                    }
                    return (f / 255.0f) / ((i * i2) >> 2);
                }
            } catch (Exception e) {
                cot.a("ImageUtil", "calMeanImgValue", e);
            }
        }
        return -1.0f;
    }

    public static byte[] a(Image image) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("72dbb1d4", new Object[]{image});
        }
        int width = image.getWidth();
        int height = image.getHeight();
        int i2 = width * height;
        byte[] bArr = new byte[((i2 / 4) << 1) + i2];
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        ByteBuffer buffer2 = image.getPlanes()[1].getBuffer();
        ByteBuffer buffer3 = image.getPlanes()[2].getBuffer();
        int rowStride = image.getPlanes()[0].getRowStride();
        if (!f7031a && image.getPlanes()[0].getPixelStride() != 1) {
            throw new AssertionError();
        }
        if (rowStride == width) {
            buffer.get(bArr, 0, i2);
            i = i2 + 0;
        } else {
            long j = -rowStride;
            int i3 = 0;
            while (i3 < i2) {
                j += rowStride;
                buffer.position((int) j);
                buffer.get(bArr, i3, width);
                i3 += width;
            }
            i = i3;
        }
        int rowStride2 = image.getPlanes()[2].getRowStride();
        int pixelStride = image.getPlanes()[2].getPixelStride();
        if (!f7031a && rowStride2 != image.getPlanes()[1].getRowStride()) {
            throw new AssertionError();
        }
        if (!f7031a && pixelStride != image.getPlanes()[1].getPixelStride()) {
            throw new AssertionError();
        }
        if (pixelStride == 2 && rowStride2 == width && buffer2.get(0) == buffer3.get(1)) {
            byte b = buffer3.get(1);
            byte b2 = (byte) (~b);
            try {
                buffer3.put(1, b2);
                if (buffer2.get(0) == b2) {
                    buffer3.put(1, b);
                    buffer3.position(0);
                    buffer2.position(0);
                    buffer3.get(bArr, i2, 1);
                    buffer2.get(bArr, i2 + 1, buffer2.remaining());
                    return bArr;
                }
            } catch (ReadOnlyBufferException unused) {
            }
            buffer3.put(1, b);
        }
        for (int i4 = 0; i4 < height / 2; i4++) {
            for (int i5 = 0; i5 < width / 2; i5++) {
                int i6 = (i5 * pixelStride) + (i4 * rowStride2);
                int i7 = i + 1;
                bArr[i] = buffer3.get(i6);
                i = i7 + 1;
                bArr[i7] = buffer2.get(i6);
            }
        }
        return bArr;
    }
}
