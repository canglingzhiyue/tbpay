package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class hvg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
        } else {
            a(str, 19999, strArr);
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else {
            a(str, 19999, map);
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null && !jSONObject.isEmpty()) {
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, String.valueOf(jSONObject.get(str)));
            }
        }
        return hashMap;
    }

    private static void a(String str, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6e4a54", new Object[]{str, new Integer(i), map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("OpenCart", i, str, null, null, map).build());
        }
    }

    private static void a(String str, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4609b46e", new Object[]{str, new Integer(i), strArr});
        } else {
            a(str, i, a(strArr));
        }
    }

    public static Map<String, String> a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("78cf35ac", new Object[]{strArr});
        }
        HashMap hashMap = new HashMap();
        if (strArr.length == 0) {
            return hashMap;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && str.contains("=")) {
                if (str.contains(",")) {
                    arrayList.add(str);
                } else {
                    b(str, hashMap);
                }
            }
        }
        for (String str2 : arrayList) {
            for (String str3 : str2.split(",")) {
                b(str3, hashMap);
            }
        }
        return hashMap;
    }

    private static void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{str, map});
            return;
        }
        String[] split = str.split("=");
        if (split == null) {
            return;
        }
        if (split.length == 1) {
            map.put(split[0], "");
        } else if (split.length != 2) {
        } else {
            map.put(split[0], split[1]);
        }
    }
}
