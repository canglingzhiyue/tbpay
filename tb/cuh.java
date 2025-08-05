package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class cuh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(821884890);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && str.indexOf("?") > 0) {
            String substring = str.substring(str.indexOf("?") + 1);
            if (TextUtils.isEmpty(substring)) {
                return hashMap;
            }
            for (String str2 : substring.split("&")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }
}
