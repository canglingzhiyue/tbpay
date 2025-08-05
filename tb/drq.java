package tb;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.j;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class drq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static drq f26929a;
    private static int b;
    private static ThreadLocal<StringBuilder> c;
    private static ThreadLocal<StringBuilder> d;

    public static /* synthetic */ ThreadLocal b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadLocal) ipChange.ipc$dispatch("32834b6d", new Object[0]) : c;
    }

    static {
        kge.a(410181430);
        b = 5;
        c = new ThreadLocal<StringBuilder>() { // from class: tb.drq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.StringBuilder] */
            @Override // java.lang.ThreadLocal
            public /* synthetic */ StringBuilder initialValue() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2908671e", new Object[]{this}) : a();
            }

            public StringBuilder a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (StringBuilder) ipChange.ipc$dispatch("735e5c83", new Object[]{this}) : new StringBuilder(512);
            }
        };
        d = new ThreadLocal<StringBuilder>() { // from class: tb.drq.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.StringBuilder] */
            @Override // java.lang.ThreadLocal
            public /* synthetic */ StringBuilder initialValue() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2908671e", new Object[]{this}) : a();
            }

            public StringBuilder a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (StringBuilder) ipChange.ipc$dispatch("735e5c83", new Object[]{this}) : new StringBuilder(1024);
            }
        };
    }

    private drq() {
    }

    public static drq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drq) ipChange.ipc$dispatch("f03d3db", new Object[0]);
        }
        if (f26929a == null) {
            synchronized (drq.class) {
                if (f26929a == null) {
                    f26929a = new drq();
                }
            }
        }
        return f26929a;
    }

    public void a(String str, drp drpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("259e63c0", new Object[]{this, str, drpVar});
        } else if (str == null) {
        } else {
            a aVar = new a(str);
            try {
                a(aVar);
                if (drpVar == null) {
                    return;
                }
                drpVar.v = aVar.d;
                if (!dro.m()) {
                    drpVar.u = j.d(aVar.d);
                }
                drpVar.c();
            } catch (Exception e) {
                a("convertBizArgsArrayToKVS", e, true);
                aVar.f = true;
            }
        }
    }

    public void a(Map<String, String> map, drp drpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85770eab", new Object[]{this, map, drpVar});
        } else if (map != null && drpVar != null) {
            HashMap hashMap = new HashMap();
            for (String str : map.keySet()) {
                a(1, str, map.get(str), hashMap);
            }
            drpVar.v = hashMap;
            if (!dro.m()) {
                drpVar.u = j.d(hashMap);
            }
            if (a.b.m()) {
                return;
            }
            drpVar.l = j.a(map, "=", ",");
        }
    }

    private void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48fa1938", new Object[]{this, aVar});
        } else if (aVar == null || !aVar.f26930a.booleanValue()) {
        } else {
            b(aVar);
            c(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(tb.drq.a r15) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.drq.b(tb.drq$a):void");
    }

    private void c(a aVar) {
        int length;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb0edba", new Object[]{this, aVar});
        } else if (aVar == null || aVar.f.booleanValue() || aVar.e == null) {
        } else {
            Iterator<String> it = aVar.e.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.length() > 0) {
                    if (dro.m()) {
                        length = kps.a(next, "=");
                    } else {
                        length = (next.length() - next.replace("=", "").length()) / 1;
                    }
                    if (length == 0) {
                        str = next;
                    } else {
                        String[] split = next.split("=", 2);
                        if (a(split)) {
                            String str2 = split[0];
                            str = split[1];
                            next = str2;
                        } else {
                            a("genKVFormatByParseObj", (Exception) null, false);
                            aVar.f = true;
                        }
                    }
                    if (next.length() > 0) {
                        aVar.f = Boolean.valueOf(a(length, next, str, aVar.d));
                    }
                }
            }
        }
    }

    private boolean a(int i, String str, String str2, Map<String, Object> map) {
        int length;
        int length2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8ec607a", new Object[]{this, new Integer(i), str, str2, map})).booleanValue();
        }
        if (str2 == null) {
            return false;
        }
        String a2 = a(str2, 0, a.b.o());
        if (dro.m()) {
            length = kps.a(a2, riy.BLOCK_START_STR);
            length2 = kps.a(a2, riy.BLOCK_END_STR);
        } else {
            length = a2.length() - a2.replace(riy.BLOCK_START_STR, "").length();
            length2 = a2.length() - a2.replace(riy.BLOCK_END_STR, "").length();
        }
        if (i > 0 && length == length2 && length > 0) {
            try {
                JSONObject parseObject = JSONObject.parseObject(a2);
                if (parseObject != null && parseObject.size() > 0) {
                    map.put(str, parseObject);
                } else {
                    map.put(str, new JSONObject());
                }
            } catch (Exception e) {
                if (a2.length() > 0) {
                    map.put(str, a2);
                } else {
                    a("genKVFormatByParseObj", e, false);
                    return false;
                }
            }
        } else if (a2.length() > 0 && str.length() > 0) {
            map.put(str, a2);
        } else if (a2.length() == 0 && str.length() > 0) {
            map.put(str, "");
        } else {
            a("genKVFormatByParseObj", (Exception) null, false);
            return false;
        }
        return false;
    }

    /* loaded from: classes4.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String b;
        public StringBuffer o;
        public StringBuilder p;

        /* renamed from: a  reason: collision with root package name */
        public Boolean f26930a = true;
        public Map<String, String> c = new HashMap();
        public Map<String, Object> d = new HashMap();
        public List<String> e = new ArrayList();
        public Boolean f = false;
        public Boolean g = false;
        public int h = 0;
        public int i = 0;
        public int j = 0;
        public int k = 0;
        public boolean l = false;
        public boolean m = false;
        public int n = -1;

        static {
            kge.a(-242712848);
        }

        public a(String str) {
            this.b = "";
            if (dro.m()) {
                this.b = str;
                this.p = (StringBuilder) drq.b().get();
                this.p.setLength(0);
                return;
            }
            this.b = String.format("%s%s", str, ",");
            this.o = new StringBuffer();
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.o.toString();
        }

        public void a(char c) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8217d15", new Object[]{this, new Character(c)});
            } else if (dro.m()) {
                this.p.append(c);
            } else {
                this.o.append(c);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.g = false;
            this.l = false;
            this.m = false;
            this.n = -1;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            if (dro.m()) {
                this.p.setLength(0);
            } else {
                this.o = new StringBuffer();
            }
        }
    }

    public void a(String str, Exception exc, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c4cfc0", new Object[]{this, str, exc, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("toBeParsedData", "");
        if (!z) {
            dsb.a("bizArgs_Manager", null, hashMap, "bizArgs_standard_genericParse", String.format("%s%s", "parse error within: %@", str));
        } else {
            dsb.a("bizArgs_Manager", null, hashMap, exc);
        }
    }

    private static String a(String str, int i, boolean z) {
        StringBuilder sb;
        String decode;
        boolean contains;
        String str2 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec05af1d", new Object[]{str2, new Integer(i), new Boolean(z)});
        }
        if (str2 != null && str.length() > 0) {
            if (!str2.contains(riy.MOD)) {
                return str2;
            }
            if (z) {
                if (dro.m()) {
                    StringBuilder sb2 = d.get();
                    sb2.setLength(0);
                    sb2.append(str2);
                    if (str2.contains("%3D") || str2.contains("%26")) {
                        kps.a(sb2, "%3D", "=");
                        kps.a(sb2, "%26", "&");
                    }
                    if (str2.contains("%7B")) {
                        kps.a(sb2, "%22", "\"");
                        kps.a(sb2, "%2C", ",");
                        kps.a(sb2, "%7B", riy.BLOCK_START_STR);
                        kps.a(sb2, "%7D", riy.BLOCK_END_STR);
                    }
                    kps.a(sb2, "%3A", ":");
                    kps.a(sb2, "%23", "#");
                    kps.a(sb2, "%7E", Constants.WAVE_SEPARATOR);
                    kps.a(sb2, "%3B", ";");
                    kps.a(sb2, "%7C", "|");
                    kps.a(sb2, "%2F", "/");
                    kps.a(sb2, "%3F", "?");
                    if (!str2.contains(riy.MOD)) {
                        return sb2.toString();
                    }
                    sb = sb2;
                    decode = (sb != null || Build.VERSION.SDK_INT < 19) ? Uri.decode(str2) : kps.a(sb);
                    if (decode != null && decode.length() > 0) {
                        if (!"1".equals(com.taobao.android.behavix.behavixswitch.a.a("enableFilterJsonDecode", "1")) && (decode.startsWith(riy.BLOCK_START_STR) || decode.startsWith(riy.ARRAY_START_STR))) {
                            return decode;
                        }
                        contains = decode.contains(riy.MOD);
                        if (!contains && TextUtils.equals(decode, str2)) {
                            return decode;
                        }
                        int i2 = i + 1;
                        return (!contains || i2 >= b) ? decode : a(decode, i2, z);
                    }
                } else {
                    if (str2.contains("%3D") || str2.contains("%26")) {
                        str2 = str2.replace("%3D", "=").replace("%26", "&");
                    }
                    if (str2.contains("%7B")) {
                        str2 = str2.replace("%22", "\"").replace("%2C", ",").replace("%7B", riy.BLOCK_START_STR).replace("%7D", riy.BLOCK_END_STR);
                    }
                    if (str2.contains("%3A")) {
                        str2 = str2.replace("%3A", ":");
                    }
                    if (str2.contains("%23")) {
                        str2 = str2.replace("%23", "#");
                    }
                    if (str2.contains("%7E")) {
                        str2 = str2.replace("%7E", Constants.WAVE_SEPARATOR);
                    }
                    if (str2.contains("%3B")) {
                        str2 = str2.replace("%3B", ";");
                    }
                    if (str2.contains("%7C")) {
                        str2 = str2.replace("%7C", "|");
                    }
                    if (str2.contains("%2F")) {
                        str2 = str2.replace("%2F", "/");
                    }
                    if (str2.contains("%3F")) {
                        str2 = str2.replace("%3F", "?");
                    }
                    if (!str2.contains(riy.MOD)) {
                        return str2;
                    }
                }
            }
            sb = null;
            if (sb != null) {
            }
            if (decode != null) {
                if (!"1".equals(com.taobao.android.behavix.behavixswitch.a.a("enableFilterJsonDecode", "1"))) {
                }
                contains = decode.contains(riy.MOD);
                if (!contains) {
                }
                int i22 = i + 1;
                if (!contains) {
                    return decode;
                }
            }
        }
        return str2;
    }

    private static boolean a(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b26fbb", new Object[]{strArr})).booleanValue() : (strArr == null || strArr.length != 2 || strArr[0] == null || strArr[1] == null) ? false : true;
    }
}
