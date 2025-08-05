package tb;

import com.alibaba.android.aura.b;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ema {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1653289402);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSAURAErrorReporter");
    }

    public static void a(String str, String str2, q qVar, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("188c8e72", new Object[]{str, str2, qVar, aqsVar});
            return;
        }
        HashMap hashMap = null;
        if (qVar != null && qVar.e() != null) {
            hashMap = new HashMap();
            hashMap.put("itemId", emf.a(qVar.e()));
        }
        a(1, str, str2, hashMap, aqsVar);
    }

    public static void a(String str, String str2, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fb76c9", new Object[]{str, str2, aqsVar});
        } else {
            a(1, str, str2, null, aqsVar);
        }
    }

    public static void a(String str, String str2, Map<String, Object> map, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7baab2d6", new Object[]{str, str2, map, aqsVar});
        } else {
            a(1, str, str2, map, aqsVar);
        }
    }

    public static void b(String str, String str2, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208510ca", new Object[]{str, str2, aqsVar});
        } else {
            a(0, str, str2, null, aqsVar);
        }
    }

    private static void a(int i, String str, String str2, Map<String, Object> map, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a92afc3", new Object[]{new Integer(i), str, str2, map, aqsVar});
        } else if (aqsVar == null) {
            ard a2 = arc.a();
            a2.c("AliSAURAErrorReporter", "reportMainGalleryError", "type=" + i + "|code=" + str + "|message=" + str2);
        } else {
            b bVar = new b(i, "AliSDetailMainGallery", str, str2);
            bVar.a(map);
            aqsVar.a(bVar);
        }
    }
}
