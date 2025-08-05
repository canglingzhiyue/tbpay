package com.alibaba.ability.impl.file;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, WeakReference<a>> f1889a;

    static {
        kge.a(25902620);
        INSTANCE = new b();
        f1889a = new ConcurrentHashMap<>();
    }

    private b() {
    }

    @JvmStatic
    public static final a a(Context context, String businessId) {
        a aVar;
        a it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a0447e04", new Object[]{context, businessId});
        }
        q.d(context, "context");
        q.d(businessId, "businessId");
        WeakReference<a> weakReference = f1889a.get(businessId);
        if (weakReference != null && (it = weakReference.get()) != null) {
            q.b(it, "it");
            return it;
        }
        a aVar2 = new a(context, businessId);
        WeakReference<a> putIfAbsent = f1889a.putIfAbsent(businessId, new WeakReference<>(aVar2));
        return (putIfAbsent == null || (aVar = putIfAbsent.get()) == null) ? aVar2 : aVar;
    }
}
