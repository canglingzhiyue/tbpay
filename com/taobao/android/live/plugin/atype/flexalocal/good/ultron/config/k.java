package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import tb.his;
import tb.kge;
import tb.pmd;

/* loaded from: classes3.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1680786431);
    }

    public static void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            Coordinator.execute(new Coordinator.TaggedRunnable("UltronConfigWriter") { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String path = pmd.a().u().c().getCacheDir().getPath();
                        com.taobao.taolive.sdk.goodlist.b.a(path, str2 + ".json", String.valueOf(str));
                    } catch (Throwable th) {
                        his.b("UltronConfigWriter", th.toString());
                    }
                }
            }, 1, 2000);
        }
    }
}
