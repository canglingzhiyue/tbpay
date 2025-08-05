package com.alibaba.android.split.core.splitcompat;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashSet;
import tb.kge;

/* loaded from: classes2.dex */
public final class k implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final j f2456a;
    private Collection<String> b;

    static {
        kge.a(-641953107);
        kge.a(-1390502639);
    }

    public k(j jVar) {
        this(jVar, new HashSet());
    }

    public k(j jVar, Collection<String> collection) {
        this.f2456a = jVar;
        this.b = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            this.f2456a.b().v();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
