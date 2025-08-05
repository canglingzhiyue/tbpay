package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.WeexFrameLayout;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import java.util.HashMap;
import java.util.Map;
import tb.jvs;
import tb.kge;
import tb.oec;
import tb.ogg;
import tb.ogl;
import tb.ogq;

/* loaded from: classes8.dex */
public class ae extends Component<WeexFrameLayout, a> implements com.taobao.tao.flexbox.layoutmanager.core.s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    private int c;
    private WeexFrameLayout d;
    private View e;
    private String f;
    private com.taobao.android.weex_framework.p h;

    /* renamed from: a  reason: collision with root package name */
    private final String f20098a = "WeexComponent";
    private boolean g = false;
    private boolean i = false;
    private JSONObject j = new JSONObject();
    private Map<String, Object> k = new HashMap();
    private com.taobao.tao.flexbox.layoutmanager.core.c l = new c.a<WeexFrameLayout, a>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ae.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, WeexFrameLayout weexFrameLayout, a aVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef940dad", new Object[]{this, fVar, weexFrameLayout, aVar, dVar});
            } else if (ae.a(ae.this) == null || aVar == null) {
            } else {
                if (aVar.d) {
                    ogg.b("WeexComponent", "setBackgroundColor TRANSPARENT");
                    ((WeexFrameLayout) ae.b(ae.this)).setBackgroundColor(0);
                } else {
                    ogg.b("WeexComponent", "setBackgroundColor WHITE");
                    ((WeexFrameLayout) ae.c(ae.this)).setBackgroundColor(-1);
                }
                ae.a(ae.this, aVar.e);
                ogg.b("WeexComponent", "hideDefaultErrorView: " + ae.d(ae.this));
                if (!TextUtils.isEmpty(aVar.f20105a)) {
                    ae.e(ae.this);
                    ae.this.a(aVar);
                    ae aeVar = ae.this;
                    ae.a(aeVar, 0, ae.f(aeVar), ae.g(ae.this), "");
                    return;
                }
                ogg.a("WeexComponent", "attr.src is empty");
            }
        }
    };

    static {
        kge.a(-1034278687);
        kge.a(-1420926486);
    }

    public static /* synthetic */ Object ipc$super(ae aeVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 258418204) {
            if (hashCode == 1277574414) {
                super.onInitAttrs((com.taobao.tao.flexbox.layoutmanager.core.f) objArr[0], (View) objArr[1], (ogl) objArr[2], (aa.d) objArr[3]);
                return null;
            } else if (hashCode != 2127624665) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onDetach();
                return null;
            }
        }
        return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.tao.flexbox.layoutmanager.component.ae$a, tb.ogl] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ a mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, com.taobao.android.layoutmanager.container.WeexFrameLayout] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ WeexFrameLayout onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void onInitAttrs(com.taobao.tao.flexbox.layoutmanager.core.f fVar, WeexFrameLayout weexFrameLayout, a aVar, aa.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c263d0e", new Object[]{this, fVar, weexFrameLayout, aVar, dVar});
        } else {
            a(fVar, weexFrameLayout, aVar, dVar);
        }
    }

    public static /* synthetic */ View a(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("67ee153c", new Object[]{aeVar}) : aeVar.view;
    }

    public static /* synthetic */ ViewParent a(ae aeVar, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewParent) ipChange.ipc$dispatch("a00bee90", new Object[]{aeVar, view}) : aeVar.a(view);
    }

    public static /* synthetic */ void a(ae aeVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42e2453", new Object[]{aeVar, new Integer(i), str});
        } else {
            aeVar.a(i, str);
        }
    }

    public static /* synthetic */ void a(ae aeVar, int i, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efa8cbf", new Object[]{aeVar, new Integer(i), new Boolean(z), str, str2});
        } else {
            aeVar.a(i, z, str, str2);
        }
    }

    public static /* synthetic */ void a(ae aeVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8787cac", new Object[]{aeVar, str, jSONObject});
        } else {
            aeVar.a(str, jSONObject);
        }
    }

    public static /* synthetic */ boolean a(ae aeVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca9cfa9e", new Object[]{aeVar, new Boolean(z)})).booleanValue();
        }
        aeVar.g = z;
        return z;
    }

    public static /* synthetic */ View b(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("825f0e5b", new Object[]{aeVar}) : aeVar.view;
    }

    public static /* synthetic */ boolean b(ae aeVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f031039f", new Object[]{aeVar, new Boolean(z)})).booleanValue();
        }
        aeVar.i = z;
        return z;
    }

    public static /* synthetic */ View c(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9cd0077a", new Object[]{aeVar}) : aeVar.view;
    }

    public static /* synthetic */ boolean d(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c81ba01b", new Object[]{aeVar})).booleanValue() : aeVar.g;
    }

    public static /* synthetic */ void e(ae aeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c951f2f6", new Object[]{aeVar});
        } else {
            aeVar.b();
        }
    }

    public static /* synthetic */ boolean f(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca8845d9", new Object[]{aeVar})).booleanValue() : aeVar.b;
    }

    public static /* synthetic */ String g(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("86115a6c", new Object[]{aeVar}) : aeVar.f;
    }

    public static /* synthetic */ WeexFrameLayout h(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexFrameLayout) ipChange.ipc$dispatch("e34bcda9", new Object[]{aeVar}) : aeVar.d;
    }

    public static /* synthetic */ void i(ae aeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2b3e72", new Object[]{aeVar});
        } else {
            aeVar.c();
        }
    }

    public static /* synthetic */ View j(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e6d753", new Object[]{aeVar}) : aeVar.view;
    }

    public static /* synthetic */ boolean k(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d097e434", new Object[]{aeVar})).booleanValue() : aeVar.i;
    }

    public static /* synthetic */ View l(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8ac8c991", new Object[]{aeVar}) : aeVar.view;
    }

    public static /* synthetic */ View m(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a539c2b0", new Object[]{aeVar}) : aeVar.view;
    }

    public static /* synthetic */ com.taobao.android.weex_framework.p n(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.p) ipChange.ipc$dispatch("ae15c7ca", new Object[]{aeVar}) : aeVar.h;
    }

    public static /* synthetic */ JSONObject o(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f2262acc", new Object[]{aeVar}) : aeVar.j;
    }

    public static /* synthetic */ Map p(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5230c580", new Object[]{aeVar}) : aeVar.k;
    }

    public WeexFrameLayout a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexFrameLayout) ipChange.ipc$dispatch("d18230bc", new Object[]{this, context});
        }
        this.d = new WeexFrameLayout(context);
        return this.d;
    }

    public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, WeexFrameLayout weexFrameLayout, a aVar, aa.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef940dad", new Object[]{this, fVar, weexFrameLayout, aVar, dVar});
            return;
        }
        super.onInitAttrs(fVar, weexFrameLayout, aVar, dVar);
        this.l.a(fVar, (com.taobao.tao.flexbox.layoutmanager.core.f) weexFrameLayout, (WeexFrameLayout) aVar, dVar);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        String str = eVar.c;
        ogg.b("WeexComponent", "onHandleMessage name: " + str + " args: " + eVar.d);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -552345454) {
            if (hashCode != 1729966319) {
                if (hashCode == 2122668806 && str.equals("onwillappear")) {
                    c = 0;
                }
            } else if (str.equals("onforcerefresh")) {
                c = 2;
            }
        } else if (str.equals("onwilldisappear")) {
            c = 1;
        }
        if (c == 0) {
            this.b = true;
            int i = this.c;
            if (2 == i) {
                a(str, JSON.parseObject(JSON.toJSONString(eVar.d)));
                c();
            } else if (3 == i && this.h != null && !TextUtils.isEmpty(this.f)) {
                ogg.a("WeexComponent", "onHandleMessage  try reload");
                this.h.initWithURL(Uri.parse(this.f));
            }
        } else if (c == 1) {
            this.b = false;
            if (2 == this.c) {
                a(str, JSON.parseObject(JSON.toJSONString(eVar.d)));
                d();
            }
        } else if (c == 2) {
            a(str, JSON.parseObject(JSON.toJSONString(eVar.d)));
        }
        return false;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p pVar = this.h;
        if (pVar == null) {
            return;
        }
        pVar.onActivityStart();
        this.h.onActivityResume();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p pVar = this.h;
        if (pVar == null) {
            return;
        }
        pVar.onActivityPause();
        this.h.onActivityStop();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(g.c cVar, String str, JSONObject jSONObject, g.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67261c", new Object[]{this, cVar, str, jSONObject, dVar})).booleanValue();
        }
        ogg.b("WeexComponent", "invoke name: " + str + " params: " + jSONObject);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1240638001) {
            if (hashCode != -934641255) {
                if (hashCode == 1490029383 && str.equals("postMessage")) {
                    c = 2;
                }
            } else if (str.equals("reload")) {
                c = 0;
            }
        } else if (str.equals("goback")) {
            c = 1;
        }
        if (c != 0) {
            if (c == 1) {
                com.taobao.android.weex_framework.p pVar = this.h;
                if (pVar != null) {
                    pVar.goBack();
                }
            } else if (c != 2) {
                z = false;
            } else {
                a(jSONObject);
            }
        } else if (this.h != null) {
            b();
            this.h.refresh(this.j, this.k);
        }
        return !z ? super.invoke(cVar, str, jSONObject, dVar) : z;
    }

    private void a(int i, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de12f2d", new Object[]{this, new Integer(i), new Boolean(z), str, str2});
            return;
        }
        this.c = i;
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i));
        hashMap.put("appear", Boolean.valueOf(z));
        hashMap.put("url", str);
        hashMap.put("error", str2);
        a("onstatechanged", hashMap);
    }

    public void a(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        ogg.b("WeexComponent", "sendMessage2TNode name: " + str + " args: " + map);
        sendMessage(getNode(), str, null, map, null);
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) str);
        jSONObject2.put("args", (Object) jSONObject);
        a(jSONObject2);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        ogg.b("WeexComponent", "sendToWeexMessage eventName: onTNodeMessage params: " + jSONObject);
        this.h.dispatchEvent(MUSEventTarget.MUS_BODY_TARGET, "onTNodeMessage", jSONObject);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c1a91d", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.j = aVar.c;
            this.f = aVar.f20105a;
            this.k.put("bundleUrl", this.f);
            com.taobao.android.weex_framework.p pVar = this.h;
            if (pVar == null) {
                MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
                mUSInstanceConfig.d(true);
                mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
                mUSInstanceConfig.a(new com.taobao.android.weex_framework.f() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ae.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.f
                    public void onCreateView(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                        } else if (ae.h(ae.this) == null) {
                        } else {
                            ae.h(ae.this).addView(view);
                        }
                    }
                });
                mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
                this.h = com.taobao.android.weex_framework.q.a().a(((WeexFrameLayout) this.view).getContext(), mUSInstanceConfig);
                this.h.registerRenderListener(new com.taobao.android.weex_framework.g() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ae.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.g
                    public void onDestroyed(MUSDKInstance mUSDKInstance) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                        }
                    }

                    @Override // com.taobao.android.weex_framework.g
                    public void onFatalException(com.taobao.android.weex_framework.p pVar2, int i, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar2, new Integer(i), str});
                        }
                    }

                    @Override // com.taobao.android.weex_framework.g
                    public void onForeground(com.taobao.android.weex_framework.p pVar2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar2});
                        }
                    }

                    @Override // com.taobao.android.weex_framework.g
                    public void onJSException(com.taobao.android.weex_framework.p pVar2, int i, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar2, new Integer(i), str});
                        }
                    }

                    @Override // com.taobao.android.weex_framework.g
                    public void onRefreshFailed(com.taobao.android.weex_framework.p pVar2, int i, String str, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar2, new Integer(i), str, new Boolean(z)});
                        }
                    }

                    @Override // com.taobao.android.weex_framework.g
                    public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar2});
                        }
                    }

                    @Override // com.taobao.android.weex_framework.g
                    public void onPrepareSuccess(com.taobao.android.weex_framework.p pVar2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar2});
                            return;
                        }
                        ogg.b("WeexComponent", "weex onPrepareSuccess url: " + ae.g(ae.this));
                        ae aeVar = ae.this;
                        ae.a(aeVar, 1, ae.f(aeVar), ae.g(ae.this), "");
                    }

                    @Override // com.taobao.android.weex_framework.g
                    public void onRenderSuccess(com.taobao.android.weex_framework.p pVar2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar2});
                            return;
                        }
                        ogg.b("WeexComponent", "weex onRenderSuccess url: " + ae.g(ae.this));
                        ae aeVar = ae.this;
                        ae.a(aeVar, 2, ae.f(aeVar), ae.g(ae.this), "");
                        if (!ae.f(ae.this)) {
                            return;
                        }
                        ae.a(ae.this, "onwillappear", (JSONObject) null);
                        ae.i(ae.this);
                    }

                    @Override // com.taobao.android.weex_framework.g
                    public void onRenderFailed(com.taobao.android.weex_framework.p pVar2, int i, String str, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar2, new Integer(i), str, new Boolean(z)});
                            return;
                        }
                        ogg.a("WeexComponent", "weex onRenderFailed error: " + str);
                        ae aeVar = ae.this;
                        ae.a(aeVar, 3, ae.f(aeVar), ae.g(ae.this), str);
                        if (ae.d(ae.this)) {
                            return;
                        }
                        ae.a(ae.this, i, str);
                    }
                });
                this.h.initWithURL(Uri.parse(this.f));
                this.h.setTag("WeexComponent", this);
                this.h.render(this.j, this.k);
                this.h.setGestureStateListener(new com.taobao.android.weex_framework.ui.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ae.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.ui.c
                    public void a(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        ogg.d("WeexComponent", "onGestureState beeConsume:" + z);
                        if (z) {
                            ae.b(ae.this, true);
                            ((WeexFrameLayout) ae.j(ae.this)).setWeexConsume(WeexFrameLayout.WEEX_STATE_CONSUME);
                            return;
                        }
                        ogg.d("WeexComponent", "onGestureState setWeexConsume WEEX_STATE_NOT_CONSUME");
                        ((WeexFrameLayout) ae.l(ae.this)).setWeexConsume(WeexFrameLayout.WEEX_STATE_NOT_CONSUME);
                    }
                });
                this.h.setWeexScrollListener(new jvs() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ae.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.jvs
                    public void a(Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                        } else if (!ae.k(ae.this)) {
                        } else {
                            ae.b(ae.this, false);
                            ae aeVar = ae.this;
                            ViewParent a2 = ae.a(aeVar, ae.m(aeVar));
                            if (!(a2 instanceof ViewPager)) {
                                return;
                            }
                            a2.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                });
                return;
            }
            pVar.initWithURL(Uri.parse(this.f));
            this.h.render(this.j, this.k);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.e;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.e.setVisibility(8);
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else if (this.h == null) {
        } else {
            if (this.e != null) {
                getView().removeView(this.e);
            }
            this.e = ogq.a(getNode().N(), this.f, String.valueOf(i), str, ((a) this.viewParams).b, new ogq.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ae.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ogq.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (ae.n(ae.this) == null || TextUtils.isEmpty(ae.g(ae.this))) {
                    } else {
                        ae.e(ae.this);
                        ae.n(ae.this).refresh(ae.o(ae.this), ae.p(ae.this));
                        ogg.b("WeexComponent", "onClick errorView refresh load url: " + ae.g(ae.this));
                    }
                }
            });
            getView().addView(this.e, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private ViewParent a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("9dafa0e2", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        return (!(parent instanceof ViewPager) && (parent instanceof View)) ? a((View) parent) : parent;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        com.taobao.android.weex_framework.p pVar = this.h;
        if (pVar == null) {
            return;
        }
        pVar.destroy();
        this.h = null;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e5debddd", new Object[]{this}) : new a();
    }

    /* loaded from: classes8.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_HIDE_DEFAULT_ERROR_VIEW = "hideDefaultErrorView";
        public static final String KEY_OPAQUE = "opaque";

        /* renamed from: a  reason: collision with root package name */
        public String f20105a;
        public String b;
        public JSONObject c;
        public boolean d;
        public boolean e;

        static {
            kge.a(1884287146);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2079543418) {
                super.a((Context) objArr[0], (String) objArr[1], objArr[2]);
                return null;
            } else if (hashCode != -1185345197) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
        }

        @Override // tb.ogl
        public void a(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
                return;
            }
            super.a(context, hashMap);
            this.f20105a = oec.c(hashMap.get("src"));
            this.c = a(hashMap);
        }

        @Override // tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            super.a(context, str, obj);
            ogg.b("WeexParams", "parseExtraViewParams key: " + str + " value: " + obj);
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1010695135) {
                if (hashCode != 1577082094) {
                    if (hashCode == 1589884724 && str.equals("error-page")) {
                        c = 0;
                    }
                } else if (str.equals("hideDefaultErrorView")) {
                    c = 2;
                }
            } else if (str.equals("opaque")) {
                c = 1;
            }
            if (c == 0) {
                this.b = oec.a(obj, "");
            } else if (c == 1) {
                this.d = oec.a(obj, true);
            } else if (c != 2) {
            } else {
                this.e = oec.a(obj, false);
            }
        }

        private JSONObject a(HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("3dee7b6b", new Object[]{this, hashMap});
            }
            JSONObject jSONObject = new JSONObject();
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            return jSONObject;
        }
    }
}
