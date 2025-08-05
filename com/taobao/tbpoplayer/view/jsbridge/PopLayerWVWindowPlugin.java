package com.taobao.tbpoplayer.view.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.view.View;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.WVWindow;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class PopLayerWVWindowPlugin extends WVWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2109535075);
    }

    public static /* synthetic */ Object ipc$super(PopLayerWVWindowPlugin popLayerWVWindowPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1126948911) {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.browser.jsbridge.WVWindow, android.taobao.windvane.jsbridge.api.WVBase, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (("openWindow".equals(str) || "navTo".equals(str)) && this.mWebView != null && (this.mWebView instanceof View) && (((View) this.mWebView).getParent() instanceof PopLayerBaseView)) {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("url")) {
                    ((PopLayerBaseView) ((View) this.mWebView).getParent()).syncJumpToUrlInfo(jSONObject.getString("url"));
                }
                if (jSONObject.has("userResult")) {
                    ((PopLayerBaseView) ((View) this.mWebView).getParent()).setUserResultInTrack(jSONObject.getString("userResult"), false, null);
                }
            }
            return super.execute(str, str2, wVCallBackContext);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWVWindowPlugin.executeError.", th);
            wVCallBackContext.error();
            return false;
        }
    }
}
