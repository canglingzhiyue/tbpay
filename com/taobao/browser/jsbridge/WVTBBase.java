package com.taobao.browser.jsbridge;

import android.os.Handler;
import android.os.Message;
import android.taobao.util.g;
import android.taobao.util.i;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.tao.util.NetWorkUtils;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class WVTBBase extends e implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVTBBase";
    private Handler handler;

    static {
        kge.a(-861063327);
        kge.a(-1043440182);
    }

    public static /* synthetic */ Object ipc$super(WVTBBase wVTBBase, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        return true;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        BrowserUtil.a(TAG, BrowserUtil.f16842a, str, this.mWebView != null ? this.mWebView.getUrl() : null, null);
        if ("getNetworkStatus".equals(str)) {
            getNetworkStatus(wVCallBackContext, str2);
        } else if ("getEnvironment".equals(str)) {
            getEnvironment(wVCallBackContext, str2);
        } else if (!"isLowendPhone".equals(str)) {
            return false;
        } else {
            isLowendPhone(wVCallBackContext, str2);
        }
        return true;
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Handler handler = this.handler;
        if (handler instanceof i) {
            ((i) handler).a();
        }
        this.handler = null;
        super.onDestroy();
    }

    @WindVaneInterface
    public final void getNetworkStatus(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884eca98", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String c = g.c(this.mContext);
        HashMap hashMap = new HashMap();
        hashMap.put("network", c);
        wVCallBackContext.success(JSON.toJSONString(hashMap));
    }

    @WindVaneInterface
    public final void getEnvironment(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820c87ab", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        if (this.mWebView instanceof BrowserHybridWebView) {
            rVar.b();
            rVar.a("getEnvironment", String.valueOf(((BrowserHybridWebView) this.mWebView).getWebviewMode()));
            wVCallBackContext.success(rVar);
            return;
        }
        wVCallBackContext.success(rVar);
    }

    public final void isLowendPhone(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41be7feb", new Object[]{this, wVCallBackContext, str});
        } else if (NetWorkUtils.isLowendPhone()) {
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }
}
