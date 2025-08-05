package android.taobao.windvane.cache;

import android.taobao.windvane.util.l;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static b f1550a;

    static {
        kge.a(-1692598476);
    }

    public static synchronized b a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6352dde8", new Object[0]);
            }
            if (f1550a == null) {
                f1550a = new b();
            }
            return f1550a;
        }
    }

    private b() {
    }

    public WVFileCache a(String str, String str2, int i, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (WVFileCache) ipChange.ipc$dispatch("94fef8e8", new Object[]{this, str, str2, new Integer(i), new Boolean(z)});
        }
        if (m.a()) {
            m.b("FileCacheFactory", "createFileCache: " + str + "/" + str2 + " capacity: " + i + " sdcard: " + z);
        }
        if (str2 == null || i < 10) {
            if (m.a()) {
                m.b("FileCacheFactory", "createFileCache: url is null, or capacity is too small");
            }
            return null;
        }
        if (!z || !l.a()) {
            z2 = false;
        }
        String a2 = android.taobao.windvane.file.b.a(android.taobao.windvane.config.a.f, str, str2, z2);
        String b = android.taobao.windvane.file.b.b(android.taobao.windvane.config.a.f, str, str2);
        if (m.a()) {
            m.b("FileCacheFactory", "base dir: " + a2);
        }
        WVFileCache wVFileCache = new WVFileCache(a2, b, i, z2);
        if (wVFileCache.b()) {
            return wVFileCache;
        }
        m.d("FileCacheFactory", "init FileCache failed");
        return null;
    }
}
