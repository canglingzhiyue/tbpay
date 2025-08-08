package com.taobao.android.xsearchplugin.muise;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.DebugFrameLayout;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.iob;
import tb.ioc;
import tb.iru;
import tb.isr;
import tb.isu;
import tb.itm;
import tb.itn;
import tb.itu;
import tb.ium;
import tb.iur;
import tb.kge;

/* loaded from: classes6.dex */
public class o extends itn implements com.taobao.android.searchbaseframe.uikit.screentype.a, com.taobao.android.weex_framework.g, com.taobao.android.xsearchplugin.weex.weex.h, itm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_WIDGET_BIND = "widget_bind";
    public boolean G;

    /* renamed from: a  reason: collision with root package name */
    public a f16263a;
    private final TemplateBean b;
    private h c;
    private MuiseBean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private JSONObject i;
    private final iob j;
    private Handler k;
    private boolean l;
    private boolean m;
    private i n;
    public int o;

    static {
        kge.a(666148478);
        kge.a(-311268728);
        kge.a(-1977052299);
        kge.a(248725262);
        kge.a(502437767);
        kge.a(1735786321);
        kge.a(-1327398134);
    }

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1743784140:
                return super.dumpDebugInfo();
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            case 1085853301:
                return super.obtainRootView();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf6d521", new Object[]{this, aVar});
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "MuiseModWidget";
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    public static /* synthetic */ boolean a(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbfd3257", new Object[]{oVar})).booleanValue() : oVar.h;
    }

    public static /* synthetic */ boolean a(o oVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3a9cae5", new Object[]{oVar, new Boolean(z)})).booleanValue();
        }
        oVar.m = z;
        return z;
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((MuiseBean) obj);
        }
    }

    @Override // tb.ius, tb.iup
    public /* synthetic */ View obtainRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("40b8ce75", new Object[]{this}) : m();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : s();
    }

    public o(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, TemplateBean templateBean, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
        this.h = true;
        this.k = new Handler(Looper.getMainLooper());
        this.l = false;
        this.m = false;
        this.G = false;
        this.n = new i() { // from class: com.taobao.android.xsearchplugin.muise.o.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (o.this.f16263a == null) {
                } else {
                    o.a(o.this, true);
                    if (o.this.f16263a.e() != null && o.a(o.this)) {
                        o.this.f16263a.e().updateNativeState("visibility", "appear");
                    }
                    o.this.f16263a.j();
                }
            }
        };
        this.b = templateBean;
        ensureView();
        this.j = (iob) findParentOfClass(iob.class);
        subscribeScopeEvent(this, "childPageWidget");
        ScreenType a2 = ScreenType.a(activity);
        if (a2 != null) {
            a2.a(this);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.android.xsearchplugin.muise.o.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    int i9 = i3 - i;
                    if (i9 == 0) {
                        return;
                    }
                    int i10 = i7 - i5;
                    o oVar = o.this;
                    oVar.o = i9;
                    if (i10 == i9 || i10 == 0) {
                        return;
                    }
                    oVar.n();
                }
            });
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfa03ba", new Object[]{this, hVar});
            return;
        }
        this.c = hVar;
        if (this.e) {
            hVar.a(this.f16263a.e());
        } else if (!this.f) {
        } else {
            hVar.a();
        }
    }

    public void a(String str, JSONObject jSONObject) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (!this.e || (aVar = this.f16263a) == null || aVar.e() == null) {
        } else {
            this.f16263a.e().sendInstanceMessage("MUISE", str, jSONObject);
        }
    }

    public void a(com.taobao.android.xsearchplugin.weex.weex.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e64f2be", new Object[]{this, hVar});
        } else {
            this.f16263a.a(hVar);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        a aVar = this.f16263a;
        if (aVar == null || aVar.e() == null) {
            return;
        }
        this.f16263a.e().addInstanceEnv(str, str2);
    }

    public void a(MuiseBean muiseBean) {
        boolean b;
        iob iobVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5087a1", new Object[]{this, muiseBean});
        } else if (muiseBean == null) {
            c().b().b("MuiseModWidget", "bean is null");
        } else {
            boolean z = this.d != null && !StringUtils.equals(muiseBean.type, this.d.type);
            this.d = muiseBean;
            a aVar = this.f16263a;
            if (aVar != null && z) {
                aVar.g();
            }
            this.e = false;
            this.f = false;
            Map<String, Object> c = c(muiseBean);
            if (c().a().c()) {
                this.i = c().e().b(c);
            }
            if (this.f16263a == null) {
                c().b().c("MuiseModWidget", "render weex cell: %s", muiseBean);
                this.f16263a = p();
                this.f16263a.a(false);
                a(this.f16263a);
                com.taobao.android.searchbaseframe.util.k.d("[XS.render]", "[Muise render] Start, tItemType: %s, index: -1", muiseBean.type);
                b = this.f16263a.a(muiseBean, c);
                if (b && (iobVar = this.j) != null) {
                    iobVar.E();
                }
            } else {
                c().b().c("MuiseModWidget", "refresh weex cell: %s", muiseBean);
                com.taobao.android.searchbaseframe.util.k.d("[XS.render]", "[Muise refresh] Start, tItemType: %s, index: -1", muiseBean.type);
                b = this.f16263a.b(muiseBean, c);
                a(EVENT_WIDGET_BIND);
            }
            int b2 = b(muiseBean);
            if (b) {
                if (b2 <= 0) {
                    return;
                }
                ((FrameLayout) getView()).getLayoutParams().height = b2;
                ((FrameLayout) getView()).setLayoutParams(((FrameLayout) getView()).getLayoutParams());
                return;
            }
            a(this.f16263a.e(), "template err", "template or data illegal");
            com.taobao.android.searchbaseframe.util.k b3 = c().b();
            b3.b("MuiseModWidget", "render failed:" + muiseBean);
        }
    }

    public int b(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("115452f3", new Object[]{this, muiseBean})).intValue();
        }
        if (muiseBean == null) {
            c().b().b("MuiseModWidget", "obtainFixHeightFromTemplate:weex bean is null");
            return 0;
        }
        TemplateBean a2 = this.f16263a.a(muiseBean);
        if (a2 == null) {
            c().b().b("MuiseModWidget", "obtainFixHeightFromTemplate:template is null");
            return 0;
        }
        return a2.listHeight;
    }

    public a p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("974ee138", new Object[]{this}) : new p(this.mActivity, c(), this, this, this.b, getModel());
    }

    public Map<String, Object> c(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e1ea1e54", new Object[]{this, muiseBean});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, muiseBean.rn);
        hashMap.put("bucketId", muiseBean.abtest);
        hashMap.put("pageType", muiseBean.pageType);
        hashMap.put(TBSearchChiTuJSBridge.ABTEST, muiseBean.abtest);
        hashMap.put("containerWidth", e());
        hashMap.put("keyword", getModel().d().getKeyword());
        JSONObject extraStatus = getModel().d().getExtraStatus();
        if (extraStatus != null) {
            for (String str : extraStatus.keySet()) {
                hashMap.put(str, extraStatus.get(str));
            }
        }
        if (muiseBean.pageInfoExtraStatus != null) {
            hashMap.put("pageInfo", muiseBean.pageInfoExtraStatus);
        }
        a(hashMap);
        hashMap.putAll(muiseBean.extraStatus);
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(muiseBean.mStorage);
        hashMap2.put(com.taobao.android.xsearchplugin.weex.weex.i.INDEX_KEY, "mod");
        HashMap hashMap3 = new HashMap();
        if (muiseBean != null) {
            hashMap3.put("__nxType__", muiseBean.type);
            hashMap3.put("model", muiseBean.model);
            hashMap3.put("status", hashMap);
            hashMap3.put(WXStorageModule.NAME, hashMap2);
        }
        return hashMap3;
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (this.o == 0) {
            this.o = ((FrameLayout) getView()).getMeasuredWidth();
        }
        if (this.o == 0) {
            ViewParent parent = ((FrameLayout) getView()).getParent();
            while (true) {
                if (parent == null) {
                    break;
                } else if (parent instanceof ViewGroup) {
                    int width = ((ViewGroup) parent).getWidth();
                    if (width > 0) {
                        this.o = width;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        }
        if (this.o == 0) {
            this.o = getActivity().getWindow().getDecorView().getMeasuredWidth();
        }
        return String.valueOf(com.taobao.android.searchbaseframe.util.j.d(this.o));
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (!this.F) {
        } else {
            ((FrameLayout) getView()).getLayoutParams().height = -2;
            ((FrameLayout) getView()).setLayoutParams(((FrameLayout) getView()).getLayoutParams());
        }
    }

    public TemplateBean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("6b0bb577", new Object[]{this}) : this.b;
    }

    public FrameLayout s() {
        DebugFrameLayout debugFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d9f7991f", new Object[]{this});
        }
        if (c().a().c()) {
            DebugFrameLayout debugFrameLayout2 = new DebugFrameLayout(getActivity());
            debugFrameLayout2.setDebugClickListener(new DebugFrameLayout.a() { // from class: com.taobao.android.xsearchplugin.muise.o.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.uikit.DebugFrameLayout.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    o oVar = o.this;
                    oVar.postEvent(new com.taobao.android.xsearchplugin.debugger.protocal.b(oVar));
                }
            });
            debugFrameLayout = debugFrameLayout2;
        } else {
            debugFrameLayout = new FrameLayout(getActivity());
        }
        debugFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return debugFrameLayout;
    }

    public FrameLayout m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("a8d619e5", new Object[]{this});
        }
        FrameLayout frameLayout = (FrameLayout) super.obtainRootView();
        a(frameLayout);
        return frameLayout;
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        a aVar = this.f16263a;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        a aVar = this.f16263a;
        if (aVar != null) {
            aVar.g();
        }
        ScreenType a2 = ScreenType.a(this.mActivity);
        if (a2 == null) {
            return;
        }
        a2.b(this);
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        a aVar = this.f16263a;
        if (aVar == null) {
            return;
        }
        aVar.i();
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        a aVar = this.f16263a;
        if (aVar == null) {
            return;
        }
        aVar.h();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        h hVar = this.c;
        if (hVar != null) {
            hVar.a(pVar);
        }
        iob iobVar = this.j;
        if (iobVar != null) {
            iobVar.F();
        }
        this.e = true;
        if (this.F) {
            this.f16263a.a((ViewGroup) getView(), pVar, false);
        } else {
            this.f16263a.a((ViewGroup) getView(), pVar, false, -1, -1);
        }
        a();
        q();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        h hVar = this.c;
        if (hVar != null) {
            hVar.a();
        }
        iob iobVar = this.j;
        if (iobVar != null) {
            iobVar.F();
        }
        a(pVar, String.valueOf(i), str);
        this.f = true;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        this.e = true;
        if (pVar.getRenderRoot().getParent() == null) {
            if (this.F) {
                this.f16263a.a((ViewGroup) getView(), pVar, false);
            } else {
                this.f16263a.a((ViewGroup) getView(), pVar, false, -1, -1);
            }
        }
        a();
        q();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        } else {
            a(pVar, String.valueOf(i), str);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
        } else {
            a(pVar, String.valueOf(i), str);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
        } else {
            a(pVar, String.valueOf(i), str);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        } else {
            unsubscribeScopeEvent(this, "childPageWidget");
        }
    }

    public void onEventMainThread(isu.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4858e929", new Object[]{this, eVar});
        } else {
            a(com.taobao.search.musie.k.ACTION_START_SCROLL);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        a aVar = this.f16263a;
        if (aVar == null || aVar.e() == null) {
            return;
        }
        this.f16263a.e().fireNativeEvent(str, "");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.g) {
        } else {
            this.g = false;
            if (this.l) {
                return;
            }
            this.l = true;
            this.k.removeCallbacks(this.n);
            this.k.postDelayed(this.n, 100L);
        }
    }

    public void a(com.taobao.android.weex_framework.p pVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16fbb9", new Object[]{this, pVar, str, str2});
            return;
        }
        if (getRoot() instanceof itu) {
            ((itu) getRoot()).a(this, this.b.templateName, pVar, str, str2);
        }
        q();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.e) {
            if (this.g) {
                return;
            }
            this.g = true;
        } else if (this.l) {
        } else {
            this.l = true;
            this.k.removeCallbacks(this.n);
            this.k.postDelayed(this.n, 100L);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.g) {
            this.g = false;
        }
        if (!this.e || !this.l) {
            return;
        }
        this.l = false;
        if (this.m) {
            this.m = false;
            a aVar = this.f16263a;
            if (aVar == null) {
                return;
            }
            if (aVar.e() != null && this.h) {
                this.f16263a.e().updateNativeState("visibility", "disappear");
            }
            this.f16263a.k();
            return;
        }
        this.k.removeCallbacks(this.n);
    }

    @Override // tb.itm
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // tb.itm
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            d();
        }
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
            if (hashCode == 914742642 && str.equals("updateStorage")) {
                c = 0;
            }
        } else if (str.equals("requestLostFocus")) {
            c = 1;
        }
        if (c != 0) {
            if (c != 1) {
                return false;
            }
            ioc.a(aVar);
            return true;
        }
        MuiseBean muiseBean = this.d;
        if (muiseBean != null) {
            muiseBean.mStorage.putAll(jSONObject.getInnerMap());
        }
        return true;
    }

    public MuiseBean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MuiseBean) ipChange.ipc$dispatch("f3585074", new Object[]{this}) : this.d;
    }

    @Override // tb.iut
    public JSONObject dumpDebugInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("980ff734", new Object[]{this});
        }
        JSONObject dumpDebugInfo = super.dumpDebugInfo();
        JSONObject jSONObject = this.i;
        if (jSONObject != null) {
            dumpDebugInfo.put("查看init_data", (Object) jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        com.taobao.android.weex_framework.p e = this.f16263a.e();
        String str = "null";
        jSONObject2.put("videostatus", (Object) (e == null ? str : e.getNativeState("videostatus")));
        if (e != null) {
            str = e.getNativeState("visibility");
        }
        jSONObject2.put("visibility", (Object) str);
        dumpDebugInfo.put("播放状态", (Object) jSONObject2);
        return dumpDebugInfo;
    }

    @Override // com.taobao.android.searchbaseframe.uikit.screentype.a
    public void i_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57263006", new Object[]{this, new Integer(i)});
        } else {
            n();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        a aVar = this.f16263a;
        if (aVar == null || aVar.e() == null) {
            return;
        }
        com.taobao.android.searchbaseframe.util.t.a(this.f16263a.e().getRenderRoot());
        this.f16263a.g();
        this.f16263a = null;
        a(this.d);
    }
}
