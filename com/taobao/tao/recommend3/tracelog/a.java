package com.taobao.tao.recommend3.tracelog;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.i;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1886316845);
    }

    public static void a(String str, final String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        b a2 = b.a(str3);
        if (a2 == null) {
            return;
        }
        a2.a(str, 2, new HashMap<String, Object>() { // from class: com.taobao.tao.recommend3.tracelog.HomeApmTraceUtils$1
            {
                put(i.CDN_REQUEST_TYPE, str2);
            }
        });
    }

    public static void a(final String str, final boolean z, final String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d29d8f6", new Object[]{str, new Boolean(z), str2, str3});
            return;
        }
        b a2 = b.a(str3);
        if (a2 == null) {
            return;
        }
        a2.a(str, new HashMap<String, Object>() { // from class: com.taobao.tao.recommend3.tracelog.HomeApmTraceUtils$2
            {
                put(i.CDN_REQUEST_TYPE, str2);
                put(c.c(str), Boolean.valueOf(z));
            }
        });
    }
}
