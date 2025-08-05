package com.taobao.search.common.uikit;

import android.taobao.util.d;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.StringUtil;
import tb.acw;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1304067116);
    }

    public static String a(String str) {
        d.a a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : (StringUtil.isEmpty(str) || (a2 = acw.a(str)) == null || TextUtils.isEmpty(a2.d)) ? str : a2.d;
    }
}
