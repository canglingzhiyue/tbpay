package com.alibaba.android.split;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference f2492a;

    static {
        kge.a(894397266);
        f2492a = new AtomicReference(null);
    }

    public static u a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (u) ipChange.ipc$dispatch("873eeb9a", new Object[0]) : (u) f2492a.get();
    }

    public static void a(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5344049a", new Object[]{uVar});
        } else {
            f2492a.compareAndSet(null, uVar);
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f2492a.get() != null;
    }
}
