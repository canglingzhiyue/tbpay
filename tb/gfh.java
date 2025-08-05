package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gfh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte f28308a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public gbn f;

    static {
        kge.a(-783300055);
    }

    public gfh(byte b, String str, int i, int i2, int i3) {
        this.f28308a = b;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public gfh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfh) ipChange.ipc$dispatch("f0502d5", new Object[]{this});
        }
        gfh gfhVar = new gfh(this.f28308a, this.b, this.c, this.d, this.e);
        gfhVar.f = this.f;
        return gfhVar;
    }

    public byte b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d5", new Object[]{this})).byteValue() : this.f28308a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.d;
    }

    public void a(gbn gbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f01705", new Object[]{this, gbnVar});
        } else {
            this.f = gbnVar;
        }
    }

    public gbn f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbn) ipChange.ipc$dispatch("357d2f66", new Object[]{this}) : this.f;
    }
}
