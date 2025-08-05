package tb;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/taobao/android/lightvane/webview/compat/WebViewCompat;", "", "()V", "disableAccessibility", "", "context", "Landroid/content/Context;", "onWebViewInit", ecg.UMB_FEATURE_WEB_VIEW, "Landroid/webkit/WebView;", "shouldDisableHardwareRenderInLayer", "", "lightvane_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class gwr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gwr INSTANCE;

    static {
        kge.a(-1202874130);
        INSTANCE = new gwr();
    }

    private gwr() {
    }

    @JvmStatic
    public static final void a(Context context, WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9be503", new Object[]{context, webView});
            return;
        }
        q.d(webView, "webView");
        webView.setVerticalScrollBarEnabled(false);
        webView.requestFocus();
        CookieManager.getInstance().setAcceptCookie(true);
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        }
        INSTANCE.a(context);
        if (Build.VERSION.SDK_INT < 17) {
            try {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        gwq.a();
        if (Build.VERSION.SDK_INT < 11 || !INSTANCE.a()) {
            return;
        }
        try {
            webView.setLayerType(1, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a() {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.gwr.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            java.lang.String r2 = "56c6c6c"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            java.lang.String r0 = android.os.Build.MODEL
            if (r0 == 0) goto L42
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "Build.MODEL"
            kotlin.jvm.internal.q.b(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "GT-I95"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4 = 2
            r5 = 0
            boolean r0 = kotlin.text.n.b(r0, r1, r3, r4, r5)
            if (r0 == 0) goto L42
            java.lang.String r0 = android.os.Build.MANUFACTURER
            if (r0 == 0) goto L42
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "samsung"
            boolean r0 = kotlin.jvm.internal.q.a(r0, r1)
            if (r0 == 0) goto L42
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 18
            if (r1 != r4) goto L4b
            r1 = 1
            goto L4c
        L4b:
            r1 = 0
        L4c:
            if (r0 == 0) goto L51
            if (r1 == 0) goto L51
            return r2
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gwr.a():boolean");
    }

    private final void a(Context context) {
        if (Build.VERSION.SDK_INT != 17 || context == null) {
            return;
        }
        try {
            Object systemService = context.getSystemService("accessibility");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            if (!accessibilityManager.isEnabled()) {
                return;
            }
            Method setState = accessibilityManager.getClass().getDeclaredMethod(a.ATOM_EXT_setState, Integer.TYPE);
            q.b(setState, "setState");
            setState.setAccessible(true);
            setState.invoke(accessibilityManager, 0);
        } catch (Throwable unused) {
        }
    }
}
