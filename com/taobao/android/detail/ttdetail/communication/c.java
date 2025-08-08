package com.taobao.android.detail.ttdetail.communication;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, b> f10526a;

    static {
        kge.a(1956702907);
        f10526a = new ConcurrentHashMap<>();
    }

    public static b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3f6621dd", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        synchronized (c.class) {
            if (f10526a.containsKey(str)) {
                return f10526a.get(str);
            }
            b bVar = new b();
            f10526a.put(str, bVar);
            return bVar;
        }
    }

    public static b a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8c8768b", new Object[]{obj});
        }
        if (obj != null) {
            return a(i.a(obj));
        }
        return null;
    }

    public static b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("59d71afc", new Object[]{str});
        }
        if (StringUtils.isEmpty(str) || !f10526a.containsKey(str)) {
            return null;
        }
        return f10526a.get(str);
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            synchronized (c.class) {
                if (f10526a.containsKey(str)) {
                    f10526a.get(str).a();
                    f10526a.remove(str);
                }
            }
        }
    }

    public static void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{obj});
        } else if (obj == null) {
        } else {
            c(i.a(obj));
        }
    }

    public static <T extends d> void a(Object obj, Class<T> cls, g gVar) {
        b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae1164d", new Object[]{obj, cls, gVar});
        } else if (obj == null || (b = b(i.a(obj))) == null) {
        } else {
            b.a(cls, gVar);
        }
    }

    public static <T extends d> void a(Object obj, Class<T> cls) {
        b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5e9579", new Object[]{obj, cls});
        } else if (obj == null || (b = b(i.a(obj))) == null) {
        } else {
            b.a(cls);
        }
    }

    public static void a(Object obj, g gVar) {
        b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2c5398", new Object[]{obj, gVar});
        } else if (obj == null || (b = b(i.a(obj))) == null) {
        } else {
            b.a(gVar);
        }
    }

    public static void a(Object obj, d dVar) {
        b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2af67b", new Object[]{obj, dVar});
        } else if (obj == null || (b = b(i.a(obj))) == null) {
        } else {
            b.b(dVar);
        }
    }

    public static <T extends d> void a(Object obj, Class<T> cls, f fVar) {
        b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae0a1ee", new Object[]{obj, cls, fVar});
        } else if (obj == null || (b = b(i.a(obj))) == null) {
        } else {
            b.a(cls, fVar);
        }
    }

    public static <T extends d> void b(Object obj, Class<T> cls) {
        b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527c8658", new Object[]{obj, cls});
        } else if (obj == null || (b = b(i.a(obj))) == null) {
        } else {
            b.b(cls);
        }
    }

    public static void a(Object obj, f fVar) {
        b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2bdf39", new Object[]{obj, fVar});
        } else if (obj == null || (b = b(i.a(obj))) == null) {
        } else {
            b.a(fVar);
        }
    }

    public static <T> T b(Object obj, d dVar) {
        b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("86151576", new Object[]{obj, dVar});
        }
        if (obj != null && (b = b(i.a(obj))) != null) {
            return (T) b.a(dVar);
        }
        return null;
    }
}
