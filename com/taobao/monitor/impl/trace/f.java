package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, m> f18179a = new HashMap();

    public static void a(String str, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645d6dd3", new Object[]{str, mVar});
        } else {
            f18179a.put(str, mVar);
        }
    }

    public static m a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("386f9167", new Object[]{str});
        }
        m mVar = f18179a.get(str);
        return mVar == null ? g.b : mVar;
    }

    public static boolean a(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8eac61", new Object[]{mVar})).booleanValue() : mVar == null || mVar == g.b;
    }
}
