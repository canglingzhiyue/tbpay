package com.etao.feimagesearch.newresult.widget.preview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.b;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.newresult.base.i;
import com.etao.feimagesearch.newresult.widget.preview.a;
import com.etao.feimagesearch.newresult.widget.preview.d;
import com.etao.feimagesearch.regionedit.RegionEditView2023;
import com.etao.feimagesearch.result.FirstChildOffsetView;
import com.etao.feimagesearch.ui.coordinatorcard.CoordinatorCardView;
import com.etao.feimagesearch.util.ao;
import com.taobao.monitor.procedure.v;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.com;
import tb.cov;
import tb.ctl;
import tb.ctm;
import tb.ctr;
import tb.hon;
import tb.igi;
import tb.kge;
import tb.lbt;
import tb.nom;
import tb.rwf;

/* loaded from: classes3.dex */
public final class c extends com.etao.feimagesearch.newresult.widget.preview.d implements b, ctr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RegionEditView2023 b;
    private CoordinatorCardView e;
    private Map<String, com.etao.feimagesearch.newresult.widget.preview.f> j;
    private String k;
    private String l;

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.a(c.this).updateRootViewMetrics(rwf.c(c.c(c.this).getImageView().getWidth(), com.b(c.this.g())), rwf.c(c.c(c.this).getImageView().getHeight(), com.d(c.this.g())));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c.a(c.this).setRegionRationSize(c.c(c.this).getImageView().getWidth(), c.c(c.this).getImageView().getHeight());
            c.a(c.this).updateRootViewMetrics(rwf.c(c.c(c.this).getImageView().getWidth(), com.b(c.this.g())), rwf.c(c.c(c.this).getImageView().getHeight(), com.e(c.this.g())));
            c.c(c.this).setImageTranslationY(0.0f);
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;

        public f(List list) {
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.a(c.this).executeActions(this.b);
            }
        }
    }

    static {
        kge.a(-293722873);
        kge.a(1576504320);
        kge.a(-240197265);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1556504263) {
            super.b((RectF) objArr[0], (a.b) objArr[1]);
            return null;
        } else if (hashCode == 95609325) {
            super.f();
            return null;
        } else if (hashCode != 1955084058) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((RectF) objArr[0], (a.b) objArr[1]);
            return null;
        }
    }

    public static final /* synthetic */ CoordinatorCardView a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CoordinatorCardView) ipChange.ipc$dispatch("e301258e", new Object[]{cVar});
        }
        CoordinatorCardView coordinatorCardView = cVar.e;
        if (coordinatorCardView == null) {
            q.b("regionDigestContainer");
        }
        return coordinatorCardView;
    }

    public static final /* synthetic */ RegionEditView2023 c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionEditView2023) ipChange.ipc$dispatch("87307ffc", new Object[]{cVar});
        }
        RegionEditView2023 regionEditView2023 = cVar.b;
        if (regionEditView2023 == null) {
            q.b("mRegionEditView");
        }
        return regionEditView2023;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.etao.feimagesearch.result.FirstChildOffsetView, android.view.View] */
    @Override // tb.igj
    public /* synthetic */ FirstChildOffsetView k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter, d.a aVar) {
        super(activity, parent, irpDatasource, setter, aVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
        this.j = new LinkedHashMap();
    }

    public FirstChildOffsetView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FirstChildOffsetView) ipChange.ipc$dispatch("2f9184f6", new Object[]{this});
        }
        View inflate = LayoutInflater.from(g()).inflate(R.layout.feis_view_irp_2023_crop_preview, P(), false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.result.FirstChildOffsetView");
        }
        FirstChildOffsetView firstChildOffsetView = (FirstChildOffsetView) inflate;
        View findViewById = firstChildOffsetView.findViewById(R.id.region_edit_view);
        q.a((Object) findViewById, "rootView.findViewById(R.id.region_edit_view)");
        this.b = (RegionEditView2023) findViewById;
        if (!m().H().g()) {
            RegionEditView2023 regionEditView2023 = this.b;
            if (regionEditView2023 == null) {
                q.b("mRegionEditView");
            }
            regionEditView2023.triggerPreviewImgViewHide();
        }
        RegionEditView2023 regionEditView20232 = this.b;
        if (regionEditView20232 == null) {
            q.b("mRegionEditView");
        }
        regionEditView20232.assignPreviewImgLocation(m().A());
        RegionEditView2023 regionEditView20233 = this.b;
        if (regionEditView20233 == null) {
            q.b("mRegionEditView");
        }
        regionEditView20233.optionRegionTouch(m().H().h());
        RegionEditView2023 regionEditView20234 = this.b;
        if (regionEditView20234 == null) {
            q.b("mRegionEditView");
        }
        regionEditView20234.setRegionCallback(this);
        RegionEditView2023 regionEditView20235 = this.b;
        if (regionEditView20235 == null) {
            q.b("mRegionEditView");
        }
        regionEditView20235.setRegionEditViewChangeListener(new a());
        View findViewById2 = firstChildOffsetView.findViewById(R.id.card_container);
        q.a((Object) findViewById2, "rootView.findViewById(R.id.card_container)");
        this.e = (CoordinatorCardView) findViewById2;
        lbt.INSTANCE.a(g(), this);
        firstChildOffsetView.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
        return firstChildOffsetView;
    }

    /* loaded from: classes3.dex */
    public static final class a implements RegionEditView2023.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.etao.feimagesearch.regionedit.RegionEditView2023.a
        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            } else {
                c.a(c.this).setLayoutTranslationX(f);
            }
        }

        @Override // com.etao.feimagesearch.regionedit.RegionEditView2023.a
        public void b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            } else {
                c.a(c.this).setLayoutTranslationY(f);
            }
        }

        @Override // com.etao.feimagesearch.regionedit.RegionEditView2023.a
        public void c(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
            } else {
                c.a(c.this).setLayoutScale(f);
            }
        }
    }

    @Override // tb.hon
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        lbt.INSTANCE.a(g());
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            return;
        }
        RegionEditView2023 regionEditView2023 = this.b;
        if (regionEditView2023 == null) {
            q.b("mRegionEditView");
        }
        regionEditView2023.post(new e());
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(Float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f847471", new Object[]{this, f2});
            return;
        }
        RegionEditView2023 regionEditView2023 = this.b;
        if (regionEditView2023 == null) {
            q.b("mRegionEditView");
        }
        regionEditView2023.updateRegionImgDragBottomHeight(f2);
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(List<a.b> parts, Float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405117a0", new Object[]{this, parts, f2});
            return;
        }
        q.c(parts, "parts");
        RegionEditView2023 regionEditView2023 = this.b;
        if (regionEditView2023 == null) {
            q.b("mRegionEditView");
        }
        regionEditView2023.setObjects(parts, f2);
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(List<i> list) {
        RegionEditView2023 regionEditView2023;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        List<i> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        CoordinatorCardView coordinatorCardView = this.e;
        if (coordinatorCardView == null) {
            q.b("regionDigestContainer");
        }
        RegionEditView2023 regionEditView20232 = this.b;
        if (regionEditView20232 == null) {
            q.b("mRegionEditView");
        }
        float left = regionEditView20232.getImageView().getLeft();
        if (this.b == null) {
            q.b("mRegionEditView");
        }
        coordinatorCardView.setMargin(left, regionEditView2023.getImageView().getTop());
        CoordinatorCardView coordinatorCardView2 = this.e;
        if (coordinatorCardView2 == null) {
            q.b("regionDigestContainer");
        }
        RegionEditView2023 regionEditView20233 = this.b;
        if (regionEditView20233 == null) {
            q.b("mRegionEditView");
        }
        int width = regionEditView20233.getImageView().getWidth();
        RegionEditView2023 regionEditView20234 = this.b;
        if (regionEditView20234 == null) {
            q.b("mRegionEditView");
        }
        coordinatorCardView2.setRegionRationSize(width, regionEditView20234.getImageView().getHeight());
        this.j = new LinkedHashMap();
        JSONObject jSONObject = null;
        ctm ctmVar = null;
        ArrayList arrayList = new ArrayList();
        if (StringUtils.isEmpty(this.l)) {
            this.l = list.get(0).a();
        }
        for (i iVar : list) {
            RectF a2 = cov.a(iVar.a(), 1, 1);
            if (a2 != null) {
                boolean a3 = q.a((Object) iVar.a(), (Object) this.l);
                if (a3) {
                    String a4 = cov.a(a2);
                    q.a((Object) a4, "ParseUtil.parseRectF2Str(locate)");
                    ctmVar = a(a4, iVar.a(), iVar.d(), iVar.b());
                }
                float centerY = a2.centerY();
                float centerX = a2.centerX();
                String smallCardLocateValue = cov.a(new RectF(centerX, centerY, centerX, centerY));
                q.a((Object) smallCardLocateValue, "smallCardLocateValue");
                ctm ctmVar2 = new ctm(smallCardLocateValue);
                String d2 = iVar.d();
                String a5 = iVar.a();
                if (iVar.c()) {
                    jSONObject = iVar.b();
                }
                ctmVar2.a(a(false, d2, a5, jSONObject));
                ctl ctlVar = new ctl();
                RectF rectF = new RectF(a2);
                ctlVar.a(true);
                ctlVar.a(rectF);
                ctlVar.b(!a3);
                ctlVar.a(rectF.width() > rectF.height() ? 2 : 1);
                ctmVar2.a(ctlVar);
                ctmVar2.a(0);
                arrayList.add(ctmVar2);
                this.j.put(iVar.a(), new com.etao.feimagesearch.newresult.widget.preview.f(smallCardLocateValue, iVar));
                jSONObject = null;
            }
        }
        if (ctmVar != null) {
            arrayList.add(ctmVar);
        }
        CoordinatorCardView coordinatorCardView3 = this.e;
        if (coordinatorCardView3 == null) {
            q.b("regionDigestContainer");
        }
        coordinatorCardView3.executeActions(arrayList);
        if (arrayList.size() <= 1) {
            return;
        }
        ao.a();
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void b(List<i> parts) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, parts});
            return;
        }
        q.c(parts, "parts");
        if (parts.isEmpty() || this.j.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (i iVar : parts) {
            RectF a2 = cov.a(iVar.a(), 1, 1);
            if (a2 != null) {
                float centerY = a2.centerY();
                float centerX = a2.centerX();
                String smallCardLocateValue = cov.a(new RectF(centerX, centerY, centerX, centerY));
                q.a((Object) smallCardLocateValue, "smallCardLocateValue");
                ctm ctmVar = new ctm(smallCardLocateValue);
                ctmVar.a(a(false, iVar.d(), iVar.a(), iVar.c() ? iVar.b() : null));
                ctl ctlVar = new ctl();
                ctlVar.a(true);
                RectF rectF = new RectF(a2);
                ctlVar.a(rectF);
                ctlVar.a(rectF.width() > rectF.height() ? 2 : 1);
                ctlVar.b(true);
                ctmVar.a(ctlVar);
                ctmVar.a(0);
                arrayList.add(ctmVar);
                this.j.put(iVar.a(), new com.etao.feimagesearch.newresult.widget.preview.f(smallCardLocateValue, iVar));
            }
        }
        CoordinatorCardView coordinatorCardView = this.e;
        if (coordinatorCardView == null) {
            q.b("regionDigestContainer");
        }
        coordinatorCardView.post(new f(arrayList));
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(Bitmap bitmap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5e18ce", new Object[]{this, bitmap, new Boolean(z)});
        } else if (bitmap == null) {
            FirstChildOffsetView O = O();
            if (O == null) {
                return;
            }
            O.setVisibility(8);
        } else {
            a(bitmap);
            RegionEditView2023 regionEditView2023 = this.b;
            if (regionEditView2023 == null) {
                q.b("mRegionEditView");
            }
            regionEditView2023.setBitmap(bitmap);
            RegionEditView2023 regionEditView20232 = this.b;
            if (regionEditView20232 == null) {
                q.b("mRegionEditView");
            }
            regionEditView20232.post(new d());
            FirstChildOffsetView O2 = O();
            if (O2 == null) {
                return;
            }
            O2.setCenter(false);
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            RegionEditView2023 regionEditView2023 = this.b;
            if (regionEditView2023 == null) {
                q.b("mRegionEditView");
            }
            regionEditView2023.setRegionAlpha(1.0f);
        } else {
            RegionEditView2023 regionEditView20232 = this.b;
            if (regionEditView20232 == null) {
                q.b("mRegionEditView");
            }
            regionEditView20232.setRegionAlpha(0.0f);
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(RectF rectF, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a437999", new Object[]{this, rectF, new Integer(i), new Integer(i2)});
        } else if (rectF == null) {
        } else {
            RegionEditView2023 regionEditView2023 = this.b;
            if (regionEditView2023 == null) {
                q.b("mRegionEditView");
            }
            regionEditView2023.setRegionSelected(rectF);
            a(rectF);
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public int ez_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b454d9c4", new Object[]{this})).intValue();
        }
        RegionEditView2023 regionEditView2023 = this.b;
        if (regionEditView2023 == null) {
            q.b("mRegionEditView");
        }
        return regionEditView2023.getRegionCount();
    }

    private final com.etao.feimagesearch.ui.coordinatorcard.a a(boolean z, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.ui.coordinatorcard.a) ipChange.ipc$dispatch("9ea0369b", new Object[]{this, new Boolean(z), str, str2, jSONObject});
        }
        com.etao.feimagesearch.ui.coordinatorcard.a aVar = new com.etao.feimagesearch.ui.coordinatorcard.a();
        aVar.a(str);
        aVar.a(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "region", str2);
        jSONObject3.put((JSONObject) nom.KEY_IS_FULL, (String) Boolean.valueOf(z));
        aVar.b(jSONObject2);
        return aVar;
    }

    private final ctm a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ctm) ipChange.ipc$dispatch("53b44140", new Object[]{this, str, str2, str3, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        ctm ctmVar = new ctm(str);
        ctmVar.a(a(true, str3, str2, jSONObject));
        ctl ctlVar = new ctl();
        ctlVar.a(false);
        ctlVar.a(0);
        ctmVar.a(ctlVar);
        ctmVar.a(0);
        ctmVar.b(1);
        this.k = str;
        return ctmVar;
    }

    private final void a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ec1379", new Object[]{this, rectF});
            return;
        }
        String a2 = cov.a(rectF);
        if (a2 == null || StringUtils.isEmpty(a2)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = this.k;
        if (str != null && !StringUtils.isEmpty(str)) {
            ctm ctmVar = new ctm(str);
            ctmVar.a(1);
            arrayList.add(ctmVar);
        }
        com.etao.feimagesearch.newresult.widget.preview.f fVar = this.j.get(this.l);
        if (fVar != null) {
            ctm ctmVar2 = new ctm(fVar.a());
            ctmVar2.a(3);
            arrayList.add(ctmVar2);
        }
        com.etao.feimagesearch.newresult.widget.preview.f fVar2 = this.j.get(a2);
        if (fVar2 != null) {
            ctm ctmVar3 = new ctm(fVar2.a());
            ctmVar3.a(2);
            arrayList.add(ctmVar3);
            this.l = a2;
            String a3 = cov.a(cov.a(a2, 1, 1));
            q.a((Object) a3, "ParseUtil.parseRectF2Str…ctF(targetCardKey, 1, 1))");
            ctm a4 = a(a3, a2, fVar2.b().d(), fVar2.b().b());
            if (a4 != null) {
                arrayList.add(a4);
            }
        }
        CoordinatorCardView coordinatorCardView = this.e;
        if (coordinatorCardView == null) {
            q.b("regionDigestContainer");
        }
        coordinatorCardView.executeActions(arrayList);
        this.l = a2;
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(RectF rectF, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7488371a", new Object[]{this, rectF, bVar});
            return;
        }
        super.a(rectF, bVar);
        a(rectF);
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d, com.etao.feimagesearch.newresult.widget.preview.b
    public void b(RectF rectF, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a339a139", new Object[]{this, rectF, bVar});
            return;
        }
        super.b(rectF, bVar);
        a(rectF);
    }

    @Override // tb.ctr
    public void a(JSONObject jSONObject) {
        b.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (com.taobao.android.searchbaseframe.util.a.a(jSONObject, "isScanRegion", false)) {
            String a3 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "region", "");
            if (StringUtils.isEmpty(a3) || (a2 = m().a(cov.a(a3, 1, 1))) == null) {
                return;
            }
            com.etao.feimagesearch.capture.scan.irp.b.a().a((FragmentActivity) g(), a2);
        } else if (com.taobao.android.searchbaseframe.util.a.a(jSONObject, "isRegionChange", false)) {
            RectF a4 = cov.a(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "region", ""), 1, 1);
            if (a4 == null) {
                return;
            }
            RegionEditView2023 regionEditView2023 = this.b;
            if (regionEditView2023 == null) {
                q.b("mRegionEditView");
            }
            regionEditView2023.setRegionSelected(a4);
            a(a4, (a.b) null);
        } else {
            d.a eA_ = eA_();
            if (eA_ == null) {
                return;
            }
            eA_.a();
        }
    }
}
