package com.alibaba.ability.inject;

import com.alibaba.ability.inject.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.Map;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class d implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-473046983);
        kge.a(-1183689618);
    }

    @Override // com.alibaba.ability.inject.a
    @JvmDefault
    public /* synthetic */ void a(String str, String str2) {
        a.CC.$default$a(this, str, str2);
    }

    @Override // com.alibaba.ability.inject.a
    public void a(int i, String module, String eventName, String str, String str2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89fc62", new Object[]{this, new Integer(i), module, eventName, str, str2, map});
            return;
        }
        q.d(module, "module");
        q.d(eventName, "eventName");
        try {
            com.taobao.android.riverlogger.e.a(a(i), module).a(eventName, str).b(str2).a((Map<String, ?>) map).a();
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
        }
    }

    private final RVLLevel a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RVLLevel) ipChange.ipc$dispatch("30435bca", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return RVLLevel.Off;
        }
        if (i == 1) {
            return RVLLevel.Error;
        }
        if (i == 2) {
            return RVLLevel.Warn;
        }
        if (i == 3) {
            return RVLLevel.Info;
        }
        if (i == 4) {
            return RVLLevel.Debug;
        }
        if (i == 5) {
            return RVLLevel.Verbose;
        }
        return RVLLevel.Off;
    }
}
