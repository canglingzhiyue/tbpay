package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bdx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String F_BROADCAST = "broadcast";
    public static final String F_COMPONENT_RENDER = "componentRender";
    public static final String F_COMPONENT_RENDER_TAG = "umbrella.component.render";
    public static final String F_CONFIG = "orange";
    public static final String F_DATA_PROCESS = "dataProcess";
    public static final String F_DATA_PROCESS_TAG = "umbrella.data.process";
    public static final String F_DOWNGRADE = "downgrade";
    public static final String F_EVENT_PROCESS = "eventProcess";
    public static final String F_EVENT_PROCESS_TAG = "umbrella.event.process";
    public static final String F_NETWORK_REQUEST = "netRequest";
    public static final String F_PAGE_RENDER = "pageRender";
    public static final String F_PAGE_RENDER_TAG = "umbrella.page.render";
    public static final String F_SKIN = "skin";
    public static final String F_TEMPLATE_DOWNGRADE_INNER_TEMPALTE_TAG = "umbrella.downgrade.inner.template";
    public static final String F_TEMPLATE_DOWNGRADE_NATIVE_TAG = "umbrella.downgrade.native";
    public static final String F_TEMPLATE_DOWNLOAD = "templateDownload";
    public static final String F_TEMPLATE_DOWNLOAD_TAG = "umbrella.download.template";

    /* renamed from: a  reason: collision with root package name */
    private static final UMLinkLogInterface f25826a;

    static {
        kge.a(-1887724217);
        f25826a = bpp.a();
    }

    public static void a(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20852e9", new Object[]{bmzVar});
        } else if (bmzVar == null) {
        } else {
            try {
                HashMap hashMap = new HashMap(2);
                hashMap.put("eventId", bmzVar.b());
                hashMap.put("params", bmzVar.e());
                f25826a.logInfo("cart_ultron", "", "eventProcess", null, jpz.CONTAINER_DIM_MAP, a.a(hashMap));
            } catch (Throwable th) {
                UnifyLog.a(bmzVar.d().s(), "UmbrellaMonitor", "logEvent", th.getMessage());
            }
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        a a2 = a.a(str5);
        a2.b("tag", str);
        f25826a.logError("cart_ultron", "", str2, null, str3, str4, null, a2);
    }

    public static void a(String str, String str2, String str3, String str4, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d74f5", new Object[]{str, str2, str3, str4, map});
            return;
        }
        a a2 = a.a(map);
        a2.b("tag", str);
        f25826a.logError("cart_ultron", "", str2, null, str3, str4, null, a2);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        a a2 = a.a(str3, str4);
        a2.b("tag", str);
        try {
            f25826a.logInfo("cart_ultron", "", str2, null, null, a2);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        a a2 = a.a(map);
        a2.b("tag", str);
        try {
            f25826a.logInfo("cart_ultron", "", str2, null, null, a2);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3969d7f", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        a("umbrella", str, str6, str7, map);
        try {
            f25826a.commitFailure(str, str2, str3, "cart_ultron", "", map, str6, str7);
        } catch (Throwable unused) {
        }
    }
}
