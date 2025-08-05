package tb;

import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.taolive.adapterimpl.global.a;
import com.taobao.taolive.adapterimpl.global.c;
import com.taobao.taolive.adapterimpl.global.d;
import com.taobao.taolive.adapterimpl.media.a;
import com.taobao.taolive.adapterimpl.msg.AccsAdapter;
import com.taobao.taolive.adapterimpl.network.b;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.ax;
import com.taobao.taolive.sdk.adapter.network.g;
import com.taobao.taolive.sdk.ui.media.i;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.tbliveinteractive.jsbridge.TaoLiveTradeTrack;

/* loaded from: classes8.dex */
public class ozt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ozt f32516a;

    public static /* synthetic */ void a(ozt oztVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ebca4f", new Object[]{oztVar});
        } else {
            oztVar.b();
        }
    }

    static {
        kge.a(1557106539);
        f32516a = null;
    }

    private ozt() {
        pmd.a().a(new a());
        g gVar = new g();
        gVar.a(ozu.INSTANCE);
        gVar.a(new com.taobao.taolive.adapterimpl.network.a());
        pmd.a().a(gVar);
        pmd.a().a(new pai());
        pmd.a().a(new pat());
        pmd.a().a(new b());
        pmd.a().a(new pal());
        pmd.a().a(new pbb());
        cgl.a(new com.taobao.taolive.adapterimpl.global.b());
        cgl.a(new com.taobao.taolive.adapterimpl.uikit.b());
        pmd.a().a(new pak());
        pmd.a().a(new paj());
        pmd.a().a(new pba());
        cgl.a(new c());
        cgl.a(new com.taobao.taolive.adapterimpl.nav.b());
        cgl.a(new pax());
        cgl.a(new com.taobao.taolive.adapterimpl.uikit.recyclerview.a());
        cgl.a(new paz());
        cgl.a(new pay());
        cgl.a(new ozy());
        cgl.a(new pbc());
        pmd.a().a(new ozv());
        cgl.a(new pbd());
        cgl.a(new com.taobao.taolive.adapterimpl.uikit.a());
        cgl.a(new ozx());
        cgl.a(new pac());
        cgl.a(new paa());
        thj.a().a(new ax());
        pon ponVar = new pon();
        ponVar.a((pom) ozu.INSTANCE);
        ponVar.a((pol) new pas());
        pmd.a().a(ponVar);
        pmd.a().a(new par());
        pmk pmkVar = new pmk();
        pmkVar.a(ozu.INSTANCE);
        pmkVar.a(new pab());
        pmd.a().a(pmkVar);
        pmd.a().a(new AccsAdapter());
        pnv pnvVar = new pnv();
        pnvVar.a(new com.taobao.taolive.adapterimpl.msg.g());
        pnvVar.a(ozu.INSTANCE);
        pmd.a().a(pnvVar);
        pmd.a().a(new com.taobao.taolive.adapterimpl.msg.c());
        pmd.a().a(new ozz());
        pmd.a().a(new com.taobao.taolive.adapterimpl.media.a());
        pmd.a().a(new com.taobao.taolive.adapterimpl.nav.c());
        t b = tjy.b("tblive");
        b.a(aw.TRACK_ORANGES);
        pmd.a().a(b);
        pmd.a().a(new tqv());
        pme pmeVar = new pme();
        pmeVar.a(ozu.INSTANCE);
        pmeVar.a(new ozw());
        pmd.a().a(pmeVar);
        pmd.a().a(new pap());
        pmc.a().a(new pam());
        pmd.a().a(new pan());
        try {
            if (com.taobao.android.live.plugin.proxy.c.a().d()) {
                b();
            } else {
                com.taobao.android.live.plugin.proxy.c.a().a(new c.b() { // from class: tb.ozt.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            ozt.a(ozt.this);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            q.b("LiveRoomInit", "[<clinit>] error: " + th.getMessage());
        }
        i iVar = new i();
        iVar.a(ozu.INSTANCE);
        iVar.a(new a.C0889a());
        pmd.a().a(iVar);
        pmd.a().a(new pac());
        pmd.a().a(new paf());
        pmd.a().a(new pae());
        pmd.a().a(new pad());
        pmd.a().a(new sgn());
        pmd.a().a(new d());
        if (psm.I()) {
            pmd.a().a(new ted());
        }
        android.taobao.windvane.jsbridge.q.a("TaoLiveTradeTrack", (Class<? extends e>) TaoLiveTradeTrack.class, true);
        tki.f34181a = true;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (f.t() == null) {
                return;
            }
            f.t().initTaoLiveEvocation();
        } catch (Throwable th) {
            q.b("LiveRoomInit", "[initTaoLiveEvocation] error: " + th.getMessage());
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f32516a != null) {
        } else {
            f32516a = new ozt();
        }
    }
}
