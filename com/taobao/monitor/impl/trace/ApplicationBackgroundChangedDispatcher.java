package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class ApplicationBackgroundChangedDispatcher extends com.taobao.monitor.impl.trace.a<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int B2F = 0;
    public static final int F2B = 1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Status {
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(int i, long j);
    }

    public void a(final int i, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3403b20c", new Object[]{this, aVar});
                    } else {
                        aVar.a(i, j);
                    }
                }
            });
        }
    }
}
