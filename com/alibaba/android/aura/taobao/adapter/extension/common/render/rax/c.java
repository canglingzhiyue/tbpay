package com.alibaba.android.aura.taobao.adapter.extension.common.render.rax;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.Map;
import tb.ami;
import tb.arc;
import tb.awk;
import tb.bay;
import tb.bqd;
import tb.bqe;
import tb.bsu;
import tb.ept;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WVUCWebView b;
    private boolean d;
    private AURARenderComponent f;
    private ViewGroup g;
    private final String h;

    /* renamed from: a  reason: collision with root package name */
    private final String f2189a = "RaxComponentCreator";
    private String c = null;
    private final Map<String, AURARenderComponent> e = new HashMap();

    static {
        kge.a(-2034169033);
    }

    public static /* synthetic */ WVUCWebView a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("298ca440", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ String b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fdf8bc6a", new Object[]{cVar}) : cVar.h;
    }

    public c(String str, boolean z) {
        this.d = false;
        this.h = str;
        this.d = z;
    }

    public AURARenderComponent a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("cb48fc1d", new Object[]{this, str});
        }
        AURARenderComponent aURARenderComponent = this.e.get(str);
        return aURARenderComponent == null ? this.f : aURARenderComponent;
    }

    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer, RaxJSBridgeApiPlugin raxJSBridgeApiPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8bea80f9", new Object[]{this, viewGroup, aURARenderComponentContainer, raxJSBridgeApiPlugin});
        }
        if (this.b != null && this.d) {
            a(viewGroup);
            return this.b;
        }
        this.g = viewGroup;
        Context context = viewGroup.getContext();
        c();
        this.b = new WVUCWebView(context);
        this.b.setBackgroundColor(-1);
        a(viewGroup);
        this.b.setWebViewClient(new WVUCWebViewClient(context) { // from class: com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -332805219) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                } else if (hashCode != 1373550412) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                    return null;
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                if (c.a(c.this) == null) {
                    return;
                }
                c.a(c.this).setVisibility(0);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                    return;
                }
                super.onReceivedError(webView, i, str, str2);
                String b = c.b(c.this);
                bsu.a(b, "TAG_RAX_ERROR", "umf-render-rax", ag.ARG_ERROR_CODE + i + ",failingUrl=" + str2);
            }
        });
        this.b.setWebChromeClient(new WVUCWebChromeClient(context) { // from class: com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.c.2
        });
        q.a(RaxJSBridgeApiPlugin.UMF_JS_BRIDGE_CLASS_NAME, raxJSBridgeApiPlugin);
        arc.a().a("RaxComponentCreator", ept.SUB_CREATE_VIEW, "finish register windvane plugin:UMFJsBridge");
        this.b.setVerticalScrollBarEnabled(false);
        return this.b;
    }

    private void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        int height = viewGroup.getHeight();
        if (height <= 0) {
            height = ami.a(viewGroup.getContext()) ? ami.d(viewGroup.getContext()) : bay.c();
        }
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, height));
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.b;
        if (wVUCWebView == null) {
            return;
        }
        try {
            wVUCWebView.destroy();
        } catch (Throwable th) {
            bqd a2 = bqe.a();
            a2.c("RaxComponentCreator", "destroyWebView#exception=" + th.getMessage());
        }
        this.b = null;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        RecyclerView b = b(view);
        if (b == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = b.getLayoutManager();
        if (!(layoutManager instanceof VirtualLayoutManager)) {
            return;
        }
        ((VirtualLayoutManager) layoutManager).a(new com.alibaba.android.ultron.ext.vlayout.extend.a() { // from class: com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.ext.vlayout.extend.a
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.extend.a
            public boolean b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
                }
                return false;
            }
        });
    }

    private RecyclerView b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("45b7b65b", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            return null;
        }
        return b((View) parent);
    }

    public void a(AURARenderComponent aURARenderComponent, View view, com.alibaba.android.umf.taobao.adapter.widget.floatview.a aVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a8503", new Object[]{this, aURARenderComponent, view, aVar, dVar});
            return;
        }
        a(aVar, dVar);
        this.f = aURARenderComponent;
        if (!(view instanceof WVUCWebView)) {
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            bqe.a().c("RaxComponentCreator", "renderView#data is null");
            bsu.a(this.h, "TAG_RAX_ERROR", "umf-render-rax", "renderView#data is null");
            return;
        }
        AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
        if (aURARenderComponentContainer == null) {
            bqe.a().c("RaxComponentCreator", "renderView#container is null");
            bsu.a(this.h, "TAG_RAX_ERROR", "umf-render-rax", "renderView#container is null");
            return;
        }
        String str = aURARenderComponentContainer.url;
        if (TextUtils.isEmpty(str)) {
            bqe.a().c("RaxComponentCreator", "renderView#url is empty");
            bsu.a(this.h, "TAG_RAX_ERROR", "umf-render-rax", "renderView#url is empty");
            return;
        }
        a((View) this.g);
        WVUCWebView wVUCWebView = (WVUCWebView) view;
        String str2 = aURARenderComponent.key;
        if (TextUtils.isEmpty(str2)) {
            bqe.a().c("RaxComponentCreator", "renderView#componentKey is empty");
            bsu.a(this.h, "TAG_RAX_ERROR", "umf-render-rax", "renderView#componentKey is empty");
            return;
        }
        if (this.d && a(str, str2).equals(this.c)) {
            awk.a(this.b, awk.BRIDGE_EVENT_UPDATE, d());
        } else {
            if (!TextUtils.isEmpty(wVUCWebView.getCurrentUrl())) {
                wVUCWebView.setVisibility(4);
            }
            wVUCWebView.loadUrl(str);
            this.c = a(str, str2);
        }
        this.e.put(str2, aURARenderComponent);
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        AURARenderComponent a2 = a("");
        if (a2 != null && a2.protocol != null) {
            return a2.protocol.toJSONString();
        }
        return null;
    }

    private void a(com.alibaba.android.umf.taobao.adapter.widget.floatview.a aVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d28d0c", new Object[]{this, aVar, dVar});
        } else if (aVar == null) {
        } else {
            aVar.a(dVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c();
        q.b(RaxJSBridgeApiPlugin.UMF_JS_BRIDGE_CLASS_NAME);
        this.e.clear();
        this.f = null;
        this.c = null;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : a.b.b;
    }

    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        String str = null;
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null && aURARenderComponentData.container != null) {
            AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
            str = aURARenderComponentContainer.containerType + "_" + aURARenderComponentContainer.name + "_" + aURARenderComponentContainer.version;
        }
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(System.currentTimeMillis());
            bqe.a().c("RaxComponentCreator", "getItemViewType#failed to get itemViewType from component, use system time instead, component=" + aURARenderComponent);
        }
        return str + System.currentTimeMillis();
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        return str + "#" + str2;
    }
}
