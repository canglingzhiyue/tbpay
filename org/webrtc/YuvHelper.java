package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes9.dex */
public class YuvHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1184197679);
    }

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db692c36", new Object[]{byteBuffer, new Integer(i), byteBuffer2, new Integer(i2), byteBuffer3, new Integer(i3), byteBuffer4, new Integer(i4), new Integer(i5)});
            return;
        }
        int i6 = (i4 + 1) / 2;
        int i7 = i4 * i5;
        int i8 = ((i5 + 1) / 2) * i6;
        int i9 = (i8 << 1) + i7;
        if (byteBuffer4.capacity() < i9) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i9 + " was " + byteBuffer4.capacity());
        }
        byteBuffer4.position(0);
        ByteBuffer slice = byteBuffer4.slice();
        byteBuffer4.position(i7);
        ByteBuffer slice2 = byteBuffer4.slice();
        byteBuffer4.position(i8 + i7);
        nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i4, slice2, i6, byteBuffer4.slice(), i6, i4, i5);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96814567", new Object[]{byteBuffer, new Integer(i), byteBuffer2, new Integer(i2), byteBuffer3, new Integer(i3), byteBuffer4, new Integer(i4), new Integer(i5)});
            return;
        }
        int i6 = (i4 + 1) / 2;
        int i7 = i4 * i5;
        int i8 = ((((i5 + 1) / 2) * i6) << 1) + i7;
        if (byteBuffer4.capacity() < i8) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i8 + " was " + byteBuffer4.capacity());
        }
        byteBuffer4.position(0);
        ByteBuffer slice = byteBuffer4.slice();
        byteBuffer4.position(i7);
        nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i4, byteBuffer4.slice(), i6 << 1, i4, i5);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e68feb3", new Object[]{byteBuffer, new Integer(i), byteBuffer2, new Integer(i2), byteBuffer3, new Integer(i3), byteBuffer4, new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        int i7 = i6 % 180;
        int i8 = i7 == 0 ? i4 : i5;
        int i9 = i7 == 0 ? i5 : i4;
        int i10 = (i8 + 1) / 2;
        int i11 = i9 * i8;
        int i12 = ((i9 + 1) / 2) * i10;
        int i13 = (i12 << 1) + i11;
        if (byteBuffer4.capacity() < i13) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i13 + " was " + byteBuffer4.capacity());
        }
        byteBuffer4.position(0);
        ByteBuffer slice = byteBuffer4.slice();
        byteBuffer4.position(i11);
        ByteBuffer slice2 = byteBuffer4.slice();
        byteBuffer4.position(i12 + i11);
        nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i8, slice2, i10, byteBuffer4.slice(), i10, i4, i5, i6);
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326bb1f2", new Object[]{byteBuffer, new Integer(i), byteBuffer2, new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
        }
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7016b31", new Object[]{byteBuffer, new Integer(i), byteBuffer2, new Integer(i2), byteBuffer3, new Integer(i3), byteBuffer4, new Integer(i4), byteBuffer5, new Integer(i5), byteBuffer6, new Integer(i6), new Integer(i7), new Integer(i8)});
        } else {
            nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
        }
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c169a8ce", new Object[]{byteBuffer, new Integer(i), byteBuffer2, new Integer(i2), byteBuffer3, new Integer(i3), byteBuffer4, new Integer(i4), byteBuffer5, new Integer(i5), new Integer(i6), new Integer(i7)});
        } else {
            nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
        }
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("addae28c", new Object[]{byteBuffer, new Integer(i), byteBuffer2, new Integer(i2), byteBuffer3, new Integer(i3), byteBuffer4, new Integer(i4), byteBuffer5, new Integer(i5), byteBuffer6, new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9)});
        } else {
            nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8, i9);
        }
    }
}
