package com.taobao.tbpoplayer.util;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1705510486);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e7e917", new Object[]{spannableStringBuilder, str, str2, obj, obj2});
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str).append(riy.CONDITION_IF_MIDDLE);
        if (obj == null) {
            obj = new ForegroundColorSpan(-3355444);
        }
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        int length2 = spannableStringBuilder.length();
        if (str2 == null) {
            str2 = com.taobao.android.weex_framework.util.a.ATOM_EXT_Null;
        }
        spannableStringBuilder.append((CharSequence) str2).append('\n');
        int i = str2 == null ? -65536 : -7829368;
        if (obj2 == null) {
            obj2 = new ForegroundColorSpan(i);
        }
        spannableStringBuilder.setSpan(obj2, length2, spannableStringBuilder.length(), 33);
    }
}
