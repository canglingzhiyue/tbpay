package com.taobao.android.detail.ttdetail.request;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import tb.kge;
import tb.soa;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, b> f10781a;
    private static final Map<String, String> b;
    private static final ReentrantLock d;
    private final String c;

    static {
        kge.a(-1129548665);
        f10781a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        d = new ReentrantLock();
    }

    public a(String str) {
        this.c = str;
    }

    public void a(soa soaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1b8733", new Object[]{this, soaVar});
            return;
        }
        d.lock();
        try {
            b bVar = f10781a.get(this.c);
            if (bVar == null) {
                return;
            }
            bVar.a(soaVar);
        } finally {
            d.unlock();
        }
    }

    public void a(C0427a c0427a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71775cc", new Object[]{this, c0427a});
            return;
        }
        d.lock();
        try {
            b bVar = f10781a.get(this.c);
            if (bVar == null) {
                return;
            }
            bVar.a(c0427a);
        } finally {
            d.unlock();
        }
    }

    public soa a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (soa) ipChange.ipc$dispatch("f0a9839", new Object[]{this});
        }
        d.lock();
        try {
            b c = c();
            return c == null ? null : c.b();
        } finally {
            d.unlock();
        }
    }

    public C0427a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0427a) ipChange.ipc$dispatch("60ab6471", new Object[]{this});
        }
        d.lock();
        try {
            b c = c();
            return c == null ? null : c.a();
        } finally {
            d.unlock();
        }
    }

    public b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8e83feef", new Object[]{this}) : f10781a.get(this.c);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.c) && f10781a.get(this.c) != null;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            f10781a.put(str, new b());
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            f10781a.remove(this.c);
        }
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private C0427a f10783a;
        private soa b;

        static {
            kge.a(-39602400);
        }

        public C0427a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0427a) ipChange.ipc$dispatch("32d2ca12", new Object[]{this}) : this.f10783a;
        }

        public void a(C0427a c0427a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d71775cc", new Object[]{this, c0427a});
            } else {
                this.f10783a = c0427a;
            }
        }

        public soa b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (soa) ipChange.ipc$dispatch("16bc3d98", new Object[]{this}) : this.b;
        }

        public void a(soa soaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff1b8733", new Object[]{this, soaVar});
            } else {
                this.b = soaVar;
            }
        }
    }

    /* renamed from: com.taobao.android.detail.ttdetail.request.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0427a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10782a;
        private MtopInfo b;

        static {
            kge.a(-1768433163);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10782a;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f10782a = str;
            }
        }

        public MtopInfo b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MtopInfo) ipChange.ipc$dispatch("dbec6b71", new Object[]{this}) : this.b;
        }

        public void a(MtopInfo mtopInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("206474f0", new Object[]{this, mtopInfo});
            } else {
                this.b = mtopInfo;
            }
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (str == null || str2 == null) {
        } else {
            b.put(str, str2);
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (str != null) {
            return b.get(str);
        }
        return null;
    }

    public static boolean a(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("206474f4", new Object[]{mtopInfo})).booleanValue() : mtopInfo != null && mtopInfo.a() == 2;
    }

    public static boolean b(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad518c13", new Object[]{mtopInfo})).booleanValue() : mtopInfo != null && mtopInfo.a() == 3;
    }

    public static boolean c(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a3ea332", new Object[]{mtopInfo})).booleanValue() : mtopInfo.a() == 1;
    }
}
