package com.sina.weibo.sdk.web;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.sina.weibo.sdk.web.b.b;
import tb.kge;

/* loaded from: classes4.dex */
public class WebActivity extends Activity implements a {
    private LinearLayout am;
    private TextView an;
    private TextView ao;
    private WebView ap;
    private ProgressBar aq;
    private b ar;
    private com.sina.weibo.sdk.web.a.b as;
    private String at;

    static {
        kge.a(-585043212);
        kge.a(-1035203022);
    }

    private static void a(WebView webView, String str) {
        try {
            WebView.class.getDeclaredMethod("removeJavascriptInterface", String.class).invoke(webView, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static /* synthetic */ void d(WebActivity webActivity) {
        webActivity.am.setVisibility(8);
        webActivity.ap.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("https://service.weibo.com/share/mobilesdk.php") || str.startsWith("https://open.weibo.cn/oauth2/authorize?");
        }
        return false;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        j.b(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.web.WebActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.as.s()) {
                return true;
            }
            if (this.ap.canGoBack()) {
                this.ap.goBack();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.sina.weibo.sdk.web.a
    public final void p() {
        this.am.setVisibility(0);
        this.ap.setVisibility(8);
    }

    @Override // com.sina.weibo.sdk.web.a
    public final void q() {
        finish();
    }
}
