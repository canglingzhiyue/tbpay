package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1885620701);
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        if (!StringUtils.isDigitsOnly(str)) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static float b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e563", new Object[]{str})).floatValue();
        }
        if (StringUtils.isEmpty(str)) {
            return -1.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return -1.0f;
        }
    }
}
