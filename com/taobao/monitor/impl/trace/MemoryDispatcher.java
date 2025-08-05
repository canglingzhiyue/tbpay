package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.i;
import com.taobao.monitor.impl.trace.a;
import java.util.Map;

/* loaded from: classes.dex */
public class MemoryDispatcher extends com.taobao.monitor.impl.trace.a<a> implements i.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j, long j2, long j3, long j4);
    }

    public MemoryDispatcher() {
        com.taobao.metrickit.i.a(15, this);
    }

    @Override // com.taobao.metrickit.i.a
    public void a(int i, final Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
        } else if (i != 15) {
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.MemoryDispatcher.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2deb261", new Object[]{this, aVar});
                        return;
                    }
                    Object obj = map.get("javaUsed");
                    Object obj2 = map.get("nativeHeapSize");
                    Object obj3 = map.get("nativeHeapAllocatedSize");
                    Object obj4 = map.get("pss");
                    if (!(obj instanceof Long) || !(obj2 instanceof Long) || !(obj3 instanceof Long)) {
                        return;
                    }
                    long j = 0;
                    if (obj4 instanceof Long) {
                        j = ((Long) obj4).longValue();
                    }
                    aVar.a(((Long) obj).longValue() >> 20, ((Long) obj2).longValue() >> 20, ((Long) obj3).longValue() >> 20, j >> 20);
                }
            });
        }
    }
}
