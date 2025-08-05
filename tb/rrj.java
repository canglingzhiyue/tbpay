package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes9.dex */
public class rrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int MODE_NV21 = 0;

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f33334a;
    public int b;
    public int c;
    public int d;
    public ShortBuffer e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;

    static {
        kge.a(-1083688700);
    }

    public rrj() {
        this.k = true;
    }

    public rrj(ByteBuffer byteBuffer, int i, int i2, int i3, ShortBuffer shortBuffer, int i4, int i5, int i6, int i7) {
        this(byteBuffer, i, i2, i3, shortBuffer, i4, i5, i6, i7, false);
    }

    public rrj(ByteBuffer byteBuffer, int i, int i2, int i3, ShortBuffer shortBuffer, int i4, int i5, int i6, int i7, boolean z) {
        this.k = true;
        this.f33334a = byteBuffer;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = shortBuffer;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = z;
    }

    public ByteBuffer a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("351f15a9", new Object[]{this}) : this.f33334a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CameraData{, mColorWidth=" + this.b + ", mColorHeight=" + this.c + ", mColorFrameMode=" + this.d + ", mDepthWidth=" + this.f + ", mDepthHeight=" + this.g + ", mPreviewWidth=" + this.h + ", mPreviewHeight=" + this.i + ", mMirror=" + this.j + '}';
    }
}
