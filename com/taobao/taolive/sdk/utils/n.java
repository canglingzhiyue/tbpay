package com.taobao.taolive.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1608490870);
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else if (pmd.a().m() == null) {
        } else {
            pmd.a().m().a(str, obj);
        }
    }

    public static void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{str, obj});
        } else if (pmd.a().m() == null) {
        } else {
            pmd.a().m().b(str, obj);
        }
    }
}
