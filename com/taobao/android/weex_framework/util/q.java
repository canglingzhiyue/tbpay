package com.taobao.android.weex_framework.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.instance.WeexDOMInstance;
import tb.kge;

/* loaded from: classes6.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(901412351);
    }

    public static String a(WeexInstance weexInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2a2f4d0", new Object[]{weexInstance, str});
        }
        if (!(weexInstance instanceof WeexDOMInstance)) {
            return str;
        }
        return ((WeexDOMInstance) weexInstance).getOriginURLString() + str;
    }
}
