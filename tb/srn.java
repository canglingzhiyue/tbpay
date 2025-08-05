package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Coordinator;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public class srn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f33864a;
    private static final Map<String, String> b;
    private static final Map<String, String> c;
    private static final List<String> d;
    private static final List<String> e;

    public static /* synthetic */ Map f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[0]) : c;
    }

    static {
        kge.a(437366286);
        f33864a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        d = new CopyOnWriteArrayList();
        e = new CopyOnWriteArrayList();
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (TextUtils.equals("Market", str)) {
            b.put(str2, str3);
        } else {
            f33864a.put(str2, str3);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        if (!b.isEmpty()) {
            String jSONString = JSON.toJSONString(b);
            kej.a("LocalResourceUtils", "saveSuffixImages splash: -> " + jSONString);
            ssg.a().a("splashSuffixImages", jSONString);
        }
        if (f33864a.isEmpty()) {
            return;
        }
        String jSONString2 = JSON.toJSONString(f33864a);
        kej.a("LocalResourceUtils", "saveSuffixImages awe: -> " + jSONString2);
        ssg.a().a("aweSuffixImages", jSONString2);
    }

    public static void a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            if (TextUtils.equals("Market", str)) {
                e.addAll(list);
                ssg.a().a("splashFailImages", JSON.toJSONString(e));
                return;
            }
            d.addAll(list);
            ssg.a().a("aweFailImages", JSON.toJSONString(d));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        b.clear();
        ssg.a().a("splashSuffixImages");
        e.clear();
        ssg.a().a("splashFailImages");
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        f33864a.clear();
        ssg.a().a("aweSuffixImages");
        d.clear();
        ssg.a().a("aweFailImages");
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        a("aweSuffixImages", f33864a);
        a("splashSuffixImages", b);
        a("videoMapKey", c);
        b("splashFailImages", e);
        b("aweFailImages", d);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && !e.contains(str) && !d.contains(str);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f33864a.containsKey(str)) {
            return f33864a.get(str);
        }
        if (!b.containsKey(str)) {
            return null;
        }
        return b.get(str);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            c.put(str2, str);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (c.size() <= 0) {
        } else {
            String str = null;
            try {
                str = JSON.toJSONString(c);
            } catch (Exception e2) {
                kej.a("LocalResourceUtils", "saveVideoPath error: -> ", e2);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ssg.a().a("videoMapKey", str);
        }
    }

    private static void a(String str, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else {
            ssg.a().a(str, new srm() { // from class: tb.srn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.srm
                public void a(String str2) {
                    Map map2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    kej.a("LocalResourceUtils", "loadRecord2Map: -> " + str2);
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    try {
                        map2 = (Map) JSON.parseObject(str2, Map.class);
                    } catch (Exception e2) {
                        kej.a("LocalResourceUtils", "loadRecord2Map  error", e2);
                        map2 = null;
                    }
                    if (map2 == null) {
                        return;
                    }
                    map.putAll(map2);
                }
            });
        }
    }

    public static void c(final String str, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ac23a5", new Object[]{str, list});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.srn.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    File[] listFiles;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : srn.f().entrySet()) {
                        if (TextUtils.equals(str, (CharSequence) entry.getKey())) {
                            arrayList.add(entry.getValue());
                        }
                    }
                    File file = new File(keo.d(str));
                    if (!file.exists()) {
                        return;
                    }
                    for (File file2 : file.listFiles()) {
                        if (!arrayList.contains(file2.getAbsolutePath()) && file2.exists()) {
                            kej.a("LocalResourceUtils", "delVideoResource : " + file2.getAbsolutePath() + ",delete:" + file2.delete());
                        }
                    }
                }
            });
        }
    }

    public static void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.srn.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    File[] listFiles;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    File file = new File(keo.d(str));
                    if (!file.exists()) {
                        return;
                    }
                    for (File file2 : file.listFiles()) {
                        kej.a("LocalResourceUtils", "delVideoAllResource key: " + str + ",file:" + file2.getAbsolutePath() + ",delete:" + file2.delete());
                    }
                }
            });
        }
    }

    private static void b(String str, final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aab2c64", new Object[]{str, list});
        } else {
            ssg.a().a(str, new srm() { // from class: tb.srn.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.srm
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    kej.a("LocalResourceUtils", "loadRecord2Map: -> " + str2);
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    List list2 = null;
                    try {
                        list2 = JSON.parseArray(str2, String.class);
                    } catch (Exception e2) {
                        kej.a("LocalResourceUtils", "loadRecord2Map  error", e2);
                    }
                    if (list2 == null) {
                        return;
                    }
                    list.addAll(list2);
                }
            });
        }
    }
}
