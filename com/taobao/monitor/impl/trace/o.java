package com.taobao.monitor.impl.trace;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;

/* loaded from: classes.dex */
public class o extends com.taobao.monitor.impl.trace.a<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public interface a {
        void a(Looper looper, String str);
    }

    public void a(final Looper looper, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ec33c7", new Object[]{this, looper, str});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.o.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("19d3b27e", new Object[]{this, aVar});
                    } else {
                        aVar.a(looper, str);
                    }
                }
            });
        }
    }
}
