package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.ucp.b;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.utils.f;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.viewmodel.PopDataViewModel;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class kzv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public kzz f30425a;
    private PopDataViewModel b;
    private kyu c;

    public static /* synthetic */ void a(kzv kzvVar, lad ladVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e45a12", new Object[]{kzvVar, ladVar});
        } else {
            kzvVar.a(ladVar);
        }
    }

    public static /* synthetic */ boolean a(kzv kzvVar, lab labVar, BasePopContainer basePopContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b976c244", new Object[]{kzvVar, labVar, basePopContainer})).booleanValue() : kzvVar.a(labVar, basePopContainer);
    }

    public kzv(kyu kyuVar, PopDataViewModel popDataViewModel, kzz kzzVar) {
        this.c = kyuVar;
        this.b = popDataViewModel;
        this.f30425a = kzzVar;
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            this.c.i().b();
        }
    }

    public boolean a(boolean z, String str, List<JSONObject> list) {
        Map<String, IPopData> allPopData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47a8db2b", new Object[]{this, new Boolean(z), str, list})).booleanValue();
        }
        boolean updateViewModel = this.b.updateViewModel(this.c, list, z, str);
        c.a("HomePopEngine ", "refreshPops, update=" + updateViewModel + ", size=" + this.b.getPopSize() + ", requestType=" + str);
        if (!updateViewModel || (allPopData = this.b.getAllPopData()) == null) {
            return updateViewModel;
        }
        Collection<IPopData> a2 = com.taobao.homepage.pop.ucp.c.a(allPopData.values());
        if (a2 != null && !a2.isEmpty() && z && !StringUtils.equals(str, "coldStart")) {
            this.c.i().a("request", str);
        }
        this.c.g().a(this.c, this.b);
        return updateViewModel;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        kyu.a();
        this.c.g().a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        a(context, 3);
        a(context, 2);
        a(context, 1);
        a(context, 0);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c.j();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.c.k();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c.b("HomePopEngine ", "destroyPopEngine");
        this.b.destroy();
        this.c.g().f();
        this.c.i().d();
    }

    private void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
        } else if (context == null) {
        } else {
            final BasePopContainer a2 = this.c.g().a(context, i);
            final lab a3 = a(i);
            if (a(a3, a2)) {
                return;
            }
            lah.a().a(new Runnable() { // from class: tb.kzv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        kzv.a(kzv.this, a3, a2);
                    }
                }
            }, 0L);
        }
    }

    private boolean a(final lab labVar, BasePopContainer basePopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59ca594d", new Object[]{this, labVar, basePopContainer})).booleanValue();
        }
        int hierarchy = basePopContainer.getHierarchy();
        if (!labVar.a(basePopContainer)) {
            c.a("HomePopEngine ", "attachContainer failed, hierarchy=" + hierarchy);
            return false;
        }
        c.a("HomePopEngine ", "attachContainer success, hierarchy=" + hierarchy + ", container:" + basePopContainer.hashCode());
        basePopContainer.refreshData(this.c, this.b);
        basePopContainer.setPopListenerRegister(this.f30425a);
        if (labVar instanceof lad) {
            lah.a().a(new Runnable() { // from class: tb.kzv.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        kzv.a(kzv.this, (lad) labVar);
                    }
                }
            }, 0L);
        }
        return true;
    }

    private void a(lad ladVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f265aee9", new Object[]{this, ladVar});
            return;
        }
        int[] a2 = ladVar.a();
        if (a2 == null || a2.length < 2 || a2[0] > a2[1]) {
            return;
        }
        if (!this.c.b()) {
            kyu.a();
        }
        for (int i = a2[0]; i <= a2[1]; i++) {
            View b = ladVar.b(i);
            String a3 = ladVar.a(i);
            if (b != null && !StringUtils.isEmpty(a3)) {
                this.c.c().a(i, b, a3);
            }
        }
    }

    private lab a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lab) ipChange.ipc$dispatch("e6641e9e", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return this.c.f();
        }
        if (i == 1) {
            return this.c.e();
        }
        if (i == 3) {
            return this.c.h();
        }
        return this.c.d();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Map<String, IPopData> allPopData = this.b.getAllPopData();
        if (allPopData == null) {
            com.taobao.homepage.pop.ucp.c.a(com.taobao.homepage.pop.ucp.c.a(this.c), "Error", 3, b.ERROR_MSG_NO_POP_DATA);
            c.a("HomePopEngine ", "reTriggerByUCP, popDataMap is null");
            return;
        }
        IPopData<?> iPopData = allPopData.get(str);
        if (!com.taobao.homepage.pop.ucp.c.a(iPopData)) {
            c.a("HomePopEngine ", "reTriggerByUCP, popDataMap is null, or not ucp pop " + str);
            com.taobao.homepage.pop.ucp.c.a(this.c.i().c(), "Error", 3, b.ERROR_MSG_NO_POP_DATA);
            return;
        }
        f.a("UcpInfoMatchPop", "1", true, str);
        this.c.g().b(iPopData);
        c.a("HomePopEngine ", "reTriggerByUCP");
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        IPopData popDataByBusinessId = this.b.getPopDataByBusinessId(str);
        if (popDataByBusinessId != null) {
            return this.c.g().c(popDataByBusinessId);
        }
        return false;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        IPopData popDataByBusinessId = this.b.getPopDataByBusinessId(str);
        if (popDataByBusinessId == null) {
            return;
        }
        this.c.g().d(popDataByBusinessId);
    }
}
