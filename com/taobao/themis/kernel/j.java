package com.taobao.themis.kernel;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, Object> f22537a = new ConcurrentHashMap();
    private final String b = "DataStore";
    private final Map<String, Object> c = new ConcurrentHashMap();

    static {
        kge.a(-699641093);
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        Object obj = this.c.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (Throwable th) {
            TMSLogger.b("DataStore", "getStringValue error!", th);
            return null;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (str2 == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, str2);
        }
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        Object obj = this.c.get(str);
        if (obj != null) {
            try {
                return ((Boolean) obj).booleanValue();
            } catch (Throwable th) {
                TMSLogger.b("DataStore", "getStringValue error!", th);
            }
        }
        return false;
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            this.c.put(str, Boolean.valueOf(z));
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.f22537a.clear();
        this.c.clear();
    }

    public <T> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{this, cls}) : (T) this.f22537a.get(cls);
    }

    public <T> void a(Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9dcc71", new Object[]{this, cls, t});
        } else if (t == null) {
        } else {
            this.f22537a.put(cls, t);
        }
    }
}
