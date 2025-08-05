package com.alibaba.aliweex.bundle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.aliweex.AliWXSDKInstance;
import com.alibaba.aliweex.bundle.k;
import com.alibaba.aliweex.bundle.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.ui.component.NestedContainer;
import com.taobao.weex.utils.TBWXConfigManger;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXResourceUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import tb.anu;
import tb.kge;

/* loaded from: classes2.dex */
public class d implements k.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_BUNDLE_URL = "http://taobao.com?_wx_tpl=http://h5.m.taobao.com/weex/render/error.js";
    public static final String ERROR_RENDER_URL = "http://h5.m.taobao.com/weex/render/error.js";
    public static String e;
    private static String f;
    private static long w;

    /* renamed from: a  reason: collision with root package name */
    public String f2012a;
    public a b;
    private k.f c;
    public j d;
    private Activity g;
    private WXSDKInstance h;
    private String i;
    private Map<String, Object> j;
    private String k;
    private String l;
    private String m;
    private String n;
    private k.c o;
    private k.g q;
    private m.c s;
    private com.taobao.weex.d t;
    private Timer v;
    private boolean p = false;
    private RenderContainer r = null;

    public static /* synthetic */ Activity a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("6b94b2d9", new Object[]{dVar}) : dVar.g;
    }

    public static /* synthetic */ k.g b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k.g) ipChange.ipc$dispatch("ef640723", new Object[]{dVar}) : dVar.q;
    }

    public static /* synthetic */ WXSDKInstance c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("66686bcf", new Object[]{dVar}) : dVar.h;
    }

    static {
        kge.a(29945046);
        kge.a(224026774);
        f = "weex_sandbox";
        w = 5000L;
        e = "wx_wait_init";
    }

    public d(Activity activity, String str, com.taobao.weex.d dVar, k.f fVar, k.c cVar, m.c cVar2, j jVar, k.g gVar, boolean z) {
        this.g = activity;
        this.f2012a = str;
        this.t = dVar;
        this.c = fVar;
        this.o = cVar;
        this.s = cVar2;
        this.d = jVar;
        this.q = gVar;
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void a(String str, String str2, Map<String, Object> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80c2013", new Object[]{this, str, str2, map, str3});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            m.c cVar = this.s;
            if (cVar != null) {
                cVar.a(true);
            }
            b(this.g);
            this.j = map;
            this.k = str3;
            this.l = str;
            this.m = str2;
            this.p = true;
            WXSDKInstance wXSDKInstance = this.h;
            if (TextUtils.isEmpty(str2)) {
                str2 = "AliWeex";
            }
            wXSDKInstance.a(str2, str, map, str3, a(this.j));
        }
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void a(Map<String, Object> map, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6942fc3b", new Object[]{this, map, str, str2, str3});
        } else if (!TextUtils.isEmpty(str3)) {
            k.g gVar = this.q;
            if (gVar != null) {
                gVar.a(str3);
            }
            Uri parse = Uri.parse(str3);
            boolean booleanQueryParameter = parse.getBooleanQueryParameter("wx_mute_loading_indicator", false);
            m.c cVar = this.s;
            if (cVar != null) {
                cVar.a(!booleanQueryParameter);
            }
            b(this.g);
            b(str2, str3);
            a(k());
            a(this.h, parse);
            this.j = map;
            this.k = str;
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str2)) {
                str2 = str3;
            }
            hashMap.put("bundleUrl", str2);
            if (map != null) {
                for (String str4 : map.keySet()) {
                    hashMap.put(str4, map.get(str4));
                }
            }
            k.f fVar = this.c;
            if (fVar != null) {
                fVar.c(k());
            }
            this.p = true;
            a(hashMap, str, a(this.j));
        }
    }

    private void a(WXSDKInstance wXSDKInstance, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b86181", new Object[]{this, wXSDKInstance, uri});
        } else if (wXSDKInstance == null || uri == null) {
        } else {
            String queryParameter = uri.getQueryParameter("bgContainerColor");
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            if (wXSDKInstance.am() == null) {
                wXSDKInstance.a(new RenderContainer(this.g));
            }
            wXSDKInstance.am().setBackgroundColor(WXResourceUtils.getColor(queryParameter, -1));
        }
    }

    private void a(WXSDKInstance wXSDKInstance, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c5bcb5", new Object[]{this, wXSDKInstance, str, map});
        } else if (wXSDKInstance == null || wXSDKInstance.z() == null) {
        } else {
            wXSDKInstance.a(wXSDKInstance.z().getRef(), str, map);
        }
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            a(this.h, str, map);
        }
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        k.f fVar = this.c;
        if (fVar != null) {
            fVar.b(k());
        }
        if (!TextUtils.isEmpty(l()) && !TextUtils.isEmpty(n())) {
            b();
            a(this.j, this.k, l(), n());
        } else if (TextUtils.isEmpty(this.l)) {
        } else {
            b();
            a(this.l, this.m, this.j, this.k);
        }
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        b();
        b(str, str2);
        k.f fVar = this.c;
        if (fVar != null) {
            fVar.b(k());
        }
        a(this.j, this.k, str, str2);
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        k.c cVar = this.o;
        if (cVar != null) {
            cVar.a(str, str2);
            return;
        }
        this.m = str;
        this.n = str2;
    }

    public WXSDKInstance a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("971e293e", new Object[]{this, context});
        }
        String m = m();
        AliWXSDKInstance aliWXSDKInstance = null;
        if (!TextUtils.isEmpty(m)) {
            WXSDKInstance a2 = anu.a().a(m, context);
            if (a2 instanceof AliWXSDKInstance) {
                aliWXSDKInstance = (AliWXSDKInstance) a2;
                aliWXSDKInstance.a(this.f2012a);
                Log.e("RenderPresenter", "preinit -> use preinitInstance ");
            }
        }
        if (aliWXSDKInstance == null) {
            Log.e("RenderPresenter", "preinit -> failed ,and  new AliWXSDKInstance ");
            aliWXSDKInstance = new AliWXSDKInstance(context, this.f2012a);
        }
        aliWXSDKInstance.a(this.d);
        return aliWXSDKInstance;
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.h;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.l();
        this.h.e();
        this.h = null;
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public NestedContainer a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NestedContainer) ipChange.ipc$dispatch("a666dc67", new Object[]{this, wXSDKInstance});
        }
        a aVar = this.b;
        if (aVar != null && wXSDKInstance != null) {
            return aVar.a(wXSDKInstance);
        }
        return null;
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public WXSDKInstance c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("4566f2c8", new Object[]{this});
        }
        if (this.h == null) {
            b(this.g);
        }
        return this.h;
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void a(RenderContainer renderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4646fe49", new Object[]{this, renderContainer});
        } else {
            this.r = renderContainer;
        }
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void a(ViewGroup viewGroup, Map<String, Object> map, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3f0670", new Object[]{this, viewGroup, map, str, str2, str3, str4, str5});
            return;
        }
        if (this.r == null) {
            this.r = new RenderContainer(this.g);
        }
        viewGroup.addView(this.r);
        b(this.g);
        this.r.createInstanceRenderView(this.h.N());
        this.h.a(this.r);
        a(map, str, str2, str3, str4, str5);
    }

    private void a(Map<String, Object> map, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c85efcf", new Object[]{this, map, str, str2, str3, str4, str5});
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            a(str2, str3, map, str);
        } else if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            a(map, str, str3, str4);
        } else if (!TextUtils.isEmpty(str5)) {
            a(map, str, str5, str5);
        }
        this.h.onActivityCreate();
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.h;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityStart();
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.h;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityStop();
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.h;
        if (wXSDKInstance != null) {
            if (wXSDKInstance.am() != null && p()) {
                a((ViewGroup) this.h.am());
            }
            this.h.onActivityPause();
        }
        com.alibaba.aliweex.d.a("");
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.h;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityResume();
        }
        a(k());
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (this.h != null) {
            Timer timer = this.v;
            if (timer != null) {
                timer.cancel();
            }
            c();
            this.h.l();
            this.h.onActivityDestroy();
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void a(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2945670", new Object[]{this, menu});
            return;
        }
        WXSDKInstance wXSDKInstance = this.h;
        if (wXSDKInstance != null) {
            wXSDKInstance.a(menu);
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.onCreateOptionsMenu(menu);
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WXSDKInstance wXSDKInstance = this.h;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.a(i, i2, intent);
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        WXSDKInstance wXSDKInstance = this.h;
        if (wXSDKInstance == null) {
            return false;
        }
        return wXSDKInstance.ac();
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        WXSDKInstance wXSDKInstance = this.h;
        if (wXSDKInstance == null) {
            return false;
        }
        return wXSDKInstance.ab();
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        k.c cVar = this.o;
        return cVar != null ? cVar.a() : this.m;
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        k.c cVar = this.o;
        return cVar != null ? cVar.b() : this.m;
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        k.c cVar = this.o;
        return cVar != null ? cVar.c() : this.n;
    }

    @Override // com.alibaba.aliweex.bundle.k.e
    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        k.c cVar = this.o;
        return cVar != null ? cVar.d() : this.n;
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (this.h != null) {
        } else {
            this.h = a(context);
            this.h.a(new WXSDKManager.a() { // from class: com.alibaba.aliweex.bundle.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.WXSDKManager.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    }
                }

                @Override // com.taobao.weex.WXSDKManager.a
                public void onInitSuccess() {
                    try {
                        d.this.b = (a) Class.forName("com.alibaba.aliweex.bundle.WXNestedInstanceInterceptor").getConstructor(Context.class, Handler.class).newInstance(d.a(d.this), d.b(d.this).a());
                        d.c(d.this).a(d.this.b);
                    } catch (Throwable th) {
                        WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
                    }
                }
            });
            com.alibaba.aliweex.d.b(this.h.N());
            if (com.alibaba.aliweex.d.a().l() != null) {
                if ("false".equals(com.alibaba.aliweex.d.a().l().getConfig(f, "enableSanbox", "true"))) {
                    this.h.c(false);
                } else {
                    this.h.c(true);
                }
            }
            k.f fVar = this.c;
            if (fVar != null) {
                fVar.b(this.h);
            }
            this.h.a(this.t);
            this.h.I();
        }
    }

    private void a(Map<String, Object> map, String str, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be29ef67", new Object[]{this, map, str, wXRenderStrategy});
            return;
        }
        String m = m();
        if (!f.e(m) && !WXEnvironment.isApkDebugable()) {
            m = ERROR_RENDER_URL;
        }
        String str2 = m;
        if (this.h.H()) {
            return;
        }
        this.h.c(str2, str2, map, str, wXRenderStrategy);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (!TextUtils.equals(this.i, str)) {
                if (TextUtils.isEmpty(this.i)) {
                    this.i = str;
                } else {
                    z = false;
                }
            }
            if (this.g != null && z) {
                this.i = Uri.parse(str).buildUpon().appendQueryParameter("activity", this.g.getClass().getName()).build().toString();
            }
            com.alibaba.aliweex.d.a(this.i);
        }
    }

    private synchronized boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        com.alibaba.aliweex.e l = com.alibaba.aliweex.d.a().l();
        if (l == null) {
            return false;
        }
        return Boolean.parseBoolean(l.getConfig(TBWXConfigManger.WX_NAMESPACE_EXT_CONFIG, TBWXConfigManger.WX_GET_DEEP_VIEW_LAYER, Boolean.toString(true)));
    }

    private int a(ViewGroup viewGroup) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a18609a", new Object[]{this, viewGroup})).intValue();
        }
        if (viewGroup == null) {
            return -1;
        }
        if (viewGroup.getChildCount() == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null && (childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt)) > i) {
                i = a2;
            }
        }
        return i + 1;
    }

    private WXRenderStrategy a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXRenderStrategy) ipChange.ipc$dispatch("7ffd61fb", new Object[]{this, map});
        }
        WXRenderStrategy wXRenderStrategy = WXRenderStrategy.APPEND_ASYNC;
        if (map == null) {
            return wXRenderStrategy;
        }
        try {
            return map.containsKey(WeexPageFragment.WX_RENDER_STRATEGY) ? WXRenderStrategy.valueOf(map.get(WeexPageFragment.WX_RENDER_STRATEGY).toString()) : wXRenderStrategy;
        } catch (Exception e2) {
            WXLogUtils.e("RenderPresenter", WXLogUtils.getStackTrace(e2));
            return wXRenderStrategy;
        }
    }
}
