package tb;

import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class leb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LruCache<JSONObject, ldz> f30516a;

    static {
        kge.a(1420258475);
        f30516a = new LruCache<>(20);
    }

    public static ldz a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ldz) ipChange.ipc$dispatch("2903703c", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            ldz ldzVar = f30516a.get(jSONObject);
            if (ldzVar != null) {
                return ldzVar;
            }
            ldz ldzVar2 = new ldz(jSONObject);
            f30516a.put(jSONObject, ldzVar2);
            return ldzVar2;
        } catch (Throwable th) {
            ldf.d("TemplateDataUtils", "getCompatibleDinamicTemplate error e: " + th.getMessage());
            return new ldz(jSONObject);
        }
    }
}
