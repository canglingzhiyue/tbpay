package com.taobao.android.jarviswe.tracker;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(546002778);
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2c1a57", new Object[]{bVar});
        } else {
            com.taobao.android.jarviswe.a.a().a(bVar.b(), bVar.c(), bVar.a(), null);
        }
    }
}
