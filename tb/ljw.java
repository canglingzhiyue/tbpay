package tb;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.g;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.tao.infoflow.multitab.i;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.protocol.c;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class ljw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f30691a;
    private final c b;
    private final kvw c = new kvw();
    private JSONObject d;
    private boolean e;
    private final i f;
    private final IMultiTabPerformanceListener g;

    static {
        kge.a(-1676554133);
    }

    public static /* synthetic */ i a(ljw ljwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("82b8655d", new Object[]{ljwVar}) : ljwVar.f;
    }

    public ljw(i iVar, JSONObject jSONObject, c cVar, IMultiTabPerformanceListener iMultiTabPerformanceListener) {
        this.f = iVar;
        this.d = jSONObject;
        this.b = cVar;
        this.g = iMultiTabPerformanceListener;
        a(this.c, iVar);
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        this.f30691a = c(context);
        return this.f30691a;
    }

    public View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13a4681", new Object[]{this, context});
        }
        View view = this.f30691a;
        if (view != null) {
            this.f30691a = null;
            return view;
        }
        return c(context);
    }

    public void a(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6446c03", new Object[]{this, bVar});
            return;
        }
        a aVar = (a) c(a.KEY);
        if (aVar == null) {
            return;
        }
        aVar.a(bVar);
    }

    public void a(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52139e4", new Object[]{this, bVar});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) c(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar == null) {
            return;
        }
        aVar.a(bVar);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) c(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar == null) {
            return;
        }
        aVar.b(z);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) c(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar == null) {
            return;
        }
        aVar.c(z);
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) c(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar == null) {
            return;
        }
        aVar.a(i, z);
    }

    public View a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fef0fbf4", new Object[]{this, str});
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) c(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar != null) {
            return aVar.a(str);
        }
        return null;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) c(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        return aVar != null && aVar.b();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) c(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar == null) {
            return;
        }
        aVar.b(str);
    }

    public void a(String str, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2be937", new Object[]{this, str, dVar});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) c(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar == null) {
            return;
        }
        aVar.a(str, dVar);
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) c(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar == null) {
            return;
        }
        aVar.a(i, i2);
    }

    public List<JSONObject> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) c(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!this.e) {
            this.d = jSONObject;
        } else {
            List<JSONObject> a2 = e.a(jSONObject);
            for (Map.Entry<String, ksi> entry : this.c.a().entrySet()) {
                entry.getValue().a(jSONObject, a2, true);
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        d dVar = (d) c(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (dVar == null) {
            return;
        }
        dVar.s();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (Map.Entry<String, ksi> entry : this.c.a().entrySet()) {
            entry.getValue().a();
        }
        d();
    }

    public void a(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cd2679", new Object[]{this, iHomeSubTabController});
            return;
        }
        b(iHomeSubTabController);
        c(iHomeSubTabController);
        d(iHomeSubTabController);
    }

    private View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb04e860", new Object[]{this, context});
        }
        LinearLayout linearLayout = new LinearLayout(d(context));
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        for (Map.Entry<String, ksi> entry : this.c.a().entrySet()) {
            entry.getValue().a(linearLayout);
        }
        e();
        g();
        this.e = true;
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            a(jSONObject);
        }
        f();
        return linearLayout;
    }

    private Context d(Context context) {
        Context a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f5ad1f35", new Object[]{this, context}) : (!(context instanceof com.taobao.prefork.a) || (a2 = ((com.taobao.prefork.a) context).a()) == null) ? context : a2;
    }

    private void a(kvw kvwVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4b512", new Object[]{this, kvwVar, iVar});
            return;
        }
        kvwVar.a(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY, new com.taobao.tao.infoflow.multitab.viewprovider.viewpager.c(iVar, this.g));
        kvwVar.a(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY, new d(kvwVar, iVar, this.g));
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c.b();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) c(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        d dVar = (d) c(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar == null || dVar == null) {
            return;
        }
        aVar.a(dVar);
    }

    private <T extends ksi> T c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("7dcb0571", new Object[]{this, str}) : (T) this.c.a(str);
    }

    private void b(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552e2a58", new Object[]{this, iHomeSubTabController});
        } else {
            this.b.b(iHomeSubTabController, iHomeSubTabController.isEnableToSecondFloor());
        }
    }

    private void c(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38f2e37", new Object[]{this, iHomeSubTabController});
            return;
        }
        boolean isEnablePullReFresh = iHomeSubTabController.isEnablePullReFresh();
        b(isEnablePullReFresh);
        this.b.a(iHomeSubTabController, isEnablePullReFresh);
    }

    private void d(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f03216", new Object[]{this, iHomeSubTabController});
            return;
        }
        this.b.a(iHomeSubTabController, iHomeSubTabController.isOnRocketState() ? NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET : g.TAO);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) c(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar == null) {
            return;
        }
        aVar.a(new a.c() { // from class: tb.ljw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.c
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                IHomeSubTabController a2 = ljw.a(ljw.this).a(i);
                if (a2 == null) {
                    return;
                }
                com.taobao.tao.infoflow.multitab.g.a("MultiTabViewProvider", "instantiateItem 补偿 onPageSelected: " + i);
                ljw.this.a(a2);
                a2.onPageSelected();
                ljw.a(ljw.this).e(-1);
            }
        });
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) c(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar == null) {
            return;
        }
        aVar.e();
    }
}
