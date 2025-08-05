package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.mou;

/* loaded from: classes.dex */
public class PageLeaveDispatcher extends com.taobao.monitor.impl.trace.a<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BACK = -4;
    public static final int TYPE_F2B = -3;
    public static final int TYPE_JUMP_NEXT_PAGE = -5;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PageLeaveType {
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(mou mouVar, int i, long j);
    }

    public void a(final mou mouVar, final int i, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593ec9c6", new Object[]{this, mouVar, new Integer(i), new Long(j)});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.PageLeaveDispatcher.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d39385e", new Object[]{this, aVar});
                    } else {
                        aVar.a(mouVar, i, j);
                    }
                }
            });
        }
    }
}
