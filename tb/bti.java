package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.config.n;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public class bti extends n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static bti b;
    private static final String[] d;

    /* renamed from: a  reason: collision with root package name */
    private Map<EventType, bth> f26129a = Collections.synchronizedMap(new HashMap(3));
    private int c;

    public static /* synthetic */ Object ipc$super(bti btiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(927761461);
        b = null;
        d = new String[]{"ap_stat", "ap_counter", "ap_alarm"};
    }

    /* JADX WARN: Multi-variable type inference failed */
    private bti() {
        EventType[] values;
        c();
        for (EventType eventType : EventType.values()) {
            Class<? extends aof> cls = eventType.getCls();
            bth a2 = a(aob.a().G().a(cls, null, "module,mp ASC ", -1));
            if (a2 == null) {
                try {
                    bth bthVar = (bth) cls.newInstance();
                    try {
                        bthVar.b = "event_type";
                        bthVar.b(eventType.getDefaultSampling());
                    } catch (Exception unused) {
                    }
                    a2 = bthVar;
                } catch (Exception unused2) {
                }
            }
            this.f26129a.put(eventType, a2);
        }
    }

    public static bti a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bti) ipChange.ipc$dispatch("f02f1a7", new Object[0]);
        }
        if (b == null) {
            synchronized (bti.class) {
                if (b == null) {
                    b = new bti();
                }
            }
        }
        return b;
    }

    public boolean a(EventType eventType, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c002c2e5", new Object[]{this, eventType, str, str2})).booleanValue() : b(eventType, str, str2, (Map<String, String>) null);
    }

    public boolean a(EventType eventType, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff66da88", new Object[]{this, eventType, str, str2, map})).booleanValue() : b(eventType, str, str2, map);
    }

    public boolean a(String str, String str2, Boolean bool, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0ab1718", new Object[]{this, str, str2, bool, map})).booleanValue() : b(str, str2, bool, map);
    }

    public boolean b(EventType eventType, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfe8a267", new Object[]{this, eventType, str, str2, map})).booleanValue();
        }
        bth bthVar = this.f26129a.get(eventType);
        if (bthVar != null) {
            return bthVar.a(this.c, str, str2, map);
        }
        apr.b("eventTypeSample  ==null", new Object[0]);
        return false;
    }

    public boolean b(String str, String str2, Boolean bool, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("245941d9", new Object[]{this, str, str2, bool, map})).booleanValue();
        }
        bth bthVar = this.f26129a.get(EventType.ALARM);
        if (bthVar != null && (bthVar instanceof btj)) {
            return ((btj) bthVar).a(this.c, str, str2, bool, map);
        }
        return false;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.c = new Random().nextInt(10000);
        }
    }

    public void a(EventType eventType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc18c56", new Object[]{this, eventType, new Integer(i)});
            return;
        }
        bth bthVar = this.f26129a.get(eventType);
        if (bthVar != null) {
            bthVar.b(i);
        }
        apr.b("setSampling end", new Object[0]);
    }

    private bth a(Class<? extends bth> cls, JSONObject jSONObject) {
        bth bthVar;
        try {
            bthVar = cls.newInstance();
            try {
                if (jSONObject.containsKey("offline")) {
                    bthVar.d = jSONObject.getString("offline");
                }
                if (jSONObject.containsKey(StatisticRecord.ET_CP)) {
                    bthVar.b(jSONObject.getIntValue(StatisticRecord.ET_CP));
                }
                if (bthVar instanceof btj) {
                    btj btjVar = (btj) bthVar;
                    if (jSONObject.containsKey("scp")) {
                        btjVar.e = jSONObject.getIntValue("scp");
                    }
                    if (jSONObject.containsKey("fcp")) {
                        btjVar.f = jSONObject.getIntValue("fcp");
                    }
                    return btjVar;
                } else if (!(bthVar instanceof btl)) {
                    return bthVar;
                } else {
                    btl btlVar = (btl) bthVar;
                    if (!jSONObject.containsKey("detail")) {
                        return bthVar;
                    }
                    btlVar.e = jSONObject.getIntValue("detail");
                    return bthVar;
                }
            } catch (Throwable unused) {
                apr.e("new AppMonitorConfig error", new Object[0]);
                return bthVar;
            }
        } catch (Throwable unused2) {
            bthVar = null;
        }
    }

    private bth a(List<bth> list) {
        bth bthVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bth) ipChange.ipc$dispatch("fa59f377", new Object[]{this, list});
        }
        int size = list.size();
        int i = 0;
        while (i < size && !"event_type".equalsIgnoreCase(list.get(i).b)) {
            i++;
        }
        if (i < size) {
            bthVar = list.remove(i);
            apr.a("remove root element", new Object[0]);
        } else {
            apr.a("cannot found the root element", new Object[0]);
            bthVar = null;
        }
        if (bthVar == null) {
            return null;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bth bthVar2 = list.get(i2);
            if (StringUtils.isEmpty(bthVar2.f26128a)) {
                bthVar.a(bthVar2.b, bthVar2);
            } else {
                bthVar.b(bthVar2.b).a(bthVar2.f26128a, bthVar2);
            }
        }
        return bthVar;
    }

    @Override // com.alibaba.analytics.core.config.n
    public String[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("11a28f78", new Object[]{this}) : d;
    }

    @Override // com.alibaba.analytics.core.config.n
    public void a(String str, Map<String, String> map) {
        bth newInstance;
        apr.b("", "namespace", str, "config:", map);
        if (aqc.d(str) || map == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        EventType eventTypeByNameSpace = EventType.getEventTypeByNameSpace(str);
        Class cls = eventTypeByNameSpace.getCls();
        try {
            if (map.containsKey("event_type")) {
                newInstance = a(cls, JSON.parseObject(map.get("event_type")));
                map.remove("event_type");
            } else {
                try {
                    newInstance = cls.newInstance();
                    if (newInstance instanceof btj) {
                        btj btjVar = (btj) newInstance;
                        btjVar.e = eventTypeByNameSpace.getDefaultSampling();
                        btjVar.f = eventTypeByNameSpace.getDefaultSampling();
                    } else {
                        newInstance.b(eventTypeByNameSpace.getDefaultSampling());
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            newInstance.b = "event_type";
            for (String str2 : map.keySet()) {
                JSONObject parseObject = JSON.parseObject(map.get(str2));
                if (parseObject != null) {
                    bth a2 = a(cls, parseObject);
                    a2.b = str2;
                    JSONObject jSONObject = parseObject.getJSONObject("mps");
                    if (jSONObject != null) {
                        for (String str3 : jSONObject.keySet()) {
                            bth a3 = a(cls, jSONObject.getJSONObject(str3));
                            a3.b = str2;
                            a3.f26128a = str3;
                            a2.a(str3, a3);
                            arrayList.add(a3);
                        }
                    }
                    newInstance.a(str2, a2);
                    arrayList.add(a2);
                }
            }
            arrayList.add(newInstance);
            this.f26129a.put(eventTypeByNameSpace, newInstance);
            aob.a().G().c((Class<? extends aof>) newInstance.getClass());
            aob.a().G().a(arrayList);
        } catch (Throwable th) {
            apr.e("", "parse config error", th);
        }
    }

    public boolean b(EventType eventType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a07c18e6", new Object[]{this, eventType, str, str2})).booleanValue();
        }
        if (c(eventType, str, str2)) {
            return true;
        }
        bth bthVar = this.f26129a.get(eventType);
        if (bthVar == null) {
            return false;
        }
        return bthVar.a(str, str2);
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        bth bthVar = this.f26129a.get(EventType.STAT);
        if (bthVar != null) {
            return ((btl) bthVar).b(str, str2);
        }
        return false;
    }

    private boolean c(EventType eventType, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("80f56ee7", new Object[]{this, eventType, str, str2})).booleanValue() : eventType != null && eventType == EventType.COUNTER && aou.module.equalsIgnoreCase(str) && (aou.UPLOAD_TRAFFIC_OFFLINE.equalsIgnoreCase(str2) || aou.TNET_REQUEST_SEND_OFFLINE.equalsIgnoreCase(str2));
    }
}
