package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.android.netutil.UtilTool;
import org.android.spdy.SpdyAgent;
import org.android.spdy.spduLog;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.mto;

/* loaded from: classes.dex */
public class sad {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEFAULT_AGENT_FREE_ENABLE = false;
    public static final long DEFAULT_BODY_READ_TIMEOUT_MS = 3000;
    public static final boolean DEFAULT_HTTP_ZSTD_ENCODE_ENABLE = true;
    public static final boolean DEFAULT_MPQUIC_ENABLE = true;
    public static final long DEFAULT_QUIC_CONNECT_TIMEOUT_MS = 5000;
    public static final boolean DEFAULT_REQUEST_READ_IDLE_TIMEOUT_ENABLE = true;
    public static final long DEFAULT_REQUEST_READ_TIMEOUT_MS = 1500;
    public static final boolean DEFAULT_TLOG_ENABLE = true;
    public static final long DEFAULT_TLOG_XQUIC_LEVEL = 2;
    public static final boolean DEFAULT_TUNNEL_PROXY_ENABLE = true;
    public static final String REQUEST_READ_TIMEOUT_TYPE_FAST = "fast";
    public static final String REQUEST_READ_TIMEOUT_TYPE_NORMAL = "normal";
    private static volatile int X;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f33453a = new ArrayList();
    private static volatile boolean b = true;
    private static volatile boolean c = true;
    private static CopyOnWriteArrayList<String> e = null;
    private static CopyOnWriteArrayList<String> f = null;
    private static CopyOnWriteArrayList<String> g = null;
    private static CopyOnWriteArrayList<String> i = null;
    private static volatile long j = 5000;
    public static final long DEFAULT_TCP_CONNECT_TIMEOUT_MS = 6000;
    private static volatile long k = DEFAULT_TCP_CONNECT_TIMEOUT_MS;
    private static volatile boolean l = true;
    private static volatile boolean n = true;
    private static volatile long o = 2500;
    private static volatile long p = 3000;
    private static volatile ConcurrentHashMap<String, List<String>> q = null;
    private static volatile long r = 1500;
    private static volatile long s = 3000;
    private static volatile ConcurrentHashMap<String, List<String>> t = null;
    private static volatile ConcurrentHashMap<String, List<String>> d = null;
    private static volatile boolean u = true;
    private static CopyOnWriteArrayList<String> v = null;
    private static volatile long z = 604800000;
    private static volatile boolean A = false;
    private static volatile boolean C = true;
    private static volatile boolean E = true;
    private static volatile boolean Q = true;
    private static volatile boolean F = true;
    private static CopyOnWriteArrayList<String> G = null;
    private static CopyOnWriteArrayList<String> S = null;
    private static volatile String U = null;
    private static CopyOnWriteArrayList<String> Y = null;
    private static CopyOnWriteArrayList<String> Z = null;
    private static volatile boolean m = false;
    private static CopyOnWriteArrayList<String> h = null;
    private static volatile boolean I = false;
    private static CopyOnWriteArrayList<String> w = null;
    private static CopyOnWriteArrayList<String> N = null;
    private static volatile boolean B = true;
    private static volatile long D = 15000;
    private static volatile boolean R = false;
    private static volatile boolean T = true;
    private static volatile boolean ab = true;
    private static volatile boolean x = false;
    private static volatile boolean P = false;
    private static volatile boolean H = false;
    private static volatile boolean J = false;
    private static volatile boolean K = false;
    private static volatile boolean L = false;
    private static volatile boolean M = false;
    private static volatile boolean O = false;
    private static volatile boolean V = false;
    private static volatile boolean W = false;
    private static volatile boolean y = false;

