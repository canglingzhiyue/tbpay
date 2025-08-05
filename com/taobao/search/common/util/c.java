package com.taobao.search.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(286755384);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : (Globals.getApplication() == null || Globals.getApplication().getApplicationInfo() == null || (Globals.getApplication().getApplicationInfo().flags & 2) == 0) ? false : true;
    }
}
