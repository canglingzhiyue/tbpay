package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.c;
import com.taobao.taobaoavsdk.util.b;
import java.util.LinkedList;
import java.util.Map;
import tb.ozn;

/* loaded from: classes8.dex */
public abstract class ozg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LruCache<String, ozn> f32508a;
    public ozn.a b;
    public ozn c;
    public boolean g;

    static {
        kge.a(-2062431264);
    }

    public abstract int a();

    public abstract void f();

    public void a(String str, ozn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50de8242", new Object[]{this, str, aVar});
        } else if (!TextUtils.isEmpty(str)) {
            for (String str2 : this.f32508a.snapshot().keySet()) {
                if (str.equals(str2)) {
                    ozn oznVar = this.f32508a.get(str2);
                    if (oznVar.h != null) {
                        oznVar.h.remove(aVar);
                        if (oznVar.h.size() == 0) {
                            this.b = aVar;
                            this.f32508a.remove(str);
                        }
                    }
                }
            }
        }
    }

    public ozn a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozn) ipChange.ipc$dispatch("7c739a91", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.c != null) {
            ozn oznVar = new ozn(str);
            oznVar.h = this.c.h;
            oznVar.b = this.c.b;
            oznVar.c = this.c.c;
            oznVar.d = this.c.d;
            oznVar.k = this.c.k;
            oznVar.i = this.c.i;
            this.c = null;
            return oznVar;
        }
        ozn oznVar2 = new ozn(str, this.b);
        this.b = null;
        return oznVar2;
    }

    public ozn a(ozn oznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozn) ipChange.ipc$dispatch("aca414e", new Object[]{this, oznVar});
        }
        if (oznVar == null || TextUtils.isEmpty(oznVar.f32509a)) {
            return oznVar;
        }
        if (this.f32508a == null) {
            this.f32508a = new ozl(a());
        }
        Map<String, ozn> snapshot = this.f32508a.snapshot();
        if (snapshot.size() == a() && b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_REORDER_WHEN_CREATE, "true"))) {
            c();
        }
        for (String str : snapshot.keySet()) {
            if (oznVar.f32509a.equals(str)) {
                return this.f32508a.get(str);
            }
        }
        this.c = oznVar;
        return this.f32508a.get(oznVar.f32509a);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        LruCache<String, ozn> lruCache = this.f32508a;
        return lruCache != null && lruCache.size() < a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LruCache<String, ozn> lruCache = this.f32508a;
        if (lruCache == null) {
            return;
        }
        Map<String, ozn> snapshot = lruCache.snapshot();
        if (snapshot.isEmpty()) {
            return;
        }
        try {
            for (ozn oznVar : snapshot.values()) {
                if (oznVar.h != null && oznVar.h.size() > 0 && oznVar.h.get(0).isVisible()) {
                    AVSDKLog.e(c.MODULE_SDK_PAGE, "recycler " + oznVar.h.get(0) + "is Visible");
                    this.f32508a.get(oznVar.f32509a);
                }
            }
            for (ozn oznVar2 : snapshot.values()) {
                if (oznVar2.h != null && oznVar2.h.size() > 0 && oznVar2.h.get(0).isPlaying()) {
                    this.f32508a.get(oznVar2.f32509a);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void a(boolean z, String str, ozn oznVar) {
        ozn.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64a6fe3", new Object[]{this, new Boolean(z), str, oznVar});
        } else if (TextUtils.isEmpty(str) || oznVar == null || oznVar.h == null || this.g) {
        } else {
            ozn.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.release(true);
                this.b = null;
            } else if (oznVar.h.size() <= 0 || oznVar.f == null || (aVar = oznVar.h.get(0)) == null) {
            } else {
                oznVar.b = aVar.getCurrentPosition();
                oznVar.c = oznVar.e;
                oznVar.d = true;
                oznVar.e = aVar.getDestoryState();
                aVar.release(true);
            }
        }
    }

    public Map<String, ozn> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        f();
        return this.f32508a.snapshot();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : d().size();
    }

    public ozn b(String str, ozn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozn) ipChange.ipc$dispatch("a4e36360", new Object[]{this, str, aVar});
        }
        if (TextUtils.isEmpty(str) || aVar == null) {
            return null;
        }
        f();
        Map<String, ozn> snapshot = this.f32508a.snapshot();
        if (snapshot.size() == a() && b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_REORDER_WHEN_CREATE, "true"))) {
            c();
        }
        for (String str2 : snapshot.keySet()) {
            if (str.equals(str2)) {
                ozn oznVar = this.f32508a.get(str2);
                if (oznVar.h == null) {
                    oznVar.h = new LinkedList();
                }
                if (!oznVar.h.contains(aVar)) {
                    oznVar.h.add(0, aVar);
                }
                return oznVar;
            }
        }
        this.b = aVar;
        return this.f32508a.get(str);
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : this.f32508a.snapshot().keySet()) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }
}
