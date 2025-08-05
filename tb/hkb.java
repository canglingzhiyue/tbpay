package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.StateName;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.c;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* loaded from: classes6.dex */
public class hkb extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1022673507);
    }

    public static /* synthetic */ Object ipc$super(hkb hkbVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : StateName.FAVORITE;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a a(hkb hkbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("76fa63ee", new Object[]{hkbVar}) : hkbVar.c;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a b(hkb hkbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("9c8e6cef", new Object[]{hkbVar}) : hkbVar.c;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a c(hkb hkbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("c22275f0", new Object[]{hkbVar}) : hkbVar.c;
    }

    public hkb(c cVar, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, d dVar) {
        super(cVar, aVar, tBLiveDataModel, dVar);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            g();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!kpj.a(this.c, this.b)) {
        } else {
            kpi kpiVar = new kpi(this.f14053a, this.c, this.b, this.h);
            this.f14053a.a(kpiVar);
            kpiVar.c(false);
            kpiVar.d();
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        pmt pmtVar = new pmt();
        pmtVar.f32764a = str;
        if (pmd.a().B() == null) {
            return;
        }
        pmd.a().B().c(pmtVar, new pmv() { // from class: tb.hkb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pmv
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                }
            }

            @Override // tb.pmv
            public void a(pmz pmzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                } else if (!(pmzVar instanceof pna)) {
                } else {
                    boolean z = ((pna) pmzVar).f32767a;
                    pmw pmwVar = new pmw();
                    pmwVar.f32765a = str;
                    pmwVar.b = z;
                    hkb.this.onFollowChange(pmwVar);
                    hkb.c(hkb.this).e().a(xkw.EVENT_GET_FOLLOW_STATUS, Boolean.valueOf(z), hkb.a(hkb.this) == null ? null : hkb.b(hkb.this).G());
                }
            }
        });
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        if (!hkk.ay() || !phg.d().a()) {
            return;
        }
        a(this.d);
    }
}
