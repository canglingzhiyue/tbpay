package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lbj f30448a;
    private final lbk b;
    private final lbc c;
    private final lbe d;
    private final lbg e;
    private final lbd f;
    private final mjx g;

    static {
        kge.a(1024052572);
    }

    public lbh(lbo lboVar) {
        this.f30448a = new lbj(lboVar);
        this.b = new lbk(lboVar);
        law y = lboVar.y();
        this.c = y.b();
        this.d = y.a();
        this.e = y.d();
        this.f = y.e();
        this.g = lboVar.i();
        this.c.a(this.f30448a);
        this.d.a(this.f30448a);
        this.e.a(this.f30448a);
        this.f.a(this.f30448a);
        mjx mjxVar = this.g;
        if (mjxVar != null) {
            mjxVar.a(this.b);
        }
    }

    public void a() {
        lbk lbkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e.b(this.f30448a);
        this.d.b(this.f30448a);
        this.c.b(this.f30448a);
        this.f.b(this.f30448a);
        mjx mjxVar = this.g;
        if (mjxVar == null || (lbkVar = this.b) == null) {
            return;
        }
        mjxVar.b(lbkVar);
    }
}
