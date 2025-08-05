package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.security.ccrc.service.build.xa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1262xa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Object> f3335a = new HashMap();
    public static final Map<String, C1262xa> b = new HashMap();
    public final Map<String, Object> c = new HashMap();

    public C1262xa(String str) {
        b.put(str, this);
    }

    public void a(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb14d106", new Object[]{this, str, obj, new Boolean(z)});
        } else if (z) {
            f3335a.put(str, obj);
        } else {
            this.c.put(str, obj);
        }
    }

    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.c;
    }

    public static Map<String, Object> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        C1262xa c1262xa = b.get(str);
        if (c1262xa != null) {
            Map<String, Object> a2 = c1262xa.a();
            a2.putAll(f3335a);
            return a2;
        }
        return f3335a;
    }
}
