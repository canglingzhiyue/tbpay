package android.taobao.windvane.cache;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.taobao.windvane.config.j;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.jbg;
import tb.kge;

/* loaded from: classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_CACHE_TIME = 2000;

    /* renamed from: a  reason: collision with root package name */
    private static e f1552a;
    private HashMap<String, f> b = null;
    private Handler c;

    static {
        kge.a(-1302665071);
        f1552a = null;
    }

    public static synchronized e a() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("6352de45", new Object[0]);
            }
            if (f1552a == null) {
                f1552a = new e();
            }
            return f1552a;
        }
    }

    private e() {
        try {
            HandlerThread a2 = jbg.a("WindVane");
            if (!a2.isAlive()) {
                a2.start();
            }
            this.c = new Handler(a2.getLooper());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(String str, Map<String, List<String>> map, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c18e11a", new Object[]{this, str, map, bArr});
            return;
        }
        j.a();
        a(str, map, bArr, j.commonConfig.aH, 0L);
    }

    public void a(String str, Map<String, List<String>> map, byte[] bArr, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8973db1a", new Object[]{this, str, map, bArr, new Long(j), new Long(j2)});
            return;
        }
        if (this.b == null) {
            this.b = new HashMap<>();
        }
        if (str == null) {
            return;
        }
        f fVar = new f(str, map, bArr, j, j2);
        final String e = p.e(str);
        this.b.put(e, fVar);
        Handler handler = this.c;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: android.taobao.windvane.cache.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    e.this.c(e);
                }
            }
        }, j);
    }

    public f a(String str) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("668b162e", new Object[]{this, str});
        }
        f fVar2 = null;
        if (this.b == null || str == null) {
            return null;
        }
        try {
            fVar = this.b.get(p.e(str));
        } catch (Throwable th) {
            th = th;
        }
        if (fVar == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(fVar.c);
            Set<String> queryParameterNames = parse2.getQueryParameterNames();
            Iterator<String> it = parse2.getQueryParameterNames().iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar2 = fVar;
                    break;
                }
                String next = it.next();
                if (queryParameterNames.contains(next)) {
                    String queryParameter = parse.getQueryParameter(next);
                    String queryParameter2 = parse2.getQueryParameter(next);
                    if (!queryParameter.equals(queryParameter2)) {
                        m.e("WVMemoryCache", "param don't match, query=" + next + " ,targetParam=" + queryParameter + " ,cachedParam=" + queryParameter2);
                        break;
                    }
                } else {
                    m.e("WVMemoryCache", "param key don't match, query=" + next + " ,targetQueryParams=" + queryParameterNames);
                    break;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fVar2 = fVar;
            m.e("WVMemoryCache", "getMemoryCacheByUrlForHtml error!");
            th.printStackTrace();
            return fVar2;
        }
        return fVar2;
    }

    public f b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("8fdf6b6f", new Object[]{this, str});
        }
        HashMap<String, f> hashMap = this.b;
        if (hashMap != null && str != null) {
            return hashMap.get(p.e(str));
        }
        return null;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        HashMap<String, f> hashMap = this.b;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return;
        }
        m.b("WVMemoryCache", "clearCacheByUrl url=" + str + ",realUrl=" + this.b.remove(str).c);
    }
}
