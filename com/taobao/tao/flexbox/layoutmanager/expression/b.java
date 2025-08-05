package com.taobao.tao.flexbox.layoutmanager.expression;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, a> f20395a;

    static {
        kge.a(1280051689);
        f20395a = new HashMap<>();
    }

    public static Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{str, obj});
        }
        a aVar = f20395a.get(str);
        if (aVar == null) {
            aVar = new a(str);
            f20395a.put(str, aVar);
        }
        return aVar.a(obj);
    }

    public static Object a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("121a1a7f", new Object[]{str, map}) : new a(str, map).b();
    }
}
