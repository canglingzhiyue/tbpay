package com.taobao.android.detail.wrapper.ext.floatview;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.eqa;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-641898787);
        emu.a("com.taobao.android.detail.wrapper.ext.floatview.ChannelIdUtil");
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        return str + eqa.a(str2);
    }
}
