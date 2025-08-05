package com.alibaba.analytics.core.config;

import com.alibaba.analytics.core.model.LogField;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;
import tb.aob;
import tb.apr;
import tb.aqc;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class q extends n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static q f2069a;
    private int b;
    private Random c;
    private Map<String, a> d;

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(794493439);
        f2069a = null;
    }

    public static q a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("afc32e8f", new Object[0]);
        }
        if (f2069a == null) {
            f2069a = new q();
        }
        return f2069a;
    }

    private q() {
        this.b = 0;
        this.c = null;
        this.d = null;
        String utdid = UTDevice.getUtdid(aob.a().k());
        if (utdid == null || utdid.equals(Constants.UTDID_INVALID)) {
            this.b = 0;
        } else {
            this.b = Math.abs(aqc.a(utdid)) % 10000;
        }
        apr.b("UTSampleConfBiz", "deviceSample", Integer.valueOf(this.b));
        this.c = new Random();
        this.d = new HashMap();
    }

    public synchronized boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        try {
            return a(Integer.parseInt(map.get(LogField.EVENTID.toString())), map.get(LogField.ARG1.toString()));
        } catch (Exception e) {
            apr.b("UTSampleConfBiz", e, new Object[0]);
            return false;
        }
    }

    public synchronized boolean a(int i, String str) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), str})).booleanValue();
        } else if (aob.a().y()) {
            return true;
        } else {
            if (this.d.size() == 0) {
                return true;
            }
            if (i == 19998 || i == 19997) {
                i2 = this.b;
            } else {
                i2 = this.c.nextInt(10000);
            }
            b a2 = a(i, str, i2);
            if (a2.a()) {
                return true;
            }
            if (a2.b()) {
                return false;
            }
            b a3 = a(i - (i % 10), str, i2);
            if (a3.a()) {
                return true;
            }
            if (a3.b()) {
                return false;
            }
            b a4 = a(i - (i % 100), str, i2);
            if (a4.a()) {
                return true;
            }
            if (a4.b()) {
                return false;
            }
            b a5 = a(i - (i % 1000), str, i2);
            if (a5.a()) {
                return true;
            }
            if (a5.b()) {
                return false;
            }
            b a6 = a(-1, str, i2);
            if (a6.a()) {
                return true;
            }
            return a6.b() ? false : false;
        }
    }

    private b a(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("de484aa7", new Object[]{this, new Integer(i), str, new Integer(i2)});
        }
        String valueOf = String.valueOf(i);
        b bVar = new b();
        if (this.d.containsKey(valueOf)) {
            bVar.b(true);
            bVar.a(this.d.get(valueOf).a(str, i2));
            return bVar;
        }
        bVar.a(false);
        return bVar;
    }

    @Override // com.alibaba.analytics.core.config.n
    public synchronized void a(String str, Map<String, String> map) {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        this.d.clear();
        for (String str2 : map.keySet()) {
            String str3 = map.get(str2);
            if (str3 != null && (a2 = a(str3)) != null) {
                this.d.put(str2, a2);
            }
        }
    }

    @Override // com.alibaba.analytics.core.config.n
    public String[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("11a28f78", new Object[]{this}) : new String[]{"ut_sample"};
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f2071a;
        private boolean b;

        static {
            kge.a(65600491);
        }

        private b() {
            this.f2071a = false;
            this.b = false;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f2071a = z;
            }
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f2071a;
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f2070a;
        private Map<String, Integer> b;

        static {
            kge.a(688081505);
        }

        private boolean a(int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : i != 0 && i2 < i;
        }

        private a() {
            this.f2070a = 0;
            this.b = new HashMap();
        }

        public static /* synthetic */ int a(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("37450d84", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.f2070a = i;
            return i;
        }

        public static /* synthetic */ Map a(a aVar, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("12313a88", new Object[]{aVar, map});
            }
            aVar.b = map;
            return map;
        }

        public boolean a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{this, str, new Integer(i)})).booleanValue();
            }
            if (str != null) {
                try {
                    for (Map.Entry<String, Integer> entry : this.b.entrySet()) {
                        String key = entry.getKey();
                        int intValue = entry.getValue().intValue();
                        if (key.startsWith(riy.MOD) && key.endsWith(riy.MOD)) {
                            if (str.contains(key.substring(1, key.length() - 1))) {
                                return a(intValue, i);
                            }
                        } else if (str.equals(key)) {
                            return a(intValue, i);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            return a(this.f2070a, i);
        }
    }

    private static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b94f34bc", new Object[]{str});
        }
        try {
            a aVar = new a();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(StatisticRecord.ET_CP)) {
                a.a(aVar, jSONObject.optInt(StatisticRecord.ET_CP));
            }
            if (jSONObject.has("arg1")) {
                HashMap hashMap = new HashMap();
                JSONObject optJSONObject = jSONObject.optJSONObject("arg1");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, Integer.valueOf(Integer.parseInt(optJSONObject.optString(next))));
                    }
                }
                a.a(aVar, hashMap);
            }
            return aVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
