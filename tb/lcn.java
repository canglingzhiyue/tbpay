package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public abstract class lcn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public loz f30474a;
    public lcm b;
    private lco c;

    static {
        kge.a(1679423166);
    }

    public abstract void b();

    public abstract void d();

    public abstract void f();

    public lcn(lcm lcmVar, loz lozVar) {
        this.f30474a = lozVar;
        this.b = lcmVar;
    }

    public void a(lco lcoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f286de00", new Object[]{this, lcoVar});
            return;
        }
        this.c = lcoVar;
        lco lcoVar2 = this.c;
        if (lcoVar2 == null) {
            return;
        }
        lcoVar2.a(this.b);
        this.c.a(this.f30474a);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d();
        lco lcoVar = this.c;
        if (lcoVar == null) {
            return;
        }
        lcoVar.a();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            f();
        }
    }
}
