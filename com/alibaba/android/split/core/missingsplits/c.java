package com.alibaba.android.split.core.missingsplits;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicReference f2436a;

    static {
        kge.a(-2082822702);
        f2436a = new AtomicReference(null);
    }

    public static b a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3d199e6d", new Object[]{context}) : new d(context, Runtime.getRuntime(), new a(context, context.getPackageManager()), f2436a);
    }
}
