package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public abstract class etf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AURAGlobalData f27558a;
    public q b;
    public aqs c;
    public f d;
    private int e = 2;

    static {
        kge.a(-292893000);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public etf(AURAGlobalData aURAGlobalData, q qVar, f fVar, aqs aqsVar) {
        this.f27558a = aURAGlobalData;
        this.b = qVar;
        this.d = fVar;
        this.c = aqsVar;
        emu.a("com.taobao.android.detail.industry.adapter.component.AbsDIComponentLifecycleHolder");
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            a();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            b();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.e == 2) {
        } else {
            c();
            this.e = 2;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.e == 3) {
        } else {
            d();
            this.e = 3;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.e == 4) {
        } else {
            e();
            this.e = 4;
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.e == 5) {
        } else {
            f();
            this.e = 5;
        }
    }
}
