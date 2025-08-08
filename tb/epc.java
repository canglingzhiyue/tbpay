package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class epc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, epc> f27503a;
    private static boolean f;
    private String b;
    private int c;
    private Map<String, String> g;
    private boolean e = false;
    private Map<String, a> d = new ConcurrentHashMap();

    static {
        kge.a(2120990780);
        f27503a = new HashMap();
        f = true;
    }

    private epc(String str) {
        this.b = str;
        b();
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.profile.TimeProfiler");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.g = new HashMap();
        }
    }

    public static epc a(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (epc) ipChange.ipc$dispatch("33b1a221", new Object[]{context, new Integer(i), str}) : a(context, str).a(i);
    }

    public static epc a(Context context, int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epc) ipChange.ipc$dispatch("a0e4b10d", new Object[]{context, new Integer(i), str, str2, str3});
        }
        epc a2 = a(context, i, str);
        a2.a(str2, str3);
        return a2;
    }

    public static epc a(Context context, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epc) ipChange.ipc$dispatch("44a1da57", new Object[]{context, new Integer(i), str, str2});
        }
        epc a2 = a(context, i, str);
        a2.a(str2);
        return a2;
    }

    public static void a(Context context, int i, String str, String str2, long j, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0c4bf7", new Object[]{context, new Integer(i), str, str2, new Long(j), str3});
        } else {
            a(context, i, str).a(str2, j, str3);
        }
    }

    public static void a(Context context, int i, String str, String str2, long j, long j2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e41b01", new Object[]{context, new Integer(i), str, str2, new Long(j), new Long(j2), str3});
        } else {
            a(context, i, str).a(str2, j, j2, str3);
        }
    }

    public static Map<String, String> b(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4b712563", new Object[]{context, new Integer(i), str}) : a(context, i, str).a();
    }

    public static epc a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epc) ipChange.ipc$dispatch("837a5704", new Object[]{context, str});
        }
        epc epcVar = f27503a.get(str);
        if (epcVar != null) {
            return epcVar;
        }
        synchronized (epc.class) {
            epc epcVar2 = f27503a.get(str);
            if (epcVar2 != null) {
                return epcVar2;
            }
            epc epcVar3 = new epc(str);
            f27503a.put(str, epcVar3);
            return epcVar3;
        }
    }

    public epc a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epc) ipChange.ipc$dispatch("95397f72", new Object[]{this, str, str2});
        }
        a aVar = new a();
        aVar.f27504a = str;
        aVar.b = System.currentTimeMillis();
        aVar.d = 0L;
        aVar.e = str2;
        this.d.put(str, aVar);
        return this;
    }

    public epc a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (epc) ipChange.ipc$dispatch("7c6ee7fc", new Object[]{this, str}) : b(str, null);
    }

    public epc b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epc) ipChange.ipc$dispatch("cf042151", new Object[]{this, str, str2});
        }
        a aVar = this.d.get(str);
        if (aVar == null) {
            epp.d("TimeProfiler", "TimeProfiler Page " + this.b + " None Start Method " + str);
            return this;
        }
        aVar.f = str2;
        if (aVar.d <= 0) {
            aVar.c = System.currentTimeMillis();
            if (aVar.b > 0) {
                aVar.d = aVar.c - aVar.b;
                String str3 = "TimeProfiler " + this.b + " " + aVar.f27504a + " CostTime " + aVar.d + "ms";
            } else {
                this.d.remove(str);
            }
        }
        return this;
    }

    public epc a(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epc) ipChange.ipc$dispatch("4aa88ed2", new Object[]{this, str, new Long(j), str2});
        }
        if (j >= 0) {
            a aVar = new a();
            aVar.f27504a = str;
            aVar.b = System.currentTimeMillis();
            aVar.c = aVar.b;
            aVar.d = j;
            aVar.e = str2;
            this.d.put(str, aVar);
            epp.b("TimeProfiler", "TimeProfiler " + this.b + " " + aVar.f27504a + " CostTime " + j + "ms");
        }
        return this;
    }

    public epc a(String str, long j, long j2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epc) ipChange.ipc$dispatch("431b6b72", new Object[]{this, str, new Long(j), new Long(j2), str2});
        }
        if (j2 >= 0) {
            a aVar = new a();
            aVar.f27504a = str;
            aVar.b = j;
            aVar.c = System.currentTimeMillis();
            aVar.d = j2;
            aVar.e = str2;
            this.d.put(str, aVar);
            epp.b("TimeProfiler", "TimeProfiler " + this.b + " " + aVar.f27504a + " CostTime " + j2 + "ms");
        }
        return this;
    }

    public Map<String, String> a() {
        String concat;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        ept.b("firstBoot", String.valueOf(f));
        HashMap hashMap = new HashMap();
        if (this.e) {
            return hashMap;
        }
        this.e = true;
        long a2 = eqd.a();
        Set<Map.Entry<String, a>> entrySet = this.d.entrySet();
        b();
        String str = this.b;
        HashMap hashMap2 = new HashMap();
        String str2 = "";
        String str3 = str2;
        for (Map.Entry<String, a> entry : entrySet) {
            a value = entry.getValue();
            if (!StringUtils.isEmpty(value.f27504a)) {
                String str4 = value.f27504a;
                long j2 = value.d;
                if (str4.equals("load") || str4.equals("click")) {
                    if (j2 > 0) {
                        String str5 = "" + j2;
                        String str6 = "" + value.f;
                        str2 = str4;
                    }
                } else if (j2 >= 0) {
                    if (StringUtils.isEmpty(value.g)) {
                        hashMap2.put(str4, "" + j2);
                    } else {
                        str3 = value.g;
                    }
                }
                String str7 = "start=" + value.b + ",end=" + value.c + ",cost=" + value.d;
                Map<String, String> map = this.g;
                StringBuilder sb = new StringBuilder();
                j = a2;
                sb.append(value.d);
                sb.append("");
                map.put(str4, sb.toString());
                hashMap.put(StringUtils.isEmpty(value.e) ? str4 : value.e, value.d + "");
                epu.b(str4, str7);
                ept.a(this.d);
            } else {
                j = a2;
            }
            a2 = j;
        }
        long j3 = a2;
        if (!StringUtils.isEmpty(str2) && this.c > 0) {
            if (StringUtils.isEmpty(str3)) {
                concat = hashMap2.toString();
            } else {
                concat = hashMap2.toString().replace('}', ',').concat(str3).concat(riy.BLOCK_END_STR);
            }
            epu.b("loadDetail", concat);
            epp.b("TimeProfiler", concat);
        }
        f27503a.remove(str);
        this.d.clear();
        long a3 = eqd.a() - j3;
        if (StringUtils.isEmpty(str2)) {
            epp.d("TimeProfiler", "TimeProfiler Page cann't find load event");
        }
        String str8 = "dump time =" + a3;
        f = false;
        ept.b();
        return hashMap;
    }

    public epc a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epc) ipChange.ipc$dispatch("e6612873", new Object[]{this, new Integer(i)});
        }
        this.c = i;
        return this;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f27504a;
        public long b;
        public long c;
        public long d;
        public String e;
        public String f;
        public String g;

        static {
            kge.a(-1395966428);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MethodName =" + this.f27504a + " CostTime =" + this.d + "ms\r\n";
        }
    }
}
