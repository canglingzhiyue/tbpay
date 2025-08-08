package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.b;
import com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a;

/* loaded from: classes7.dex */
public class lxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lxz f30980a;

    static {
        kge.a(1300851775);
    }

    public lxy(lxz lxzVar) {
        this.f30980a = lxzVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!b()) {
            a(false, "no item key");
            return false;
        } else if (!c()) {
            a(false, "no item id");
            return false;
        } else if (!d()) {
            a(false, "windvane not expired");
            return false;
        } else if (!e() && !f()) {
            a(false, "not main edition");
            return false;
        } else if (this.f30980a.c().contains(this.f30980a.b())) {
            b(false, "current exposed");
            return false;
        } else if (g()) {
            b(false, "next or prev exposed");
            return false;
        } else {
            a(true, "");
            return true;
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.f30980a.b());
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.f30980a.a());
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f30980a.f() <= 0 || this.f30980a.e() <= 0 || System.currentTimeMillis() > ((long) (this.f30980a.e() + this.f30980a.f()));
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : b.f(lxm.c());
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : b.d(lxm.c());
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        int indexOf = this.f30980a.d().indexOf(this.f30980a.b());
        if (indexOf > 0 && this.f30980a.c().contains(this.f30980a.d().get(indexOf - 1))) {
            return true;
        }
        return indexOf < this.f30980a.d().size() - 1 && this.f30980a.c().contains(this.f30980a.d().get(indexOf + 1));
    }

    private void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        a.a("dataProcess", "WindvaneRequestPolicy", "shouldHappen addRequestPolicyMonitor  needRequest: " + z + "reason" + str);
        String str2 = z ? "windvane_request_need" : "windvane_request_not_need";
        if (str == null) {
            str = "";
        }
        lxv.a("windvane_request_filter", "1.0", str2, "", str);
    }

    private void b(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31b0915", new Object[]{this, new Boolean(z), str});
            return;
        }
        a.a("dataProcess", "WindvaneRequestPolicy", "shouldHappen addRequestPolicyMonitorFail needRequest: " + z + "reason" + str);
        String str2 = z ? "windvane_request_need" : "windvane_request_not_need";
        if (str == null) {
            str = "";
        }
        lxv.a("windvane_request_filter", "1.0", str2, "-999", str, null, null);
    }
}
