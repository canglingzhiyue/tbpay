package com.taobao.avplayer.core.component;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Class<? extends DWComponent>> f16484a;

    static {
        kge.a(229675871);
        f16484a = new HashMap();
    }

    public static Class<? extends DWComponent> a(String str) {
        IpChange ipChange = $ipChange;
        return (Class) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("582938df", new Object[]{str}) : f16484a.get(str));
    }
}
