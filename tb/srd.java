package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.fatigue.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class srd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject h;

    /* renamed from: a  reason: collision with root package name */
    private final List<srl> f33851a = new ArrayList();
    private final List<srv> b = new ArrayList();
    private final List<srf> c = new ArrayList();
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final srk d = new srk();
    private final a e = new a();
    private final srx f = new srx(this.d, this.e);
    private final xki i = new xki();

    static {
        kge.a(-1340703679);
    }

    public srd() {
        b();
        c();
        d();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.g.set(false);
        kej.a("2ARCH_BootImageWorkFlow", "loadDataFromCache: ");
        for (srl srlVar : this.f33851a) {
            srlVar.bN_();
        }
        this.g.set(true);
        JSONObject jSONObject = this.h;
        if (jSONObject == null) {
            return;
        }
        a(jSONObject);
        this.h = null;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!this.g.get()) {
            this.h = jSONObject;
            kej.a("2ARCH_BootImageWorkFlow", "updateAwesomeData wait cache load ");
        } else {
            kej.a("2ARCH_BootImageWorkFlow", "updateAwesomeData: ");
            for (srl srlVar : this.f33851a) {
                srlVar.a(jSONObject);
            }
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        kej.a("2ARCH_BootImageWorkFlow", "updateSplashData: ");
        for (srl srlVar : this.f33851a) {
            srlVar.b(jSONObject);
        }
    }

    public void a(int i, Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b994ad", new Object[]{this, new Integer(i), activity});
            return;
        }
        kej.a("2ARCH_BootImageWorkFlow", "launcherStart: ");
        kel.a("");
        for (srf srfVar : this.c) {
            z = srfVar.a();
        }
        if (!z) {
            kej.a("2ARCH_BootImageWorkFlow", "launcherStart: 拦截");
            return;
        }
        kej.a("2ARCH_BootImageWorkFlow", "launcherStart: start");
        this.f.a(activity);
        for (srv srvVar : this.b) {
            kej.a("2ARCH_BootImageWorkFlow", "launcherStart: 分发 " + srvVar.getClass());
            srvVar.b(this.d.b(), i);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        for (srv srvVar : this.b) {
            kej.a("2ARCH_BootImageWorkFlow", "pageInBackground: 分发 " + srvVar.getClass());
            srvVar.onTerminate(i, 205, 0);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        for (srv srvVar : this.b) {
            srvVar.a(this.d.b(), i);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f33851a.add(this.d);
        this.f33851a.add(this.e);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.add(this.f);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.c.add(this.e);
        this.c.add(this.i);
    }
}
