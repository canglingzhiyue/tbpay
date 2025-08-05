package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.b;
import com.taobao.alivfssdk.cache.h;
import com.taobao.phenix.cache.disk.c;

/* loaded from: classes.dex */
public class niz implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private h f31494a;
    private int b = 2097152;
    private String c;
    private nja d;

    public niz(String str) {
        if (TextUtils.isEmpty(str)) {
            this.c = "phximgs_KV";
            return;
        }
        this.c = "phximgs_KV_" + str;
    }

    @Override // com.taobao.phenix.cache.disk.c
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        h hVar = this.f31494a;
        if (hVar != null) {
            return (String) hVar.b(str);
        }
        niw.a(6, "AlivfsDiskKV", "please call init before use!!!");
        return "";
    }

    @Override // com.taobao.phenix.cache.disk.c
    public boolean a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123b0d6", new Object[]{this, str, new Long(j)})).booleanValue();
        }
        if (this.f31494a != null) {
            long b = b();
            if (b <= 0) {
                return false;
            }
            return this.f31494a.a(str, (Object) String.valueOf(b + j));
        }
        niw.a(6, "AlivfsDiskKV", "please call init before use!!!");
        return false;
    }

    @Override // com.taobao.phenix.cache.disk.c
    public void a() {
        b cacheForModule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f31494a != null || (cacheForModule = AVFSCacheManager.getInstance().cacheForModule(this.c)) == null) {
        } else {
            com.taobao.alivfssdk.cache.c cVar = new com.taobao.alivfssdk.cache.c();
            cVar.f8483a = Long.valueOf(this.b);
            cacheForModule.a(cVar);
            this.f31494a = cacheForModule.b();
        }
    }

    @Override // com.taobao.phenix.cache.disk.c
    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        try {
            if (this.d == null) {
                return -1L;
            }
            return this.d.a();
        } catch (Exception e) {
            qol.h("TTL", "ttl getCurrentTime error=%s", e);
            return -1L;
        }
    }

    @Override // com.taobao.phenix.cache.disk.c
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        try {
            if (this.d != null && !TextUtils.isEmpty(str)) {
                return this.d.a(str);
            }
            return false;
        } catch (Exception e) {
            qol.h("TTL", "ttl isTTLDomain error=%s", e);
            return false;
        }
    }

    @Override // com.taobao.phenix.cache.disk.c
    public boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        try {
            if (this.d == null) {
                return false;
            }
            return this.d.a(j);
        } catch (Exception e) {
            qol.h("TTL", "ttl isExpectedTime error=%s", e);
            return false;
        }
    }

    public void a(nja njaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64cd693", new Object[]{this, njaVar});
        } else {
            this.d = njaVar;
        }
    }
}
