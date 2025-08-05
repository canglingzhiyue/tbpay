package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.b;

/* loaded from: classes7.dex */
public class njj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f31500a;
    private final nmv<?, b> b;
    private final int c;
    private int d;
    private boolean e;
    private int f;
    private byte[] g;

    static {
        kge.a(164007101);
    }

    public njj(nmv<?, b> nmvVar, int i, int i2) {
        this.b = nmvVar;
        this.f31500a = i;
        this.c = i2;
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int i2 = this.f31500a;
        return i2 <= 0 || this.f + i <= i2;
    }

    public synchronized boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        this.f += i;
        if (this.b == null) {
            return true;
        }
        if (this.f31500a > 0 && this.c > 0) {
            float f = this.f / this.f31500a;
            int i2 = (int) ((100.0f * f) / this.c);
            if (i2 > this.d || this.f == this.f31500a) {
                this.d = i2;
                this.b.b(f);
            }
        }
        if (!this.b.e().K()) {
            return true;
        }
        niw.b("Stream", this.b.e(), "Request is cancelled while reading stream", new Object[0]);
        this.b.d();
        this.e = true;
        return false;
    }

    public boolean a() {
        int i;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.g == null || ((i = this.f31500a) > 0 && this.f != i);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.e;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f;
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else {
            this.g = bArr;
        }
    }

    public njc d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (njc) ipChange.ipc$dispatch("261d2ff4", new Object[]{this}) : new njc(!a(), this.g, 0, this.f);
    }
}
