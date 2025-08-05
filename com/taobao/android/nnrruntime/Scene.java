package com.taobao.android.nnrruntime;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import tb.kge;

/* loaded from: classes6.dex */
public class Scene {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f14478a;
    private final a b;
    private long c;

    /* loaded from: classes6.dex */
    public interface a {
        long a();

        void b();
    }

    static {
        kge.a(632603350);
    }

    public static native long nativeCreateFromBuffer(byte[] bArr, long j);

    public static native long nativeCreateFromFile(String str, long j);

    public static native long nativeGetPosition(long j, String str);

    public static native void nativeRelease(long j);

    public static native int nativeRender(long j, long j2);

    public static native int nativeReplaceFromBuffer(byte[] bArr, long j, String str, String str2, long j2);

    public static native int nativeReplaceFromFile(String str, long j, String str2, String str3, long j2);

    public static native int nativeReset(long j, String str);

    public static native int nativeSetComponent(long j, byte[] bArr, long j2);

    public static Scene a(String str, a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scene) ipChange.ipc$dispatch("4c6fad0d", new Object[]{str, aVar, aVar2});
        }
        if (!OpenGLUtils.f14474a) {
            return null;
        }
        long nativeCreateFromFile = nativeCreateFromFile(str, aVar.a());
        if (0 != nativeCreateFromFile) {
            return new Scene(nativeCreateFromFile, aVar, aVar2);
        }
        return null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long j = this.c;
        if (0 == j) {
            return;
        }
        nativeRender(j, this.b.a());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        long j = this.c;
        if (0 == j) {
            return;
        }
        nativeRelease(j);
        this.c = 0L;
        this.b.b();
        this.f14478a.b();
    }

    public long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{this, str})).longValue();
        }
        long j = this.c;
        if (0 != j) {
            return nativeGetPosition(j, str);
        }
        return 0L;
    }

    public void a(float[] fArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2715c6f1", new Object[]{this, fArr, new Long(j)});
        } else if (0 == this.c) {
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(fArr.length * 4);
            allocate.order(ByteOrder.nativeOrder());
            allocate.asFloatBuffer().put(fArr);
            nativeSetComponent(this.c, allocate.array(), j);
        }
    }

    public void a(byte[] bArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2713f575", new Object[]{this, bArr, new Long(j)});
            return;
        }
        long j2 = this.c;
        if (0 == j2) {
            return;
        }
        nativeSetComponent(j2, bArr, j);
    }

    public a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7bf6ebe8", new Object[]{this}) : this.b;
    }

    private Scene(long j, a aVar, a aVar2) {
        this.f14478a = aVar;
        this.b = aVar2;
        this.c = j;
    }
}
