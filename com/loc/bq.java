package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kkr;
import tb.mto;

/* loaded from: classes4.dex */
public final class bq {

    /* renamed from: a  reason: collision with root package name */
    public static volatile ConcurrentHashMap<String, c> f7692a = new ConcurrentHashMap<>(8);
    public static volatile List<String> b = Collections.synchronizedList(new ArrayList(8));
    private static volatile ConcurrentHashMap<String, b> c = new ConcurrentHashMap<>(8);
    private static Random d = new Random();
    private static ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>(8);
    private static List<bz> f = Collections.synchronizedList(new ArrayList(16));

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f7693a;
        int b;
        double c;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        bu f7694a;
        long b;

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Map<String, List<a>> f7695a;
        Map<String, String> b;

        private c() {
            this.f7695a = new HashMap(8);
            this.b = new HashMap(8);
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f7695a.equals(cVar.f7695a) && this.b.equals(cVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Map<String, List<a>> map = this.f7695a;
            int i = 0;
            int hashCode = map != null ? map.hashCode() : 0;
            Map<String, String> map2 = this.b;
            if (map2 != null) {
                i = map2.hashCode();
            }
            return hashCode + i;
        }
    }

    public static synchronized String a(String str, String str2) throws k {
        synchronized (bq.class) {
            try {
                try {
                    System.currentTimeMillis();
                    if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str)) {
                        Context context = m.c;
                        try {
                            if (b == null) {
                                b = Collections.synchronizedList(new ArrayList(8));
                            }
                            if (context != null && !b.contains(str2)) {
                                b.add(str2);
                                String a2 = bd.a(context, "Yb3Blbl9odHRwX2NvbnRyb2w", str2);
                                if (!StringUtils.isEmpty(a2)) {
                                    a(str2, new JSONObject(a2));
                                }
                            }
                        } catch (Throwable th) {
                            as.a(th, "hlUtil", "llhl");
                        }
                        if (f7692a != null && f7692a.size() > 0) {
                            if (!f7692a.containsKey(str2)) {
                                return str;
                            }
                            c cVar = f7692a.get(str2);
                            if (cVar == null) {
                                return str;
                            }
                            if (a(str, cVar, str2)) {
                                throw new k("服务QPS超限");
                            }
                            return b(str, cVar, str2);
                        }
                        return str;
                    }
                    return str;
                } catch (k e2) {
                    throw e2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a() {
        try {
            Context context = m.c;
            if (context == null) {
                return;
            }
            ca.a(b(), context);
        } catch (Throwable unused) {
        }
    }

    private static void a(c cVar, JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(com.taobao.android.weex_framework.util.a.ATOM_EXT_block);
            if (optJSONArray == null) {
                return;
            }
            HashMap hashMap = new HashMap(8);
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("api");
                    if (!StringUtils.isEmpty(optString)) {
                        if (!optString.startsWith("/")) {
                            optString = "/".concat(String.valueOf(optString));
                        }
                        if (optString.endsWith("/")) {
                            optString = optString.substring(0, optString.length() - 1);
                        }
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("periods");
                        if (optJSONArray != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                                if (optJSONObject2 != null) {
                                    a aVar = new a((byte) 0);
                                    aVar.f7693a = optJSONObject2.optString("begin");
                                    aVar.b = optJSONObject2.optInt("duration");
                                    aVar.c = optJSONObject2.optDouble(kkr.PERCENT);
                                    arrayList.add(aVar);
                                }
                            }
                            hashMap.put(optString, arrayList);
                        }
                    }
                }
            }
            cVar.f7695a = hashMap;
        } catch (Throwable th) {
            as.a(th, "hlUtil", "pbr");
        }
    }

    public static synchronized void a(w wVar, JSONObject jSONObject) {
        synchronized (bq.class) {
            if (wVar == null) {
                return;
            }
            try {
                String a2 = wVar.a();
                if (StringUtils.isEmpty(a2)) {
                    return;
                }
                if (jSONObject == null) {
                    a(a2);
                }
                if (!m.a(jSONObject.optString("able", null), false)) {
                    a(a2);
                    return;
                }
                bd.a(m.c, "Yb3Blbl9odHRwX2NvbnRyb2w", a2, jSONObject.toString());
                a(a2, jSONObject);
            } catch (Throwable th) {
                as.a(th, "hlUtil", "par");
            }
        }
    }

    private static synchronized void a(String str) {
        synchronized (bq.class) {
            try {
                if (f7692a.containsKey(str)) {
                    f7692a.remove(str);
                }
                SharedPreferences.Editor a2 = bd.a(m.c, "Yb3Blbl9odHRwX2NvbnRyb2w");
                bd.a(a2, str);
                bd.a(a2);
            } catch (Throwable th) {
                as.a(th, "hlUtil", LogContext.RELEASETYPE_RC);
            }
        }
    }

    private static void a(String str, c cVar) {
        try {
            if (f7692a == null) {
                f7692a = new ConcurrentHashMap<>(8);
            }
            f7692a.put(str, cVar);
        } catch (Throwable th) {
            as.a(th, "hlUtil", "ucr");
        }
    }

    private static void a(String str, String str2, String str3) {
        try {
            Context context = m.c;
            if (context != null && !StringUtils.isEmpty(str)) {
                if (e == null) {
                    e = new ConcurrentHashMap<>(8);
                }
                synchronized (e) {
                    if (e.containsKey(str2)) {
                        return;
                    }
                    e.put(str2, str3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timestamp", System.currentTimeMillis());
                    jSONObject.put("type", ag.j);
                    jSONObject.put("name", str);
                    jSONObject.put("version", ag.a(str));
                    jSONObject.put("hostname", str2 + "#" + str3);
                    String jSONObject2 = jSONObject.toString();
                    if (StringUtils.isEmpty(jSONObject2)) {
                        return;
                    }
                    bz bzVar = new bz(context, "core", "2.0", "O005");
                    bzVar.a(jSONObject2);
                    ca.a(bzVar, context);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, JSONObject jSONObject) {
        try {
            c cVar = new c((byte) 0);
            a(cVar, jSONObject);
            b(cVar, jSONObject);
            if (cVar.b == null && cVar.f7695a == null) {
                a(str);
            } else {
                a(str, cVar);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(URL url, bu buVar) {
        List<String> list;
        try {
            if (c == null) {
                c = new ConcurrentHashMap<>(8);
            }
            if (buVar.b != null && buVar.b.containsKey("nb") && (list = buVar.b.get("nb")) != null && list.size() > 0) {
                String[] split = list.get(0).split("#");
                if (split.length < 2) {
                    return;
                }
                int parseInt = Integer.parseInt(split[0]);
                long parseInt2 = Integer.parseInt(split[1]);
                b bVar = new b((byte) 0);
                bVar.f7694a = buVar;
                if (parseInt2 <= 0) {
                    parseInt2 = 30;
                }
                bVar.b = SystemClock.elapsedRealtime() + (parseInt2 * 1000);
                if (parseInt == 1) {
                    c.put("app", bVar);
                } else if (parseInt != 2 || url == null) {
                } else {
                    c.put(url.getPath(), bVar);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z, String str) {
        try {
            Context context = m.c;
            if (context != null && !StringUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                jSONObject.put("type", z ? ag.g : ag.f);
                jSONObject.put("name", str);
                jSONObject.put("version", ag.a(str));
                String jSONObject2 = jSONObject.toString();
                bz bzVar = new bz(context, "core", "2.0", "O005");
                bzVar.a(jSONObject2);
                ca.a(bzVar, context);
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(boolean z, String str, String str2, int i) {
        String str3;
        Integer num;
        try {
            Context context = m.c;
            if (context != null && !StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", System.currentTimeMillis());
                String a2 = ag.a(str);
                if (z) {
                    str3 = "type";
                    num = ag.i;
                } else {
                    str3 = "type";
                    num = ag.h;
                }
                jSONObject.put(str3, num);
                jSONObject.put("name", str);
                jSONObject.put("version", a2);
                jSONObject.put("uri", Uri.parse(str2).getPath());
                jSONObject.put("blockLevel", i);
                String jSONObject2 = jSONObject.toString();
                if (StringUtils.isEmpty(jSONObject2)) {
                    return;
                }
                bz bzVar = new bz(context, "core", "2.0", "O005");
                bzVar.a(jSONObject2);
                if (f == null) {
                    f = Collections.synchronizedList(new ArrayList(16));
                }
                synchronized (f) {
                    f.add(bzVar);
                    if (f.size() >= 15) {
                        a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean a(a aVar) {
        if (aVar == null || aVar.c == 1.0d) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!StringUtils.isEmpty(aVar.f7693a) && aVar.b > 0) {
            long timeInMillis = currentTimeMillis - x.a(aVar.f7693a, "HH:mm:ss").getTimeInMillis();
            if (timeInMillis > 0 && timeInMillis < aVar.b * 1000) {
                if (aVar.c == mto.a.GEO_NOT_SUPPORT) {
                    return true;
                }
                if (d == null) {
                    d = new Random();
                }
                d.setSeed(UUID.randomUUID().hashCode() + currentTimeMillis);
                if (d.nextDouble() > aVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, c cVar, String str2) {
        Map<String, List<a>> map;
        try {
            map = cVar.f7695a;
        } catch (Throwable th) {
            as.a(th, "hlUtil", "inb");
        }
        if (map != null && map.size() > 0) {
            if (map.containsKey("*")) {
                for (Map.Entry<String, List<a>> entry : map.entrySet()) {
                    if (a(entry.getValue())) {
                        a(false, str2, str, 1);
                        return true;
                    }
                }
            } else {
                String path = Uri.parse(str).getPath();
                if (map.containsKey(path) && a(map.get(path))) {
                    a(false, str2, str, 2);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean a(List<a> list) {
        if (list != null && list.size() > 0) {
            for (a aVar : list) {
                if (a(aVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static bu b(String str, String str2) {
        Uri parse;
        String str3 = "app";
        if (c == null) {
            return null;
        }
        if (!c.containsKey(str3)) {
            if (!StringUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) {
                str3 = parse.getPath();
                if (c.containsKey(str3)) {
                    b bVar = c.get(str3);
                    if (SystemClock.elapsedRealtime() <= bVar.b) {
                        bu buVar = bVar.f7694a;
                        if (buVar != null) {
                            buVar.e = false;
                        }
                        a(true, str2, str, 2);
                        return buVar;
                    }
                }
            }
            return null;
        }
        b bVar2 = c.get(str3);
        if (SystemClock.elapsedRealtime() <= bVar2.b) {
            bu buVar2 = bVar2.f7694a;
            if (buVar2 != null) {
                buVar2.e = false;
            }
            a(true, str2, str, 1);
            return buVar2;
        }
        c.remove(str3);
        return null;
    }

    private static String b(String str, c cVar, String str2) {
        try {
            Map<String, String> map = cVar.b;
            if (map != null && map.size() > 0) {
                Uri parse = Uri.parse(str);
                String authority = parse.getAuthority();
                if (!map.containsKey(authority)) {
                    return str;
                }
                String str3 = map.get(authority);
                str = parse.buildUpon().authority(str3).toString();
                a(str2, authority, str3);
                return str;
            }
            return str;
        } catch (Throwable th) {
            as.a(th, "hlUtil", "pdr");
            return str;
        }
    }

    public static List<bz> b() {
        ArrayList arrayList = null;
        try {
        } catch (Throwable unused) {
        }
        synchronized (f) {
            try {
                if (f != null && f.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        arrayList2.addAll(f);
                        f.clear();
                        arrayList = arrayList2;
                    } catch (Throwable th) {
                        th = th;
                        arrayList = arrayList2;
                        throw th;
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private static void b(c cVar, JSONObject jSONObject) {
        JSONArray names;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("domainMap");
            if (optJSONObject == null || (names = optJSONObject.names()) == null) {
                return;
            }
            HashMap hashMap = new HashMap(8);
            int length = names.length();
            for (int i = 0; i < length; i++) {
                String optString = names.optString(i);
                hashMap.put(optString, optJSONObject.optString(optString));
            }
            cVar.b = hashMap;
        } catch (Throwable th) {
            as.a(th, "hlUtil", "pdr");
        }
    }
}
