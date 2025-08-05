package com.alibaba.analytics.core.config;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.aob;
import tb.apr;
import tb.aqc;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class p extends n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static p e;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, a> f2067a = new HashMap();
    private int b = 10;
    private int c = 0;
    private int d = -1;

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : b(str);
    }

    static {
        kge.a(-1859733346);
        e = null;
    }

    public static p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("afc32e70", new Object[0]);
        }
        if (e == null) {
            e = new p();
        }
        return e;
    }

    private p() {
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : aob.a().f() || aob.a().d() || aob.a().e();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (c()) {
            return false;
        }
        if (aob.a().y()) {
            return true;
        }
        if (this.d == -1) {
            String utdid = UTDevice.getUtdid(aob.a().k());
            if (utdid == null || utdid.equals(Constants.UTDID_INVALID)) {
                return false;
            }
            this.d = Math.abs(aqc.a(utdid));
        }
        apr.a("", "hashcode", Integer.valueOf(this.d), "sample", Integer.valueOf(this.c));
        return this.d % 10000 < this.c;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.b;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f2067a.clear();
        this.b = 10;
        this.c = 0;
    }

    public synchronized int a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a421210", new Object[]{this, map})).intValue();
        }
        String str = "";
        if (map.containsKey(LogField.EVENTID.toString())) {
            str = map.get(LogField.EVENTID.toString());
        }
        String str2 = null;
        String str3 = map.containsKey(LogField.PAGE.toString()) ? map.get(LogField.PAGE.toString()) : null;
        String str4 = map.containsKey(LogField.ARG1.toString()) ? map.get(LogField.ARG1.toString()) : null;
        if (map.containsKey(LogField.ARG2.toString())) {
            str2 = map.get(LogField.ARG2.toString());
        }
        return a(str, str3, str4, str2);
    }

    private int a(String str, String str2, String str3, String str4) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee2b483", new Object[]{this, str, str2, str3, str4})).intValue();
        }
        if (TextUtils.isEmpty(str) || !this.f2067a.containsKey(str) || (aVar = this.f2067a.get(str)) == null) {
            return 0;
        }
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
            return aVar.a(str2, str3, str4);
        }
        return 0;
    }

    @Override // com.alibaba.analytics.core.config.n
    public synchronized void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        apr.b("", "aGroupname", str, "aConfContent", map);
        f();
        for (String str2 : map.keySet()) {
            String str3 = map.get(str2);
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                if (str2.equals("time")) {
                    int b = b(str3);
                    if (b >= 3 && b <= 20) {
                        this.b = b;
                    }
                } else if (str2.equals("sample")) {
                    int b2 = b(str3);
                    if (b2 >= 0 && b2 <= 10000) {
                        this.c = b2;
                    }
                } else {
                    a a2 = a.a(str3);
                    if (a2 != null) {
                        this.f2067a.put(str2, a2);
                    }
                }
            }
        }
    }

    @Override // com.alibaba.analytics.core.config.n
    public String[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("11a28f78", new Object[]{this}) : new String[]{"ut_realtime"};
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Map<String, String> f2068a = new HashMap();
        private Map<String, String> b = new HashMap();
        private Map<String, String> c = new HashMap();
        private int d = 0;

        static {
            kge.a(-1521999363);
        }

        private a() {
        }

        public int a(String str, String str2, String str3) {
            String a2;
            String a3;
            String a4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("929ad039", new Object[]{this, str, str2, str3})).intValue();
            }
            if (!aqc.e(str3) && (a4 = a(this.c, str3)) != null) {
                return p.a(a4);
            }
            if (!aqc.e(str) && (a3 = a(this.f2068a, str)) != null) {
                return p.a(a3);
            }
            if (!aqc.e(str2) && (a2 = a(this.b, str2)) != null) {
                return p.a(a2);
            }
            return this.d;
        }

        private String a(Map<String, String> map, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{this, map, str});
            }
            if (str == null) {
                return null;
            }
            for (String str2 : map.keySet()) {
                if (str2.startsWith(riy.MOD) && str2.endsWith(riy.MOD)) {
                    if (str.contains(str2.substring(1, str2.length() - 1))) {
                        return map.get(str2);
                    }
                } else if (str.equals(str2)) {
                    return map.get(str2);
                }
            }
            return null;
        }

        public static a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b94ec05d", new Object[]{str});
            }
            try {
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("tp")) {
                    aVar.d = p.a(jSONObject.optString("tp"));
                }
                aVar.f2068a = a(jSONObject, "pg");
                aVar.b = a(jSONObject, "arg1");
                aVar.c = a(jSONObject, "arg2");
                return aVar;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        private static Map<String, String> a(JSONObject jSONObject, String str) {
            JSONObject optJSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("b20490d5", new Object[]{jSONObject, str});
            }
            HashMap hashMap = new HashMap();
            if (jSONObject.has(str) && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, optJSONObject.optString(next));
                }
            }
            return hashMap;
        }
    }

    private static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e2) {
            apr.b("", e2);
            return 0;
        }
    }
}
