package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class hzw implements hzv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bny f28871a;

    static {
        kge.a(-1468287273);
        kge.a(1175355774);
    }

    public void a(bny bnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e215f60b", new Object[]{this, bnyVar});
        } else {
            this.f28871a = bnyVar;
        }
    }

    @Override // tb.hzv
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        hzy.a("OrderActiveLifeCycleImp", "doStart", "----");
        bny bnyVar = this.f28871a;
        if (bnyVar == null) {
            return;
        }
        bnyVar.aa();
    }

    @Override // tb.hzv
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        hzy.a("OrderActiveLifeCycleImp", "doPause", "----");
        bny bnyVar = this.f28871a;
        if (bnyVar == null) {
            return;
        }
        bnyVar.i();
    }

    @Override // tb.hzv
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        hzy.a("OrderActiveLifeCycleImp", "doStop", "----");
        bny bnyVar = this.f28871a;
        if (bnyVar == null) {
            return;
        }
        bnyVar.Z();
    }

    @Override // tb.hzv
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            hzy.a("OrderActiveLifeCycleImp", "doDestroy", "----");
        }
    }

    @Override // tb.hzv
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        hzy.a("OrderActiveLifeCycleImp", "doResume", "----");
        bny bnyVar = this.f28871a;
        if (bnyVar == null) {
            return;
        }
        bnyVar.ab();
    }
}
