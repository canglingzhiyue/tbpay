package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.alibaba.ut.TrackerWebView;
import com.alibaba.ut.d;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static d a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1b7dc596", new Object[]{activity});
        }
        WebView webView = null;
        TrackerWebView trackerWebView = (TrackerWebView) activity.getClass().getAnnotation(TrackerWebView.class);
        if (trackerWebView != null) {
            webView = (WebView) activity.findViewById(trackerWebView.value());
        }
        if (webView != null) {
            return new cfk(webView);
        }
        return a(activity.getWindow().getDecorView());
    }

    private static d a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("42231de6", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        if (view instanceof WebView) {
            return new cfk((WebView) view);
        }
        if (a(view.getClass())) {
            return new cfl((com.uc.webview.export.WebView) view);
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            d a2 = a(viewGroup.getChildAt(i));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private static boolean a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20fa47d9", new Object[]{cls})).booleanValue();
        }
        if (cls == null || "android.view.View".equalsIgnoreCase(cls.getName()) || cls.getSuperclass() == null) {
            return false;
        }
        if (!"com.uc.webview.export.WebView".equalsIgnoreCase(cls.getName())) {
            return a(cls.getSuperclass());
        }
        return true;
    }
}
