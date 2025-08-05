package com.taobao.search.sf.widgets.headerskin;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.downgrade.Downgrade;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.ioe;
import tb.iom;
import tb.iqt;
import tb.irt;
import tb.isv;
import tb.iuk;
import tb.ium;
import tb.iut;
import tb.kge;
import tb.mxw;
import tb.nom;
import tb.ntg;
import tb.nuu;
import tb.nvj;
import tb.nvk;
import tb.nxi;

/* loaded from: classes8.dex */
public class c extends iut implements nvj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<nvk> f19495a;
    private ArrayList<Object> b;
    private ArrayList<com.taobao.search.sf.datasource.c> c;
    private nxi d;
    private irt e;
    private SFPromotionBean f;
    private float g;
    private SFPromotionBean h;
    private int j;
    private boolean k;
    private boolean l;
    private iom m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;

    static {
        kge.a(-1987195838);
        kge.a(-587723147);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -211767613) {
            super.onComponentDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SearchPromotionWidget";
    }

    public static /* synthetic */ ArrayList a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("d4e1236d", new Object[]{cVar}) : cVar.f19495a;
    }

    public static /* synthetic */ SFPromotionBean b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SFPromotionBean) ipChange.ipc$dispatch("5b4ba7d7", new Object[]{cVar}) : cVar.f;
    }

    public c(Activity activity, ium iumVar, irt irtVar) {
        super(activity, iumVar);
        this.f19495a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.d = new nxi();
        this.g = 1.0f;
        this.h = new SFPromotionBean();
        CommonSearchContext commonSearchContext = (CommonSearchContext) irtVar.f();
        boolean isGallerySrp = commonSearchContext.isGallerySrp();
        if ("degrade".equals(Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance())) {
            this.r = r.ap();
        } else {
            this.r = false;
        }
        subscribeEvent(this);
        this.e = irtVar;
        boolean z = true;
        this.k = FestivalMgr.a().a("global") || isGallerySrp;
        this.l = commonSearchContext.isPopupSrp() && r.bQ();
        Resources resources = activity.getResources();
        this.n = resources.getColor(R.color.tbsearch_srp_tab_text_unselected);
        this.o = resources.getColor(R.color.tbsearch_tab_selected);
        this.p = resources.getColor(R.color.tbsearch_srp_prom_tab_text_normal);
        this.q = resources.getColor(R.color.tbsearch_srp_prom_tab_text_selected);
        ntg a2 = nuu.INSTANCE.a(commonSearchContext.getChannelSrp());
        if (a2 != null) {
            this.h.f19160a = a2.f;
            this.h.c = com.taobao.search.mmd.util.d.a(a2.d, 0);
            this.h.b = a2.c;
            this.h.d = com.taobao.search.mmd.util.d.a(a2.f31751a, this.n);
            this.h.e = com.taobao.search.mmd.util.d.a(a2.b, this.o);
        } else {
            int i = 10001;
            if (this.k && !this.l) {
                if (!TextUtils.equals(FestivalMgr.a().d("global", nom.KEY_NAVI_STYLE), "0") && !isGallerySrp) {
                    z = false;
                }
                this.h.f19160a = z ? 10002 : i;
                SFPromotionBean sFPromotionBean = this.h;
                sFPromotionBean.c = 0;
                sFPromotionBean.b = FestivalMgr.a().a("mytaobao", mxw.KEY_SKIN_PIC);
                this.h.d = z ? this.p : this.n;
                this.h.e = z ? this.q : this.o;
            } else {
                SFPromotionBean sFPromotionBean2 = this.h;
                sFPromotionBean2.f19160a = 10001;
                sFPromotionBean2.c = resources.getColor(R.color.tbsearch_srp_header_color);
                SFPromotionBean sFPromotionBean3 = this.h;
                sFPromotionBean3.b = null;
                sFPromotionBean3.d = this.n;
                sFPromotionBean3.e = this.o;
            }
        }
        this.f = this.h.a();
    }

    public void onEventMainThread(isv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0bf04c", new Object[]{this, aVar});
        } else if (!aVar.b()) {
        } else {
            a((com.taobao.search.sf.datasource.c) this.e.e());
        }
    }

    public void onEventMainThread(ioe.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59711518", new Object[]{this, bVar});
            return;
        }
        iom iomVar = null;
        if (bVar.d != null && !bVar.d.isEmpty()) {
            iuk iukVar = bVar.d.get(0);
            if (iukVar instanceof iom) {
                iomVar = (iom) iukVar;
            }
        }
        a(iomVar);
    }

    public void onEventMainThread(iqt.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd5c88c", new Object[]{this, aVar});
            return;
        }
        int abs = Math.abs(aVar.f29233a);
        if (this.j == abs) {
            return;
        }
        this.j = abs;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.m != null) {
            b();
        }
        iom iomVar = this.m;
        if (iomVar == null || !iomVar.d()) {
            return;
        }
        d();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        iom iomVar = this.m;
        float f = 1.0f;
        if (iomVar != null && iomVar.aK_() != 0) {
            f = 1.0f - Math.max(Math.min(this.j / this.m.aK_(), 1.0f), 0.0f);
        }
        if (f == this.g) {
            return;
        }
        this.g = f;
        f();
    }

    private void d() {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        iom iomVar = this.m;
        if (iomVar == null) {
            return;
        }
        int intValue = iomVar.e() == null ? this.p : this.m.e().intValue();
        int intValue2 = this.m.f() == null ? this.q : this.m.f().intValue();
        int intValue3 = (this.m.g() == null || this.m.g().intValue() == 10000) ? 10002 : this.m.g().intValue();
        if (this.h.d == intValue && this.h.e == intValue2 && this.h.f19160a == intValue3) {
            return;
        }
        int intValue4 = this.m.e() == null ? this.p : this.m.e().intValue();
        int intValue5 = this.m.f() == null ? this.q : this.m.f().intValue();
        if (this.r) {
            if (this.g < 0.5f) {
                intValue4 = this.h.d;
            }
            if (this.g < 0.5f) {
                intValue5 = this.h.e;
            }
        } else {
            intValue4 = this.d.a(this.h.d, intValue4, this.g);
            intValue5 = this.d.a(this.h.e, intValue5, this.g);
        }
        if (this.m.g() == null || this.m.g().intValue() == 10000) {
            i = this.g >= 0.5f ? 10002 : this.h.f19160a;
        } else {
            i = this.g >= 0.5f ? this.m.g().intValue() : this.h.f19160a;
        }
        if (this.f.d != intValue4) {
            this.f.d = intValue4;
            z = true;
        }
        if (this.f.e != intValue5) {
            this.f.e = intValue5;
            z = true;
        }
        if (this.f.f19160a != i) {
            this.f.f19160a = i;
            z = true;
        }
        this.f.f = this.g;
        if (!z) {
            return;
        }
        e();
    }

    public void a(com.taobao.search.sf.datasource.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141ef998", new Object[]{this, cVar});
            return;
        }
        if (!cVar.isSubscribed(this)) {
            cVar.subscribe(this);
            this.c.add(cVar);
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
        ntg ntgVar = commonSearchResult != null ? commonSearchResult.tabPromotionBean : null;
        if (ntgVar != null) {
            z = a(ntgVar);
        }
        if (!z) {
            return;
        }
        e();
    }

    private void a(iom iomVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee108571", new Object[]{this, iomVar});
            return;
        }
        this.m = iomVar;
        int i = this.h.f19160a;
        int i2 = this.h.d;
        int i3 = this.h.e;
        if (iomVar != null && iomVar.d()) {
            i = (iomVar.g() == null || iomVar.g().intValue() == 10000) ? 10002 : iomVar.g().intValue();
            i2 = iomVar.e() == null ? this.p : iomVar.e().intValue();
            i3 = iomVar.f() == null ? this.q : iomVar.f().intValue();
        }
        if (this.f.f19160a != i) {
            this.f.f19160a = i;
            z = true;
        }
        if (this.f.e != i3) {
            this.f.e = i3;
            z = true;
        }
        if (this.f.d != i2) {
            this.f.d = i2;
            z = true;
        }
        if (!z) {
            return;
        }
        e();
    }

    private boolean a(ntg ntgVar) {
        int a2;
        int a3;
        int a4;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6dc7bdb", new Object[]{this, ntgVar})).booleanValue();
        }
        if (!TextUtils.isEmpty(ntgVar.d) && this.f.c != (a4 = com.taobao.search.mmd.util.d.a(ntgVar.d, this.f.c))) {
            SFPromotionBean sFPromotionBean = this.f;
            sFPromotionBean.b = null;
            sFPromotionBean.c = a4;
            z = true;
        }
        if (!TextUtils.equals(this.f.b, ntgVar.c)) {
            this.f.b = ntgVar.c;
            z = true;
        }
        if (!TextUtils.isEmpty(ntgVar.f31751a) && this.f.d != (a3 = com.taobao.search.mmd.util.d.a(ntgVar.f31751a, this.f.d))) {
            this.f.d = a3;
            z = true;
        }
        if (!TextUtils.isEmpty(ntgVar.b) && this.f.e != (a2 = com.taobao.search.mmd.util.d.a(ntgVar.b, this.f.e))) {
            this.f.e = a2;
            z = true;
        }
        if (ntgVar.f == 10000 || ntgVar.f == this.f.f19160a) {
            return z;
        }
        this.f.f19160a = ntgVar.f;
        return true;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        q.a("SearchPromotionWidget", "notifyPromotionChanged:" + this.f);
        Iterator<nvk> it = this.f19495a.iterator();
        while (it.hasNext()) {
            it.next().a(this.f);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (this.r) {
            Math.round(this.g);
        }
        Iterator<Object> it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // tb.nvj
    public void a(final nvk nvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fa7c55", new Object[]{this, nvkVar});
        } else if (nvkVar == null) {
        } else {
            getActivity().runOnUiThread(new Runnable() { // from class: com.taobao.search.sf.widgets.headerskin.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (c.a(c.this).contains(nvkVar)) {
                    } else {
                        c.a(c.this).add(nvkVar);
                        nvkVar.a(c.b(c.this));
                    }
                }
            });
        }
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        Iterator<com.taobao.search.sf.datasource.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().unsubscribe(this);
        }
    }
}
