package com.taobao.monitor.impl.trace;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;

/* loaded from: classes.dex */
public class j extends a<k> implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.monitor.impl.trace.k
    public void a(final Activity activity, final Fragment fragment, final String str, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3ca102", new Object[]{this, activity, fragment, str, new Long(j)});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<k>() { // from class: com.taobao.monitor.impl.trace.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(k kVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dc39f", new Object[]{this, kVar});
                    } else {
                        kVar.a(activity, fragment, str, j);
                    }
                }
            });
        }
    }
}
