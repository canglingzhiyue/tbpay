package android.taobao.windvane.extra.uc;

import android.net.Uri;
import android.taobao.windvane.config.a;
import android.taobao.windvane.config.j;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.embed.Empty;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.EmbedViewConfig;
import com.uc.webview.export.extension.IEmbedView;
import com.uc.webview.export.extension.IEmbedViewContainer;
import com.uc.webview.export.extension.UCClient;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class WVUCClient extends UCClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUCClient";
    public String tStart;
    public IWVWebView webView;

    static {
        kge.a(1404901366);
    }

    public static /* synthetic */ Object ipc$super(WVUCClient wVUCClient, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1380575401) {
            super.onPageStartedEx((WebView) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode != 1507240588) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onWebViewEvent((WebView) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
    }

    public WVUCClient() {
        this.webView = null;
        this.tStart = "0";
    }

    public WVUCClient(IWVWebView iWVWebView) {
        this.webView = null;
        this.tStart = "0";
        this.webView = iWVWebView;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    @Override // com.uc.webview.export.extension.UCClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onWebViewEvent(final com.uc.webview.export.WebView r10, int r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCClient.onWebViewEvent(com.uc.webview.export.WebView, int, java.lang.Object):void");
    }

    @Override // com.uc.webview.export.extension.UCClient
    public void onGpuProcessGone(WebView webView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71eb23d1", new Object[]{this, webView, new Integer(i)});
            return;
        }
        m.c("sandbox", "onGpuProcessGone");
        if ((i & 2) == 0) {
            return;
        }
        Uri parse = Uri.parse(this.webView.getUrl());
        String str = parse.getHost() + parse.getPath();
        if (!a.b) {
            m.e("GPU", "gpu process is killed, url = [" + str + "] , upload information!");
            android.taobao.windvane.monitor.a.commitFail(android.taobao.windvane.monitor.a.MONITOR_POINT_GPU_PROCESS_GONE_TYPE, 1, null, str);
        }
        if (j.commonConfig.u.n.contains(str)) {
            m.e("GPU", "gpu process error, need not reload page, url = [" + str + riy.ARRAY_END_STR);
            return;
        }
        j.a();
        if (!j.commonConfig.av) {
            return;
        }
        IWVWebView iWVWebView = this.webView;
        if (iWVWebView instanceof WVUCWebView) {
            ((WVUCWebView) iWVWebView).refreshWhenForeground();
        } else {
            iWVWebView.refresh();
        }
        m.e("GPU", "gpu process error, reload page, url = [" + str + riy.ARRAY_END_STR);
    }

    @Override // com.uc.webview.export.extension.UCClient
    public IEmbedView getEmbedView(EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        BaseEmbedView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IEmbedView) ipChange.ipc$dispatch("5415cbeb", new Object[]{this, embedViewConfig, iEmbedViewContainer});
        }
        Map map = embedViewConfig.mObjectParam;
        if (map.containsKey(b.VIEW_TYPE)) {
            String str = (String) map.get(b.VIEW_TYPE);
            String str2 = map.containsKey("bridgeId") ? (String) map.get("bridgeId") : "";
            if (j.commonConfig.bV) {
                a2 = android.taobao.windvane.embed.a.a(str2, str, this.webView, embedViewConfig, iEmbedViewContainer);
            } else {
                a2 = android.taobao.windvane.embed.a.a(str2, str, this.webView, embedViewConfig);
            }
            if (a2 == null) {
                m.e(android.taobao.windvane.monitor.a.MONITOR_POINT_EMBED_VIEW, "failed to create embedView");
            } else {
                iEmbedViewContainer.setOnParamChangedListener(a2);
                iEmbedViewContainer.setOnStateChangedListener(a2);
                iEmbedViewContainer.setOnVisibilityChangedListener(a2);
                return a2;
            }
        } else {
            m.e(android.taobao.windvane.monitor.a.MONITOR_POINT_EMBED_VIEW, "viewType should not be lost");
        }
        Empty empty = new Empty();
        empty.init("", "empty", this.webView, null);
        return empty;
    }

    @Override // com.uc.webview.export.extension.UCClient
    public void onPageStartedEx(WebView webView, String str) {
        WVUCWebViewClient webViewClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb61757", new Object[]{this, webView, str});
            return;
        }
        super.onPageStartedEx(webView, str);
        if (!(webView instanceof WVUCWebView) || (webViewClient = ((WVUCWebView) webView).getWebViewClient()) == null) {
            return;
        }
        webViewClient.setPageStartUrl(str);
    }
}
