package com.etao.feimagesearch.jni;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.a;
import java.nio.ByteBuffer;
import tb.cot;
import tb.coy;
import tb.ihq;
import tb.ihy;
import tb.ihz;
import tb.kge;

/* loaded from: classes3.dex */
public class PailitaoCUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f6732a;
    private static long b;

    private static native void destroyWatermark();

    private static native byte[] detectVideoWatermark(byte[] bArr, int i, int i2);

    private static native int detectWatermark(byte[] bArr, int i, int i2);

    private static native void initWatermark();

    private static native int scaleYuv(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr2, int i8, int i9);

    private static native void yuv420pToBitmap(byte[] bArr, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7);

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        f6732a = z;
        return z;
    }

    static {
        kge.a(-177257281);
        f6732a = false;
        b = 0L;
        c();
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (f6732a) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - b < 300000) {
                return;
            }
            b = currentTimeMillis;
            try {
                coy.a(a.f6987a, "beginLoadRemoteSo", 19999, new String[0]);
                ihq.a().a("PailitaoCUtil", new ihy() { // from class: com.etao.feimagesearch.jni.PailitaoCUtil.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ihy
                    public void onLoadFinished(ihz ihzVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
                        } else if (!ihzVar.g()) {
                        } else {
                            coy.a(a.f6987a, "loadRemoteSoSuccess", 19999, new String[0]);
                            PailitaoCUtil.a(true);
                        }
                    }
                });
            } catch (Throwable th) {
                cot.a("PltCameraPai", "loadRemoteSo", cot.a("", th));
            }
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : f6732a;
    }

    public static int a(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr2, int i8, int i9) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("535ee92e", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), bArr2, new Integer(i8), new Integer(i9)})).intValue();
        }
        if (!f6732a) {
            throw new Exception("PailitaoCUtil init err");
        }
        try {
            c();
            return scaleYuv(bArr, i, i2, i3, i4, i5, i6, i7, bArr2, i8, i9);
        } catch (Throwable th) {
            throw new Exception("call scaleYuvNative err.", th);
        }
    }

    public static void a(byte[] bArr, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e0f8a5", new Object[]{bArr, byteBuffer, new Integer(i), byteBuffer2, new Integer(i2), byteBuffer3, new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
        } else if (!f6732a) {
            c();
            throw new Exception("PailitaoCUtil init err");
        } else {
            try {
                yuv420pToBitmap(bArr, byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, i4, i5, i6, i7);
            } catch (Throwable th) {
                throw new Exception("call yuv420pToBitmap err.", th);
            }
        }
    }

    public static void a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!f6732a) {
            c();
            throw new Exception("PailitaoCUtil init err");
        } else {
            try {
                initWatermark();
            } catch (Throwable th) {
                throw new Exception("call initWaterMark err.", th);
            }
        }
    }

    public static void b() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!f6732a) {
            c();
            throw new Exception("PailitaoCUtil init err");
        } else {
            try {
                destroyWatermark();
            } catch (Throwable th) {
                throw new Exception("call initWaterMark err.", th);
            }
        }
    }

    public static int a(byte[] bArr, int i, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb6ab7c2", new Object[]{bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (!f6732a) {
            c();
            throw new Exception("PailitaoCUtil init err");
        }
        try {
            return detectWatermark(bArr, i, i2);
        } catch (Throwable th) {
            throw new Exception("call detectWaterMark err.", th);
        }
    }

    public static String b(byte[] bArr, int i, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb8347d0", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        if (!f6732a) {
            c();
            throw new Exception("PailitaoCUtil init err");
        }
        try {
            byte[] detectVideoWatermark = detectVideoWatermark(bArr, i, i2);
            return detectVideoWatermark == null ? "" : new String(detectVideoWatermark, "utf-8");
        } catch (Throwable th) {
            throw new Exception("call detectWaterMark err.", th);
        }
    }
}
