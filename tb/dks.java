package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class dks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f26818a;
    private final HashMap<String, dln> b = new HashMap<>(50);

    static {
        kge.a(-1763197819);
    }

    public static void a(dlc dlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e559781d", new Object[]{dlcVar});
            return;
        }
        dlb.a(dlcVar.f26824a);
        if (dlcVar.c != null) {
            dlb.b = dlcVar.c;
        }
        if (dlcVar.b != null) {
            dlb.c = dlcVar.b;
        }
        if (dlcVar.d != null) {
            dlb.d = dlcVar.d;
        }
        if (dlcVar.f != null) {
            dlb.f = dlcVar.f;
        }
        if (dlcVar.e == null) {
            return;
        }
        dlb.e = dlcVar.e;
    }

    public dks(String str) {
        this.f26818a = str;
    }

    public boolean a(String str, dln dlnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2548ee00", new Object[]{this, str, dlnVar})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || dlb.f26823a.containsKey(str)) {
            return false;
        }
        this.b.put(str, dlnVar);
        return true;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f26818a = str;
        }
    }

    public dlg<dle> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dlg) ipChange.ipc$dispatch("7c6e6515", new Object[]{this, str});
        }
        dln<Object> dlnVar = dlb.f26823a.get(str);
        if (dlnVar == null) {
            dlnVar = this.b.get(str);
        }
        if (dlnVar == null) {
            dlnVar = dml.INSTANCE.a(str, this.f26818a);
        }
        if (dlnVar != null) {
            return dlnVar.b(null);
        }
        return null;
    }
}
