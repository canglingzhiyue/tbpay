package com.taobao.android.preload.core.task;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.f;
import java.util.concurrent.ExecutorService;
import tb.icl;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ExecutorService a(com.taobao.android.preload.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("9a399b0c", new Object[]{this, aVar}) : aVar.a(1, 60, "Detail Preload Loader");
    }

    public void a(final icl iclVar, final a aVar, com.taobao.android.preload.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbac0ae", new Object[]{this, iclVar, aVar, aVar2});
        } else {
            a(aVar2).execute(new Runnable() { // from class: com.taobao.android.preload.core.task.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        iclVar.b(aVar);
                        String a2 = com.taobao.android.preload.e.a("PreloadTaskCaller");
                        f.b(a2, "executor.finished:" + Thread.currentThread().getName());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
