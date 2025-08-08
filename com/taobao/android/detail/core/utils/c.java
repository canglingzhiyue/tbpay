package com.taobao.android.detail.core.utils;

import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-324786991);
        emu.a("com.taobao.android.detail.core.utils.ColorUtils");
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        if (!str.startsWith("#")) {
            if (!str.startsWith("0x")) {
                return 0;
            }
            str = "#" + str.substring(2);
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
