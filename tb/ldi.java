package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.h;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ldi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static h f30498a;
    private static final List<h.b> b;

    static {
        kge.a(1965150999);
        b = new CopyOnWriteArrayList();
    }

    public static void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9aa5d07", new Object[]{hVar});
        } else {
            f30498a = hVar;
        }
    }

    public static void a(h.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ca3c9", new Object[]{bVar});
        } else {
            b.add(bVar);
        }
    }

    public static void b(h.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b0f90a", new Object[]{bVar});
        } else {
            b.remove(bVar);
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (f30498a == null) {
            ldf.b("InfoFlowNav", "toUri gInfoFlowNav == null");
            return false;
        }
        try {
            return f30498a.a(context, a(str));
        } catch (Throwable th) {
            ldf.a("InfoFlowNav", "toUri error", th);
            return false;
        }
    }

    public static boolean a(Context context, h.a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("14c88eb0", new Object[]{context, aVar, str})).booleanValue() : a(context, aVar, a(str), (View) null, false);
    }

    public static boolean a(Context context, h.a aVar, String str, View view, dqa dqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9faed26", new Object[]{context, aVar, str, view, dqaVar})).booleanValue();
        }
        if (f30498a == null) {
            ldf.b("InfoFlowNav", "toUri2 gInfoFlowNav == null");
            return false;
        }
        try {
            return f30498a.a(context, aVar, a(str), view, dqaVar);
        } catch (Throwable th) {
            ldf.a("InfoFlowNav", "toUri2 error", th);
            return false;
        }
    }

    public static boolean a(Context context, h.a aVar, String str, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd394f2", new Object[]{context, aVar, str, view, new Boolean(z)})).booleanValue();
        }
        if (f30498a == null) {
            ldf.b("InfoFlowNav", "toUri2 gInfoFlowNav == null");
            return false;
        }
        try {
            return f30498a.a(context, aVar, a(str), view, z);
        } catch (Throwable th) {
            ldf.a("InfoFlowNav", "toUri2 error", th);
            return false;
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        for (h.b bVar : b) {
            str = bVar.onIntercept(str);
        }
        return str;
    }
}
