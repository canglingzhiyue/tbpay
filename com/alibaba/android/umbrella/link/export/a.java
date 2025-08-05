package com.alibaba.android.umbrella.link.export;

import com.alibaba.android.umbrella.link.j;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f2824a = "";
    private final Map<String, Object> b = new HashMap();

    private a() {
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a412b282", new Object[]{str});
        }
        a aVar = new a();
        aVar.f2824a = str;
        return aVar;
    }

    public static a a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("25da29a6", new Object[]{str, obj});
        }
        a aVar = new a();
        if (!j.a(str) && obj != null) {
            aVar.b.put(str, obj);
        }
        return aVar;
    }

    public static a a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("26b287b7", new Object[]{map});
        }
        a aVar = new a();
        if (map != null && !map.isEmpty()) {
            aVar.b.putAll(map);
        }
        return aVar;
    }

    public a b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6dd98805", new Object[]{this, str, obj});
        }
        if (!j.a(str) && obj != null) {
            this.b.put(str, obj);
        }
        return this;
    }

    public Map<String, ?> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        if (!j.a(this.f2824a)) {
            this.b.put("msg", this.f2824a);
        }
        return this.b;
    }
}
