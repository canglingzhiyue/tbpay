package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bex {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-258798952);
    }

    public static void a(bbz bbzVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8cd577", new Object[]{bbzVar, str, strArr});
        } else {
            a(bbzVar, str, 2101, strArr);
        }
    }

    public static void b(bbz bbzVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c367b96", new Object[]{bbzVar, str, strArr});
        } else {
            a(bbzVar, str, 2201, strArr);
        }
    }

    public static void c(bbz bbzVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de021b5", new Object[]{bbzVar, str, strArr});
        } else {
            a(bbzVar, str, 19999, strArr);
        }
    }

    public static void a(bbz bbzVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb557dd", new Object[]{bbzVar, str, map});
        } else {
            a(bbzVar, str, 2101, map);
        }
    }

    private static void a(final bbz bbzVar, final String str, final int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbeb0ca", new Object[]{bbzVar, str, new Integer(i), map});
            return;
        }
        final boolean a2 = jqi.a("iCart", "asyncUTSend", true);
        if (a2) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("currentCheckedCount", String.valueOf(CheckHoldManager.a().f()));
        } else if (map == null) {
            map = bdo.a(bbzVar);
        } else {
            map.putAll(bdo.a(bbzVar));
        }
        final Map<String, String> map2 = map;
        jqh.a(new Runnable() { // from class: tb.bex.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (a2) {
                        map2.putAll(bdo.a(bbzVar));
                    }
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(bbzVar.v().f(), i, str, null, null, map2).build());
                } catch (Exception e) {
                    bed.a("cartUtSendError", e.getMessage());
                }
            }
        });
    }

    private static void a(bbz bbzVar, String str, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2435efe4", new Object[]{bbzVar, str, new Integer(i), strArr});
        } else {
            a(bbzVar, str, i, a(strArr));
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null && !jSONObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject.getInnerMap().entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
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
                    a(str, hashMap);
                }
            }
        }
        for (String str2 : arrayList) {
            for (String str3 : str2.split(",")) {
                a(str3, hashMap);
            }
        }
        return hashMap;
    }

    private static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        String[] split = str.split("=");
        if (split == null || split.length != 2) {
            return;
        }
        map.put(split[0], split[1]);
    }
}
