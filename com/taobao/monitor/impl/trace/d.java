package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends com.taobao.monitor.impl.trace.a<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public interface a {
        void a(float f, int i, int i2);

        void a(String str, int i, long j);

        void b(String str);
    }

    public void a(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ef32b8", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        for (LISTENER listener : this.f18168a) {
            listener.a(f, i, i2);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Iterator it = this.f18168a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void a(final String str, final int i, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526bd3", new Object[]{this, str, new Integer(i), new Long(j)});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("70e63a9", new Object[]{this, aVar});
                    } else {
                        aVar.a(str, i, j);
                    }
                }
            });
        }
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("70e63a9", new Object[]{this, aVar});
                    } else {
                        aVar.b(str);
                    }
                }
            });
        }
    }
}
