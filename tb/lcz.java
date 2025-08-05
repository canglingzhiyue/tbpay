package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.c;

/* loaded from: classes.dex */
public class lcz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f30488a;

    static {
        kge.a(-1244235624);
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a8172c", new Object[]{cVar});
        } else {
            f30488a = cVar;
        }
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("f921f837", new Object[0]);
        }
        c cVar = f30488a;
        if (cVar == null) {
            ldf.b("InfoFlowAppEnv", "getApplication gInfoFlowAppEnv == null");
            return null;
        }
        try {
            return cVar.a();
        } catch (Throwable th) {
            ldf.a("InfoFlowAppEnv", "getApplication error", th);
            return null;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        c cVar = f30488a;
        if (cVar == null) {
            ldf.b("InfoFlowAppEnv", "isDebug gInfoFlowAppEnv == null");
            return false;
        }
        try {
            return cVar.b();
        } catch (Throwable th) {
            ldf.a("InfoFlowAppEnv", "isDebug error", th);
            return true;
        }
    }
}