    public static void a(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z2)});
        } else {
            b = z2;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b;
    }

    public static void b(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z2)});
        } else {
            SpdyAgent.configSwitchValueByKey(1L, z2 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
        }
    }

    public static void a(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j2)});
        } else {
            SpdyAgent.configSwitchValueByKey(16L, (int) j2, mto.a.GEO_NOT_SUPPORT, null);
        }
    }

    public static void d(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{new Boolean(z2)});
        } else {
            c = z2;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : c;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                }
                g = copyOnWriteArrayList;
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setBackgroundMultiNetworkBrandBlockList] error", e2);
            }
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        try {
            if (g == null) {
                return false;
            }
            if (!g.contains("*")) {
                return g.contains(Build.BRAND.toLowerCase());
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                }
                f = copyOnWriteArrayList;
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setMultiNetworkHarmonyWhiteList] error", e2);
            }
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = f;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        return f.contains(str) || f.contains("*");
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                }
                e = copyOnWriteArrayList;
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setConnectFastTimeoutHostWhiteList] error", e2);
            }
        }
    }

    public static boolean e(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = e) == null) {
            return false;
        }
        if (!copyOnWriteArrayList.contains("*")) {
            return e.contains(str);
        }
        return true;
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                }
                i = copyOnWriteArrayList;
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setConnectFastTimeoutHostWhiteList] error", e2);
            }
        }
    }

    public static boolean g(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = i) == null) {
            return false;
        }
        if (!copyOnWriteArrayList.contains("*")) {
            return i.contains(str);
        }
        return true;
    }

    public static void b(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{new Long(j2)});
            return;
        }
        if (j2 > orq.FRAME_CHECK_TIMEOUT) {
            j2 = 20000;
        }
        if (j2 <= 0) {
            return;
        }
        j = j2;
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[0])).longValue() : j;
    }

    public static void c(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{new Long(j2)});
            return;
        }
        if (j2 > orq.FRAME_CHECK_TIMEOUT) {
            j2 = 20000;
        }
        if (j2 <= 0) {
            return;
        }
        k = j2;
    }

    public static long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[0])).longValue() : k;
    }

    public static void f(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{new Boolean(z2)});
        } else {
            l = z2;
        }
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : l;
    }

    public static void g(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{new Boolean(z2)});
            return;
        }
        n = z2;
        SpdyAgent.configSwitchValueByKey(2L, z2 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : n;
    }

    public static long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[0])).longValue() : o;
    }

    public static long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[0])).longValue() : r;
    }

    public static long l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee7", new Object[0])).longValue() : p;
    }

    public static long m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158668", new Object[0])).longValue() : s;
    }

    public static void h(String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            q = null;
            t = null;
        } else {
            try {
                JSONArray jSONArray3 = new JSONArray(str);
                int i3 = 0;
                while (i3 < jSONArray3.length()) {
                    ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
                    JSONObject jSONObject = jSONArray3.getJSONObject(i3);
                    String string = jSONObject.getString("type");
                    if (!TextUtils.isEmpty(string)) {
                        long optLong = jSONObject.optLong("request_idle_time");
                        long optLong2 = jSONObject.optLong("body_idle_time");
                        JSONObject optJSONObject = jSONObject.optJSONObject("url");
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                Object obj = optJSONObject.get(next);
                                if ("*".equals(obj)) {
                                    concurrentHashMap.put(next, f33453a);
                                } else if (obj instanceof JSONArray) {
                                    JSONArray jSONArray4 = (JSONArray) obj;
                                    int length = jSONArray4.length();
                                    ArrayList arrayList = new ArrayList(length);
                                    while (i2 < length) {
                                        Object obj2 = jSONArray4.get(i2);
                                        jSONArray2 = jSONArray3;
                                        try {
                                            if (obj2 instanceof String) {
                                                arrayList.add((String) obj2);
                                            }
                                            i2++;
                                            jSONArray3 = jSONArray2;
                                        } catch (Exception unused) {
                                        }
                                    }
                                    jSONArray2 = jSONArray3;
                                    if (!arrayList.isEmpty()) {
                                        concurrentHashMap.put(next, arrayList);
                                    }
                                    jSONArray3 = jSONArray2;
                                    i2 = 0;
                                }
                                jSONArray2 = jSONArray3;
                                jSONArray3 = jSONArray2;
                                i2 = 0;
                            }
                            jSONArray = jSONArray3;
                            if ("fast".equalsIgnoreCase(string)) {
                                if (optLong > 0) {
                                    r = optLong;
                                }
                                if (optLong2 > 0) {
                                    s = optLong2;
                                }
                                if (!concurrentHashMap.isEmpty()) {
                                    t = concurrentHashMap;
                                }
                            } else if ("normal".equalsIgnoreCase(string)) {
                                if (optLong > 0) {
                                    o = optLong;
                                }
                                if (optLong2 > 0) {
                                    p = optLong2;
                                }
                                if (!concurrentHashMap.isEmpty()) {
                                    q = concurrentHashMap;
                                }
                            }
                            i3++;
                            jSONArray3 = jSONArray;
                            i2 = 0;
                        }
                    }
                    jSONArray = jSONArray3;
                    i3++;
                    jSONArray3 = jSONArray;
                    i2 = 0;
                }
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setRequestFastTimeoutWhiteURL] parse jsonObject failed", e2);
            }
        }
    }

    public static boolean a(URL url, String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9ad35f5", new Object[]{url, str})).booleanValue();
        }
        if (url != null && str != null && !TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, List<String>> concurrentHashMap = null;
            try {
                if ("fast".equalsIgnoreCase(str)) {
                    concurrentHashMap = t;
                } else if ("normal".equalsIgnoreCase(str)) {
                    concurrentHashMap = q;
                }
                if (concurrentHashMap == null || (list = concurrentHashMap.get(url.getHost())) == null) {
                    return false;
                }
                if (list == f33453a) {
                    return true;
                }
                for (String str2 : list) {
                    if (url.getPath().startsWith(str2)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad732412", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            d = null;
        } else {
            ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    try {
                        if (obj instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) obj;
                            int length = jSONArray.length();
                            ArrayList arrayList = new ArrayList(length);
                            for (int i2 = 0; i2 < length; i2++) {
                                Object obj2 = jSONArray.get(i2);
                                if (obj2 instanceof String) {
                                    arrayList.add((String) obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                concurrentHashMap.put(next, arrayList);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setRequestTimeoutURLBlockList] fail", e2);
            }
            d = concurrentHashMap;
        }
    }

    public static boolean b(URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e6bf9ac", new Object[]{url})).booleanValue();
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = d;
        if (url != null && concurrentHashMap != null) {
            try {
                List<String> list = concurrentHashMap.get(url.getHost());
                if (list == null) {
                    return false;
                }
                for (String str : list) {
                    if (url.getPath().startsWith(str)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void h(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{new Boolean(z2)});
        } else {
            u = z2;
        }
    }

    public static void i(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{new Boolean(z2)});
            return;
        }
        SpdyAgent.configSwitchValueByKey(17L, z2 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
        spduLog.Tloge("tnetsdk.SwitchConfig", null, "http3_opt_enable=" + z2, new Object[0]);
    }

    public static void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327e438b", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    boolean z2 = jSONObject.getBoolean("cid_update_enable");
                    SpdyAgent.configSwitchValueByKey(25L, z2 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "cidUpdateEnable=" + z2, new Object[0]);
                } catch (Exception unused) {
                }
                try {
                    boolean z3 = jSONObject.getBoolean("zstd_rso");
                    B(z3);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "zstdRso=" + z3, new Object[0]);
                } catch (Exception unused2) {
                }
                try {
                    boolean z4 = jSONObject.getBoolean("mp_net_enable");
                    d(z4);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "mpNetEnable=" + z4, new Object[0]);
                } catch (Exception unused3) {
                }
                try {
                    q(jSONObject.getBoolean("mp_net_upper_enable"));
                } catch (Exception unused4) {
                }
                try {
                    boolean z5 = jSONObject.getBoolean("encode_decode_opt");
                    SpdyAgent.configSwitchValueByKey(36L, z5 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "encodeDecodeOpt=" + z5, new Object[0]);
                } catch (Exception unused5) {
                }
                try {
                    boolean z6 = jSONObject.getBoolean("storage_remove");
                    SpdyAgent.configSwitchValueByKey(39L, z6 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "storageRemove=" + z6, new Object[0]);
                } catch (Exception unused6) {
                }
                try {
                    boolean z7 = jSONObject.getBoolean("storage_env_fix");
                    SpdyAgent.configSwitchValueByKey(40L, z7 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "storageEnvFix=" + z7, new Object[0]);
                } catch (Exception unused7) {
                }
                try {
                    boolean z8 = jSONObject.getBoolean("quic_opt");
                    SpdyAgent.configSwitchValueByKey(41L, z8 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "quicOpt=" + z8, new Object[0]);
                } catch (Exception unused8) {
                }
                try {
                    boolean z9 = jSONObject.getBoolean("atoi_enable");
                    SpdyAgent.configSwitchValueByKey(32L, z9 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "atoiEnable=" + z9, new Object[0]);
                } catch (Exception unused9) {
                }
                try {
                    e(jSONObject.getBoolean("root_ca_enable"));
                } catch (Exception unused10) {
                }
                try {
                    JSONArray optJSONArray = jSONObject.optJSONArray("fec_host");
                    if (optJSONArray != null) {
                        a(optJSONArray);
                    }
                } catch (Exception e2) {
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "fec_host fail", e2);
                }
                try {
                    f(jSONObject.optLong("launch_pass_Time", 15000L));
                    m(jSONObject.getBoolean("quic_proof"));
                    j(jSONObject.getBoolean("launch_pass_enable"));
                } catch (Exception unused11) {
                }
                try {
                    boolean z10 = jSONObject.getBoolean("sssl_pubkey_retry");
                    SpdyAgent.configSwitchValueByKey(42L, z10 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "sssl_pubkey_retry=" + z10, new Object[0]);
                } catch (Exception unused12) {
                }
                try {
                    boolean z11 = jSONObject.getBoolean("sssl_pubkey_plain");
                    t(z11);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "sssl_pubkey_plain=" + z11, new Object[0]);
                } catch (Exception unused13) {
                }
                int optInt = jSONObject.optInt("tunnel_cc_type");
                if (optInt > 0) {
                    SpdyAgent.configSwitchValueByKey(18L, optInt, mto.a.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "tunnel_cc_type=" + optInt, new Object[0]);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("pto_host");
                if (optJSONArray2 != null) {
                    c(optJSONArray2);
                }
                if (!jSONObject.optBoolean("jni_env_opt", false)) {
                    return;
                }
                SpdyAgent.configSwitchValueByKey(45L, 1, mto.a.GEO_NOT_SUPPORT, null);
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "jniEnvOpt=true", new Object[0]);
            } catch (Exception e3) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[parseCommonSwitchConfigAndSet] error", e3);
            }
        }
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                StringBuilder sb = new StringBuilder(128);
                sb.append("[mp config] ");
                boolean optBoolean = jSONObject.optBoolean("mpquic_enable", true);
                if (!optBoolean) {
                    h(optBoolean);
                }
                int optInt = jSONObject.optInt("mp_version");
                if (optInt > 0) {
                    SpdyAgent.configSwitchValueByKey(3L, optInt, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append("version=");
                    sb.append(optInt);
                }
                int optInt2 = jSONObject.optInt("reinj_hard_deadline");
                if (optInt2 > 0) {
                    SpdyAgent.configSwitchValueByKey(7L, optInt2, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append(",hardDeadline=");
                    sb.append(optInt2);
                }
                int optInt3 = jSONObject.optInt("reinj_deadline_lower_bound");
                if (optInt3 > 0) {
                    SpdyAgent.configSwitchValueByKey(8L, optInt3, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append(",deadlineLowerBound=");
                    sb.append(optInt3);
                }
                int optInt4 = jSONObject.optInt("scheduler_bw_Bps_thr");
                if (optInt4 > 0) {
                    SpdyAgent.configSwitchValueByKey(10L, optInt4, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append(",bwBpsThr=");
                    sb.append(optInt4);
                }
                double optDouble = jSONObject.optDouble("scheduler_loss_percent_thr_high");
                if (optDouble > 0.1d) {
                    SpdyAgent.configSwitchValueByKey(11L, 0, optDouble, null);
                    sb.append(",lossPercentThrHigh=");
                    sb.append(optDouble);
                }
                double optDouble2 = jSONObject.optDouble("scheduler_loss_percent_thr_low");
                if (optDouble2 > 0.1d) {
                    SpdyAgent.configSwitchValueByKey(12L, 0, optDouble2, null);
                    sb.append(",lossPercentThrLow=");
                    sb.append(optDouble2);
                }
                int optInt5 = jSONObject.optInt("scheduler_pto_cnt_thr");
                if (optInt5 > 0) {
                    SpdyAgent.configSwitchValueByKey(13L, optInt5, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append(",ptoCntThr=");
                    sb.append(optInt5);
                }
                int optInt6 = jSONObject.optInt("scheduler_rtt_us_thr_high");
                if (optInt6 > 0) {
                    SpdyAgent.configSwitchValueByKey(14L, optInt6, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append(",rttUsThrHigh=");
                    sb.append(optInt6);
                }
                int optInt7 = jSONObject.optInt("scheduler_rtt_us_thr_low");
                if (optInt7 > 0) {
                    SpdyAgent.configSwitchValueByKey(15L, optInt7, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append(",rttUsThrLow=");
                    sb.append(optInt7);
                }
                int optInt8 = jSONObject.optInt("path_keep_alive_time");
                if (optInt8 > 0) {
                    SpdyAgent.configSwitchValueByKey(4L, optInt8, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append(",pathKeepAliveTime=");
                    sb.append(optInt8);
                }
                int optInt9 = jSONObject.optInt("scheduler_type");
                if (optInt9 > 0) {
                    SpdyAgent.configSwitchValueByKey(9L, optInt9, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append(",schedulerType=");
                    sb.append(optInt9);
                }
                int optInt10 = jSONObject.optInt("reinj_type");
                if (optInt10 > 0) {
                    SpdyAgent.configSwitchValueByKey(5L, optInt10, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append(",reinjType=");
                    sb.append(optInt10);
                }
                double optDouble3 = jSONObject.optDouble("reinj_deadline_srtt_factor");
                if (optDouble3 > 0.1d) {
                    SpdyAgent.configSwitchValueByKey(6L, 0, optDouble3, null);
                    sb.append(",reinjSRTTFactor=");
                    sb.append(optDouble3);
                }
                int optInt11 = jSONObject.optInt("enable_pathInfo");
                if (optInt11 > 0) {
                    SpdyAgent.configSwitchValueByKey(27L, optInt11, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append(",enablePathInfo=");
                    sb.append(optInt11);
                }
                r(jSONObject.optBoolean("enable_amdc_mp", true));
                if (jSONObject.optBoolean("enable_ipv6", false)) {
                    k(true);
                    sb.append(",enableIpv6=");
                    sb.append(true);
                }
                int optInt12 = jSONObject.optInt("bind_net_opt");
                if (optInt12 > 0) {
                    SpdyAgent.configSwitchValueByKey(43L, optInt12, mto.a.GEO_NOT_SUPPORT, null);
                    sb.append(",bindNetOpt=");
                    sb.append(optInt12);
                }
                spduLog.Tloge("tnetsdk.SwitchConfig", null, sb.toString(), new Object[0]);
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[parseMpquicParameterConfigAndSet] error", e2);
            }
        }
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            v = null;
        } else {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                }
                v = copyOnWriteArrayList;
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setMpquicConnectCompensateHostWhiteList] error", e2);
            }
        }
    }

    public static boolean l(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23c7e201", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = v) == null) {
            return false;
        }
        if (!copyOnWriteArrayList.contains("*")) {
            return v.contains(str);
        }
        return true;
    }

    public static void d(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{new Long(j2)});
        } else if (j2 <= 0) {
        } else {
            z = j2;
        }
    }

    public static long o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b56a", new Object[0])).longValue() : z;
    }

    public static void l(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{new Boolean(z2)});
        } else {
            A = z2;
        }
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : A;
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[0])).intValue() : "com.taobao.taobao:channel".equals(UtilTool.a()) ? 1 : 0;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : E;
    }

    public static void n(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50d37f", new Object[]{new Boolean(z2)});
        } else {
            E = z2;
        }
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : Q;
    }

    public static void B(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733b982b", new Object[]{new Boolean(z2)});
        } else {
            Q = z2;
        }
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : r() && !"com.taobao.taobao:channel".equals(UtilTool.a());
    }

    public static void o(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{new Boolean(z2)});
        } else {
            SpdyAgent.configSwitchValueByKey(24L, z2 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
        }
    }

    public static void q(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{new Boolean(z2)});
        } else {
            C = z2;
        }
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : C;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : F;
    }

    public static void r(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52435fb", new Object[]{new Boolean(z2)});
        } else {
            F = z2;
        }
    }

    public static void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f17983", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            G = null;
        } else {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                }
                G = copyOnWriteArrayList;
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setRequestLimitSpeedHostWhiteList] error", e2);
            }
        }
    }

    public static boolean s(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b2312c8", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = G) != null) {
            return copyOnWriteArrayList.contains(str);
        }
        return false;
    }

    public static void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7554ac05", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            S = null;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String string = jSONObject.getString("type");
                    String optString = jSONObject.optString("connect_option");
                    JSONArray optJSONArray = jSONObject.optJSONArray("host");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(optString) && optJSONArray != null) {
                        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            String string2 = optJSONArray.getString(i3);
                            if (!TextUtils.isEmpty(string2)) {
                                copyOnWriteArrayList.add(string2);
                            }
                        }
                        if (!copyOnWriteArrayList.isEmpty()) {
                            spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setConnectOptionConfig] ", "type", string, "option", optString, "hostsList", copyOnWriteArrayList);
                            if ("picture".equalsIgnoreCase(string)) {
                                U = optString;
                                S = copyOnWriteArrayList;
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setConnectOptionConfig] parse failed", e2);
            }
        }
    }

    public static String u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d84a241a", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (!TextUtils.isEmpty(U) || S != null)) {
            try {
                if (G() && S.contains(str)) {
                    return U;
                }
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[getConnectOptionConfig] error", e2);
            }
        }
        return null;
    }

    public static void e(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f9d8", new Object[]{new Long(j2)});
            return;
        }
        spduLog.Tloge("tnetsdk.SwitchConfig", null, "setQuicInitAndMinCwnd, cwnd=" + j2, new Object[0]);
        SpdyAgent.configSwitchValueByKey(29L, (int) j2, mto.a.GEO_NOT_SUPPORT, null);
    }

    public static void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i2)});
        } else {
            X = i2;
        }
    }

    private static void b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1a4603", new Object[]{jSONArray});
        } else if (jSONArray != null) {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                }
                Y = copyOnWriteArrayList;
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setRecvBufferResizeHostWhiteList] error", e2);
            }
        }
    }

    public static boolean v(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b7de8b", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = Y) != null) {
            return copyOnWriteArrayList.contains(str);
        }
        return false;
    }

    public static void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Long valueOf = Long.valueOf(jSONObject.optLong("raw_size"));
                if (valueOf != null && valueOf.intValue() > 0 && valueOf.intValue() < 262144) {
                    SpdyAgent.configSwitchValueByKey(33L, valueOf.intValue(), mto.a.GEO_NOT_SUPPORT, null);
                }
                Long valueOf2 = Long.valueOf(jSONObject.optLong("deflated_size"));
                if (valueOf2 != null && valueOf2.intValue() > 0 && valueOf2.intValue() < 262144) {
                    SpdyAgent.configSwitchValueByKey(34L, valueOf2.intValue(), mto.a.GEO_NOT_SUPPORT, null);
                }
                try {
                    boolean z2 = jSONObject.getBoolean("direct_enable");
                    SpdyAgent.configSwitchValueByKey(35L, z2 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "direct_enable=" + z2, new Object[0]);
                } catch (Exception unused) {
                }
                try {
                    boolean z3 = jSONObject.getBoolean("recvmmsg_enable");
                    SpdyAgent.configSwitchValueByKey(31L, z3 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "recvmmsg_enable=" + z3, new Object[0]);
                } catch (Exception unused2) {
                }
                try {
                    boolean z4 = jSONObject.getBoolean("sendmmsg_enable");
                    boolean isValidPathEnv = UtilTool.isValidPathEnv(SpdyAgent.getContext());
                    SpdyAgent.configSwitchValueByKey(37L, (!z4 || !isValidPathEnv) ? 0 : 1, mto.a.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "sendmmsgEnable=" + z4, "isValidEnv", Boolean.valueOf(isValidPathEnv));
                } catch (Exception unused3) {
                }
                try {
                    JSONArray optJSONArray = jSONObject.optJSONArray("resize_host");
                    if (optJSONArray != null) {
                        b(optJSONArray);
                    }
                } catch (Exception unused4) {
                }
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "RecvBody", "rawSize", valueOf, "deflatedSize", valueOf2);
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setSendAndRecvBodyOptimizeConfig] error", e2);
            }
        }
    }

    public static void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1b1109", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                }
                Z = copyOnWriteArrayList;
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[multiSessionHostWhiteList] error", e2);
            }
        }
    }

    public static boolean y(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e84caa4e", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = Z) == null) {
            return false;
        }
        if (!copyOnWriteArrayList.contains("*")) {
            return Z.contains(str);
        }
        return true;
    }

    public static void c(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{new Boolean(z2)});
            return;
        }
        m = z2;
        spduLog.Tloge("tnetsdk.SwitchConfig", null, "setMultiThreadOptEnable=" + z2, new Object[0]);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : m;
    }

    public static int I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("41a3843", new Object[0])).intValue() : b() ? 2 : 1;
    }

    public static void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a4bd53", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                }
                h = copyOnWriteArrayList;
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setQuic0RTTFastTimeoutHostWhiteList] error", e2);
            }
        }
    }

    public static boolean C(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41d65698", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = h) != null) {
            return copyOnWriteArrayList.contains(str);
        }
        return false;
    }

    private static void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e9f902", new Object[]{jSONArray});
        } else if (jSONArray != null) {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                }
                w = copyOnWriteArrayList;
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setFecHostWhiteList] ", "hosts", copyOnWriteArrayList);
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setFecHostWhiteList] error", e2);
            }
        }
    }

    public static boolean j(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f64af7f", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = w) != null) {
            return copyOnWriteArrayList.contains(str);
        }
        return false;
    }

    public static void c(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4a9304", new Object[]{jSONArray});
        } else if (jSONArray != null) {
            try {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                }
                N = copyOnWriteArrayList;
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setQuicPtoHostWhiteList] ", "hosts", copyOnWriteArrayList);
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setQuicPtoHostWhiteList] error", e2);
            }
        }
    }

    public static boolean m(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6df97b42", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = N) != null) {
            return copyOnWriteArrayList.contains(str);
        }
        return false;
    }

    public static void e(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{new Boolean(z2)});
        } else {
            I = z2;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : I;
    }

    public static void j(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{new Boolean(z2)});
            return;
        }
        B = z2;
        spduLog.Tloge("tnetsdk.SwitchConfig", null, "setAllowLaunchTimePassEnable=" + z2, new Object[0]);
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : B;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : t() && L();
    }

    public static void f(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9d277", new Object[]{new Long(j2)});
        } else {
            D = j2;
        }
    }

    public static long H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40c20c3", new Object[0])).longValue() : D;
    }

    public static void k(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{new Boolean(z2)});
        } else {
            R = z2;
        }
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue() : R;
    }

    public static void m(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{new Boolean(z2)});
        } else {
            T = z2;
        }
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue() : T;
    }

    public static void D(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a54969", new Object[]{new Boolean(z2)});
            return;
        }
        ab = z2;
        spduLog.Tloge("tnetsdk.SwitchConfig", null, "CDNPublicKeyToPlain=" + z2, new Object[0]);
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue() : ab;
    }

    public static void t(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88de739", new Object[]{new Boolean(z2)});
        } else {
            x = z2;
        }
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : x;
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : P;
    }

    public static void v(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf79877", new Object[]{new Boolean(z2)});
        } else {
            P = z2;
        }
    }

    public static void s(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d90e9a", new Object[]{new Boolean(z2)});
        } else {
            H = z2;
        }
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : H;
    }

    public static void u(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca42bfd8", new Object[]{new Boolean(z2)});
        } else {
            J = z2;
        }
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : J;
    }

    public static void w(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdac7116", new Object[]{new Boolean(z2)});
        } else {
            M = z2;
        }
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : M;
    }

    public static void y(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1162254", new Object[]{new Boolean(z2)});
        } else {
            O = z2;
        }
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : O;
    }

    public static void z(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2cafaf3", new Object[]{new Boolean(z2)});
        } else {
            K = z2;
        }
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue() : K;
    }

    public static void A(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7186bf8c", new Object[]{new Boolean(z2)});
        } else {
            L = z2;
        }
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : L;
    }

    public static void C(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f070ca", new Object[]{new Boolean(z2)});
        } else {
            V = z2;
        }
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue() : V;
    }

    public static void p(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{new Boolean(z2)});
        } else {
            W = z2;
        }
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue() : W;
    }

    public static void x(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6149b5", new Object[]{new Boolean(z2)});
        } else {
            y = z2;
        }
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue() : y;
    }

    public static void E(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785a2208", new Object[]{new Boolean(z2)});
        } else {
            SpdyAgent.configSwitchValueByKey(44L, z2 ? 1 : 0, mto.a.GEO_NOT_SUPPORT, null);
        }
    }
}
