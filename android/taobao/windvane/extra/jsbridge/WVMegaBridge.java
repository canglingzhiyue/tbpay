package android.taobao.windvane.extra.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.performance.WVWebViewPageModel;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVBridgeEngine;
import android.taobao.windvane.util.a;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import tb.alo;
import tb.alq;
import tb.alu;
import tb.dqn;
import tb.kge;

/* loaded from: classes2.dex */
public class WVMegaBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final alu mAbilityHubAdapter;
    private final WVUCWebView mWebView;

    static {
        kge.a(1747285172);
        kge.a(1028243835);
    }

    public static /* synthetic */ WVUCWebView access$000(WVMegaBridge wVMegaBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("79e61341", new Object[]{wVMegaBridge}) : wVMegaBridge.mWebView;
    }

    public static /* synthetic */ alu access$100(WVMegaBridge wVMegaBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alu) ipChange.ipc$dispatch("5d6e1827", new Object[]{wVMegaBridge}) : wVMegaBridge.mAbilityHubAdapter;
    }

    public WVMegaBridge(WVUCWebView wVUCWebView, alu aluVar) {
        this.mAbilityHubAdapter = aluVar;
        this.mWebView = wVUCWebView;
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String nativeCall(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ffe45e6", new Object[]{this, str, str2, str3});
        }
        final String[] strArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: android.taobao.windvane.extra.jsbridge.WVMegaBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    alq alqVar = new alq();
                    if (WVMegaBridge.access$000(WVMegaBridge.this) != null) {
                        String url = WVMegaBridge.access$000(WVMegaBridge.this).getUrl();
                        alqVar.a("url", url);
                        alqVar.a("pageId", WVMegaBridge.access$000(WVMegaBridge.this).getCurId());
                        alqVar.a((View) WVMegaBridge.access$000(WVMegaBridge.this));
                        String customMegaBizId = WVMegaBridge.access$000(WVMegaBridge.this).getWebViewContext().getCustomMegaBizId();
                        if (j.commonConfig.da) {
                            alqVar.a(a.a(url, customMegaBizId, WVMegaBridge.access$000(WVMegaBridge.this).getContext()));
                        }
                    }
                    ExecuteResult a2 = WVMegaBridge.access$100(WVMegaBridge.this).a(str, str2, alqVar, JSON.parseObject(str3), new alo() { // from class: android.taobao.windvane.extra.jsbridge.WVMegaBridge.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.alo
                        public void onCallback(ExecuteResult executeResult) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                            }
                        }
                    });
                    if (a2 != null) {
                        strArr[0] = new JSONObject(a2.c()).toJSONString();
                    }
                } catch (Throwable th) {
                    String[] strArr2 = strArr;
                    if (strArr2[0] == null) {
                        strArr2[0] = a$a.c(th.getMessage()).c().toString();
                    }
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return strArr[0];
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String getMegaBridgeJs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dedbf7f", new Object[]{this});
        }
        if (j.commonConfig.cI) {
            return WVBridgeEngine.WINDVANE_CORE_JS;
        }
        return WVBridgeEngine.WINDVANE_MEGA_BRIDGE_JS;
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String getInjectJS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("27c608e9", new Object[]{this}) : this.mWebView.getInjectJS();
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String getStages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("254c7ae", new Object[]{this});
        }
        try {
            dqn webViewPageModel = this.mWebView.getWebViewContext().getWebViewPageModel();
            return webViewPageModel instanceof WVWebViewPageModel ? JSONObject.toJSONString(((WVWebViewPageModel) webViewPageModel).getStageMap()) : "{}";
        } catch (Exception unused) {
            return "{}";
        }
    }
}
