package com.taobao.taolive.movehighlight.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ipx;
import tb.kge;

/* loaded from: classes8.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1214367690);
    }

    public static boolean a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18197561", new Object[]{aVar})).booleanValue() : (b(aVar) == null || b(aVar).a() == null || b(aVar).b() == null) ? false : true;
    }

    public static ipx b(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ipx) ipChange.ipc$dispatch("a9340579", new Object[]{aVar});
        }
        if (aVar != null && (aVar.H() instanceof ipx)) {
            return (ipx) aVar.H();
        }
        return null;
    }
}
