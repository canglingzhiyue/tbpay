package com.taobao.message.notification.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class ChannelUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IMBA = "imba";
    public static final String IM_BC = "im_bc";
    public static final String IM_CC = "im_cc";

    static {
        kge.a(1446646593);
    }

    public static String convertChannelType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f27d06e", new Object[]{new Integer(i)}) : (i < 11000 || i >= 12000) ? (i < 20000 || i >= 30000) ? (i < 0 || i >= 11000) ? "not-support-type" : "im_cc" : "imba" : "im_bc";
    }
}
