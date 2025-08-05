package com.taobao.android.detail2.core.framework.floatwindow;

import com.android.alibaba.ip.runtime.IpChange;
import tb.izc;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends izc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11554a;

    static {
        kge.a(1891599027);
    }

    @Override // tb.izc
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : f11554a;
    }
}
