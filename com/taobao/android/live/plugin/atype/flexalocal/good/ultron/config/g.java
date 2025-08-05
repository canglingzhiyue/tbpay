package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.util.concurrent.CountDownLatch;
import tb.his;
import tb.kge;
import tb.pmd;

/* loaded from: classes3.dex */
public class g extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1070412475);
    }

    public g(CountDownLatch countDownLatch, boolean z) {
        super(countDownLatch, z);
    }

    public void a(final i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab25046", new Object[]{this, iVar});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Application c = pmd.a().u().c();
                        if (c != null) {
                            String path = c.getCacheDir().getPath();
                            iVar.a(com.taobao.taolive.sdk.goodlist.b.a(path, g.this.e + ".json"), ConfigSource.FILE);
                        }
                    } catch (Throwable th) {
                        try {
                            his.b("UltronFileTask", "错误 :" + th.toString());
                        } finally {
                            g.this.f13826a.countDown();
                        }
                    }
                }
            }, 30);
        }
    }
}
