package com.taobao.desktop.widget.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class WidgetServerJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASSNAME_WIDGET_CLIENT_PASS = "ClientPaasBridge";

    static {
        kge.a(-652994767);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            Object b = b.b(this.mContext, str, str2);
            r rVar = new r();
            rVar.a("result", b);
            wVCallBackContext.success(rVar);
            return true;
        } catch (Exception e) {
            kif.a("WidgetServerJsBridge === execute === 桌面组件jsBridge调用异常：" + e.getMessage());
            kih.a("widget_catch_error", "WidgetServerJsBridge", e.getMessage(), null);
            return false;
        }
    }
}
