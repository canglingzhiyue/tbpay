package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.adapter.core.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class epu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APM_GOD_EYE_ERROR = "error";
    public static final String APM_GOD_EYE_EXCEPRION = "exception";
    public static final String APM_GOD_EYE_STAGE = "stage";

    static {
        kge.a(-1370700261);
        emu.a("com.taobao.android.detail.datasdk.utils.ApmUtils");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        b q = epj.q();
        if (q == null) {
            return;
        }
        q.a("taobao_detail");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("itemId", str);
        hashMap.put("bizCode", str2);
        hashMap.put("container_type", eaz.DINAMIC_MODULE_NAME);
        q.a("taobao_detail", hashMap);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a("mtopStart");
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        b q = epj.q();
        if (q == null) {
            return;
        }
        q.a("taobao_detail", str);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        a(hashMap);
    }

    public static void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{hashMap});
            return;
        }
        b q = epj.q();
        if (q == null) {
            return;
        }
        q.a("taobao_detail", hashMap);
    }

    public static void a(String str, String str2, String str3, String str4, Map<String, Object>... mapArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107c1ce0", new Object[]{str, str2, str3, str4, mapArr});
        } else {
            if (epj.q() == null) {
            }
        }
    }
}
