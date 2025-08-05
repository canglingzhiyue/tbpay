package com.taobao.tao.tbmaincontroller;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.TBMainActivity;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f21120a;

    static {
        kge.a(-73472197);
        f21120a = new AtomicBoolean(false);
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else if (!f21120a.compareAndSet(false, true)) {
        } else {
            s.f18233a.d().a(TBMainActivity.KEY_APM_MAIN_INDEX, Integer.valueOf(i));
        }
    }
}
