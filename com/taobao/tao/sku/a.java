package com.taobao.tao.sku;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.u;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-487124279);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            AliUserTrackerInterface a2 = u.a();
            if (a2 == null) {
                return;
            }
            a2.a("Page_Detail", 2201, "codeTrack", null, null, "className=" + str);
        } catch (Throwable unused) {
        }
    }
}
