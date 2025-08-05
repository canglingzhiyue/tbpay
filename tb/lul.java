package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class lul extends lua implements lke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-589665243);
        kge.a(-2140782140);
    }

    public lul(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.lke
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            e().a(z);
        }
    }

    @Override // tb.lke
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            e().a();
        }
    }

    @Override // tb.lke
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            e().b();
        }
    }

    @Override // tb.lke
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : e().j();
    }

    @Override // tb.lke
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : e().c();
    }
}
