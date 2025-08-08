package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.d;
import com.taobao.android.nav.Nav;
import com.taobao.browser.BrowserActivity;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.exbrowser.BrowserUpperActivity;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.utils.i;
import com.taobao.pha.tb.H5NavProcess;
import com.taobao.tao.util.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.ngu;
import tb.riy;

/* loaded from: classes6.dex */
public class TBNative extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CATEGORY_UPPER_BROWSER = "upperBrowser";
    public static final String RESULT = "result";
    private static final String TAG = "TBNative";
    public Handler mHandler;

    static {
        kge.a(1788587400);
    }

    public static /* synthetic */ Object ipc$super(TBNative tBNative, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode != -1504501726) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDestroy();
            return null;
        }
    }

    public static /* synthetic */ void access$000(TBNative tBNative, WVCallBackContext wVCallBackContext, Bundle bundle, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28335456", new Object[]{tBNative, wVCallBackContext, bundle, intent});
        } else {
            tBNative.startSelf(wVCallBackContext, bundle, intent);
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

    @WindVaneInterface
    public final void nativeBack(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("872a2f2c", new Object[]{this, wVCallBackContext, str});
        } else if (this.mHandler != null) {
            if (StringUtil.isEmpty(str)) {
                this.mHandler.sendEmptyMessage(1105);
            } else {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString("result", str);
                obtain.what = 1105;
                obtain.setData(bundle);
                this.mHandler.sendMessage(obtain);
            }
            wVCallBackContext.success();
        } else {
            try {
                if (this.mContext instanceof Activity) {
                    ((Activity) this.mContext).finish();
                    wVCallBackContext.success();
                    return;
                }
            } catch (Throwable unused) {
            }
            wVCallBackContext.error();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mHandler = null;
        super.onDestroy();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        BrowserUtil.a(TAG, BrowserUtil.f16842a, str, this.mWebView != null ? this.mWebView.getUrl() : null, null);
        if ("nativeBack".equals(str)) {
            nativeBack(wVCallBackContext, str2);
        } else if ("openWindow".equals(str)) {
            openWindow(str2, wVCallBackContext);
            return true;
        } else if ("navTo".equals(str)) {
            navTo(str2, wVCallBackContext);
            return true;
        } else if ("openWindowCompatNavProcess".equals(str)) {
            openWindowCompatNavProcess(str2, wVCallBackContext);
        }
        return false;
    }

    private void openWindowCompatNavProcess(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd412d36", new Object[]{this, str, wVCallBackContext});
        } else {
            openWindowInner(str, wVCallBackContext, true);
        }
    }

    private void openWindow(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b284a1a8", new Object[]{this, str, wVCallBackContext});
        } else {
            openWindowInner(str, wVCallBackContext, false);
        }
    }

    private void openWindowInner(String str, final WVCallBackContext wVCallBackContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689f302a", new Object[]{this, str, wVCallBackContext, new Boolean(z)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("popBeforeOpen", false);
            if (optBoolean && this.mHandler != null) {
                this.mHandler.sendEmptyMessage(1105);
            }
            String string = jSONObject.getString("url");
            String optString = jSONObject.optString("transitionParams", null);
            boolean optBoolean2 = jSONObject.optBoolean("nextPageAnimation", true);
            if (!optBoolean2) {
                string = p.a(string, "nextPageAnimation", "false");
            }
            final Bundle bundle = new Bundle();
            bundle.putString("transitionParams", optString);
            bundle.putString("url", string);
            bundle.putBoolean("popBeforeOpen", optBoolean);
            Nav.a aVar = z ? new Nav.a() { // from class: com.taobao.browser.jsbridge.TBNative.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.nav.Nav.a
                public void a(boolean z2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6b74d729", new Object[]{this, new Boolean(z2), intent});
                    } else if (z2) {
                    } else {
                        TBNative.access$000(TBNative.this, wVCallBackContext, bundle, intent);
                    }
                }
            } : null;
            Nav from = Nav.from(this.mContext);
            if (!optBoolean2) {
                from.disableTransition();
            }
            if (optString != null) {
                from.withExtras(bundle);
                if (this.mContext instanceof BrowserActivity) {
                    from.disallowLoopback();
                    if (from.toUri(string, aVar)) {
                        wVCallBackContext.success();
                        return;
                    }
                } else if (from.toUri(string)) {
                    wVCallBackContext.success();
                    if (!optBoolean || this.mHandler != null) {
                        return;
                    }
                    ((Activity) this.mContext).finish();
                    if (optBoolean2) {
                        return;
                    }
                    ((Activity) this.mContext).overridePendingTransition(0, 0);
                    return;
                }
            } else if (this.mContext instanceof BrowserActivity) {
                from.disallowLoopback();
                if (from.toUri(string, aVar)) {
                    wVCallBackContext.success();
                    return;
                }
            } else if (from.toUri(string)) {
                wVCallBackContext.success();
                if (optBoolean && this.mHandler == null) {
                    ((Activity) this.mContext).finish();
                }
                if (optBoolean2) {
                    return;
                }
                ((Activity) this.mContext).overridePendingTransition(0, 0);
                return;
            }
            if (z) {
                return;
            }
            startSelf(wVCallBackContext, bundle, null);
        } catch (JSONException unused) {
            m.e(TAG, "openWindow: param parse to JSON error, param=" + str);
            wVCallBackContext.error();
        }
    }

    private void startSelf(WVCallBackContext wVCallBackContext, Bundle bundle, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a786e3f", new Object[]{this, wVCallBackContext, bundle, intent});
            return;
        }
        String string = bundle.getString("url");
        Uri parse = Uri.parse(string);
        String string2 = bundle.getString("transitionParams");
        boolean z = bundle.getBoolean("popBeforeOpen");
        boolean booleanQueryParameter = parse.getBooleanQueryParameter("nextPageAnimation", true);
        if (intent == null) {
            intent = new Intent();
            try {
                Variation variation = UTABTest.activate(UTABTest.COMPONENT_NAV, string).getVariation("bucket");
                if (variation != null) {
                    String valueAsString = variation.getValueAsString(null);
                    if (!StringUtils.isEmpty(valueAsString)) {
                        m.c(TAG, "openWindow replace AB url = [" + valueAsString + riy.ARRAY_END_STR);
                    }
                }
            } catch (Throwable unused) {
            }
            intent.setData(parse);
        }
        intent.setClass(this.mContext, BrowserUpperActivity.class);
        intent.addCategory(i.CATEGORY_MORE_WINDOW);
        if (string2 != null) {
            intent.putExtra("transitionParams", string2);
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
            if (!booleanQueryParameter) {
                ((Activity) this.mContext).overridePendingTransition(0, 0);
            }
            wVCallBackContext.success();
            if (!z) {
                return;
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendEmptyMessage(1105);
                return;
            } else {
                ((Activity) this.mContext).finish();
                return;
            }
        }
        r rVar = new r();
        rVar.a("errorInfo", "Your context is not Activity");
        wVCallBackContext.error(rVar);
    }

    public final void navTo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1f0ccc", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            String string = new JSONObject(str).getString("url");
            if (Nav.from(this.mContext).toUri(string)) {
                wVCallBackContext.success();
                return;
            }
            r rVar = new r();
            rVar.a("errorInfo", "can not nav url : " + string);
            wVCallBackContext.error(rVar);
        } catch (JSONException unused) {
            m.e(TAG, "navTo: param parse to JSON error, param=" + str);
            wVCallBackContext.error();
        }
    }
}
