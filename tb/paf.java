package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.adapterimpl.follow.newfollow.a;

/* loaded from: classes8.dex */
public class paf implements pmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pmu f32526a = new a();

    static {
        kge.a(-737683078);
        kge.a(-966474448);
    }

    @Override // tb.pmu
    public void a(pmx pmxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9eb42dd", new Object[]{this, pmxVar});
        } else {
            this.f32526a.a(pmxVar);
        }
    }

    @Override // tb.pmu
    public void b(pmx pmxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86e495e", new Object[]{this, pmxVar});
        } else {
            this.f32526a.b(pmxVar);
        }
    }

    @Override // tb.pmu
    public void a(pmt pmtVar, pmv pmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b35618", new Object[]{this, pmtVar, pmvVar});
        } else {
            this.f32526a.a(pmtVar, pmvVar);
        }
    }

    @Override // tb.pmu
    public void b(pmt pmtVar, pmv pmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764c4b99", new Object[]{this, pmtVar, pmvVar});
        } else {
            this.f32526a.b(pmtVar, pmvVar);
        }
    }

    @Override // tb.pmu
    public boolean a(pmt pmtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f9e97165", new Object[]{this, pmtVar})).booleanValue() : this.f32526a.a(pmtVar);
    }

    @Override // tb.pmu
    public void a(pmt pmtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43456d93", new Object[]{this, pmtVar, new Boolean(z)});
        } else {
            this.f32526a.a(pmtVar, z);
        }
    }

    @Override // tb.pmu
    public void c(pmt pmtVar, pmv pmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e5411a", new Object[]{this, pmtVar, pmvVar});
        } else {
            this.f32526a.c(pmtVar, pmvVar);
        }
    }

    @Override // tb.pmu
    public void d(pmt pmtVar, pmv pmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7e369b", new Object[]{this, pmtVar, pmvVar});
        } else {
            this.f32526a.d(pmtVar, pmvVar);
        }
    }

    @Override // tb.pmu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f32526a.a();
        }
    }
}
