package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.arc;

/* loaded from: classes2.dex */
public final class ifs implements are {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f28999a;

    static {
        kge.a(146966957);
        kge.a(-308380327);
        f28999a = null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Boolean bool = f28999a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Class.forName(OConstant.REFLECT_TLOG);
            f28999a = true;
        } catch (ClassNotFoundException unused) {
            f28999a = false;
        }
        return f28999a.booleanValue();
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

    @Override // tb.are
    public void a(String str, arf arfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207b4e2d", new Object[]{this, str, arfVar});
            return;
        }
        String c = c(str, arfVar);
        if (!a()) {
            return;
        }
        AdapterForTLog.logd(arc.AURA_LOGGER, c);
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
        String c = c(str, arfVar);
        if (!a()) {
            Log.e(arc.AURA_LOGGER, c);
        } else {
            AdapterForTLog.loge(arc.AURA_LOGGER, c);
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

    private String c(String str, arf arfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("423e69d1", new Object[]{this, str, arfVar});
        }
        if (arfVar == null) {
            return str;
        }
        return str + "|args=" + arfVar;
    }
}
