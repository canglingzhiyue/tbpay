package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVBase;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.d;
import com.taobao.android.nav.Nav;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.exbrowser.BrowserUpperActivity;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.utils.i;
import com.taobao.pha.tb.H5NavProcess;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.o;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.ngu;

/* loaded from: classes6.dex */
public class WVWindow extends WVBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVWindow";
    public Handler mHandler;

    static {
        kge.a(-737844974);
    }

    public static /* synthetic */ Object ipc$super(WVWindow wVWindow, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode != -1126948911) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        if (!(iWVWebView instanceof BrowserHybridWebView)) {
            return;
        }
        this.mHandler = ((BrowserHybridWebView) iWVWebView).getOutHandler();
    }

    @Override // android.taobao.windvane.jsbridge.api.WVBase, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("openWindow".equals(str)) {
            BrowserUtil.a(TAG, BrowserUtil.f16842a, str, this.mWebView != null ? this.mWebView.getUrl() : null, null);
            openWindow(str2, wVCallBackContext);
            return true;
        }
        return super.execute(str, str2, wVCallBackContext);
    }

    private void openWindow(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b284a1a8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("popBeforeOpen", false);
            String string = jSONObject.getString("url");
            String optString = jSONObject.optString("transitionParams", null);
            boolean optBoolean2 = jSONObject.optBoolean("nextPageAnimation", true);
            Intent intent = new Intent();
            if (!optBoolean2) {
                string = p.a(string, "nextPageAnimation", "false");
            }
            Uri parse = Uri.parse(string);
            Nav from = Nav.from(this.mContext);
            f a2 = o.a(this.mContext);
            if (a2 == null || !o.f(a2)) {
                from.disallowLoopback();
            }
            if (!optBoolean2) {
                from.disableTransition();
            }
            if (optString != null) {
                Bundle bundle = new Bundle();
                bundle.putString("transitionParams", optString);
                if (from.withExtras(bundle).toUri(string)) {
                    wVCallBackContext.success();
                    if (!optBoolean || this.mHandler != null) {
                        return;
                    }
                    ((Activity) this.mContext).finish();
                    return;
                }
            } else if (from.toUri(string)) {
                wVCallBackContext.success();
                if (!optBoolean || this.mHandler != null) {
                    return;
                }
                ((Activity) this.mContext).finish();
                return;
            } else {
                try {
                    if (this.mWebView != null && WVCore.getInstance().isUCSupport() && ((WVUCWebView) this.mWebView).getUCExtension() != null) {
                        this.mWebView.loadUrl(string);
                        wVCallBackContext.success();
                        return;
                    }
                } catch (Throwable unused) {
                    r rVar = new r();
                    rVar.a("errorInfo", "loadUrl not in webview");
                    wVCallBackContext.error(rVar);
                    return;
                }
            }
            if (this.mContext instanceof BrowserUpperActivity) {
                r rVar2 = new r();
                rVar2.a("errorInfo", "You can openWindow only once");
                wVCallBackContext.error(rVar2);
                return;
            }
            intent.setData(parse);
            intent.setClass(this.mContext, BrowserUpperActivity.class);
            intent.addCategory(i.CATEGORY_MORE_WINDOW);
            if (optString != null) {
                intent.putExtra("transitionParams", optString);
            }
            if (ngu.f()) {
                intent.setPackage(this.mContext.getPackageName());
                new H5NavProcess().process(intent, null);
            }
            if (this.mContext instanceof Activity) {
                if (Build.VERSION.SDK_INT >= 16) {
                    d.a((Activity) this.mContext, intent, 7000);
                } else {
                    ((Activity) this.mContext).startActivityForResult(intent, 7000);
                }
                if (!optBoolean2) {
                    ((Activity) this.mContext).overridePendingTransition(0, 0);
                }
                if (optBoolean) {
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.sendEmptyMessage(1105);
                    } else {
                        ((Activity) this.mContext).finish();
                    }
                }
                wVCallBackContext.success();
                return;
            }
            r rVar3 = new r();
            rVar3.a("errorInfo", "Your context is not Activity");
            wVCallBackContext.error(rVar3);
        } catch (JSONException unused2) {
            m.e(TAG, "openWindow: param parse to JSON error, param=" + str);
            wVCallBackContext.error();
        }
    }
}
