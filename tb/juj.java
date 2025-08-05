package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.r;
import com.taobao.android.weex_framework.ui.e;
import com.taobao.android.weex_framework.util.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class juj implements jug {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeexInstanceImpl f29773a;
    private View d;
    private e e;
    private final r b = new r();
    private final MUSMonitor c = new MUSMonitor(this.b);
    private final Map<String, String> f = new HashMap();
    private final Map<String, Set<p.a>> g = new HashMap();
    private final Map<String, Set<p.b>> h = new HashMap();

    static {
        kge.a(-236229966);
        kge.a(2144744574);
    }

    public juj(WeexInstanceImpl weexInstanceImpl) {
        this.f29773a = weexInstanceImpl;
    }

    @Override // tb.jug
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.f.put(str, str2);
        e(str, str2);
    }

    @Override // tb.jug
    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : this.f.get(str);
    }

    private void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
            return;
        }
        Set<p.b> set = this.h.get(str);
        if (set == null || set.isEmpty()) {
            return;
        }
        for (p.b bVar : set) {
            bVar.onNativeStateChange(str, str2);
        }
    }

    @Override // tb.jug
    public void a(String str, p.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7ebd5d", new Object[]{this, str, bVar});
        } else if (!j.a()) {
            throw new RuntimeException("please register native state listener in main thread");
        } else {
            Set<p.b> set = this.h.get(str);
            if (set == null) {
                set = new HashSet<>();
                this.h.put(str, set);
            }
            set.add(bVar);
        }
    }

    @Override // tb.jug
    public void b(String str, p.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93bd2cfc", new Object[]{this, str, bVar});
        } else if (!j.a()) {
            throw new RuntimeException("please unregister native state listener in main thread");
        } else {
            Set<p.b> set = this.h.get(str);
            if (set == null || set.isEmpty()) {
                return;
            }
            set.remove(bVar);
        }
    }

    @Override // tb.jug
    public void a(String str, p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7e48fe", new Object[]{this, str, aVar});
        } else if (!j.a()) {
            throw new RuntimeException("please register native state listener in main thread");
        } else {
            Set<p.a> set = this.g.get(str);
            if (set == null) {
                set = new HashSet<>();
                this.g.put(str, set);
            }
            set.add(aVar);
        }
    }

    @Override // tb.jug
    public void b(String str, p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93bcb89d", new Object[]{this, str, aVar});
        } else if (!j.a()) {
            throw new RuntimeException("please unregister native state listener in main thread");
        } else {
            Set<p.a> set = this.g.get(str);
            if (set == null || set.isEmpty()) {
                return;
            }
            set.remove(aVar);
        }
    }

    @Override // tb.jug
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (!j.a()) {
            throw new RuntimeException("please fireNativeEvent on mainThread");
        } else {
            Set<p.a> set = this.g.get(str);
            if (set == null || set.isEmpty()) {
                return;
            }
            for (p.a aVar : set) {
                aVar.onNativeEvent(str, str2);
            }
        }
    }

    @Override // tb.jug
    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            this.c.a(str, j);
        }
    }

    @Override // tb.jug
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else {
            this.c.b(str, str2);
        }
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.c.a(z, z2);
        }
    }

    public void a(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34debf", new Object[]{this, new Integer(i), str, new Long(j)});
        } else {
            this.c.a(i, str, j);
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else {
            this.c.a(str, str2);
        }
    }

    @Override // tb.jug
    public r a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("8088e623", new Object[]{this}) : this.b;
    }

    @Override // tb.jug
    public MUSMonitor b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSMonitor) ipChange.ipc$dispatch("63c8bbfc", new Object[]{this}) : this.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.d = com.taobao.android.weex_framework.ui.j.a().a(this.f29773a.getAdapterMUSInstance());
        }
    }

    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.d;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eca52f1", new Object[]{this, eVar});
        } else {
            this.e = eVar;
        }
    }

    public e e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("c706d4f3", new Object[]{this}) : this.e;
    }
}
