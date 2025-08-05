package com.ut.mini.behavior.expression;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.data.Data;
import com.ut.mini.behavior.data.LogicalType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, com.ut.mini.behavior.expression.a> f24092a;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static d f24093a;

        static {
            kge.a(1762314170);
            f24093a = new d();
        }

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("d6e0caa5", new Object[0]) : f24093a;
        }
    }

    static {
        kge.a(1849937127);
    }

    private d() {
        this.f24092a = a();
    }

    public static d getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("84510ccf", new Object[0]) : a.a();
    }

    private Map<String, com.ut.mini.behavior.expression.a> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        c cVar = new c();
        hashMap.put(cVar.a(), cVar);
        m mVar = new m();
        hashMap.put(mVar.a(), mVar);
        f fVar = new f();
        hashMap.put(fVar.a(), fVar);
        g gVar = new g();
        hashMap.put(gVar.a(), gVar);
        i iVar = new i();
        hashMap.put(iVar.a(), iVar);
        j jVar = new j();
        hashMap.put(jVar.a(), jVar);
        n nVar = new n();
        hashMap.put(nVar.a(), nVar);
        h hVar = new h();
        hashMap.put(hVar.a(), hVar);
        l lVar = new l();
        hashMap.put(lVar.a(), lVar);
        b bVar = new b();
        hashMap.put(bVar.a(), bVar);
        k kVar = new k();
        hashMap.put(kVar.a(), kVar);
        return hashMap;
    }

    private boolean a(Data data, Map<String, String> map) {
        com.ut.mini.behavior.expression.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("270d7fba", new Object[]{this, data, map})).booleanValue();
        }
        if (data != null && map != null && (aVar = this.f24092a.get(data.operator)) != null) {
            return aVar.a(map.get(com.ut.mini.behavior.data.a.getInstance().getDataKey(data.key)), data.value);
        }
        return false;
    }

    public boolean evaluateData(Data data, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b78e8f8", new Object[]{this, data, map})).booleanValue();
        }
        if (data == null || map == null) {
            return false;
        }
        List<Data> list = data.dataList;
        if (list != null) {
            String str = data.operator;
            if (str == null) {
                str = LogicalType.AND.getValue();
            }
            if (str.equalsIgnoreCase(LogicalType.AND.getValue())) {
                for (Data data2 : list) {
                    if (!evaluateData(data2, map)) {
                        return false;
                    }
                }
                return true;
            }
            if (str.equalsIgnoreCase(LogicalType.OR.getValue())) {
                for (Data data3 : list) {
                    if (evaluateData(data3, map)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return a(data, map);
    }

    private boolean a(Data data, com.ut.mini.h hVar) {
        com.ut.mini.behavior.expression.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58aa2be4", new Object[]{this, data, hVar})).booleanValue();
        }
        if (data != null && hVar != null && (aVar = this.f24092a.get(data.operator)) != null) {
            return aVar.a(hVar.get(com.ut.mini.behavior.data.a.getInstance().getDataKey(data.key)), data.value);
        }
        return false;
    }

    public boolean evaluateData(Data data, com.ut.mini.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d159522", new Object[]{this, data, hVar})).booleanValue();
        }
        if (data == null || hVar == null) {
            return false;
        }
        List<Data> list = data.dataList;
        if (list != null) {
            String str = data.operator;
            if (str == null) {
                str = LogicalType.AND.getValue();
            }
            if (str.equalsIgnoreCase(LogicalType.AND.getValue())) {
                for (Data data2 : list) {
                    if (!evaluateData(data2, hVar)) {
                        return false;
                    }
                }
                return true;
            }
            if (str.equalsIgnoreCase(LogicalType.OR.getValue())) {
                for (Data data3 : list) {
                    if (evaluateData(data3, hVar)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return a(data, hVar);
    }
}
