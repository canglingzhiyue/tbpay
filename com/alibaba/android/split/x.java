package com.alibaba.android.split;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kga;
import tb.kge;

/* loaded from: classes2.dex */
public class x implements w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f2517a = new ScheduledThreadPoolExecutor(1);

    static {
        kge.a(-1602208575);
        kge.a(-1005179256);
    }

    @Override // com.alibaba.android.split.w
    public void a(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else {
            this.f2517a.schedule(new Runnable() { // from class: com.alibaba.android.split.x.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        kga.a(str, k.a().b().t().getResources().getResourceName(i));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 500L, TimeUnit.MICROSECONDS);
        }
    }
}
