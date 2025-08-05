package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class Ob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Ob f3265a;
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, Pb>> b = new ConcurrentHashMap<>();

    public static Ob a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ob) ipChange.ipc$dispatch("e36f39ff", new Object[0]);
        }
        if (f3265a == null) {
            synchronized (Ob.class) {
                if (f3265a == null) {
                    f3265a = new Ob();
                }
            }
        }
        return f3265a;
    }

    public void b(String str, String str2) {
        ConcurrentHashMap<String, Pb> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (str == null || str2 == null || (b = b(str)) == null) {
        } else {
            b.remove(str2);
        }
    }

    private ConcurrentHashMap<String, Pb> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("51d19f13", new Object[]{this, str});
        }
        if (!this.b.containsKey(str)) {
            return null;
        }
        return this.b.get(str);
    }

    public Pb a(String str, String str2) {
        ConcurrentHashMap<String, Pb> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pb) ipChange.ipc$dispatch("72d1b82c", new Object[]{this, str, str2});
        }
        if (str != null && str2 != null && (b = b(str)) != null) {
            return b.get(str2);
        }
        return null;
    }

    public void a(String str, String str2, Pb pb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5deb078e", new Object[]{this, str, str2, pb});
        } else if (str == null || str2 == null) {
        } else {
            ConcurrentHashMap<String, Pb> b = b(str);
            if (b == null) {
                b = new ConcurrentHashMap<>();
            }
            b.put(str2, pb);
            this.b.put(str, b);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.b.remove(str);
        }
    }
}
