package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.dynamicFeature.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class aar implements aap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aar f25191a;
    private aaq b = aan.a();
    private ConcurrentHashMap<a, CopyOnWriteArrayList<aas>> c = new ConcurrentHashMap<>();

    static {
        kge.a(903519228);
        kge.a(-431364923);
    }

    private aar() {
    }

    public static aar a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aar) ipChange.ipc$dispatch("f02370c", new Object[0]);
        }
        if (f25191a == null) {
            synchronized (aar.class) {
                if (f25191a == null) {
                    f25191a = new aar();
                }
            }
        }
        return f25191a;
    }

    public boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5aac472f", new Object[]{this, aVar})).booleanValue() : this.b.a(aVar);
    }

    public int b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74c7c5bd", new Object[]{this, aVar})).intValue();
        }
        int b = this.b.b(aVar);
        if (b == 4) {
            abb.a(aVar);
            aba.a(aVar);
        } else {
            abb.b(aVar);
            abc.a(aVar);
            aba.b(aVar);
        }
        return b;
    }

    public String c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c9cef57", new Object[]{this, aVar}) : this.b.c(aVar);
    }

    public void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8fec308", new Object[]{this, aVar});
            return;
        }
        abb.d(aVar);
        aba.d(aVar);
        this.b.a(this);
        this.b.d(aVar);
    }

    public void a(a aVar, aas aasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8d9968", new Object[]{this, aVar, aasVar});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureService.registerInstallListener:bundleInfo is invalid");
        } else if (aasVar == null) {
            arc.a().b("AURADynamicFeatureService.registerInstallListener:listener is null");
        } else {
            Map.Entry<a, CopyOnWriteArrayList<aas>> a2 = a(aVar.f2138a);
            if (a2 == null) {
                CopyOnWriteArrayList<aas> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList.add(aasVar);
                this.c.put(aVar, copyOnWriteArrayList);
                return;
            }
            CopyOnWriteArrayList<aas> value = a2.getValue();
            if (value == null) {
                value = new CopyOnWriteArrayList<>();
                this.c.put(a2.getKey(), value);
            }
            value.add(aasVar);
        }
    }

    public void b(a aVar, aas aasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cc0907", new Object[]{this, aVar, aasVar});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureService.unregisterInstallListener:bundleInfo is invalid");
        } else if (aasVar == null) {
            arc.a().b("AURADynamicFeatureService.unregisterInstallListener:listener is null");
        } else {
            Map.Entry<a, CopyOnWriteArrayList<aas>> a2 = a(aVar.f2138a);
            if (a2 == null || a2.getValue() == null) {
                arc.a().b("AURADynamicFeatureService.unregisterInstallListener:no target listener");
            } else {
                a2.getValue().remove(aasVar);
            }
        }
    }

    @Override // tb.aap
    public void a(List<String> list) {
        Map.Entry<a, CopyOnWriteArrayList<aas>> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && (a2 = a(str)) != null) {
                a key = a2.getKey();
                abb.c(key);
                abb.e(key);
                aba.c(key);
                aba.e(key);
                CopyOnWriteArrayList<aas> value = a2.getValue();
                if (value != null) {
                    for (aas aasVar : new ArrayList(value)) {
                        if (aasVar != null) {
                            aasVar.a(key);
                        }
                    }
                }
            }
        }
    }

    @Override // tb.aap
    public void a(List<String> list, String str, String str2) {
        Map.Entry<a, CopyOnWriteArrayList<aas>> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2065ed", new Object[]{this, list, str, str2});
            return;
        }
        for (String str3 : list) {
            if (!TextUtils.isEmpty(str3) && (a2 = a(str3)) != null) {
                a key = a2.getKey();
                abb.a(key, str, str2);
                abc.a(key, str, str2);
                aba.a(key, str, str2);
                CopyOnWriteArrayList<aas> value = a2.getValue();
                if (value != null) {
                    for (aas aasVar : new ArrayList(value)) {
                        if (aasVar != null) {
                            aasVar.a(key, str, str2);
                        }
                    }
                }
            }
        }
    }

    private Map.Entry<a, CopyOnWriteArrayList<aas>> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map.Entry) ipChange.ipc$dispatch("4ac2b4f9", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Map.Entry<a, CopyOnWriteArrayList<aas>> entry : this.c.entrySet()) {
            a key = entry.getKey();
            if (key != null && TextUtils.equals(key.f2138a, str)) {
                return entry;
            }
        }
        return null;
    }
}
