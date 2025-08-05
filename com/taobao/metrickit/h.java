package com.taobao.metrickit;

import android.app.Application;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.a;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.metrickit.utils.b;
import java.util.Collections;
import java.util.HashMap;
import tb.mmn;
import tb.mmr;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void lambda$QdmshXzCGbC1W_0qwjkGJ_YPjCI(Application application) {
        a(application);
    }

    private h() {
    }

    public static void a(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        Handler handler = new Handler(a.a().b().getLooper());
        com.taobao.metrickit.context.c.a(application);
        b.a(application);
        a();
        handler.post(new Runnable() { // from class: com.taobao.metrickit.-$$Lambda$h$QdmshXzCGbC1W_0qwjkGJ_YPjCI
            @Override // java.lang.Runnable
            public final void run() {
                h.lambda$QdmshXzCGbC1W_0qwjkGJ_YPjCI(application);
            }
        });
        if (com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_BLOCK_STACK_METRIC)) {
            handler.post(new mmn("launchIdle-blockStack", null));
        }
        d.b(application);
    }

    public static /* synthetic */ void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else if (!com.taobao.metrickit.context.c.a(com.taobao.metrickit.context.c.SWITCH_UPLOAD)) {
        } else {
            mmr.a(application);
        }
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            EventCenter.a().a(new h()).a(16, Collections.emptyMap());
        }
    }
}
