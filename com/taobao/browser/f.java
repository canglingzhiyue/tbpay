package com.taobao.browser;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.alibaba.security.realidentity.ui.activity.RPWebViewActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.webview.PHAWVUCWebView;
import java.io.IOException;
import tb.kge;

/* loaded from: classes6.dex */
public class f implements com.taobao.pha.core.controller.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final PHAWVUCWebView f16773a;
    private boolean b = true;

    static {
        kge.a(1413974461);
        kge.a(1674055615);
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8417b84d", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.b = z;
        return z;
    }

    public f(PHAWVUCWebView pHAWVUCWebView) {
        this.f16773a = pHAWVUCWebView;
    }

    @Override // com.taobao.pha.core.controller.g
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.b) {
            return false;
        }
        this.f16773a.evaluateJavascript(RPWebViewActivity.j, new ValueCallback<String>() { // from class: com.taobao.browser.PHANativeBackHandler$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                    return;
                }
                if (!TextUtils.isEmpty(str) ? "true".equals(str.replace("\"", "").replace("'", "")) : false) {
                    f fVar = f.this;
                    f.$ipChange.getWVCallBackContext().fireEvent(RPWebViewActivity.l);
                    return;
                }
                f.a(f.this, false);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.browser.PHANativeBackHandler$1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            Runtime.getRuntime().exec("input keyevent 4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        return true;
    }
}
