package com.alibaba.android.umf.node.service.data.rule;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.Hierarchy;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.aqq;
import tb.bqi;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f2841a = new b();

    static {
        kge.a(-2146227893);
    }

    public UltronDeltaProtocol a(List<com.alibaba.android.umf.datamodel.service.rule.a> list, aqq<AURAParseIO> aqqVar, bqi bqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("76a29c89", new Object[]{this, list, aqqVar, bqiVar});
        }
        UltronDeltaProtocol ultronDeltaProtocol = null;
        HashMap hashMap = new HashMap();
        for (com.alibaba.android.umf.datamodel.service.rule.a aVar : list) {
            if (!StringUtils.isEmpty(aVar.b)) {
                if (hashMap.containsKey(aVar.b)) {
                    aVar.d = hashMap.get(aVar.b);
                }
                UltronDeltaProtocol a2 = this.f2841a.a(aVar, aqqVar, bqiVar);
                a(hashMap, a2);
                if (ultronDeltaProtocol == null) {
                    ultronDeltaProtocol = a2;
                } else {
                    a(ultronDeltaProtocol, a2);
                }
            }
        }
        return ultronDeltaProtocol;
    }

    private void a(UltronDeltaProtocol ultronDeltaProtocol, UltronDeltaProtocol ultronDeltaProtocol2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3543f608", new Object[]{this, ultronDeltaProtocol, ultronDeltaProtocol2});
        } else if (ultronDeltaProtocol2 != null && ultronDeltaProtocol2.getHierarchy() != null && ultronDeltaProtocol2.getHierarchy().getDelta() != null) {
            if (ultronDeltaProtocol.getHierarchy() == null) {
                ultronDeltaProtocol.hierarchy = new Hierarchy();
                ultronDeltaProtocol.getHierarchy().delta = new ArrayList();
            }
            for (Delta delta : ultronDeltaProtocol2.getHierarchy().getDelta()) {
                Iterator<Delta> it = ultronDeltaProtocol.getHierarchy().getDelta().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (StringUtils.equals(delta.getTarget(), it.next().getTarget())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    ultronDeltaProtocol.getHierarchy().getDelta().add(delta);
                }
            }
            if (ultronDeltaProtocol2.getData() == null) {
                return;
            }
            if (ultronDeltaProtocol.getData() == null) {
                ultronDeltaProtocol.data = new HashMap();
            }
            ultronDeltaProtocol.getData().putAll(ultronDeltaProtocol2.getData());
        }
    }

    private Map a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map}) : map == null ? new HashMap() : map;
    }

    private void a(Map<String, com.alibaba.android.aura.datamodel.rule.b> map, UltronDeltaProtocol ultronDeltaProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dd8dfe", new Object[]{this, map, ultronDeltaProtocol});
        } else if (ultronDeltaProtocol != null && ultronDeltaProtocol.getData() != null) {
            for (Map.Entry<String, Component> entry : ultronDeltaProtocol.getData().entrySet()) {
                com.alibaba.android.aura.datamodel.rule.b a2 = com.alibaba.android.aura.datamodel.rule.b.a();
                Component value = entry.getValue();
                a2.f2137a = a(value.getFields());
                a2.c = a(value.getLocalFields());
                a2.b = a(value.getEvents());
                map.put(entry.getKey(), a2);
            }
        }
    }
}
