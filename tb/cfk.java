package tb;

import android.content.Context;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.alibaba.ut.d;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cfk implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WebView f26266a;

    public cfk(WebView webView) {
        this.f26266a = webView;
    }

    @Override // com.alibaba.ut.d
    public boolean a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39112ea", new Object[]{this, runnable})).booleanValue() : this.f26266a.post(runnable);
    }

    @Override // com.alibaba.ut.d
    public void a(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4d5078", new Object[]{this, str, valueCallback});
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f26266a.evaluateJavascript(str, valueCallback);
        } else {
            WebView webView = this.f26266a;
            webView.loadUrl("javascript:" + str);
        }
    }

    @Override // com.alibaba.ut.d
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
            return;
        }
        this.f26266a.addJavascriptInterface(obj, str);
        cfi.d(null, "mWebview" + this.f26266a);
    }

    @Override // com.alibaba.ut.d
    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f26266a.getContext();
    }
}
