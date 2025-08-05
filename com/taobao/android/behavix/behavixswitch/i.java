package com.taobao.android.behavix.behavixswitch;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f9177a;

    /* loaded from: classes.dex */
    public interface a {
        f a(String str);

        boolean b(String str);
    }

    static {
        kge.a(-1978739843);
    }

    public static f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("48166518", new Object[]{str});
        }
        a aVar = f9177a;
        return (aVar == null || !aVar.b(str)) ? new g(str) : f9177a.a(str);
    }
}
