package tb;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.j;
import com.taobao.android.weex_framework.l;
import com.taobao.avplayer.av;
import com.taobao.avplayer.common.z;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fle implements flb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private j.b f28026a;
    private j.c b;

    static {
        kge.a(940871368);
        kge.a(1690946622);
    }

    @Override // tb.flb
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    @Override // tb.flb
    public Pair<Boolean, Map<String, String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("dd4f14b2", new Object[]{this});
        }
        j q = l.a().q();
        if (q == null) {
            return null;
        }
        j.b a2 = q.a();
        if (a2 != null && a2.b() && a2.a() != null) {
            this.b = a2.a();
            this.f28026a = a2;
            return new Pair<>(true, null);
        }
        String c = a2 != null ? a2.c() : "null_error";
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", c);
        return new Pair<>(false, hashMap);
    }

    @Override // tb.flb
    public boolean b() {
        j.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        j.b bVar = this.f28026a;
        return (bVar == null || (a2 = bVar.a()) == null || a2.f() == null) ? false : true;
    }

    @Override // tb.flb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ViewGroup d = this.f28026a.a().d();
        if (d != null && d.getParent() != null) {
            ((ViewGroup) d.getParent()).removeView(d);
        }
        j q = l.a().q();
        if (q != null) {
            q.a(this.f28026a);
        }
        this.f28026a = null;
    }

    @Override // tb.flb
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        j.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    @Override // tb.flb
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        j.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.b();
    }

    @Override // tb.flb
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        j.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.e();
        this.b = null;
    }

    @Override // tb.flb
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        j.c cVar = this.b;
        if (cVar == null) {
            return 0;
        }
        return cVar.c();
    }

    @Override // tb.flb
    public View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("20baeb71", new Object[]{this});
        }
        j.c cVar = this.b;
        if (cVar == null) {
            return null;
        }
        return cVar.d();
    }

    @Override // tb.flb
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        j.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.a(i, i2);
    }

    @Override // tb.flb
    public void a(av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173676bc", new Object[]{this, avVar});
            return;
        }
        j.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.b(avVar);
    }

    @Override // tb.flb
    public void a(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410de73b", new Object[]{this, zVar});
            return;
        }
        j.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.c(zVar);
    }

    @Override // tb.flb
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        j.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        if (cVar.c() == 1) {
            this.b.b();
        } else {
            this.b.a();
        }
    }
}
