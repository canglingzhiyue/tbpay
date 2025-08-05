package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class igt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        ihh a2 = a(application);
        nof a3 = a(a2, hashMap);
        new iha().a(new ihe(hashMap)).a(new hht(a2, a3)).a(new nlo(a2, a3)).a(application);
    }

    private static nof a(ihh ihhVar, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nof) ipChange.ipc$dispatch("1810899d", new Object[]{ihhVar, hashMap});
        }
        Object obj = hashMap.get("appVersion");
        if ((obj instanceof String ? (String) obj : "1.0.0").split("\\.").length > 3) {
            return new nlp(ihhVar);
        }
        return new nof(ihhVar);
    }

    private static ihh a(Application application) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihh) ipChange.ipc$dispatch("f2453126", new Object[]{application}) : new ihh(application.getSharedPreferences(igx.ORANGE_NAMESPACE, 0).getAll());
    }
}
