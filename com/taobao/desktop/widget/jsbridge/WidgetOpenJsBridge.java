package com.taobao.desktop.widget.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class WidgetOpenJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASSNAME_WIDGET_OPEN = "WidgetOpenJsBridge";

    static {
        kge.a(-254112200);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            b.a(this.mContext, str, str2, new c() { // from class: com.taobao.desktop.widget.jsbridge.WidgetOpenJsBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.widget.jsbridge.c
                public void a(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                        return;
                    }
                    r rVar = new r();
                    rVar.a("result", str3);
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    if (wVCallBackContext2 != null) {
                        wVCallBackContext2.success(rVar);
                    }
                    kif.a("WidgetOpenJsBridge execute success result：" + str3);
                }
            });
            return true;
        } catch (Exception e) {
            kif.a("WidgetOpenJsBridge === execute === 桌面组件jsBridge调用异常：" + e.getMessage());
            kih.a("widget_catch_error", "JsBridge", e.getMessage(), null);
            return false;
        }
    }
}
