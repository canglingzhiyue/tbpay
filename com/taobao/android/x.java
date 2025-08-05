package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.model.PageInfo;
import java.util.Map;
import tb.fmx;
import tb.kge;

/* loaded from: classes.dex */
public abstract class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public interface a {
    }

    static {
        kge.a(-575969307);
    }

    public abstract void a(String str, Map<String, String> map);

    public abstract void a(String str, fmx fmxVar);

    public abstract PageInfo b();

    public static x a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (x) ipChange.ipc$dispatch("4598c738", new Object[0]) : com.taobao.android.diagnose.c.a().f();
    }
}
