package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.arc;

/* loaded from: classes2.dex */
public final class arg implements are {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25528a = "AURALoggerV2";
    private final List<are> b = new ArrayList();
    private ifs c;

    static {
        kge.a(824315295);
        kge.a(-308380327);
        kge.a(1830165995);
    }

    public void a(are areVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0906404", new Object[]{this, areVar});
        } else if (areVar != null && !this.b.contains(areVar)) {
            for (are areVar2 : this.b) {
                if (areVar.getClass() == areVar2.getClass()) {
                    return;
                }
            }
            this.b.add(areVar);
        }
    }

    @Override // tb.are
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, (arf) null);
        }
    }

    private void c(String str, arf arfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4cdeaf", new Object[]{this, str, arfVar});
        } else if (!this.b.isEmpty()) {
        } else {
            if (this.c == null) {
                this.c = new ifs();
            }
            this.c.b(str, arfVar);
        }
    }

    @Override // tb.are
    public void a(String str, arf arfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207b4e2d", new Object[]{this, str, arfVar});
            return;
        }
        c(str, arfVar);
        for (are areVar : this.b) {
            try {
                areVar.a(str, arfVar);
            } catch (Exception e) {
                ard a2 = arc.a();
                a2.b("Debug类型日志调用报错:" + e.getMessage(), arc.a.a().b("AURALoggerV2").b());
            }
        }
    }

    @Override // tb.are
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            b(str, arc.a.a().b());
        }
    }

    @Override // tb.are
    public void b(String str, arf arfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3564166e", new Object[]{this, str, arfVar});
            return;
        }
        c(str, arfVar);
        for (are areVar : this.b) {
            try {
                areVar.b(str, arfVar);
            } catch (Exception unused) {
            }
        }
    }

    @Override // tb.are
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        arc.a a2 = arc.a.a();
        b(str2, a2.a("AURA/" + str).b());
    }
}
