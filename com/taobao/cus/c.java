package com.taobao.cus;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.nkt;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1944564868);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a("UpdateInitFree.init", new Object[0]);
            a a2 = a.a();
            a2.c();
            a2.i();
            a2.k();
            nkt.c(application);
            com.taobao.tbpoplayer.watermask.a.a().b();
            com.alibaba.poplayer.utils.c.a("UpdateInitFree.init.done", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("Updater.init.error", th);
        }
    }
}
