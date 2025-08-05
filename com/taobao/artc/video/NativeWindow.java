package com.taobao.artc.video;

import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import tb.kge;

/* loaded from: classes6.dex */
public final class NativeWindow implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f16385a;

    static {
        kge.a(1245832343);
        kge.a(-1811054506);
    }

    private static native long nInitialize(Surface surface);

    private static native void nRelease(long j);

    private static native int nSendImage(long j, byte[] bArr);

    private static native int nSetBuffersGeometry(long j, int i, int i2, int i3);

    public NativeWindow(Surface surface) {
        if (surface == null) {
            throw new NullPointerException();
        }
        this.f16385a = nInitialize(surface);
    }

    public int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        a();
        return nSetBuffersGeometry(this.f16385a, i, i2, i3);
    }

    public int a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c196722", new Object[]{this, bArr})).intValue();
        }
        a();
        if (bArr == null) {
            throw new NullPointerException();
        }
        return nSendImage(this.f16385a, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        long j = this.f16385a;
        if (0 == j) {
            return;
        }
        nRelease(j);
        this.f16385a = 0L;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            close();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (0 == this.f16385a) {
            throw new IllegalStateException();
        }
    }
}
