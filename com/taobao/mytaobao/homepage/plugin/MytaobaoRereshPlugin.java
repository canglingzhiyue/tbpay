package com.taobao.mytaobao.homepage.plugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.monitor.b;
import tb.kge;
import tb.mug;

/* loaded from: classes7.dex */
public class MytaobaoRereshPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(631161125);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        b a2 = b.a();
        a2.a("MytaobaoRereshPlugin.execute," + str);
        if ("refresh".equals(str)) {
            mug.a(true, mug.ACTION_REFRESH_PAGE, new String[0]);
            return true;
        } else if (!"forceRefreshWhenShow".equals(str)) {
            return false;
        } else {
            mug.a(true, mug.ACTION_REFRESH_PAGE_WHEN_SHOW, new String[0]);
            return true;
        }
    }
}
