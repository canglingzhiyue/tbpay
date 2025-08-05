package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pon implements pol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pol f32782a;
    private pom b;

    static {
        kge.a(-1900901118);
        kge.a(-2105028338);
    }

    public void a(pol polVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa01fd6b", new Object[]{this, polVar});
        } else {
            this.f32782a = polVar;
        }
    }

    public void a(pom pomVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0271ca", new Object[]{this, pomVar});
        } else {
            this.b = pomVar;
        }
    }

    @Override // tb.pol
    public void a(Object obj, String str) {
        pom pomVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
            return;
        }
        if (pav.INSTANCE.a() && (pomVar = this.b) != null) {
            pomVar.a(obj, str);
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.a(obj, str);
    }

    @Override // tb.pol
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.a(obj);
    }

    @Override // tb.pol
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            return;
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.b(obj);
    }

    @Override // tb.pol
    public void c(Object obj) {
        pom pomVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
            return;
        }
        if (pav.INSTANCE.a() && (pomVar = this.b) != null) {
            pomVar.a(obj);
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.c(obj);
    }

    @Override // tb.pol
    public void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        if (pav.INSTANCE.a()) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.a(str, str2, hashMap);
            }
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.a(str, str2, map);
    }

    @Override // tb.pol
    public void a(String str, String str2, String... strArr) {
        pom pomVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e6e23", new Object[]{this, str, str2, strArr});
            return;
        }
        if (pav.INSTANCE.a() && (pomVar = this.b) != null) {
            pomVar.a(str, str2, strArr);
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.a(str, str2, strArr);
    }

    @Override // tb.pol
    public void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
            return;
        }
        if (pav.INSTANCE.a()) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.b(str, str2, hashMap);
            }
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.b(str, str2, map);
    }

    @Override // tb.pol
    public void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            return;
        }
        if (pav.INSTANCE.a()) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.a(str, i, str2, str3, str4, hashMap);
            }
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.a(str, i, str2, str3, str4, map);
    }

    @Override // tb.pol
    public void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{this, obj, map});
            return;
        }
        if (pav.INSTANCE.a()) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.a(obj, hashMap);
            }
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.a(obj, map);
    }

    @Override // tb.pol
    public void c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8682cc47", new Object[]{this, str, str2, map});
            return;
        }
        if (pav.INSTANCE.a()) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.c(str, str2, hashMap);
            }
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.c(str, str2, map);
    }

    @Override // tb.pol
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.a(map);
    }

    @Override // tb.pol
    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.b(map);
    }

    @Override // tb.pol
    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
            return;
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return;
        }
        polVar.d(obj);
    }

    @Override // tb.pol
    public Map<String, String> e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("91772b7d", new Object[]{this, obj});
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return null;
        }
        return polVar.e(obj);
    }

    @Override // tb.pol
    public Map<String, String> a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4282aa6f", new Object[]{this, activity});
        }
        pol polVar = this.f32782a;
        if (polVar == null) {
            return null;
        }
        return polVar.a(activity);
    }
}
