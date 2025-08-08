package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.b;
import com.taobao.alivfssdk.cache.c;
import com.taobao.alivfssdk.cache.h;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.util.g;

/* loaded from: classes4.dex */
public class dpm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26890a;
    private volatile h b;

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final dpm f26891a;

        static {
            kge.a(727476495);
            f26891a = new dpm();
        }

        public static /* synthetic */ dpm a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dpm) ipChange.ipc$dispatch("f03cbdd", new Object[0]) : f26891a;
        }
    }

    public static dpm a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dpm) ipChange.ipc$dispatch("f03cbdd", new Object[0]) : a.a();
    }

    private dpm() {
        try {
            c();
        } catch (Throwable th) {
            g.c("MUSPageCache", th);
        }
    }

    static {
        kge.a(-2072167743);
        f26890a = !m.c();
    }

    private synchronized boolean c() {
        b cacheForModule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.b == null && (cacheForModule = AVFSCacheManager.getInstance().cacheForModule("muise_wlm_template", false)) != null) {
            c cVar = new c();
            cVar.f8483a = 104857600L;
            cacheForModule.a(cVar);
            this.b = cacheForModule.a();
        }
        return this.b != null;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            if (com.taobao.android.weex.inspector.b.a() || StringUtils.isEmpty(str)) {
                return false;
            }
            if (this.b == null) {
                c();
            }
            return this.b.a(str);
        } catch (Throwable th) {
            g.c("MUSPageCache", th);
            return false;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            if (this.b == null) {
                c();
            }
            this.b.c(str);
        } catch (Throwable th) {
            g.c("MUSPageCache", th);
        }
    }

    public byte[] c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("792658a9", new Object[]{this, str});
        }
        try {
            if (com.taobao.android.weex.inspector.b.a() || StringUtils.isEmpty(str)) {
                return null;
            }
            if (this.b == null) {
                c();
            }
            return (byte[]) this.b.b(str);
        } catch (Throwable th) {
            g.c("MUSPageCache", th);
            return null;
        }
    }

    public boolean a(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a35a7c7d", new Object[]{this, str, bArr})).booleanValue();
        }
        try {
            if (StringUtils.isEmpty(str) || bArr == null) {
                return false;
            }
            if (this.b == null) {
                c();
            }
            return this.b.a(str, bArr);
        } catch (Throwable th) {
            g.c("MUSPageCache", th);
            return false;
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            if (StringUtils.isEmpty(str) || str2 == null) {
                return false;
            }
            if (this.b == null) {
                c();
            }
            return this.b.a(str, (Object) str2);
        } catch (Throwable th) {
            g.c("MUSPageCache", th);
            return false;
        }
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        try {
            if (com.taobao.android.weex.inspector.b.a() || StringUtils.isEmpty(str)) {
                return null;
            }
            if (this.b == null) {
                c();
            }
            return (String) this.b.b(str);
        } catch (Throwable th) {
            g.c("MUSPageCache", th);
            return null;
        }
    }
}
