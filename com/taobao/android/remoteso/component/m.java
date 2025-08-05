package com.taobao.android.remoteso.component;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.search.common.util.i;
import java.util.HashMap;
import tb.ikq;

/* loaded from: classes6.dex */
public final class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(final j jVar, final l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e5b286", new Object[]{jVar, lVar});
        } else {
            ikq.a("RemoTrack.track", new Runnable() { // from class: com.taobao.android.remoteso.component.m.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("mode", j.this.b());
                    hashMap.put("module", j.this.g());
                    hashMap.put(i.b.MEASURE_SHOWUI, Boolean.valueOf(j.this.i()));
                    hashMap.put("duration", Long.valueOf(j.this.f()));
                    if (lVar.e()) {
                        ikq.b("remo_result", hashMap);
                    } else {
                        ikq.a("remo_result", hashMap, RSoException.error(lVar.c(), lVar.d()));
                    }
                }
            });
        }
    }
}
