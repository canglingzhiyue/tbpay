package com.taobao.android.xsearchplugin.muise;

import android.app.Activity;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.xsearchplugin.weex.weex.i;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.imk;
import tb.iny;
import tb.ioc;
import tb.iru;
import tb.irw;
import tb.isr;
import tb.ium;
import tb.kge;
import tb.rrv;

/* loaded from: classes6.dex */
public class c<MODEL extends iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>>> extends b<MuiseCellBean, MODEL> implements p.a, l, com.taobao.android.xsearchplugin.weex.weex.h, irw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CLOSE_PRE_FILTER = "closePreFilterPanel";
    private Map<String, String> m;
    private String n;
    private MuiseCellBean o;

    static {
        kge.a(-2088780022);
        kge.a(1609693765);
        kge.a(502437767);
        kge.a(-1409480824);
        kge.a(1988455501);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -747638089:
                super.a(((Number) objArr[0]).intValue(), (int) objArr[1]);
                return null;
            case -163815660:
                super.onRefreshFailed((com.taobao.android.weex_framework.p) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 66974264:
                super.onRenderSuccess((com.taobao.android.weex_framework.p) objArr[0]);
                return null;
            case 71597779:
                super.L();
                return null;
            case 1112741915:
                super.onRenderFailed((com.taobao.android.weex_framework.p) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 2011666273:
                return super.j();
            case 2094523359:
                super.onRefreshSuccess((com.taobao.android.weex_framework.p) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "BaseSrpListMuiseCellView";
    }

    public void a(Map<String, Object> map, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cef3c8a", new Object[]{this, map, muiseCellBean});
        }
    }

    @Override // tb.irw
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.xsearchplugin.muise.l
    public /* synthetic */ iru S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iru) ipChange.ipc$dispatch("a34f0f00", new Object[]{this}) : (iru) super.j();
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ boolean d(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84b9de0b", new Object[]{this, muiseCellBean})).booleanValue() : a(muiseCellBean);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ MuiseBean e(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MuiseBean) ipChange.ipc$dispatch("7f384101", new Object[]{this, muiseCellBean}) : c(muiseCellBean);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ void f(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191d1089", new Object[]{this, muiseCellBean});
        } else {
            b(muiseCellBean);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ void g(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634ea9ca", new Object[]{this, muiseCellBean});
        } else {
            d2(muiseCellBean);
        }
    }

    public c(Activity activity, MODEL model, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, iumVar, listStyle, viewGroup, i, model);
        this.m = new HashMap();
        this.n = "";
        E();
        this.f16257a.a((k) this);
    }

    public c(Activity activity, View view, ium iumVar, ListStyle listStyle, int i, MODEL model) {
        super(activity, view, iumVar, listStyle, i, model);
        this.m = new HashMap();
        this.n = "";
        E();
        this.f16257a.a((k) this);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        Integer aw = ((iru) j()).a().aw();
        if (aw != null) {
            view.setBackgroundColor(aw.intValue());
        } else {
            view.setBackgroundColor(v().c().h().c);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        m mVar = new m(getActivity(), v(), (iru) j(), this, this);
        mVar.a((l) this);
        a((a) mVar);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public int a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b508794", new Object[]{this, muiseBean})).intValue();
        }
        int cachedHeight = muiseBean.getCachedHeight(ListStyle.LIST);
        return cachedHeight > 0 ? cachedHeight : v().c().h().f29270a;
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public int b(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("115452f3", new Object[]{this, muiseBean})).intValue();
        }
        int cachedHeight = muiseBean.getCachedHeight(ListStyle.WATERFALL);
        return cachedHeight > 0 ? cachedHeight : v().c().h().b;
    }

    @Override // com.taobao.android.xsearchplugin.muise.b, tb.itd
    public void a(int i, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709344c", new Object[]{this, new Integer(i), muiseCellBean});
            return;
        }
        muiseCellBean.requestLayout = true;
        super.a(i, (int) muiseCellBean);
    }

    public boolean a(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("58213763", new Object[]{this, muiseCellBean})).booleanValue() : muiseCellBean != null && (muiseCellBean.mStorageUpdated || muiseCellBean.forceUpdate);
    }

    public void b(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6823b3e", new Object[]{this, muiseCellBean});
            return;
        }
        muiseCellBean.mStorageUpdated = false;
        muiseCellBean.forceUpdate = false;
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public boolean a(ListStyle listStyle, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18737846", new Object[]{this, listStyle, muiseCellBean})).booleanValue() : listStyle == ListStyle.LIST || (muiseCellBean != null && (muiseCellBean.isSection || muiseCellBean.isFullspan || muiseCellBean.comboFullSpan || (muiseCellBean.combo != null && muiseCellBean.combo.n() == ListStyle.LIST)));
    }

    public MuiseBean c(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MuiseBean) ipChange.ipc$dispatch("775fb716", new Object[]{this, muiseCellBean}) : muiseCellBean.mMuiseBean;
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public Map<String, Object> a(MuiseCellBean muiseCellBean, int i, boolean z, ListStyle listStyle) {
        float pageColumn;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6420472", new Object[]{this, muiseCellBean, new Integer(i), new Boolean(z), listStyle});
        }
        if (z) {
            pageColumn = imk.c;
        } else {
            pageColumn = (imk.c - (this.d << 1)) / ((iru) j()).d().getPageColumn();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(com.taobao.android.searchbaseframe.util.j.c(pageColumn)));
        hashMap.put(rrv.PAGE_NUMBER, Integer.valueOf(muiseCellBean.pageNo));
        hashMap.put("page", Integer.valueOf(muiseCellBean.pageNo));
        hashMap.put("layoutStyle", Integer.valueOf(ListStyle.toNum(listStyle)));
        hashMap.put("listLayoutStyle", Integer.valueOf(ListStyle.toNum(listStyle)));
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("keyword", ((iru) j()).d().getKeyword());
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, muiseCellBean.rn);
        hashMap.put("bucketId", muiseCellBean.abtest);
        hashMap.put("pageType", muiseCellBean.pageType);
        hashMap.put(TBSearchChiTuJSBridge.ABTEST, muiseCellBean.abtest);
        if (((iru) j()).d().getExtraStatus() != null) {
            for (String str : ((iru) j()).d().getExtraStatus().keySet()) {
                hashMap.put(str, ((iru) j()).d().getExtraStatus().get(str));
            }
        }
        MuiseBean muiseBean = muiseCellBean.mMuiseBean;
        if (muiseBean.pageInfoExtraStatus != null) {
            hashMap.put("pageInfo", muiseBean.pageInfoExtraStatus);
        }
        a(hashMap, muiseCellBean);
        try {
            if (muiseCellBean.extraStatus != null) {
                hashMap.putAll(muiseCellBean.extraStatus);
            }
        } catch (Exception unused) {
        }
        if (muiseCellBean.extraStatus != null && muiseCellBean.extraStatus.containsKey("layoutStyle")) {
            try {
                String valueOf = String.valueOf(muiseCellBean.extraStatus.get("layoutStyle"));
                if (!TextUtils.equals(valueOf, this.n)) {
                    this.w = 0;
                    a(this.itemView, ListStyle.fromNumString(valueOf));
                }
                this.n = valueOf;
                hashMap.put("containerWidth", a(this.itemView, ListStyle.fromNumString(valueOf), false));
            } catch (Exception unused2) {
                hashMap.put("containerWidth", R());
            }
        } else {
            hashMap.put("containerWidth", R());
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(muiseCellBean.mStorage);
        hashMap2.put(i.INDEX_KEY, Integer.valueOf(muiseCellBean.beanId));
        HashMap hashMap3 = new HashMap();
        if (muiseBean != null) {
            hashMap3.put("__nxType__", muiseBean.type);
            hashMap3.put("model", muiseBean.model);
            hashMap3.put("status", hashMap);
            hashMap3.put(WXStorageModule.NAME, hashMap2);
        }
        return hashMap3;
    }

    private void a(View view, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61430723", new Object[]{this, view, listStyle});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(a(listStyle, l()));
    }

    public String R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ce20f5e7", new Object[]{this}) : a(this.itemView, u(), true);
    }

    public static RecyclerView.ItemDecoration a(RecyclerView recyclerView) {
        RecyclerView.ItemDecoration itemDecorationAt;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("49637921", new Object[]{recyclerView});
        }
        do {
            itemDecorationAt = recyclerView.getItemDecorationAt(i);
            i++;
            if (itemDecorationAt == null) {
                return null;
            }
        } while (itemDecorationAt instanceof com.taobao.android.searchbaseframe.xsl.section.b);
        return itemDecorationAt;
    }

    public String a(View view, ListStyle listStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("febd68af", new Object[]{this, view, listStyle, new Boolean(z)});
        }
        if (this.w == 0 || (view.getMeasuredWidth() > 0 && this.w != view.getMeasuredWidth())) {
            if (view.getMeasuredWidth() > 0 && z) {
                this.w = view.getMeasuredWidth();
            } else if (getParent() instanceof iny) {
                RecyclerView B = ((iny) getParent()).B();
                Rect rect = new Rect();
                try {
                    RecyclerView.ItemDecoration a2 = a(B);
                    if (a2 != null && !z) {
                        a2.getItemOffsets(rect, view, B, null);
                    } else {
                        B.getLayoutManager().calculateItemDecorationsForChild(view, rect);
                    }
                } catch (Exception unused) {
                    v().b().b("BaseSrpListMuiseCellView", "Exception while getting ContainerWidth, please override getItemOffset in your Decoration, don't call super.getItemOffset");
                    rect.set(0, 0, 0, 0);
                }
                if (a(listStyle, l())) {
                    this.w = (B.getMeasuredWidth() - (rect.left + rect.right)) - (B.getPaddingRight() + B.getPaddingLeft());
                } else {
                    int spanCount = ((StaggeredGridLayoutManager) B.getLayoutManager()).getSpanCount();
                    this.w = ((B.getMeasuredWidth() - ((rect.left + rect.right) * spanCount)) - (B.getPaddingRight() + B.getPaddingLeft())) / spanCount;
                    com.taobao.android.searchbaseframe.util.k.d("ms.containerWidth", "rvWidth:" + B.getMeasuredWidth() + ",spanCount:" + spanCount + ", rvPadding:" + B.getPaddingRight() + "," + B.getPaddingLeft(), new Object[0]);
                }
            } else {
                v().b().b("BaseSrpListMuiseCellView", "Parent Is Not BaseListWidget");
                this.w = imk.c;
            }
        }
        com.taobao.android.searchbaseframe.util.k.d("ms.containerWidth", "width:" + this.w + ", useViewWidth:" + z, new Object[0]);
        return String.valueOf(com.taobao.android.searchbaseframe.util.j.d(this.w));
    }

    @Override // com.taobao.android.xsearchplugin.muise.k
    public void a(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
            return;
        }
        pVar.registerNativeEventCallback("videocallback", this);
        if (this.m.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : this.m.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            pVar.updateNativeState(key, value);
            b(pVar, key, value);
        }
        this.m.clear();
    }

    @Override // com.taobao.android.xsearchplugin.muise.b, com.taobao.android.weex_framework.g
    public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        super.onRenderSuccess(pVar);
        this.o.layoutCalcDone = true;
        T();
    }

    @Override // com.taobao.android.xsearchplugin.muise.b, com.taobao.android.weex_framework.g
    public void onRenderFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        super.onRenderFailed(pVar, i, str, z);
        this.o.layoutCalcDone = true;
    }

    @Override // com.taobao.android.xsearchplugin.muise.b, com.taobao.android.weex_framework.g
    public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        super.onRefreshSuccess(pVar);
        this.o.layoutCalcDone = true;
        T();
    }

    @Override // com.taobao.android.xsearchplugin.muise.b, com.taobao.android.weex_framework.g
    public void onRefreshFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        super.onRefreshFailed(pVar, i, str, z);
        this.o.layoutCalcDone = true;
    }

    /* renamed from: d  reason: avoid collision after fix types in other method */
    public void d2(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34442fc", new Object[]{this, muiseCellBean});
            return;
        }
        this.o = muiseCellBean;
        muiseCellBean.invisibleCell = false;
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        super.L();
        MuiseCellBean muiseCellBean = this.o;
        muiseCellBean.layoutCalcDone = true;
        muiseCellBean.invisibleCell = true;
    }

    @Override // tb.irw
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a("videostatus", "play");
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        com.taobao.android.weex_framework.p e = this.f16257a.e();
        if (e != null) {
            e.updateNativeState(str, str2);
            b(e, str, str2);
            return;
        }
        this.m.put(str, str2);
    }

    public void b(com.taobao.android.weex_framework.p pVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27184d58", new Object[]{this, pVar, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, (Object) str2);
        pVar.sendInstanceMessage("MUISE", "nativestatus", jSONObject);
    }

    @Override // tb.irw
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a("videostatus", "stop");
        }
    }

    @Override // tb.irw
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : l() != null && l().videoPlayable;
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        postEvent(isr.c.a(str, jSONObject, aVar, aVar2));
        return true;
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -725085627) {
            if (hashCode != 914742642) {
                if (hashCode == 980325089 && str.equals(ACTION_CLOSE_PRE_FILTER)) {
                    c = 2;
                }
            } else if (str.equals("updateStorage")) {
                c = 0;
            }
        } else if (str.equals("requestLostFocus")) {
            c = 1;
        }
        if (c == 0) {
            i.b(((iru) j()).d(), jSONObject);
            return true;
        } else if (c == 1) {
            ioc.a(aVar);
            return true;
        } else if (c != 2) {
            return false;
        } else {
            this.f16257a.e().fireNativeEvent(ACTION_CLOSE_PRE_FILTER, "");
            return true;
        }
    }

    @Override // com.taobao.android.weex_framework.p.a
    public void onNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d43f7f", new Object[]{this, str, str2});
        } else if (!"videocallback".equals(str)) {
        } else {
            b(str2);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        iny inyVar = getParent() instanceof iny ? (iny) getParent() : null;
        if (inyVar == null) {
            return;
        }
        if (TextUtils.equals(str, "finish")) {
            inyVar.b((irw) this, m());
        } else if (!TextUtils.equals(str, "start")) {
        } else {
            inyVar.c(this, m());
        }
    }

    private void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
            return;
        }
        iny inyVar = getParent() instanceof iny ? (iny) getParent() : null;
        if (inyVar == null) {
            return;
        }
        inyVar.D();
    }
}
