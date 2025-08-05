package com.taobao.application.common.impl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends f<com.taobao.application.common.f> implements com.taobao.application.common.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.application.common.f
    public void onBlock(final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7906eb70", new Object[]{this, map});
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = g.this.f16344a.iterator();
                    while (it.hasNext()) {
                        ((com.taobao.application.common.f) it.next()).onBlock(map);
                    }
                }
            });
        }
    }

    @Override // com.taobao.application.common.impl.f
    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            b.d().a(runnable);
        }
    }
}
