package com.taobao.mytaobao.ultron.fatigue;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, b> f18519a;

    static {
        kge.a(-2135761987);
        f18519a = new HashMap();
    }

    public static b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e7b5f5b2", new Object[]{str});
        }
        b bVar = f18519a.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        f18519a.put(str, bVar2);
        return bVar2;
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("74b0df3c", new Object[0]);
        }
        if (f18519a.size() <= 0) {
            return null;
        }
        return f18519a.values().iterator().next();
    }
}
