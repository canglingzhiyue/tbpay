package com.taobao.accs.utl;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public abstract class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public n f8314a;

    static {
        kge.a(2065897893);
    }

    public abstract String a();

    public static n b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("d72d9058", new Object[0]) : new g();
    }
}
