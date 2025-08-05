package com.alibaba.android.umf.node.service.data.rule;

import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.aqq;
import tb.bqi;
import tb.bqk;
import tb.bql;
import tb.bqm;
import tb.bqn;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, a> f2840a;

    static {
        kge.a(783378491);
        HashMap<String, a> hashMap = new HashMap<>();
        f2840a = hashMap;
        hashMap.put(RuleType.GROUP_SELECT, new bqk());
        f2840a.put(RuleType.PROPS_WRITE_BACK, new bqm());
        f2840a.put(RuleType.SWITCH_SELECT, new bqn());
        f2840a.put("kvmap", new bql());
    }

    public static List<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[0]) : new ArrayList(f2840a.keySet());
    }

    public UltronDeltaProtocol a(com.alibaba.android.umf.datamodel.service.rule.a aVar, aqq<AURAParseIO> aqqVar, bqi bqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("320557ed", new Object[]{this, aVar, aqqVar, bqiVar});
        }
        a aVar2 = f2840a.get(aVar.f2839a);
        if (aVar2 != null) {
            return aVar2.a(aVar, aqqVar, bqiVar);
        }
        if (aqqVar == null) {
            return null;
        }
        com.alibaba.android.aura.b bVar = new com.alibaba.android.aura.b(1, "AURARulesServiceDomain", "-2000_UNRECOGNIZED_NAME", "不识别的规则name");
        HashMap hashMap = new HashMap();
        hashMap.put("name", aVar.f2839a);
        bVar.a(hashMap);
        aqqVar.a(bVar);
        return null;
    }
}
