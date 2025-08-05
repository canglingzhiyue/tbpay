package com.taobao.android.artry.dycontainer;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.utils.d;
import java.net.URLDecoder;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class WebViewContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IWVWebView b;

    static {
        kge.a(-1471477053);
    }

    public WebViewContainer(Context context) {
        ARUCWebView aRUCWebView = new ARUCWebView(context);
        aRUCWebView.setBackgroundColor(0);
        this.b = aRUCWebView;
    }

    public WebViewContainer(IWVWebView iWVWebView) {
        this.b = iWVWebView;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c6330", new Object[]{this, bVar});
            return;
        }
        IWVWebView iWVWebView = this.b;
        if (iWVWebView == null) {
            return;
        }
        BaseWVApiPlugin.addWVActionListener(iWVWebView, bVar);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        IWVWebView iWVWebView = this.b;
        return iWVWebView instanceof ARUCWebView ? (ARUCWebView) iWVWebView : iWVWebView.getView();
    }

    public IWVWebView b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("cf3057b1", new Object[]{this}) : this.b;
    }

    public void a(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (this.b == null) {
        } else {
            String a2 = a(str);
            IWVWebView iWVWebView = this.b;
            if (iWVWebView instanceof ARUCWebView) {
                ((ARUCWebView) iWVWebView).loadUrl(a2, map);
            } else {
                iWVWebView.loadUrl(a2);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IWVWebView iWVWebView = this.b;
        if (!(iWVWebView instanceof ARUCWebView)) {
            return;
        }
        ((ARUCWebView) iWVWebView).showLoading();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IWVWebView iWVWebView = this.b;
        if (!(iWVWebView instanceof ARUCWebView)) {
            return;
        }
        ((ARUCWebView) iWVWebView).hideLoading();
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!d.a(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable unused) {
            Log.e("WebViewContainer", "failed to decode url[%s]" + str);
            return str;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        BaseWVApiPlugin.removeWVActionListener(this.b);
        IWVWebView iWVWebView = this.b;
        if (!(iWVWebView instanceof ARUCWebView)) {
            return;
        }
        ((ARUCWebView) iWVWebView).destroy();
        this.b = null;
    }
}
