package com.taobao.taolivecontainer;

import android.content.Context;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.util.AttributeSet;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolivecontainer.jsbridge.TBLiveBasePlugin;
import com.uc.webview.export.WebViewClient;
import tb.kge;
import tb.psq;
import tb.seh;

/* loaded from: classes8.dex */
public class TBLiveH5Container extends TBLiveWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private long loadUrlTimestamp;
    private b mBuilder;
    public d mWebViewProxy;

    public static /* synthetic */ Object ipc$super(TBLiveH5Container tBLiveH5Container, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1988789126:
                super.loadUrl((String) objArr[0]);
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1118518886:
                super.setWebViewClient((WebViewClient) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(831792241);
        kge.a(749643165);
        TAG = TBLiveH5Container.class.getSimpleName();
        q.a("TBLiveBasePlugin", (Class<? extends e>) TBLiveBasePlugin.class, true);
    }

    public void setLoadUrlTimestamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5f238e", new Object[]{this, new Long(j)});
        } else {
            this.loadUrlTimestamp = j;
        }
    }

    public void setBuilder(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c247108", new Object[]{this, bVar});
        } else {
            this.mBuilder = bVar;
        }
    }

    public b getBuilder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f6f97fc4", new Object[]{this}) : this.mBuilder;
    }

    public TBLiveH5Container(Context context) {
        this(context, null);
    }

    public TBLiveH5Container(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBLiveH5Container(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void pageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e933178b", new Object[]{this});
            return;
        }
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pageAppear", "{}");
        b bVar = this.mBuilder;
        if (bVar == null) {
            return;
        }
        bVar.a(TAG, m.PAGE_APPEAR);
    }

    public void pageDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d96b47b", new Object[]{this});
            return;
        }
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pageDisappear", "{}");
        b bVar = this.mBuilder;
        if (bVar == null) {
            return;
        }
        bVar.a(TAG, "pageDisAppear");
    }

    public void changeScreenLandscape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a956e6", new Object[]{this});
            return;
        }
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pageLandscape", "{}");
        b bVar = this.mBuilder;
        if (bVar == null) {
            return;
        }
        bVar.a(TAG, "changeScreenLandscape");
    }

    public void changeScreenPortrait() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35710fe", new Object[]{this});
            return;
        }
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pagePortrait", "{}");
        b bVar = this.mBuilder;
        if (bVar == null) {
            return;
        }
        bVar.a(TAG, "changeScreenPortrait");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pageDisappear", "{}");
        b bVar = this.mBuilder;
        if (bVar == null) {
            return;
        }
        bVar.a(TAG, "pageDisAppear onPause");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        WVStandardEventCenter.postNotificationToJS(this, "TBLiveBasePlugin.event.pageAppear", "{}");
        b bVar = this.mBuilder;
        if (bVar == null) {
            return;
        }
        bVar.a(TAG, "pageAppear onResume");
    }

    @Override // com.taobao.taolivecontainer.TBLiveWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        b bVar = this.mBuilder;
        if (bVar != null) {
            bVar.a(TAG, "destroy");
        }
        this.mBuilder = null;
        d dVar = this.mWebViewProxy;
        if (dVar == null) {
            return;
        }
        dVar.a();
        this.mWebViewProxy = null;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else {
            super.loadUrl(str);
        }
    }

    public void renderSuccess(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb76c5dc", new Object[]{this, jSONObject});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mBuilder != null && jSONObject != null) {
            currentTimeMillis = this.mBuilder.a("tlh5_h5_render_success", psq.a(jSONObject));
        }
        if (!seh.a(getContext())) {
            return;
        }
        Context context = getContext();
        Toast.makeText(context, "TBLiveH5Container_time:" + (currentTimeMillis - this.loadUrlTimestamp), 0).show();
    }

    public void setWebViewClientProxy(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d72ee33", new Object[]{this, dVar});
            return;
        }
        super.setWebViewClient(dVar);
        this.mWebViewProxy = dVar;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ab3e66", new Object[]{this, webViewClient});
            return;
        }
        d dVar = this.mWebViewProxy;
        if (dVar == null) {
            return;
        }
        dVar.a(webViewClient);
    }
}
