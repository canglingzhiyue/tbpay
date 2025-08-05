package com.taobao.pha.tb.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.p;
import android.taobao.windvane.webview.IWVWebView;
import android.view.View;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import tb.kge;

/* loaded from: classes7.dex */
public class b implements com.taobao.pha.core.jsbridge.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private p f18829a;
    private IWVWebView b;

    static {
        kge.a(1826423106);
        kge.a(-1278463678);
    }

    public b(AppController appController) {
        this.b = new a(appController);
        this.f18829a = new p(appController.C(), this.b);
    }

    @Override // com.taobao.pha.core.jsbridge.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        p pVar = this.f18829a;
        if (pVar != null) {
            pVar.a();
            this.f18829a = null;
        }
        this.b = null;
    }

    public p b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("a7c1a465", new Object[]{this}) : this.f18829a;
    }

    public IWVWebView c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("8faf990", new Object[]{this}) : this.b;
    }

    /* loaded from: classes7.dex */
    public static class a implements IWVWebView {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private AppController f18830a;
        private String b = null;

        static {
            kge.a(308845652);
            kge.a(-1113217877);
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public Context _getContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("78ce3197", new Object[]{this});
            }
            return null;
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public boolean _post(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("32066a08", new Object[]{this, runnable})).booleanValue();
            }
            return false;
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public void addJsObject(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b80dd8d6", new Object[]{this, str, obj});
            }
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public boolean back() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public void clearCache() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            }
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public void evaluateJavascript(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbc0a0f7", new Object[]{this, str});
            }
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
            }
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public Object getJsObject(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("a0dcc3a3", new Object[]{this, str});
            }
            return null;
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public String getUserAgentString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a06231a4", new Object[]{this}) : "";
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public View getView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
            }
            return null;
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public void hideLoadingView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7409c66", new Object[]{this});
            }
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public void loadUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            }
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public void refresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            }
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public void setUserAgentString(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("260bd7ba", new Object[]{this, str});
            }
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public void showLoadingView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8f114b", new Object[]{this});
            }
        }

        public a(AppController appController) {
            this.f18830a = appController;
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public String getUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.f18830a.t().toString();
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public void fireEvent(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msgType", (Object) "call");
            jSONObject.put("func", (Object) str);
            jSONObject.put("param", JSONObject.parse(str2));
            if (this.f18830a.J() == null) {
                return;
            }
            this.f18830a.J().a(jSONObject);
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public String getDataOnActive() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b602214", new Object[]{this}) : this.b;
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public void setDataOnActive(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("714294e2", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        @Override // android.taobao.windvane.webview.IWVWebView
        public Context getContext() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.f18830a.C();
        }
    }
}
