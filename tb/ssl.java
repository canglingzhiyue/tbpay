package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.d;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class ssl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, List<ssj>> f33886a = new HashMap();
    private static ksx b;

    public static synchronized void a(String str, ssj ssjVar) {
        List<ssj> list;
        synchronized (ssl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f427258", new Object[]{str, ssjVar});
                return;
            }
            if (f33886a.get(str) != null) {
                list = f33886a.get(str);
            } else {
                ArrayList arrayList = new ArrayList(2);
                f33886a.put(str, arrayList);
                list = arrayList;
            }
            list.add(ssjVar);
        }
    }

    public static synchronized void b(String str, ssj ssjVar) {
        synchronized (ssl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("542b3a99", new Object[]{str, ssjVar});
                return;
            }
            List<ssj> list = f33886a.get(str);
            if (list == null) {
                return;
            }
            list.remove(ssjVar);
        }
    }

    private static ksx a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksx) ipChange.ipc$dispatch("f07070e", new Object[0]);
        }
        if (b == null) {
            b = new ksx(Globals.getApplication());
        }
        return b;
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else if (!d.a().b()) {
        } else {
            if ("mute".equals(str) || "liveMute".equals(str)) {
                b(str, a().a(d.BIZ_NAME, str, false, null));
            } else if ("timeFrameMute".equals(str) || "timeFrameMuteSub".equals(str)) {
                b("mute", a().a(d.BIZ_NAME, "mute", false, null));
                b("liveMute", a().a(d.BIZ_NAME, "liveMute", false, null));
                b("inTimeFrameMute", a().a(d.BIZ_NAME, "inTimeFrameMute", false, null));
            } else {
                b(str, obj);
            }
        }
    }

    private static synchronized void b(String str, Object obj) {
        synchronized (ssl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18567e8f", new Object[]{str, obj});
                return;
            }
            List<ssj> list = f33886a.get(str);
            if (list == null) {
                return;
            }
            for (ssj ssjVar : list) {
                ssjVar.a(obj);
            }
        }
    }
}
