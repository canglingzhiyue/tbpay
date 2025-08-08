package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.c;
import com.taobao.android.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class spk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AliConfigInterface f33813a;
    private static final Map<String, c> b;
    private static final Map<String, Map<String, String>> c;

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : c;
    }

    static {
        kge.a(-1980249464);
        f33813a = e.a();
        b = new HashMap();
        c = new HashMap();
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (f33813a == null || b.containsKey(str)) {
        } else {
            c cVar = new c() { // from class: tb.spk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.c
                public void a(String str2, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20476513", new Object[]{this, str2, map});
                    } else {
                        spk.a().put(str2, map);
                    }
                }
            };
            b.put(str, cVar);
            f33813a.a(new String[]{str}, cVar);
        }
    }

    private static <T> Object a(String str, String str2, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d321fbda", new Object[]{str, str2, t});
        }
        if (f33813a == null) {
            return t;
        }
        a(str);
        String a2 = a(str, str2);
        if (a2 == null) {
            a2 = f33813a.a(str, str2, t == null ? null : String.valueOf(t));
            b(str, str2, a2);
        }
        try {
            if (t instanceof Boolean) {
                return Boolean.valueOf(Boolean.parseBoolean(a2));
            }
            if (t instanceof Float) {
                return Float.valueOf(Float.parseFloat(a2));
            }
            if (t instanceof Integer) {
                return Integer.valueOf(Integer.parseInt(a2));
            }
            return t instanceof Long ? Long.valueOf(Long.parseLong(a2)) : a2;
        } catch (Exception unused) {
            jqg.a(str, "UltronOrange", "key=" + str2 + ",value=" + a2);
            return t;
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            Map<String, String> map = c.get(str);
            if (map != null) {
                return map.get(str2);
            }
            return null;
        } catch (Throwable th) {
            jpr.a(jpu.a(str).c("UltronOrange").b(th.getMessage()));
            return null;
        }
    }

    private static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else if (str3 == null) {
        } else {
            Map<String, String> map = c.get(str);
            if (map == null) {
                map = new HashMap<>();
                c.put(str, map);
            }
            map.put(str2, str3);
        }
    }

    public static float a(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dba89b4", new Object[]{str, str2, new Float(f)})).floatValue() : ((Float) a(str, str2, Float.valueOf(f))).floatValue();
    }

    public static long a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dba98bc", new Object[]{str, str2, new Long(j)})).longValue() : ((Long) a(str, str2, Long.valueOf(j))).longValue();
    }

    public static int a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dba94fa", new Object[]{str, str2, new Integer(i)})).intValue() : ((Integer) a(str, str2, Integer.valueOf(i))).intValue();
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        String str4 = (String) a(str, str2, str3);
        return StringUtils.isEmpty(str4) ? str3 : str4;
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue() : ((Boolean) a(str, str2, Boolean.valueOf(z))).booleanValue();
    }
}
