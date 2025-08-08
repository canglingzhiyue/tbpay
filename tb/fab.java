package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.open.a;
import com.taobao.android.detail.core.open.d;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.open.i;
import com.taobao.android.detail.core.open.o;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.provider.option.e;
import com.taobao.android.detail.wrapper.ext.video.b;
import com.taobao.android.detail.wrapper.nav.c;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* loaded from: classes5.dex */
public class fab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fej f27707a;

    static {
        kge.a(713403918);
    }

    public static /* synthetic */ fej a(fab fabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fej) ipChange.ipc$dispatch("ed1918ca", new Object[]{fabVar}) : fabVar.f27707a;
    }

    public static /* synthetic */ fej a(fab fabVar, fej fejVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fej) ipChange.ipc$dispatch("73b60b25", new Object[]{fabVar, fejVar});
        }
        fabVar.f27707a = fejVar;
        return fejVar;
    }

    public static /* synthetic */ boolean a(fab fabVar, DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e4f27db", new Object[]{fabVar, detailActivity})).booleanValue() : fabVar.b(detailActivity);
    }

    public fab() {
        emu.a("com.taobao.android.detail.wrapper.ext.DetailSdkInitializer");
    }

    public void a(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22c0780", new Object[]{this, detailActivity});
            return;
        }
        a aVar = new a();
        aVar.a("detail");
        aVar.b("detail");
        long currentTimeMillis = System.currentTimeMillis();
        g a2 = i.a(detailActivity, aVar);
        String a3 = j.a("DetailSdkInitializer");
        com.taobao.android.detail.core.utils.i.d(a3, "DetailSdkInitializer cost:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        a2.a(new fae());
        a2.a(new fdy());
        a(a2);
        b(a2);
        a2.a(new e());
        c(a2);
        d(a2);
        a2.a(new ffh(detailActivity));
        com.taobao.android.detail.core.utils.i.d(j.a("DetailSdkInitializer"), "DetailSdkInitializer 0");
        com.taobao.android.detail.wrapper.ext.event.e.a(a2, detailActivity);
        com.taobao.android.detail.core.utils.i.d(j.a("DetailSdkInitializer"), "DetailSdkInitializer 0");
        e(a2);
        a(a2, detailActivity);
    }

    private void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843f8492", new Object[]{this, gVar});
            return;
        }
        gVar.a(new fea());
        gVar.a((eop) new fdx());
        gVar.a(new fec());
        gVar.a(new fed());
        gVar.a(new fee());
        gVar.a((eov) new fdx());
        gVar.a(new fdv());
    }

    private void b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472bedf1", new Object[]{this, gVar});
            return;
        }
        gVar.a(new fdz());
        gVar.a(new fdw());
        gVar.a(new feb());
    }

    private void c(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a185750", new Object[]{this, gVar});
            return;
        }
        if (a("feizhu")) {
            gVar.a(new fci());
        }
        if (!a("tmallglobalzhiying")) {
            return;
        }
        gVar.a(new fcj());
    }

    private void a(g gVar, final DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab294d16", new Object[]{this, gVar, detailActivity});
        } else {
            gVar.a(new com.taobao.android.detail.core.open.e() { // from class: tb.fab.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.open.e
                public void a(Map<String, String> map, d dVar) {
                    fab fabVar;
                    fej fejVar;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fe343020", new Object[]{this, map, dVar});
                        return;
                    }
                    if (!eip.K || !(dVar instanceof o)) {
                        fabVar = fab.this;
                        fejVar = new fej(dVar);
                    } else {
                        fabVar = fab.this;
                        fejVar = new czx((o) dVar);
                    }
                    fab.a(fabVar, fejVar);
                    if (fab.a(fab.this, detailActivity) && eip.c) {
                        com.taobao.android.detail.core.utils.i.d(com.taobao.android.detail.core.performance.i.a("DetailDataRequester", BTags.MainRequestTag), "命中nav预请求, DetailRequestImpl startMainRequest");
                        fei.a(detailActivity, fab.a(fab.this), map);
                        return;
                    }
                    new ejq().a(detailActivity, map);
                    com.taobao.android.detail.core.utils.i.d(com.taobao.android.detail.core.performance.i.a("DetailDataRequester", BTags.MainRequestTag), "TaobaoRequestImpl startMainRequest");
                    DetailActivity detailActivity2 = detailActivity;
                    fek.a(detailActivity2, detailActivity2.f9411a, fab.a(fab.this), map);
                }
            });
        }
    }

    private boolean b(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("708d0b63", new Object[]{this, detailActivity})).booleanValue();
        }
        if (detailActivity != null && detailActivity.f9411a != null) {
            return detailActivity.f9411a.b().containsKey(c.KEY_DETAIL_NAV);
        }
        return false;
    }

    private void d(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd04c0af", new Object[]{this, gVar});
            return;
        }
        gVar.a(new fez());
        gVar.a(new dyj());
        gVar.a(new fey());
    }

    private void e(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff12a0e", new Object[]{this, gVar});
            return;
        }
        eig eigVar = new eig();
        eigVar.a(new b());
        eigVar.a(new com.taobao.android.detail.wrapper.ext.video.a());
        gVar.a(eigVar);
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("android_detail", "bizCustomize", "");
        if (StringUtils.isEmpty(config)) {
            return false;
        }
        return config.toLowerCase().contains(str.toLowerCase());
    }
}
