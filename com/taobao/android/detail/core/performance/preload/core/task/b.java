package com.taobao.android.detail.core.performance.preload.core.task;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.task.Coordinator;
import tb.eiw;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends Coordinator.TaggedRunnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private eiw f9791a;
    private a b;

    static {
        kge.a(-793358571);
    }

    public b(String str) {
        super(str);
        emu.a("com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskCaller");
    }

    public void a(eiw eiwVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e19dff7", new Object[]{this, eiwVar, aVar});
            return;
        }
        this.f9791a = eiwVar;
        this.b = aVar;
        Coordinator.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            this.f9791a.b(this.b);
            String a2 = l.a("PreloadTaskCaller");
            i.c(a2, "executor.finished:" + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
