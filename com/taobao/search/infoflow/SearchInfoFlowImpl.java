package com.taobao.search.infoflow;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.datasource.d;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.xsearchplugin.muise.s;
import com.taobao.android.xsearchplugin.weex.weex.h;
import com.taobao.search.common.util.c;
import com.taobao.search.infoflow.a;
import com.taobao.search.sf.j;
import tb.isr;
import tb.kge;
import tb.noa;
import tb.rir;
import tb.ris;

/* loaded from: classes7.dex */
public class SearchInfoFlowImpl implements LifecycleObserver, g, h, a, rir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f19055a;
    private Context b;
    private p c;
    private ris d;
    private LifecycleOwner e;
    private a.InterfaceC0760a f;

    static {
        kge.a(1918094531);
        kge.a(1625206787);
        kge.a(2139684418);
        kge.a(502437767);
        kge.a(-311268728);
        kge.a(-1768735662);
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
        }
    }

    public static /* synthetic */ RecyclerView a(SearchInfoFlowImpl searchInfoFlowImpl, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("a2b89728", new Object[]{searchInfoFlowImpl, view}) : searchInfoFlowImpl.a(view);
    }

    public static /* synthetic */ p a(SearchInfoFlowImpl searchInfoFlowImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("b5c28973", new Object[]{searchInfoFlowImpl}) : searchInfoFlowImpl.c;
    }

    public SearchInfoFlowImpl(String str, Context context, LifecycleOwner lifecycleOwner) {
        this.f19055a = str;
        this.b = context;
        this.e = lifecycleOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    @Override // com.taobao.search.infoflow.a
    public View a(JSONObject jSONObject, final a.InterfaceC0760a interfaceC0760a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f2c38fa", new Object[]{this, jSONObject, interfaceC0760a});
        }
        p pVar = this.c;
        if (pVar != null) {
            pVar.destroy();
        }
        this.f = interfaceC0760a;
        String a2 = a(this.f19055a);
        if (TextUtils.isEmpty(a2)) {
            if (c.a()) {
                throw new IllegalStateException("无法获取" + this.f19055a + "对应的页面url");
            }
            return new FrameLayout(this.b);
        }
        if (this.d == null) {
            this.d = new ris(this.b, "xsl_search_event", this);
        }
        this.c = s.a(this.b, this, null);
        this.c.renderByUrl(a2, a2, jSONObject, null);
        this.c.registerRenderListener(this);
        this.c.setTag(XslMUSComponent.TAG_XSL_NESTED_MOD, "true");
        this.c.setTag(XslMUSComponent.PAGE_PERF_STATICS_CALLBACK, new d() { // from class: com.taobao.search.infoflow.SearchInfoFlowImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.datasource.d
            public void a(com.taobao.android.searchbaseframe.track.d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63e35165", new Object[]{this, dVar});
                } else if (interfaceC0760a == null) {
                } else {
                    SearchInfoFlowImpl searchInfoFlowImpl = SearchInfoFlowImpl.this;
                    RecyclerView a3 = SearchInfoFlowImpl.a(searchInfoFlowImpl, SearchInfoFlowImpl.a(searchInfoFlowImpl).getRenderRoot());
                    if (!(a3 instanceof SearchChildRecyclerView)) {
                        return;
                    }
                    interfaceC0760a.a((SearchChildRecyclerView) a3);
                }
            }
        });
        return this.c.getRenderRoot();
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String str2 = null;
        if (j.f19452a != null) {
            str2 = com.taobao.android.searchbaseframe.chitu.c.a("search_info_flow_url", j.f19452a);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = com.taobao.android.searchbaseframe.roman.c.a().a(b(str), noa.SERVER_VERSION_VALUE);
        }
        return TextUtils.isEmpty(str2) ? c.a() ? "https://dev.g.alicdn.com/asr-pages/shopping-item-page/0.0.1/weex/home.v20.wlm" : "https://g.alicdn.com/asr-pages/shopping-item-page/0.0.1/weex/home.v20.wlm" : str2;
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : ("OrderSearch".equals(str) || "orderList_search".equals(str)) ? "order-item-page" : "shopping-item-page";
    }

    private RecyclerView a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("5228321a", new Object[]{this, view});
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            RecyclerView a2 = a(viewGroup.getChildAt(i));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // com.taobao.search.infoflow.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        p pVar = this.c;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.c.destroy();
        LifecycleOwner lifecycleOwner = this.e;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            this.e = null;
        }
        ris risVar = this.d;
        if (risVar == null) {
            return;
        }
        risVar.b();
        this.d = null;
    }

    @Override // com.taobao.search.infoflow.a
    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        p pVar = this.c;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        if (z) {
            this.c.refresh(jSONObject, null);
        } else {
            this.c.sendInstanceMessage("MUISE", "updateParams", jSONObject);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void onActivityPauseInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ad256c", new Object[]{this});
            return;
        }
        p pVar = this.c;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.c.onActivityPause();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onActivityResumeInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1240903f", new Object[]{this});
            return;
        }
        p pVar = this.c;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.c.onActivityResume();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onActivityDestroyInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01a1cf0", new Object[]{this});
        } else {
            a();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void onActivityStartInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762981d8", new Object[]{this});
            return;
        }
        p pVar = this.c;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.c.onActivityStart();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void onActivityStopInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfed8c14", new Object[]{this});
            return;
        }
        p pVar = this.c;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.c.onActivityStop();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        a.InterfaceC0760a interfaceC0760a = this.f;
        if (interfaceC0760a == null) {
            return;
        }
        interfaceC0760a.a("render");
    }

    @Override // tb.rir
    public void a(Object obj) {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (!(obj instanceof JSONObject) || (pVar = this.c) == null || pVar.isDestroyed() || this.f == null) {
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.getIntValue("instanceId") != this.c.getInstanceId()) {
                return;
            }
            String string = jSONObject.getString("event");
            if ("searchSuccess".equals(string)) {
                this.f.a();
            } else if (!"searchFail".equals(string)) {
            } else {
                this.f.a("request");
            }
        }
    }
}
