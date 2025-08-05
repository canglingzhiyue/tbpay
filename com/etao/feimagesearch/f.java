package com.etao.feimagesearch;

import com.android.alibaba.ip.runtime.IpChange;
import de.greenrobot.event.c;
import tb.kge;

/* loaded from: classes3.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final c f6664a;

    static {
        kge.a(1093270046);
        f6664a = c.b().b(false).a(true).c(false).a();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("541bb6e5", new Object[0]) : f6664a;
    }
}
