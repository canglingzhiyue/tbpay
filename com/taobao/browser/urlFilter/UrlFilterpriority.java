package com.taobao.browser.urlFilter;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.taobao.util.k;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.browser.urlFilter.UrlFilter;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.login4android.api.Login;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import tb.kge;
import tb.ngu;

/* loaded from: classes6.dex */
public class UrlFilterpriority implements UrlFilter.URLFilterinterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private Handler mHandler;
    private IWVWebView mWebView;

    static {
        kge.a(-436273015);
        kge.a(33568401);
        TAG = UrlFilterpriority.class.getSimpleName();
    }

    public UrlFilterpriority(IWVWebView iWVWebView, Handler handler) {
        this.mWebView = iWVWebView;
        this.mHandler = handler;
    }

    @Override // com.taobao.browser.urlFilter.UrlFilter.URLFilterinterface
    public boolean doFilter(Context context, String str) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebc59a6c", new Object[]{this, context, str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if ("http://www.taobao.com".equalsIgnoreCase(str) || "http://www.taobao.com/".equalsIgnoreCase(str) || "https://www.taobao.com".equalsIgnoreCase(str) || "https://www.taobao.com/".equalsIgnoreCase(str) || "www.taobao.com".equalsIgnoreCase(str) || "www.taobao.com/".equalsIgnoreCase(str)) {
            TBS.Ext.commitEvent(29002, "success");
            this.mHandler.sendEmptyMessage(1102);
            Nav.from(Globals.getApplication()).toUri("http://m.taobao.com/index.htm");
            BrowserUtil.a(TAG, "doFilter", "nav_to_home", str, null);
            return true;
        } else if (str.startsWith("mailto:") || str.startsWith("tel:")) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                k.a("ExtraUrlFilter", "doFilter: ActivityNotFoundException, url=" + str);
            }
            BrowserUtil.a(TAG, "doFilter", "nav_to_mail_or_tel", str, null);
            return true;
        } else {
            if (parse.isHierarchical() && ("taobao".equals(parse.getScheme()) || "http".equals(parse.getScheme()) || "https".equals(parse.getScheme()))) {
                if (str.startsWith("taobao://")) {
                    parse = Uri.parse(str.replace("taobao://", com.taobao.search.common.util.k.HTTP_PREFIX));
                }
                String queryParameter = parse.getQueryParameter("customtitle");
                if (queryParameter != null && this.mHandler != null) {
                    BrowserUtil.a(TAG, "doFilter", "query_has_customtitle", str, null);
                    Message obtain = Message.obtain();
                    obtain.obj = queryParameter;
                    obtain.what = 1104;
                    this.mHandler.sendMessage(obtain);
                }
                String queryParameter2 = parse.getQueryParameter("landscape");
                if (queryParameter2 != null && "true".equals(queryParameter2.trim())) {
                    BrowserUtil.a(TAG, "doFilter", "query_has_landscape", str, null);
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        activity.setRequestedOrientation(0);
                        if (ngu.q() && (window = activity.getWindow()) != null) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            if (attributes != null) {
                                attributes.systemUiVisibility = 4098;
                                window.setAttributes(attributes);
                            }
                            window.addFlags(1024);
                        }
                    }
                    return false;
                }
            }
            if (!str.contains("taobao.wap.alipay.com/cmsCente") || TextUtils.isEmpty(Login.getSid())) {
                return false;
            }
            BrowserUtil.a(TAG, "doFilter", "url_contains_cmsCente", str, null);
            String a2 = BrowserUtil.a(str, "s_id", Login.getSid());
            IWVWebView iWVWebView = this.mWebView;
            if (iWVWebView != null) {
                iWVWebView.loadUrl(a2);
            }
            return true;
        }
    }
}
