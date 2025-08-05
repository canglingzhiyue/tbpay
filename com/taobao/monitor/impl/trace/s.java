package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;

/* loaded from: classes7.dex */
public class s extends a<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<Object>() { // from class: com.taobao.monitor.impl.trace.s.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public /* bridge */ /* synthetic */ void a(Object obj) {
                }
            });
        }
    }
}
