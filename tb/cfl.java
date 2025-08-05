package tb;

import android.content.Context;
import android.webkit.ValueCallback;
import com.alibaba.ut.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;

/* loaded from: classes3.dex */
public class cfl implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WebView f26267a;

    public cfl(WebView webView) {
        this.f26267a = null;
        this.f26267a = webView;
    }

    @Override // com.alibaba.ut.d
    public boolean a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39112ea", new Object[]{this, runnable})).booleanValue() : this.f26267a.post(runnable);
    }

    @Override // com.alibaba.ut.d
    public void a(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4d5078", new Object[]{this, str, valueCallback});
        } else {
            this.f26267a.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // com.alibaba.ut.d
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
            return;
        }
        this.f26267a.addJavascriptInterface(obj, str);
        cfi.d(null, "mWebview" + this.f26267a);
    }

    @Override // com.alibaba.ut.d
    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f26267a.getContext();
    }
}
