package android.taobao.windvane.cache;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.nio.ByteBuffer;
import tb.aeg;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f1549a;
    private volatile WVFileCache b;
    private volatile WVFileCache c;

    static {
        kge.a(900179515);
    }

    private WVFileCache c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVFileCache) ipChange.ipc$dispatch("52aa9965", new Object[]{this});
        }
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = b.a().a(null, "wvcache", 250, true);
                }
            }
        }
        return this.b;
    }

    private WVFileCache d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVFileCache) ipChange.ipc$dispatch("c824bfa6", new Object[]{this});
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = b.a().a(null, "wvimage", 300, true);
                }
            }
        }
        return this.c;
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6352ddc9", new Object[0]);
            }
            if (f1549a == null) {
                f1549a = new a();
            }
            return f1549a;
        }
    }

    private a() {
    }

    public synchronized void a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{this, context, str, new Integer(i)});
        } else if (context == null) {
            throw new NullPointerException("CacheManager init error, context is null");
        } else {
            m.b("WVCacheManager", "start init.");
            long currentTimeMillis = System.currentTimeMillis();
            com.taobao.weaver.prefetch.e.a().a(new aeg());
            if (this.b == null) {
                this.b = b.a().a(str, "wvcache", 250, true);
                this.c = b.a().a(str, "wvimage", 300, true);
            }
            if (m.a()) {
                m.b("WVCacheManager", "init finish.  cost time: " + (System.currentTimeMillis() - currentTimeMillis));
            }
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!str.contains("_wvcrc=")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        return parse == null || !parse.isHierarchical() || !StringUtils.isEmpty(parse.getQueryParameter("_wvcrc=")) || !"0".equals(parse.getQueryParameter("_wvcrc="));
    }

    public boolean a(c cVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3abd52", new Object[]{this, cVar, bArr})).booleanValue();
        }
        if (b()) {
            return false;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (android.taobao.windvane.util.a.a(cVar.d)) {
            return d().a(cVar, wrap);
        }
        String a2 = android.taobao.windvane.util.d.a(bArr);
        if (a2 == null) {
            return false;
        }
        cVar.e = a2;
        return c().a(cVar, wrap);
    }

    public String a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{this, new Boolean(z)});
        }
        if (b()) {
            return null;
        }
        if (z) {
            return d().a();
        }
        return c().a();
    }

    public File b(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5d0c42e2", new Object[]{this, new Boolean(z)});
        }
        if (b()) {
            return null;
        }
        if (z) {
            str = d().a() + File.separator + "temp";
        } else {
            str = c().a() + File.separator + "temp";
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : c() == null || d() == null;
    }
}
