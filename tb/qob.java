package tb;

import android.content.Context;
import android.os.Build;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.webview.WVWebView;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebSettings;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.view.PopLayerWVPlugin;
import com.taobao.tbpoplayer.view.PopLayerWebView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class qob {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<ConsoleMessage.MessageLevel, Character> WEBCONSOLE_LOGCAT_MAP;

    static {
        kge.a(347084404);
        HashMap hashMap = new HashMap();
        WEBCONSOLE_LOGCAT_MAP = hashMap;
        hashMap.put(ConsoleMessage.MessageLevel.TIP, 'v');
        WEBCONSOLE_LOGCAT_MAP.put(ConsoleMessage.MessageLevel.LOG, 'i');
        WEBCONSOLE_LOGCAT_MAP.put(ConsoleMessage.MessageLevel.WARNING, 'w');
        WEBCONSOLE_LOGCAT_MAP.put(ConsoleMessage.MessageLevel.ERROR, 'e');
        WEBCONSOLE_LOGCAT_MAP.put(ConsoleMessage.MessageLevel.DEBUG, 'd');
    }

    public static void a(Context context, PopLayerWebView popLayerWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b87e7b2", new Object[]{context, popLayerWebView});
            return;
        }
        WVUCWebView webView = popLayerWebView.getWebView();
        if (webView instanceof WVWebView) {
            WVWebView wVWebView = (WVWebView) webView;
            wVWebView.setBackgroundColor(1);
            WebSettings settings = wVWebView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSavePassword(false);
            if (Build.VERSION.SDK_INT >= 16) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
            wVWebView.addJsObject("WVPopLayer", new PopLayerWVPlugin(popLayerWebView));
            View view = new View(context);
            view.setBackgroundColor(1);
            wVWebView.getWvUIModel().setErrorView(view);
            wVWebView.removeJavascriptInterface("searchBoxJavaBridge_");
        } else if (!(popLayerWebView.getWebView() instanceof WVUCWebView)) {
        } else {
            WVUCWebView wVUCWebView = webView;
            wVUCWebView.setBackgroundColor(0);
            com.uc.webview.export.WebSettings settings2 = wVUCWebView.getSettings();
            settings2.setJavaScriptEnabled(true);
            settings2.setSavePassword(false);
            settings2.setAllowFileAccessFromFileURLs(false);
            settings2.setAllowUniversalAccessFromFileURLs(false);
            wVUCWebView.addJsObject("WVPopLayer", new PopLayerWVPlugin(popLayerWebView));
            View view2 = new View(context);
            view2.setBackgroundColor(1);
            wVUCWebView.getWvUIModel().setErrorView(view2);
            popLayerWebView.setUseCacheMark(false);
            wVUCWebView.removeJavascriptInterface("searchBoxJavaBridge_");
        }
    }
}
