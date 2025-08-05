package com.taobao.monitor.impl.trace;

import android.app.Activity;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;

/* loaded from: classes.dex */
public class r extends com.taobao.monitor.impl.trace.a<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public interface a {
        void a(Activity activity, int i, float f, float f2, long j);

        void a(Activity activity, KeyEvent keyEvent, long j);
    }

    public void a(final Activity activity, final KeyEvent keyEvent, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c497142", new Object[]{this, activity, keyEvent, new Long(j)});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.r.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1ef23c5b", new Object[]{this, aVar});
                    } else {
                        aVar.a(activity, keyEvent, j);
                    }
                }
            });
        }
    }

    public void a(final Activity activity, final int i, final float f, final float f2, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb07419b", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else {
            a((a.InterfaceC0725a) new a.InterfaceC0725a<a>() { // from class: com.taobao.monitor.impl.trace.r.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.impl.trace.a.InterfaceC0725a
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1ef23c5b", new Object[]{this, aVar});
                    } else {
                        aVar.a(activity, i, f, f2, j);
                    }
                }
            });
        }
    }
}
