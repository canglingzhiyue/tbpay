package com.taobao.search.common.util;

import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.text.style.ForegroundColorSpan;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class aa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1633567105);
    }

    public static SpannableStringBuilder a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("d32aef69", new Object[]{str, str2, str3});
        }
        if (StringUtils.isEmpty(str2)) {
            return null;
        }
        String str4 = str2 + str;
        int indexOf = str4.indexOf(str2);
        if (indexOf == -1) {
            return null;
        }
        int a2 = com.taobao.search.mmd.util.d.a(str3, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(a2), indexOf, str2.length() + indexOf, 34);
        return spannableStringBuilder;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : com.taobao.android.searchbaseframe.util.r.a(str, "shop_id");
    }
}
