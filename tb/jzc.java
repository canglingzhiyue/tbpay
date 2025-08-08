package tb;

import android.app.Activity;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.android.xsearchplugin.weex.weex.c;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.android.xsearchplugin.weex.weex.h;
import com.taobao.android.xsearchplugin.weex.weex.i;
import com.taobao.taolive.room.utils.aw;
import com.taobao.weex.WXSDKInstance;
import java.util.HashMap;
import java.util.Map;
import tb.iru;
import tb.isr;

/* loaded from: classes6.dex */
public class jzc<MODEL extends iru<? extends a<? extends BaseSearchResult, ?>>> extends jzd<WeexCellBean, MODEL> implements h, irw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int l;
    private String m;

    static {
        kge.a(-2069657191);
        kge.a(1609693765);
        kge.a(502437767);
    }

    public static /* synthetic */ Object ipc$super(jzc jzcVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1578221821) {
            super.b((d) objArr[0]);
            return null;
        } else if (hashCode != 1583554882) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((d) objArr[0]);
            return null;
        }
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "BaseSrpListWeexCellView";
    }

    public void a(Map<String, Object> map, WeexCellBean weexCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87011aae", new Object[]{this, map, weexCellBean});
        }
    }

    @Override // tb.irw
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.jzd
    public /* synthetic */ WeexBean d(WeexCellBean weexCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexBean) ipChange.ipc$dispatch("bd8ddc02", new Object[]{this, weexCellBean}) : a(weexCellBean);
    }

    public jzc(Activity activity, MODEL model, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, iumVar, listStyle, viewGroup, i, model);
        this.l = 0;
        this.m = "";
        E();
    }

    public jzc(Activity activity, View view, ium iumVar, ListStyle listStyle, int i, MODEL model) {
        super(activity, view, iumVar, listStyle, i, model);
        this.l = 0;
        this.m = "";
        E();
    }

    @Override // tb.jzd
    public boolean a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b84a969", new Object[]{this, listStyle})).booleanValue() : listStyle == ListStyle.LIST || (l() != null && (l().isSection || l().isFullspan || l().comboFullSpan));
    }

    @Override // tb.jzd
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            view.setBackgroundColor(-1184275);
        }
    }

    @Override // tb.jzd
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        c cVar = new c(getActivity(), v(), (iru) j(), this, this);
        cVar.a(this);
        a((com.taobao.android.xsearchplugin.weex.weex.a) cVar);
    }

    @Override // tb.jzd
    public int a(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ce43e6e", new Object[]{this, weexBean})).intValue();
        }
        int cachedHeight = weexBean.getCachedHeight(ListStyle.LIST);
        return cachedHeight > 0 ? cachedHeight : v().c().h().f29270a;
    }

    @Override // tb.jzd
    public int b(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d9a0b2f", new Object[]{this, weexBean})).intValue();
        }
        int cachedHeight = weexBean.getCachedHeight(ListStyle.WATERFALL);
        return cachedHeight > 0 ? cachedHeight : v().c().h().b;
    }

    public WeexBean a(WeexCellBean weexCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexBean) ipChange.ipc$dispatch("cb226410", new Object[]{this, weexCellBean}) : weexCellBean.mWeexBean;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.jzd
    public Map<String, Object> a(WeexCellBean weexCellBean, int i, boolean z, ListStyle listStyle) {
        float pageColumn;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("31839458", new Object[]{this, weexCellBean, new Integer(i), new Boolean(z), listStyle});
        }
        if (z) {
            pageColumn = imk.c;
        } else {
            pageColumn = (imk.c - (this.d << 1)) / ((iru) j()).d().getPageColumn();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(j.c(pageColumn)));
        hashMap.put(rrv.PAGE_NUMBER, Integer.valueOf(weexCellBean.pageNo));
        hashMap.put("layoutStyle", Integer.valueOf(ListStyle.toNum(listStyle)));
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("keyword", ((iru) j()).d().getKeyword());
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, weexCellBean.rn);
        hashMap.put("bucketId", weexCellBean.abtest);
        hashMap.put("pageType", weexCellBean.pageType);
        hashMap.put(TBSearchChiTuJSBridge.ABTEST, weexCellBean.abtest);
        if (((iru) j()).d().getExtraStatus() != null) {
            for (String str : ((iru) j()).d().getExtraStatus().keySet()) {
                hashMap.put(str, ((iru) j()).d().getExtraStatus().get(str));
            }
        }
        WeexBean weexBean = weexCellBean.mWeexBean;
        if (weexBean.pageInfoExtraStatus != null) {
            hashMap.put("pageInfo", weexBean.pageInfoExtraStatus);
        }
        a(hashMap, weexCellBean);
        if (weexCellBean.extraStatus != null) {
            hashMap.putAll(weexCellBean.extraStatus);
        }
        if (weexCellBean.extraStatus != null && weexCellBean.extraStatus.containsKey("layoutStyle")) {
            try {
                String valueOf = String.valueOf(weexCellBean.extraStatus.get("layoutStyle"));
                if (!StringUtils.equals(valueOf, this.m)) {
                    this.l = 0;
                    a(this.itemView, ListStyle.fromNumString(valueOf));
                }
                this.m = valueOf;
                hashMap.put("containerWidth", a(this.itemView, ListStyle.fromNumString(valueOf), false));
            } catch (Exception unused) {
                hashMap.put("containerWidth", F());
            }
        } else {
            hashMap.put("containerWidth", F());
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(weexCellBean.mStorage);
        hashMap2.put(i.INDEX_KEY, Integer.valueOf(i));
        HashMap hashMap3 = new HashMap();
        if (weexBean != null) {
            hashMap3.put("__nxType__", weexBean.type);
            hashMap3.put("model", weexBean.model);
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
        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(a(listStyle));
    }

    public String F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fdc3673", new Object[]{this}) : a(this.itemView, u(), true);
    }

    public String a(View view, ListStyle listStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("febd68af", new Object[]{this, view, listStyle, new Boolean(z)});
        }
        if (this.l == 0) {
            if (view.getMeasuredWidth() > 0 && z) {
                this.l = view.getMeasuredWidth();
            } else if (getParent() instanceof iny) {
                RecyclerView B = ((iny) getParent()).B();
                Rect rect = new Rect();
                try {
                    RecyclerView.ItemDecoration a2 = com.taobao.android.xsearchplugin.muise.c.a(B);
                    if (a2 != null && !z) {
                        a2.getItemOffsets(rect, view, B, null);
                    } else {
                        B.getLayoutManager().calculateItemDecorationsForChild(view, rect);
                    }
                } catch (Exception unused) {
                    v().b().b("BaseSrpListWeexCellView", "Exception while getting ContainerWidth, please override getItemOffset in your Decoration, don't call super.getItemOffset");
                    rect.set(0, 0, 0, 0);
                }
                if (a(listStyle)) {
                    this.l = (B.getMeasuredWidth() - (rect.left + rect.right)) - (B.getPaddingRight() + B.getPaddingLeft());
                } else {
                    this.l = ((B.getMeasuredWidth() - ((rect.left + rect.right) << 1)) - (B.getPaddingRight() + B.getPaddingLeft())) / 2;
                }
            } else {
                v().b().b("BaseSrpListWeexCellView", "Parent Is Not BaseListWidget");
                this.l = imk.c;
            }
        }
        return String.valueOf(iuc.a(this.l));
    }

    @Override // tb.jzd, com.taobao.android.xsearchplugin.weex.weex.a.InterfaceC0626a
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e632142", new Object[]{this, dVar});
            return;
        }
        super.a(dVar);
        if (!this.h || !(getParent() instanceof iny)) {
            return;
        }
        ((iny) getParent()).a((irw) this, m());
    }

    @Override // tb.jzd, com.taobao.android.xsearchplugin.weex.weex.a.InterfaceC0626a
    public void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ee3f03", new Object[]{this, dVar});
            return;
        }
        super.b(dVar);
        if (!this.h || !(getParent() instanceof iny)) {
            return;
        }
        ((iny) getParent()).a((irw) this, m());
    }

    @Override // tb.irw
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        WXSDKInstance c = this.f29876a.c();
        if (c == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", "play");
        c.a("videoStatus", (Map<String, Object>) hashMap);
    }

    @Override // tb.irw
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        WXSDKInstance c = this.f29876a.c();
        if (c == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", "stop");
        c.a("videoStatus", (Map<String, Object>) hashMap);
    }

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

    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -725085627) {
            if (hashCode == 914742642 && str.equals("updateStorage")) {
                c = 0;
            }
        } else if (str.equals("requestLostFocus")) {
            c = 1;
        }
        if (c == 0) {
            i.a(((iru) j()).d(), jSONObject);
            return true;
        } else if (c != 1) {
            return false;
        } else {
            ioc.a(aVar);
            return true;
        }
    }

    private a O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3cd9f021", new Object[]{this});
        }
        if (j() != 0) {
            return ((iru) j()).d();
        }
        return null;
    }

    @Override // tb.jzd
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else if (l() == null || !(l() instanceof WeexCellBean) || !(O() instanceof XslDatasource)) {
        } else {
            postEvent(iso.a(((XslDatasource) O()).getCurrentTabIndex(), m()));
        }
    }

    @Override // tb.jzd
    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else if (l() == null || !(l() instanceof WeexCellBean) || !(O() instanceof XslDatasource)) {
        } else {
            postEvent(iso.b(((XslDatasource) O()).getCurrentTabIndex(), m()));
        }
    }
}
