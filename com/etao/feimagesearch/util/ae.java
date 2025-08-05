package com.etao.feimagesearch.util;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public final class ae {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ae INSTANCE;

    static {
        kge.a(-223599638);
        INSTANCE = new ae();
    }

    private ae() {
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : kotlin.jvm.internal.q.a(Looper.myLooper(), Looper.getMainLooper());
    }
}
