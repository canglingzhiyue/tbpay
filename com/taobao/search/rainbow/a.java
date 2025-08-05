package com.taobao.search.rainbow;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String b;
    private static String c;
    private static Application d;
    private static c e;
    private static volatile Map<String, BucketDO> f;
    private static b h;
    private static d k;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f19297a = new HashMap();
    private static boolean g = false;
    private static boolean i = false;
    private static BigInteger j = new BigInteger("100");

    /* loaded from: classes7.dex */
    public interface b {
        String a();

        String b();
    }

    public static void a(String str, String str2, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150bece3", new Object[]{str, str2, application});
            return;
        }
        b = str;
        c = str2;
        d = application;
        g = e(b);
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d76a243", new Object[]{cVar});
        } else {
            e = cVar;
        }
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7716a2", new Object[]{dVar});
        } else {
            k = dVar;
        }
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f921f837", new Object[0]) : d;
    }

    private static final boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && str.split("\\.").length > 3;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        OrangeConfig.getInstance().getConfig("search_abtest", "content", "");
        OrangeConfig.getInstance().getConfig("search_abtest", "version", "");
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String f2 = f(str);
        c cVar = e;
        if (cVar != null) {
            cVar.a(str, f2);
        }
        return f2;
    }

    private static String f(String str) {
        JSONObject b2;
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{str});
        }
        if (TextUtils.isEmpty(c)) {
            return "";
        }
        f();
        String g2 = g(str);
        String a2 = h.a();
        String a3 = com.taobao.search.rainbow.b.a();
        c cVar = e;
        if (cVar != null) {
            cVar.a(!TextUtils.isEmpty(a2) ? a2 : a3);
        }
        String str2 = f19297a.get(g2);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (!TextUtils.isEmpty(a2) && TextUtils.equals(a2, a3)) {
            if (f != null && f.containsKey(g2)) {
                BucketDO bucketDO = f.get(g2);
                String str3 = bucketDO == null ? "" : bucketDO.name;
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
            }
        } else if (f != null) {
            f.clear();
        }
        String b3 = h.b();
        if (TextUtils.isEmpty(b3)) {
            return b(str);
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(b3);
        } catch (JSONException unused) {
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return b(str);
        }
        String b4 = com.taobao.search.rainbow.b.b();
        if (!TextUtils.isEmpty(b4) && !TextUtils.equals(b4, b)) {
            com.taobao.search.rainbow.b.d();
            if (f != null) {
                f.clear();
            }
        }
        com.taobao.search.rainbow.b.b(b);
        com.taobao.search.rainbow.b.a(a2);
        JSONObject optJSONObject2 = jSONObject.optJSONObject(g2);
        if (optJSONObject2 == null || optJSONObject2.length() == 0) {
            return b(str);
        }
        String trim = TextUtils.isEmpty(c) ? "" : c.trim();
        BucketDO a4 = a(optJSONObject2, g2, h(trim + g2));
        if (i && (b2 = b(com.taobao.search.rainbow.b.e())) != null && !b2.isNull(g2) && (optJSONObject = b2.optJSONObject(g2)) != null) {
            a4 = a(optJSONObject2, g2, optJSONObject);
        }
        if (a4 == null) {
            return "";
        }
        a(g2, a4);
        com.taobao.search.rainbow.b.a(g2, a4);
        return a4.name;
    }

    private static final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else if (h != null) {
        } else {
            h = new C0774a();
        }
    }

    private static final String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("tbAndroid")) {
            str = "tbAndroid" + str;
        }
        if (!g) {
            return str;
        }
        return str + "_beta";
    }

    private static BucketDO a(JSONObject jSONObject, String str, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (BucketDO) ipChange.ipc$dispatch("fa4db340", new Object[]{jSONObject, str, new Integer(i2)});
        }
        BucketDO bucketDO = new BucketDO();
        bucketDO.testname = str;
        bucketDO.shouldStat = !TextUtils.equals("true", jSONObject.optString("disableStat"));
        JSONArray optJSONArray = jSONObject.optJSONArray("buckets");
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            if (i3 >= optJSONArray.length()) {
                z = z2;
                break;
            }
            JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
            int optInt = optJSONObject.optInt("start", -1);
            int optInt2 = optJSONObject.optInt("end", -1);
            HashSet hashSet = new HashSet(Arrays.asList(optJSONObject.optString(KeepModel.STRATEGY_WHITE_LIST).split(",")));
            if (optInt <= 0 && optInt2 >= 99) {
                bucketDO.shouldStat = false;
            }
            boolean contains = hashSet.contains(g());
            if (contains || (i2 >= optInt && i2 <= optInt2)) {
                a(optJSONObject, bucketDO);
                if (contains) {
                    String str2 = "layer " + str + " hits white list, config value is " + bucketDO.name;
                    break;
                }
                z2 = true;
            }
            i3++;
        }
        if (z) {
            return bucketDO;
        }
        return null;
    }

    private static final int h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb017cec", new Object[]{str})).intValue();
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            byte[] bArr = new byte[8];
            for (int i2 = 0; i2 < 8; i2++) {
                bArr[i2] = digest[i2];
            }
            return new BigInteger(1, bArr).mod(j).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    private static void a(JSONObject jSONObject, BucketDO bucketDO) {
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822aa503", new Object[]{jSONObject, bucketDO});
            return;
        }
        bucketDO.name = jSONObject.optString("name");
        bucketDO.id = jSONObject.optString("id");
        if (jSONObject.isNull("this_group_config") || (optJSONObject = jSONObject.optJSONObject("this_group_config")) == null || optJSONObject.isNull("values")) {
            return;
        }
        bucketDO.config = a(optJSONObject.optJSONObject("values"));
    }

    private static Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d08f5a0b", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.isNull(next)) {
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        return hashMap;
    }

    private static final void a(String str, BucketDO bucketDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64e1cdf", new Object[]{str, bucketDO});
            return;
        }
        if (f == null) {
            f = new HashMap();
        }
        f.put(str, bucketDO);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        BucketDO i2 = i(str);
        return i2 == null ? "" : i2.name;
    }

    private static final BucketDO i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketDO) ipChange.ipc$dispatch("b7158609", new Object[]{str});
        }
        String g2 = g(str);
        if (f == null) {
            f = new HashMap();
        }
        BucketDO bucketDO = f.get(g2);
        if (bucketDO != null) {
            return bucketDO;
        }
        BucketDO c2 = com.taobao.search.rainbow.b.c(g2);
        if (c2 == null) {
            return null;
        }
        f.put(g2, c2);
        return c2;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        String g2 = g(str);
        if (f == null) {
            f = new HashMap();
        }
        BucketDO bucketDO = f.get(g2);
        if (bucketDO != null) {
            return bucketDO.shouldStat ? bucketDO.id : "";
        }
        BucketDO c2 = com.taobao.search.rainbow.b.c(g2);
        if (c2 == null || !c2.shouldStat) {
            return "";
        }
        f.put(g2, c2);
        return c2.id;
    }

    public static String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{list});
        }
        if (f == null) {
            f = new HashMap();
        }
        Map<String, BucketDO> c2 = com.taobao.search.rainbow.b.c();
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (Map.Entry<String, BucketDO> entry : c2.entrySet()) {
            String key = entry.getKey();
            BucketDO value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null && (list == null || !list.contains(key))) {
                f.put(key, value);
                if (value.shouldStat) {
                    sb.append(str);
                    sb.append(value.id);
                    str = ",";
                }
            }
        }
        return sb.toString();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : a((List<String>) null);
    }

    /* renamed from: com.taobao.search.rainbow.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0774a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private C0774a() {
        }

        @Override // com.taobao.search.rainbow.a.b
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : OrangeConfig.getInstance().getConfig("search_abtest", "version", "");
        }

        @Override // com.taobao.search.rainbow.a.b
        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : OrangeConfig.getInstance().getConfig("search_abtest", "content", "");
        }
    }

    public static Map<String, String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c27656b1", new Object[]{str, str2});
        }
        f19297a.put(str, str2);
        return f19297a;
    }

    public static Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[0]);
        }
        f19297a.clear();
        return f19297a;
    }

    public static Map<String, String> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[0]) : f19297a;
    }

    public static void d(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
            return;
        }
        com.taobao.search.rainbow.b.d();
        if (f != null) {
            f.clear();
        }
        if (TextUtils.isEmpty(str)) {
            i = false;
            return;
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = b(new JSONObject(str));
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        i = true;
        f();
        try {
            jSONObject2 = new JSONObject(h.b());
        } catch (JSONException unused2) {
        }
        if (jSONObject2 == null || jSONObject2.length() == 0) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
            if (optJSONObject != null && optJSONObject.length() != 0) {
                BucketDO a2 = a(optJSONObject, next, h((TextUtils.isEmpty(c) ? "" : c.trim()) + next));
                JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
                if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                    a2 = a(optJSONObject, next, optJSONObject2);
                }
                if (f == null) {
                    f = new HashMap();
                }
                f.put(next, a2);
                com.taobao.search.rainbow.b.a(next, a2);
            }
        }
    }

    private static BucketDO a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (BucketDO) ipChange.ipc$dispatch("51aad2a5", new Object[]{jSONObject, str, jSONObject2});
        }
        String optString = jSONObject2.optString("name");
        String optString2 = jSONObject2.optString("id");
        BucketDO bucketDO = new BucketDO();
        bucketDO.testname = str;
        bucketDO.shouldStat = !TextUtils.equals("true", jSONObject.optString("disableStat"));
        JSONArray optJSONArray = jSONObject.optJSONArray("buckets");
        while (true) {
            if (i2 >= optJSONArray.length()) {
                break;
            }
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (TextUtils.equals(optJSONObject.optString("name"), optString) && TextUtils.equals(optJSONObject.optString("id"), optString2)) {
                a(optJSONObject, bucketDO);
                break;
            }
            i2++;
        }
        return bucketDO;
    }

    private static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("79698de3", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(g(next), jSONObject.optJSONObject(next));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject2;
    }

    private static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        d dVar = k;
        return dVar == null ? "" : dVar.a();
    }
}
