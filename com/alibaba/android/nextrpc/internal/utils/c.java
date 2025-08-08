package com.alibaba.android.nextrpc.internal.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.e;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = e.a();
        if (a2 == null) {
            return true;
        }
        return StringUtils.equals(a2.a("nextrpc", "isMatchSuccessStr", "true"), Boolean.TRUE.toString());
    }
}
