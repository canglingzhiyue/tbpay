package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class loz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lcm f30791a;
    private lpb b;
    private lpa c;
    private lpa d;
    private lpa e;
    private lpa f;
    private lpa g;

    static {
        kge.a(1546399649);
    }

    public loz(lcm lcmVar) {
        this.f30791a = lcmVar;
        emu.a("com.taobao.android.detail.core.pagemanager.view.ComponentFactory");
    }

    public void a(lpb lpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33826ba", new Object[]{this, lpbVar});
        } else {
            this.b = lpbVar;
        }
    }

    public lpa a() {
        lpb lpbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpa) ipChange.ipc$dispatch("f076d61", new Object[]{this});
        }
        if (this.f == null && (lpbVar = this.b) != null) {
            this.f = lpbVar.a(this.f30791a);
        }
        return this.f;
    }

    public lpa b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpa) ipChange.ipc$dispatch("16b912c0", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new lcr(this.f30791a.b());
        }
        return this.c;
    }

    public lpa c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpa) ipChange.ipc$dispatch("1e6ab81f", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new lcr(this.f30791a.c());
        }
        return this.d;
    }

    public lpa d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpa) ipChange.ipc$dispatch("261c5d7e", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new lcr(this.f30791a.d());
        }
        return this.e;
    }

    public lpa e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpa) ipChange.ipc$dispatch("2dce02dd", new Object[]{this});
        }
        if (this.g == null) {
            this.g = new lcr(this.f30791a.e());
        }
        return this.g;
    }
}
