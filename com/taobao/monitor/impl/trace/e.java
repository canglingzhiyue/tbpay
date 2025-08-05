package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;
import java.util.Map;
import tb.mou;

/* loaded from: classes.dex */
public class e extends com.taobao.monitor.impl.trace.a<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public interface a {
        void a(mou mouVar, long j);

        void a(mou mouVar, Map<String, Object> map, long j);

        void b(mou mouVar, long j);

        void c(mou mouVar, long j);
    }

    public void a(final mou mouVar, final Map<String, Object> map, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2712cc4", new Object[]{this, mouVar, map, new Long(j)});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8c33c48", new Object[]{this, aVar});
                    } else {
                        aVar.a(mouVar, map, j);
                    }
                }
            });
        }
    }

    public void a(final mou mouVar, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80a487f", new Object[]{this, mouVar, new Long(j)});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8c33c48", new Object[]{this, aVar});
                    } else {
                        aVar.a(mouVar, j);
                    }
                }
            });
        }
    }

    public void b(final mou mouVar, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e8121e", new Object[]{this, mouVar, new Long(j)});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8c33c48", new Object[]{this, aVar});
                    } else {
                        aVar.b(mouVar, j);
                    }
                }
            });
        }
    }

    public void c(final mou mouVar, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc5dbbd", new Object[]{this, mouVar, new Long(j)});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8c33c48", new Object[]{this, aVar});
                    } else {
                        aVar.c(mouVar, j);
                    }
                }
            });
        }
    }
}
