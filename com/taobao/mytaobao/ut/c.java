package com.taobao.mytaobao.ut;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_UT_EVENT = "userTrack";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, a> f18534a;

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f18535a;
        public String b;
        public String c;

        static {
            kge.a(148040021);
        }

        public a(String str, String str2, String str3) {
            this.f18535a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            a(str, str2, str3, (String) null);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else {
            a(str, str2, str3, str4, (String) null);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        if (!TextUtils.isEmpty(str4)) {
            str6 = "spm=" + str3 + ",scm=" + str4;
        } else {
            str6 = "spm=" + str3;
        }
        if (!TextUtils.isEmpty(str5)) {
            str6 = str6 + ",extra=" + str5;
        }
        b(str, str2, str6);
        if (str3 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-url", str3);
        a(hashMap);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{str, str2, str3, str4, str5, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str3)) {
            sb.append("spm=" + str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(",scm=" + str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append(",extra=" + str5);
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    sb.append("," + key + "=" + value);
                }
            }
        }
        b(str, str2, sb.toString());
        if (str3 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-url", str3);
        if (map != null && map.containsKey(aw.PARAM_UT_PARAMS)) {
            hashMap.put(ag.KEY_UTPARAM_URL, map.get(aw.PARAM_UT_PARAMS));
        }
        a(hashMap);
    }

    public static String a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e59c2c01", new Object[]{str, str2, str3, map});
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append("spm=" + str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(",scm=" + str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(",extra=" + str3);
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    sb.append("," + key + "=" + value);
                }
            }
        }
        return sb.toString();
    }

    public static void a(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9fe4a1", new Object[]{str, new Integer(i), str2, str3, str4, jSONObject});
        } else {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, a(jSONObject));
        }
    }

    public static void a(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c357439", new Object[]{str, new Integer(i), str2, str3, str4, str5});
        } else {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
        }
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (!TextUtils.isEmpty(string)) {
                sb.append(str);
                sb.append("=");
                sb.append(string);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else {
            b("2101", str, str2, str3);
        }
    }

    public static void a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd05860", new Object[]{str, str2, str3, str4, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(str3)) {
            jSONObject2.put("spm", (Object) str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            jSONObject2.put("scm", (Object) str4);
        }
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        b(str, str2, a(jSONObject2));
    }

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40669c8", new Object[]{str, str2, str3});
        } else {
            b("2201", str, str2, str3);
        }
    }

    public static void a(Object obj, Object obj2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b638ed1", new Object[]{obj, obj2, str, str2, map});
        } else if (obj == null) {
        } else {
            a aVar = f18534a.get(obj.getClass().getName());
            if (aVar != null) {
                TextUtils.isEmpty(str);
                if (TextUtils.isEmpty(str2)) {
                    str2 = aVar.c;
                }
            }
            if (str2 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("spm-cnt", str2);
                if (map != null) {
                    hashMap.putAll(map);
                }
                a(obj2, hashMap);
            }
            if (str2 == null) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("spm-url", str2);
            a(hashMap2);
        }
    }

    public static void a(Object obj, Object obj2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e1fe65", new Object[]{obj, obj2, map});
        } else {
            a(obj, obj2, (String) null, (String) null, map);
        }
    }

    public static void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    public static void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(obj, str);
        }
    }

    private static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{str, str2, str3, str4});
        } else if (str4 == null) {
            TBS.Ext.commitEvent(str2, Integer.parseInt(str), str3, (Object) null, (Object) null);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("args", str4);
            TBS.Ext.commitEvent(str2, Integer.parseInt(str), str3, null, null, b(hashMap));
        }
    }

    private static String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder("");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry == null || entry.getKey() == null) {
                return sb.toString();
            }
            if (entry.getKey().toLowerCase().equals("args")) {
                if (entry.getValue() != null) {
                    sb.append(entry.getValue().toString());
                } else {
                    sb.append(entry.getValue());
                }
            } else if (entry.getValue() != null) {
                sb.append(riy.ARRAY_START_STR);
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue().toString());
                sb.append(riy.ARRAY_END_STR);
            } else {
                sb.append(riy.ARRAY_START_STR);
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue());
                sb.append(riy.ARRAY_END_STR);
            }
        }
        return sb.toString();
    }

    static {
        String[][] strArr;
        kge.a(411410783);
        f18534a = new HashMap();
        for (String[] strArr2 : b.f18533a) {
            a aVar = new a(strArr2[0], strArr2[1], strArr2[2]);
            f18534a.put(aVar.f18535a, aVar);
        }
    }
}
