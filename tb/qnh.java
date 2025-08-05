package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbliveinteractive.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class qnh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_MOUDLE = "taolive";
    public static final String PAGE_TAOLIVE_WATCH = "Page_TaobaoLiveWatch";

    static {
        kge.a(-476561218);
    }

    public static void a(e eVar, int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dbe0c4", new Object[]{eVar, new Integer(i), str, map});
            return;
        }
        if (eVar != null && eVar.n() != null) {
            eVar.n().a(i, str, map);
        }
        a("trackCustom", str);
    }

    public static void a(e eVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e92a8a9", new Object[]{eVar, str, strArr});
            return;
        }
        if (eVar != null && eVar.n() != null) {
            eVar.n().a(str, strArr);
        }
        a("trackBtnWithExtras", str);
    }

    public static void a(e eVar, String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855544b3", new Object[]{eVar, str, str2, hashMap});
            return;
        }
        if (eVar != null && eVar.n() != null) {
            eVar.n().a(str, str2, (Map<String, String>) hashMap);
        }
        a("trackBtnWithExtras", str2);
    }

    public static void a(e eVar, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf53d", new Object[]{eVar, str, hashMap});
            return;
        }
        if (eVar != null && eVar.n() != null) {
            eVar.n().a(str, hashMap);
        }
        a("trackShow", str);
    }

    public static void b(e eVar, String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847bd412", new Object[]{eVar, str, str2, hashMap});
            return;
        }
        if (eVar != null && eVar.n() != null) {
            eVar.n().a(str, str2, hashMap);
        }
        a("trackShow", str2);
    }

    @Deprecated
    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
            return;
        }
        if (pmd.a().e() != null) {
            pmd.a().e().a("Page_TaobaoLiveWatch", str, strArr);
        }
        a("trackBtnWithExtras", str);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (pmd.a().m() == null) {
        } else {
            pnj m = pmd.a().m();
            m.a("TaoliveInteractive_" + str, str2);
        }
    }
}
