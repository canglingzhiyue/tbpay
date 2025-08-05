package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.icart.core.data.c;
import com.alibaba.android.icart.core.data.f;
import com.alibaba.android.icart.core.data.model.CartOpenPopupWindowEventModel;
import com.alibaba.android.ultron.trade.presenter.BaseViewManager;
import com.alibaba.android.ultron.trade.utils.d;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.b;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.bby;

/* loaded from: classes2.dex */
public class bez extends BaseViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ViewGroup g;
    private bby h;
    private bcb i;
    private Set<bey> j;
    private adc k;
    private bon l;
    private final bbz m;
    private final boolean n;

    static {
        kge.a(1422184007);
    }

    public static /* synthetic */ Object ipc$super(bez bezVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1445565382) {
            super.b(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != -503277414) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((bmi) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ Set a(bez bezVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("cd265510", new Object[]{bezVar}) : bezVar.j;
    }

    public static /* synthetic */ bbz b(bez bezVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("2ee451ea", new Object[]{bezVar}) : bezVar.m;
    }

    public bez(bbz bbzVar, boc bocVar) {
        super(bbzVar, bocVar);
        this.n = jqi.a("iCart", ieu.sShowWithStdPop, false, true);
        this.l = new bon() { // from class: tb.bez.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bon
            public void a(String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    return;
                }
                String s = bez.b(bez.this).s();
                UnifyLog.a(s, "ViewManager", "view render error", "downgraded. componentName " + str + " ,code:" + str2 + " ,msg:" + str3);
                HashMap hashMap = new HashMap();
                hashMap.put("componentName", str);
                hashMap.put("errorCode", str2);
                hashMap.put("errorMsg", str3);
                bdx.a(bdx.F_PAGE_RENDER_TAG, "", "", "cart", "render", hashMap, "renderError", "组件渲染异常，不降级到h5了，期望是用兜底组件上屏");
            }
        };
        this.m = bbzVar;
        c(jqi.a("iCart", "exposureAsync", true));
        this.c.a(jqi.a("iCart", "enableHandleComponentVisibilityOnScroll", false));
        this.c.a(this.l);
        c(1);
        this.i = bbzVar.n();
        this.j = new HashSet();
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.i.n().u() != null;
    }

    public DinamicXEngine w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("44a94bc9", new Object[]{this}) : this.c.e().a().d();
    }

    public int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{this, new Float(f)})).intValue();
        }
        DinamicXEngine w = w();
        Activity activity = this.f2672a;
        return gbg.a(w, activity, f + "ap", 0);
    }

    public int b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d660ea", new Object[]{this, new Float(f)})).intValue() : gbg.b(w(), this.f2672a, f);
    }

    public void a(bey beyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1972282", new Object[]{this, beyVar});
        } else {
            this.j.add(beyVar);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        adc adcVar = this.k;
        if (adcVar != null) {
            return adcVar.b();
        }
        return 0;
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        adc adcVar = this.k;
        if (adcVar != null) {
            return adcVar.a(i);
        }
        return 0;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        adc adcVar = this.k;
        return adcVar != null && adcVar.c();
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.g = viewGroup;
        }
    }

    public ViewGroup c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("6e13476b", new Object[]{this}) : this.g;
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public void a(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a8385a", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            return;
        }
        this.k = new adc(recyclerView);
        a(this.k.a());
        b(linearLayout, recyclerView, linearLayout2);
        a(new bnn(this.c) { // from class: tb.bez.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 644526294) {
                    super.a((h) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.bnn, android.support.v7.widget.RecyclerView.Adapter
            public /* synthetic */ void onBindViewHolder(h hVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1071b8aa", new Object[]{this, hVar, new Integer(i)});
                } else {
                    a(hVar, i);
                }
            }

            @Override // tb.bnn
            public void a(h hVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266ab0d6", new Object[]{this, hVar, new Integer(i)});
                    return;
                }
                super.a(hVar, i);
                for (bey beyVar : bez.a(bez.this)) {
                    beyVar.a(this.c, hVar, i);
                }
            }
        });
    }

    public void a(bmi bmiVar, int i, bfa bfaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5590015c", new Object[]{this, bmiVar, new Integer(i), bfaVar});
            return;
        }
        bnv bnvVar = new bnv();
        if (bmiVar != null) {
            bnvVar.b(bmiVar.b());
            bnvVar.a(bmiVar.a());
            bnvVar.e(bmiVar.c());
        }
        a(bnvVar, i, bfaVar);
    }

    public void a(bnv bnvVar, int i, bfa bfaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54151f88", new Object[]{this, bnvVar, new Integer(i), bfaVar});
            return;
        }
        if (f()) {
            b(this.i.e());
        }
        if (bnvVar == null) {
            return;
        }
        jny H = this.m.H();
        if (H instanceof b) {
            bnvVar.a((b) H);
        } else if (ifp.a()) {
            throw new IllegalStateException("Presenter.getDataContext返回值必须是DMContext类型");
        }
        this.c.a(bnvVar);
        bnvVar.h(H.d());
        boolean a2 = srb.a(this.i.w(), true);
        this.m.i().a(a2);
        bny bnyVar = this.c;
        if (a2) {
            i = 4;
        }
        bnyVar.a(i, bfaVar);
        String a3 = bfaVar == null ? null : bfaVar.a();
        if (a3 != null) {
            boolean i2 = this.m.v().i();
            if (a2) {
                akg.b(this.f2672a, a3, i2);
            } else {
                akg.a(this.f2672a, a3, i2);
            }
        } else {
            jqg.a("iCart", "cannotFinishPerformance", "api is null");
        }
        d.a(this.f2672a);
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i.b("");
        bby bbyVar = this.h;
        if (bbyVar != null && bbyVar.b()) {
            this.h.a(true);
        }
        d(true);
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        bbz bbzVar = this.m;
        if (bbzVar == null || bbzVar.S() == null) {
            return;
        }
        jdc.a(this.c.k(), this.m.S().U(), z);
    }

    public void a(bby bbyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16cdbff", new Object[]{this, bbyVar});
        } else {
            this.h = bbyVar;
        }
    }

    public bby d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bby) ipChange.ipc$dispatch("2617a022", new Object[]{this});
        }
        bby bbyVar = this.h;
        if (bbyVar != null && !bbyVar.z()) {
            this.h.A();
        }
        return this.h;
    }

    public void a(View view, String str, List<IDMComponent> list, CartOpenPopupWindowEventModel cartOpenPopupWindowEventModel, bby.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfab2dd7", new Object[]{this, view, str, list, cartOpenPopupWindowEventModel, aVar});
            return;
        }
        d(false);
        bby bbyVar = this.h;
        if (bbyVar == null) {
            return;
        }
        if (bbyVar.b()) {
            this.h.a(false);
        }
        this.i.a(str);
        Pair<Integer, List<IDMComponent>> d = d(list);
        if (d != null) {
            list.addAll(((Integer) d.first).intValue(), (Collection) d.second);
        }
        bnv e = e(list);
        if (cartOpenPopupWindowEventModel == null) {
            cartOpenPopupWindowEventModel = new CartOpenPopupWindowEventModel();
        }
        this.h.a(list);
        this.h.a(e);
        ifu i = this.m.i();
        boolean a2 = i.a();
        if (a2) {
            i.b();
        }
        f a3 = a(cartOpenPopupWindowEventModel);
        a3.a(view);
        this.h.a(a3);
        bec.a(this.i.w(), str, list);
        this.h.a(aVar);
        bed.a("hideFloatDetailFirst", a2 ? "先隐藏优惠明细" : "不隐藏优惠明细", a2, 0.005f);
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public bnv e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnv) ipChange.ipc$dispatch("2dc97230", new Object[]{this});
        }
        bby bbyVar = this.h;
        if (bbyVar == null) {
            return null;
        }
        return bbyVar.d();
    }

    public List<IDMComponent> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("19a221c7", new Object[]{this});
        }
        bby bbyVar = this.h;
        if (bbyVar == null) {
            return null;
        }
        return bbyVar.f();
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public void a(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e200989a", new Object[]{this, bmiVar});
            return;
        }
        if (f()) {
            b(this.i.e());
        }
        super.a(bmiVar);
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        super.b(i);
        if (!f() || !v()) {
            return;
        }
        g();
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!dcn.a()) {
        } else {
            this.c.f(DXWidgetNode.DXMeasureSpec.a(i2, 1073741824));
            super.b(i);
            if (!f()) {
                return;
            }
            i();
        }
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else if (iDMComponent == null) {
        } else {
            String position = iDMComponent.getPosition();
            if ("header".equals(position)) {
                this.c.b(1);
            } else if ("footer".equals(position)) {
                this.c.b(4);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iDMComponent);
                this.c.a(arrayList);
            }
        }
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        bby bbyVar = this.h;
        return bbyVar != null && bbyVar.b();
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        bby bbyVar = this.h;
        if (bbyVar == null) {
            return;
        }
        bbyVar.a(127);
    }

    private void b(String str) {
        List<IDMComponent> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && v() && (a2 = this.i.w().a(str)) != null) {
            for (IDMComponent iDMComponent : a2) {
                iDMComponent.getFields().remove("cornerType");
            }
            ((b) this.m.H()).t().a(a2);
            ArrayList arrayList = new ArrayList();
            for (IDMComponent iDMComponent2 : a2) {
                c.a(iDMComponent2, arrayList);
            }
            a((List<IDMComponent>) arrayList);
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        bby bbyVar = this.h;
        return bbyVar != null && bbyVar.c();
    }

    public void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        bby bbyVar = this.h;
        if (bbyVar == null || !bbyVar.b()) {
            return;
        }
        Pair<Integer, List<IDMComponent>> d = d(list);
        if (d != null) {
            list.addAll(((Integer) d.first).intValue(), (Collection) d.second);
        }
        this.h.a(list);
        this.h.a(e(list));
        bec.a(this.i.w(), this.i.e(), list);
        this.h.a(127);
    }

    public void b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            Iterator<IDMComponent> it = list.iterator();
            while (it.hasNext()) {
                IDMComponent next = it.next();
                if (next != null) {
                    String position = next.getPosition();
                    if (!"footer".equals(position) && !"header".equals(position)) {
                        it.remove();
                        z = true;
                    }
                }
            }
            if (!z) {
                return;
            }
            if (f()) {
                i();
            } else {
                b(127);
            }
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        bby bbyVar = this.h;
        if (bbyVar == null) {
            return;
        }
        if (z) {
            bbyVar.g();
        }
        TUrlImageView h = this.h.h();
        if (h == null) {
            return;
        }
        if (z) {
            b(this.h.f());
            h.setVisibility(0);
            return;
        }
        h.setVisibility(8);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        bby bbyVar = this.h;
        if (bbyVar == null) {
            return;
        }
        a((List<IDMComponent>) new ArrayList(bbyVar.f()));
    }

    private Pair<Integer, List<IDMComponent>> d(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8119bd26", new Object[]{this, list});
        }
        bdu a2 = bdv.a(this.m, this.i.e());
        if (a2 == null) {
            return null;
        }
        return a2.b(list);
    }

    private bnv e(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnv) ipChange.ipc$dispatch("bd9dfc1f", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (list != null) {
            for (IDMComponent iDMComponent : list) {
                String b = com.taobao.android.ultron.datamodel.imp.f.b(iDMComponent);
                if ("footer".equals(b)) {
                    arrayList.add(iDMComponent);
                } else if ("header".equals(b)) {
                    arrayList3.add(iDMComponent);
                } else {
                    arrayList2.add(iDMComponent);
                }
            }
        }
        bnv bnvVar = new bnv();
        bnvVar.b(arrayList2);
        bnvVar.a(arrayList3);
        bnvVar.e(arrayList);
        return bnvVar;
    }

    private f a(CartOpenPopupWindowEventModel cartOpenPopupWindowEventModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("9ecfc821", new Object[]{this, cartOpenPopupWindowEventModel});
        }
        f fVar = new f();
        fVar.l = this.n;
        fVar.a(-1);
        CartOpenPopupWindowEventModel.Css css = cartOpenPopupWindowEventModel.getCss();
        if (css != null) {
            try {
                fVar.a(Float.parseFloat(css.getHeight()));
                fVar.c(Color.parseColor(css.getWindowColor()));
                fVar.a(css.getThemeUrl());
            } catch (Exception unused) {
            }
        } else {
            fVar.a(0.6f);
        }
        CartOpenPopupWindowEventModel.Options options = cartOpenPopupWindowEventModel.getOptions();
        if (options != null) {
            if ("true".equals(options.getNeedCloseButton())) {
                fVar.a(this.f2672a.getResources().getDrawable(R.drawable.popup_close_btn));
            }
        } else {
            fVar.a(this.f2672a.getResources().getDrawable(R.drawable.popup_close_btn));
        }
        fVar.b(80);
        if (css != null && "0".equals(css.getRadius())) {
            fVar.b(0.0f);
        } else {
            fVar.b(gbg.a((Context) this.f2672a, 12.0f));
        }
        fVar.a(cartOpenPopupWindowEventModel.isFilterPopLayer());
        return fVar;
    }

    private boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue();
        }
        return this.i.d() || (this.i.e() == null ? "" : this.i.e()).contains("cartCalculateGlobal") || this.i.o().a();
    }
}
