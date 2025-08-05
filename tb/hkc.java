package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.b;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.c;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* loaded from: classes6.dex */
public class hkc extends a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean e;
    private com.taobao.taolive.room.business.subscribe.a f;

    static {
        kge.a(1464324009);
        kge.a(-797454141);
    }

    public static /* synthetic */ Object ipc$super(hkc hkcVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : "followed";
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a a(hkc hkcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("b0c505cd", new Object[]{hkcVar}) : hkcVar.c;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a b(hkc hkcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("d6590ece", new Object[]{hkcVar}) : hkcVar.c;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a c(hkc hkcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("fbed17cf", new Object[]{hkcVar}) : hkcVar.c;
    }

    public hkc(c cVar, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.d dVar) {
        super(cVar, aVar, tBLiveDataModel, dVar);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b != null && this.b.mVideoInfo != null && b.a().b(this.b)) {
            k();
        } else {
            if (this.e) {
                e();
            }
            if (ply.W()) {
                if (kpj.a(this.c, this.b)) {
                    j();
                    return;
                } else if (this.e) {
                    g();
                    return;
                } else {
                    h();
                    return;
                }
            }
            k();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        kph kphVar = new kph(this.f14053a, this.c, this.b, this.h);
        this.f14053a.a(kphVar);
        kphVar.d();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!kpj.a(this.c, this.b)) {
        } else {
            kpi kpiVar = new kpi(this.f14053a, this.c, this.b, this.h);
            this.f14053a.a(kpiVar);
            kpiVar.c(false);
            kpiVar.d();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        hkd hkdVar = new hkd(this.f14053a, this.c, this.b, this.h);
        this.f14053a.a(hkdVar);
        hkdVar.d();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        hke hkeVar = new hke(this.f14053a, this.c, this.b, this.h);
        this.f14053a.a(hkeVar);
        hkeVar.d();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        i();
        plw.a(this.b, this.c, "follow");
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.b.mVideoInfo;
        if (videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        if (this.f == null) {
            this.f = new com.taobao.taolive.room.business.subscribe.a(this);
        }
        long c = v.c(videoInfo.broadCaster.accountId);
        if (c <= 0) {
            return;
        }
        this.f.a(c);
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
        pmd.a().B().c(pmtVar, new pmv() { // from class: tb.hkc.1
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
                    hkc.this.onFollowChange(pmwVar);
                    hkc.c(hkc.this).e().a(xkw.EVENT_GET_FOLLOW_STATUS, Boolean.valueOf(z), hkc.a(hkc.this) == null ? null : hkc.b(hkc.this).G());
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
        if (!hkk.E()) {
            return;
        }
        a(this.d);
    }
}
