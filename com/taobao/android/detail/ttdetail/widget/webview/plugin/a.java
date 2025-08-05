package com.taobao.android.detail.ttdetail.widget.webview.plugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.weex_framework.adapter.e;
import tb.fiq;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1620825394);
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return null;
    }

    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (fiq.OPERATE_GET_DETAIL_DATA.equals(str)) {
                String a2 = a();
                if (TextUtils.isEmpty(a2)) {
                    wVCallBackContext.error();
                } else {
                    wVCallBackContext.success(a2);
                }
                return true;
            }
        } catch (Throwable th) {
            i.a("DetailExecutor", e.RECORD_EXECUTE, th);
        }
        return false;
    }
}
