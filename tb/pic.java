package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.controller2.g;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.mergeInfo.b;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.observe.a;
import com.taobao.taolive.sdk.utils.o;

/* loaded from: classes8.dex */
public class pic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32676a;
    private Context b;
    private e c;
    private View d;
    private a e;
    private phn f;
    private pkp g;
    private irm h;
    private soe i;
    private b j;

    static {
        kge.a(1438473671);
    }

    public pic(String str, e eVar, Context context, View view) {
        this.f32676a = str;
        this.c = eVar;
        this.b = context;
        this.d = view;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!n()) {
        } else {
            k();
            l();
            m();
            o();
            p();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!n() || this.c.o() == null || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(this.c.o().bizCode)) {
        } else {
            this.i = new soe((g) this.c, this.b);
            this.i.a();
        }
    }

    public void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
        } else if (!n()) {
        } else {
            b(videoInfo);
            if (this.c.y() != null) {
                this.c.y().a(videoInfo);
            }
            a aVar = this.e;
            if (aVar != null) {
                aVar.j(videoInfo.roomStatus);
                this.e.k(videoInfo.streamStatus);
                this.e.l(videoInfo.dataSource);
                this.e.b();
            }
            this.f = new phn(this.c);
            this.f.a(videoInfo);
        }
    }

    public void c() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!n() || (aVar = this.e) == null) {
        } else {
            aVar.c();
        }
    }

    public void d() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!n()) {
        } else {
            if (this.c != null && (aVar = this.e) != null) {
                aVar.g();
                if (this.c.A() != null && this.c.A().e() != null) {
                    this.e.h(this.c.A().e().y());
                }
            }
            if (!o.h()) {
                return;
            }
            pkn e = pko.a().e(this.f32676a);
            e eVar = this.c;
            if (eVar != null && eVar.A() != null && this.c.A().e() != null && e != null) {
                e.g = this.c.A().e().y();
            }
            pko.a().c(this.f32676a);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!n()) {
        } else {
            j();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!n()) {
        } else {
            soe soeVar = this.i;
            if (soeVar != null) {
                soeVar.b();
            }
            j();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!n()) {
        } else {
            j.b(this.c);
            a aVar = this.e;
            if (aVar == null) {
                return;
            }
            aVar.e();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!n()) {
        } else {
            j.a(this.c);
            a aVar = this.e;
            if (aVar == null) {
                return;
            }
            aVar.f();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!n()) {
        } else {
            soe soeVar = this.i;
            if (soeVar != null) {
                soeVar.c();
            }
            j();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        a aVar = this.e;
        if (aVar != null) {
            aVar.d();
        }
        phn phnVar = this.f;
        if (phnVar != null) {
            phnVar.a();
            this.f = null;
        }
        pkp pkpVar = this.g;
        if (pkpVar != null) {
            pkpVar.b();
        }
        irm irmVar = this.h;
        if (irmVar != null) {
            irmVar.b();
        }
        b bVar = this.j;
        if (bVar != null) {
            bVar.a();
            this.j = null;
            e eVar = this.c;
            if (eVar != null) {
                eVar.a((b) null);
            }
        }
        this.b = null;
        this.c = null;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.e = new a(this.f32676a);
        e eVar = this.c;
        if (eVar != null) {
            eVar.a(this.e);
            if (this.c.r() != null) {
                this.e.a(this.c.r().liveId);
                if (this.c.r().initParams != null) {
                    this.e.b(this.c.r().initParams.get("livesource"));
                }
            }
        }
        this.e.d(poy.R(this.c));
        this.e.c("LiveRoom");
        this.e.e(poy.T(this.c));
        this.e.a();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            pbt.a().g.a("liveRoom", pdt.switchModel, this.c.r());
        }
    }

    private void b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b293c4", new Object[]{this, videoInfo});
        } else {
            pbt.a().g.a("liveRoom", pdt.switchModel, videoInfo);
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        e eVar = this.c;
        if (eVar == null || eVar.o() == null || this.c.o().bizCode == null || !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_HomeTab.toString().equals(this.c.o().bizCode)) {
            z = false;
        }
        if (z) {
            this.h = new irm(this.b, this.d, this.c);
            e eVar2 = this.c;
            if (!(eVar2 instanceof g)) {
                return;
            }
            ((g) eVar2).C = this.h;
            return;
        }
        if (this.g == null) {
            this.g = new pkp(this.b, this.d, this.c);
        }
        e eVar3 = this.c;
        if (!(eVar3 instanceof g)) {
            return;
        }
        ((g) eVar3).s = this.g;
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        e eVar = this.c;
        if (eVar == null) {
            return;
        }
        this.c.a((sss) new ssu(eVar));
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.j = new b();
            this.j.a(this.b, this.c);
            this.c.a(this.j);
        }
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (!aa.bL()) {
            return true;
        }
        return (this.f32676a == null || this.c == null || this.b == null || this.d == null) ? false : true;
    }
}
