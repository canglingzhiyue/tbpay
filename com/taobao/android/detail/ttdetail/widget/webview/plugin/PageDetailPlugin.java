package com.taobao.android.detail.ttdetail.widget.webview.plugin;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.webview.DetailHybridWebView;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class PageDetailPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "Page_Detail";
    private a mDetailExecutor;

    static {
        kge.a(-1432336255);
    }

    public static /* synthetic */ Object ipc$super(PageDetailPlugin pageDetailPlugin, String str, Object... objArr) {
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

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        this.mDetailExecutor = new a();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        a aVar = this.mDetailExecutor;
        if (aVar != null && aVar.a(str, str2, wVCallBackContext)) {
            return true;
        }
        if ("addAppmonitor".equals(str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            if (parseObject == null) {
                return false;
            }
            try {
                if (parseObject.containsKey("h5error") && "0".equals(parseObject.getString("h5error")) && parseObject.containsKey("errMsg")) {
                    parseObject.getString("errMsg");
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        if ("setHeight".equals(str)) {
            JSONObject parseObject2 = JSON.parseObject(str2);
            if (parseObject2 != null && parseObject2.containsKey("height")) {
                try {
                    int size = getSize(parseObject2.getIntValue("height"));
                    if (this.mWebView instanceof DetailHybridWebView) {
                        ((DetailHybridWebView) this.mWebView).resizeHeight(size);
                        return true;
                    }
                } catch (Throwable unused2) {
                }
            }
            return false;
        }
        return b.a(str, str2, wVCallBackContext);
    }

    public static int getSize(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a33e938", new Object[]{new Integer(i)})).intValue() : (int) (i * getScreenDensity());
    }

    public static float getScreenDensity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1f8f989d", new Object[0])).floatValue() : odg.b().a().getResources().getDisplayMetrics().density;
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
