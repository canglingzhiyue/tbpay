package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rmg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(893836185);
    }

    public void a(Object obj, String str, String str2, rlw rlwVar, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605ad635", new Object[]{this, obj, str, str2, rlwVar, str3});
        } else if (obj != null && rlwVar != null) {
            String str4 = rlz.a().g(str3).get(str2);
            if (TextUtils.isEmpty(str4)) {
                str4 = str2;
            }
            HashMap<String, Object> hashMap = rlz.a().d(str, str3).get(str4);
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                if (TextUtils.isEmpty(String.valueOf(entry.getKey()))) {
                    return;
                }
                entry.getValue();
            }
        }
    }

    public void a(Object obj, HashMap<String, Object> hashMap, rlw rlwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedfb5c2", new Object[]{this, obj, hashMap, rlwVar});
        } else if (obj != null && rlwVar != null && hashMap != null && hashMap.size() != 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                if (TextUtils.isEmpty(String.valueOf(entry.getKey()))) {
                    return;
                }
                entry.getValue();
            }
        }
    }
}
