package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;

/* loaded from: classes7.dex */
public class kyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private kyk f30398a;

    static {
        kge.a(-1196449274);
    }

    public kyi() {
        if (!j.a("enableOpenStabilityMonitor", true)) {
            ldf.d("ClientToServerMonitorManager", "orange开关关闭");
        } else {
            a(new kyj());
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b();
        }
    }

    private void a(kyj kyjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f205c49c", new Object[]{this, kyjVar});
        } else if (this.f30398a != null) {
        } else {
            this.f30398a = new kyk(kyjVar);
            oql.a().k().a(this.f30398a);
            ldf.d("ClientToServerMonitorManager", "registerDxItemClickListener");
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f30398a == null) {
        } else {
            oql.a().k().b(this.f30398a);
            this.f30398a = null;
            ldf.d("ClientToServerMonitorManager", "unRegisterDxItemClickListener");
        }
    }
}
