package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.c;
import com.taobao.alivfssdk.cache.h;
import com.taobao.phenix.cache.disk.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public class nix implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f31492a;
    private final String b;
    private h c;
    private volatile int d;

    @Override // com.taobao.phenix.cache.disk.b
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public nix(int i, String str) {
        com.taobao.tcommon.core.b.a(!TextUtils.isEmpty(str), "name cannot be empty when constructing AlivfsDiskCache");
        this.f31492a = i;
        this.b = "phximgs_" + str;
    }

    @Override // com.taobao.phenix.cache.disk.b
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f31492a;
    }

    private synchronized boolean d() {
        com.taobao.alivfssdk.cache.b cacheForModule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.c == null && (cacheForModule = AVFSCacheManager.getInstance().cacheForModule(this.b)) != null) {
            c cVar = new c();
            cVar.f8483a = Long.valueOf(this.d);
            cacheForModule.a(cVar);
            this.c = cacheForModule.a();
        }
        return this.c != null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AlivfsDiskCache(" + Integer.toHexString(hashCode()) + ", name@" + this.b + riy.BRACKET_END_STR;
    }

    @Override // com.taobao.phenix.cache.disk.b
    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        AVFSCacheManager.getInstance().removeCacheForModule(this.b);
        niw.b("DiskCache", "remove alivfs cache module(%s)", this.b);
        this.c = null;
    }

    @Override // com.taobao.phenix.cache.disk.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    @Override // com.taobao.phenix.cache.disk.b
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : d();
    }

    @Override // com.taobao.phenix.cache.disk.b
    public long b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253be4", new Object[]{this, str, new Integer(i)})).longValue();
        }
        try {
            if (!d()) {
                return -1L;
            }
            long e = (int) this.c.e(str, String.valueOf(i));
            if (e <= 0) {
                return -1L;
            }
            return e;
        } catch (Throwable unused) {
            niw.d("DiskCache", "getLength error", new Object[0]);
            return -1L;
        }
    }

    @Override // com.taobao.phenix.cache.disk.b
    public int[] a(String str) {
        List<String> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("81233af2", new Object[]{this, str});
        }
        try {
            if (d() && (f = this.c.f(str)) != null && f.size() > 0) {
                int[] iArr = new int[f.size()];
                for (int i = 0; i < f.size(); i++) {
                    try {
                        iArr[i] = Integer.parseInt(f.get(i));
                    } catch (NumberFormatException unused) {
                    }
                }
                return iArr;
            }
        } catch (Throwable unused2) {
            niw.d("DiskCache", "getCatalogs error", new Object[0]);
        }
        return new int[0];
    }

    @Override // com.taobao.phenix.cache.disk.b
    public njf a(String str, int i) {
        int e;
        InputStream d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njf) ipChange.ipc$dispatch("264f9f6b", new Object[]{this, str, new Integer(i)});
        }
        try {
            if (d() && (e = (int) this.c.e(str, String.valueOf(i))) > 0 && (d = this.c.d(str, String.valueOf(i))) != null) {
                return new njf(d, e);
            }
            return null;
        } catch (Throwable unused) {
            niw.d("DiskCache", "get error", new Object[0]);
            return null;
        }
    }

    public boolean a(String str, int i, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eec1a226", new Object[]{this, str, new Integer(i), inputStream})).booleanValue();
        }
        try {
            if (d() && inputStream != null) {
                if (this.c.a(str, String.valueOf(i), inputStream)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            niw.d("DiskCache", "put error", new Object[0]);
            return false;
        }
    }

    @Override // com.taobao.phenix.cache.disk.b
    public boolean a(String str, int i, byte[] bArr, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12cf7bfc", new Object[]{this, str, new Integer(i), bArr, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        ByteArrayInputStream byteArrayInputStream = null;
        if (bArr != null && i3 > 0) {
            byteArrayInputStream = new ByteArrayInputStream(bArr, i2, i3);
        }
        return a(str, i, byteArrayInputStream);
    }
}
