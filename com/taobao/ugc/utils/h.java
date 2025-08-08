package com.taobao.ugc.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-253383043);
    }

    public static float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{str})).floatValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0.0f;
        }
        String[] split = str.split(",");
        if (split.length < 2) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(split[1].trim()) / 2.0f;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue() : (StringUtils.isEmpty(str) || str.toLowerCase().indexOf("bold") == -1) ? 0 : 1;
    }
}
