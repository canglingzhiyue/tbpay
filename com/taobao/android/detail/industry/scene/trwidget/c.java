package com.taobao.android.detail.industry.scene.trwidget;

import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.aqs;
import tb.aqt;
import tb.arc;
import tb.ard;
import tb.atl;
import tb.ejc;
import tb.ema;
import tb.emh;
import tb.emu;
import tb.etn;
import tb.kge;

@AURAExtensionImpl(code = "industryDetail.impl.render.component.creator.triverwidget")
/* loaded from: classes4.dex */
public final class c extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AURAGlobalData d;
    private aqs e;
    private String f;

    static {
        kge.a(-74968505);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "triverwidget";
    }

    public static /* synthetic */ Map a(c cVar, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("54e49d2d", new Object[]{cVar, view}) : cVar.b(view);
    }

    public static /* synthetic */ aqs a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqs) ipChange.ipc$dispatch("ea7491c9", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ void a(c cVar, FrameLayout frameLayout, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e775b795", new Object[]{cVar, frameLayout, view});
        } else {
            cVar.a(frameLayout, view);
        }
    }

    public static /* synthetic */ void a(c cVar, FrameLayout frameLayout, com.alibaba.triver.cannal_engine.common.a aVar, TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9f31e3", new Object[]{cVar, frameLayout, aVar, tRWidgetInstance});
        } else {
            cVar.a(frameLayout, aVar, tRWidgetInstance);
        }
    }

    public static /* synthetic */ void a(c cVar, aqt aqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735ad146", new Object[]{cVar, aqtVar});
        } else {
            cVar.a(aqtVar);
        }
    }

    public static /* synthetic */ q b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("8c3a6526", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ void b(c cVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db31b79", new Object[]{cVar, view});
        } else {
            cVar.a(view);
        }
    }

    public c() {
        emu.a("com.taobao.android.detail.industry.scene.trwidget.DITriverWidgetComponentExtension");
    }

    @Override // tb.atl, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            super.onCreate(qVar, fVar);
        }
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.d = aURAGlobalData;
        ejc.a(this.d, "AliDetailTrWidgetInstanceMap", ConcurrentHashMap.class);
        this.e = aqsVar;
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(emh.a(viewGroup), -1));
        return frameLayout;
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        this.f = aURARenderComponent.key;
        HashMap hashMap = new HashMap();
        hashMap.put("AuraComponentKey", this.f);
        if (!(view instanceof FrameLayout)) {
            ema.a("trwidget#containerViewError", "根View不是FrameLayout", hashMap, this.e);
        } else if (aURARenderComponent.data == null) {
            ema.a("trwidget#containerViewError", "auraRenderComponent.data is null", hashMap, this.e);
        } else {
            Object obj = aURARenderComponent.data.fields.get(b.DATA_FIELD_KEY);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.put("AuraComponentKey", (Object) aURARenderComponent.key);
                a((FrameLayout) view, jSONObject, aURARenderComponent);
                return;
            }
            ema.a("trwidget#containerViewError", "auraRenderComponent.data.field 数据错误", hashMap, this.e);
        }
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        String str = aURARenderComponent.key;
        return StringUtils.isEmpty(str) ? "triverwidget" : str;
    }

    @Override // tb.atl, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            c();
        }
    }

    private void a(final FrameLayout frameLayout, final JSONObject jSONObject, final AURARenderComponent aURARenderComponent) {
        final TRWidgetInstance a2;
        WidgetStartParams widgetStartParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1724436", new Object[]{this, frameLayout, jSONObject, aURARenderComponent});
        } else if (a(frameLayout) || (a2 = a(frameLayout, aURARenderComponent.key)) == null) {
        } else {
            a(new aqt<etn>() { // from class: com.taobao.android.detail.industry.scene.trwidget.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public void a(etn etnVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e7840cd9", new Object[]{this, etnVar});
                    } else {
                        etnVar.a(frameLayout, jSONObject, aURARenderComponent, a2);
                    }
                }
            });
            frameLayout.setTag(R.id.detail_industry_component_trwidget_data, jSONObject);
            arc.a().a("AliSDetailTriverWidgetComponentExtension", "renderWidget", "");
            try {
                widgetStartParams = (WidgetStartParams) JSONObject.parseObject(jSONObject.toJSONString(), WidgetStartParams.class);
            } catch (Throwable unused) {
                a(new aqt<etn>() { // from class: com.taobao.android.detail.industry.scene.trwidget.c.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.aqt
                    public void a(etn etnVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e7840cd9", new Object[]{this, etnVar});
                        } else {
                            etnVar.c(frameLayout, jSONObject, aURARenderComponent, a2);
                        }
                    }
                });
                ema.a("trwidget#containerViewError", "小部件异常", b(frameLayout), this.e);
            }
            if (widgetStartParams == null) {
                return;
            }
            a2.render(widgetStartParams, new TRWidgetInstance.a() { // from class: com.taobao.android.detail.industry.scene.trwidget.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
                public void a(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    }
                }

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
                public void a(String str, JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject2});
                    }
                }

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    ard a3 = arc.a();
                    a3.a("AliSDetailTriverWidgetComponentExtension", "onWidgetInit: " + z, "");
                }

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else if (view == null) {
                        ema.a("trwidget#containerViewError", "RenderSuccess: view is null", c.a(c.this, frameLayout), c.a(c.this));
                    } else {
                        arc.a().a("AliSDetailTriverWidgetComponentExtension", "onRenderSuccess: ", "");
                        c.b(c.this, (ViewGroup) view);
                        c.a(c.this, frameLayout, view);
                        c.a(c.this, new aqt<etn>() { // from class: com.taobao.android.detail.industry.scene.trwidget.c.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.aqt
                            public void a(etn etnVar) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("e7840cd9", new Object[]{this, etnVar});
                                } else {
                                    etnVar.b(frameLayout, jSONObject, aURARenderComponent, a2);
                                }
                            }
                        });
                    }
                }

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
                public void a(com.alibaba.triver.cannal_engine.common.a aVar, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("af2eb696", new Object[]{this, aVar, map});
                        return;
                    }
                    c.a(c.this, new aqt<etn>() { // from class: com.taobao.android.detail.industry.scene.trwidget.c.2.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.aqt
                        public void a(etn etnVar) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("e7840cd9", new Object[]{this, etnVar});
                            } else {
                                etnVar.c(frameLayout, jSONObject, aURARenderComponent, a2);
                            }
                        }
                    });
                    c.a(c.this, frameLayout, aVar, a2);
                    if (aVar == null) {
                        arc.a().a("AliSDetailTriverWidgetComponentExtension", "onRenderError: errorInfo is null", "");
                        return;
                    }
                    arc.a().a("AliSDetailTriverWidgetComponentExtension", "onRenderError: ", aVar.f3640a);
                    ema.a("trwidget#renderError_" + aVar.d + "_" + aVar.f3640a, aVar.b, c.a(c.this, frameLayout), c.a(c.this));
                }

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        arc.a().a("AliSDetailTriverWidgetComponentExtension", "onDebugConsoleLog: ", str);
                    }
                }

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
                public void b(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                        return;
                    }
                    arc.a().a("AliSDetailTriverWidgetComponentExtension", "onJSError: ", str);
                    ema.a("trwidget#jsError", str, c.a(c.this, frameLayout), c.a(c.this));
                }

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
                public void a(MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                        return;
                    }
                    arc.a().a("AliSDetailTriverWidgetComponentExtension", "onWidgetClick", "");
                    com.alibaba.android.aura.service.event.a.a(c.b(c.this).b(), aURARenderComponent, "itemClick");
                }
            });
            View rootView = a2.getRootView();
            if (rootView != null) {
                rootView.setTag(R.id.detail_industry_aura_component, aURARenderComponent);
                rootView.setTag(R.id.detail_industry_aura_user_context, this.c);
            }
            a(new aqt<etn>() { // from class: com.taobao.android.detail.industry.scene.trwidget.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public /* bridge */ /* synthetic */ void a(etn etnVar) {
                }
            });
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            try {
                ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0)).getChildAt(0)).setFocusable(false);
            } catch (Exception e) {
                ema.a("trwidget#fixFlutterBug", e.getMessage(), this.c, this.e);
            }
        }
    }

    private void a(FrameLayout frameLayout, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2021bf07", new Object[]{this, frameLayout, view});
            return;
        }
        frameLayout.removeAllViews();
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        a(frameLayout, true);
    }

    private void a(FrameLayout frameLayout, com.alibaba.triver.cannal_engine.common.a aVar, TRWidgetInstance tRWidgetInstance) {
        String str;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a102ff31", new Object[]{this, frameLayout, aVar, tRWidgetInstance});
            return;
        }
        if (aVar != null) {
            String[] strArr = b.DEGRADE_ERROR_TYPE;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (strArr[i].equalsIgnoreCase(aVar.d)) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                arc.a().a("AliSDetailTriverWidgetComponentExtension", "callRenderError: ", "错误类型不需要降级 , errorType " + aVar.d + " errorCode " + aVar.f3640a);
                return;
            }
            str = "" + aVar.d + "_" + aVar.f3640a;
        } else {
            str = "emptyError";
        }
        List<String> l = com.taobao.android.detail.core.aura.utils.f.l();
        if (l != null && l.contains(str)) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.setTag(R.id.detail_industry_component_trwidget_instance, null);
        frameLayout.setTag(R.id.detail_industry_component_trwidget_data, null);
        a(tRWidgetInstance);
    }

    private TRWidgetInstance a(FrameLayout frameLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRWidgetInstance) ipChange.ipc$dispatch("78a71442", new Object[]{this, frameLayout, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        Object tag = frameLayout.getTag(R.id.detail_industry_component_trwidget_instance);
        if (tag instanceof TRWidgetInstance) {
            TRWidgetInstance tRWidgetInstance = (TRWidgetInstance) tag;
            a(tRWidgetInstance, str);
            return tRWidgetInstance;
        } else if (!(frameLayout.getContext() instanceof FragmentActivity)) {
            ema.a("trwidget#containerViewError", "页面基类不是FragmentActivity", (Map<String, Object>) null, this.e);
            return null;
        } else {
            TRWidgetInstance tRWidgetInstance2 = new TRWidgetInstance((FragmentActivity) frameLayout.getContext());
            frameLayout.setTag(R.id.detail_industry_component_trwidget_instance, tRWidgetInstance2);
            a(tRWidgetInstance2, str);
            return tRWidgetInstance2;
        }
    }

    private boolean a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f363e3ef", new Object[]{this, frameLayout})).booleanValue();
        }
        Object tag = frameLayout.getTag(R.id.detail_industry_component_trwidget_key);
        if (!(tag instanceof Boolean)) {
            return false;
        }
        return ((Boolean) tag).booleanValue();
    }

    private void a(FrameLayout frameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79194c49", new Object[]{this, frameLayout, new Boolean(z)});
        } else {
            frameLayout.setTag(R.id.detail_industry_component_trwidget_key, new Boolean(z));
        }
    }

    private void a(TRWidgetInstance tRWidgetInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d693817f", new Object[]{this, tRWidgetInstance, str});
            return;
        }
        ConcurrentHashMap<String, TRWidgetInstance> d = d();
        d.put(str, tRWidgetInstance);
        a(d);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        arc.a().a("AliSDetailTriverWidgetComponentExtension", "退出页面，销毁全部小部件 destroy ", "");
        ConcurrentHashMap<String, TRWidgetInstance> d = d();
        for (String str : d.keySet()) {
            b(d.get(str));
        }
        d.clear();
    }

    private void a(TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14bd4af5", new Object[]{this, tRWidgetInstance});
            return;
        }
        arc.a().a("AliSDetailTriverWidgetComponentExtension", "通知小部件销毁渲染失败的实例 destroy: ", "");
        if (tRWidgetInstance == null) {
            return;
        }
        ConcurrentHashMap<String, TRWidgetInstance> d = d();
        Iterator<String> it = d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (tRWidgetInstance.equals(d.get(next))) {
                d.remove(next);
                break;
            }
        }
        b(tRWidgetInstance);
        a(d);
    }

    private void b(final TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f39dd4", new Object[]{this, tRWidgetInstance});
        } else if (tRWidgetInstance == null) {
        } else {
            final String str = null;
            if (tRWidgetInstance.getApp() != null) {
                str = tRWidgetInstance.getApp().getAppId();
            }
            a(new aqt<etn>() { // from class: com.taobao.android.detail.industry.scene.trwidget.c.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public void a(etn etnVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e7840cd9", new Object[]{this, etnVar});
                    } else {
                        etnVar.a(tRWidgetInstance);
                    }
                }
            });
            try {
                tRWidgetInstance.destroy();
            } catch (Throwable unused) {
                HashMap hashMap = new HashMap();
                hashMap.put("AuraComponentKey", this.f);
                ema.a("trwidget#containerViewError", "小部件销毁异常", hashMap, this.e);
            }
            a(new aqt<etn>() { // from class: com.taobao.android.detail.industry.scene.trwidget.c.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public /* bridge */ /* synthetic */ void a(etn etnVar) {
                }
            });
        }
    }

    private ConcurrentHashMap<String, TRWidgetInstance> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("403f1a9b", new Object[]{this});
        }
        ConcurrentHashMap<String, TRWidgetInstance> concurrentHashMap = (ConcurrentHashMap) ejc.b(this.d, "AliDetailTrWidgetInstanceMap", ConcurrentHashMap.class);
        return concurrentHashMap == null ? new ConcurrentHashMap<>() : concurrentHashMap;
    }

    private void a(ConcurrentHashMap<String, TRWidgetInstance> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347f5c38", new Object[]{this, concurrentHashMap});
        } else {
            ejc.a(this.d, "AliDetailTrWidgetInstanceMap", concurrentHashMap);
        }
    }

    private Map<String, Object> b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da5750be", new Object[]{this, view});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("AuraComponentKey", this.f);
        Object tag = view.getTag(R.id.detail_industry_component_trwidget_data);
        if (!(tag instanceof JSONObject)) {
            return hashMap;
        }
        hashMap.putAll((Map) tag);
        return hashMap;
    }

    private void a(aqt<etn> aqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0891e14", new Object[]{this, aqtVar});
            return;
        }
        for (etn etnVar : b().b(etn.class)) {
            aqtVar.a(etnVar);
        }
    }
}
