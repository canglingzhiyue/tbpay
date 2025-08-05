package com.taobao.mytaobao.footprint;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsFootprintAbility;
import com.taobao.android.abilityidl.ability.FootprintRecord;
import com.taobao.android.abilityidl.ability.FootprintResult;
import com.taobao.android.abilityidl.ability.gb;
import com.taobao.android.abilityidl.ability.ge;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.als;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/taobao/mytaobao/footprint/FootprintAbility;", "Lcom/taobao/android/abilityidl/ability/AbsFootprintAbility;", "()V", "requestFootprintList", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "Lcom/taobao/android/abilityidl/ability/FootprintParam;", "callback", "Lcom/taobao/android/abilityidl/ability/IFootprintEvent;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class FootprintAbility extends AbsFootprintAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1021383837);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFootprintAbility
    public void requestFootprintList(als context, gb params, ge callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40cdc8e", new Object[]{this, context, params, callback});
            return;
        }
        q.c(context, "context");
        q.c(params, "params");
        q.c(callback, "callback");
        if (q.a((Object) params.f8882a, (Object) "SHOP")) {
            LinkedHashMap<String, Long> c = a.INSTANCE.c();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Long> entry : c.entrySet()) {
                FootprintRecord footprintRecord = new FootprintRecord();
                footprintRecord.id = entry.getKey();
                footprintRecord.timestamp = entry.getValue().longValue();
                arrayList.add(footprintRecord);
            }
            FootprintResult footprintResult = new FootprintResult();
            footprintResult.records = arrayList;
            callback.a(footprintResult);
            TLog.loge("FootprintAbility", "get shop footprint list: " + arrayList.size());
        } else if (q.a((Object) params.f8882a, (Object) "GOODS")) {
            LinkedHashMap<String, Long> b = a.INSTANCE.b();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, Long> entry2 : b.entrySet()) {
                FootprintRecord footprintRecord2 = new FootprintRecord();
                footprintRecord2.id = entry2.getKey();
                footprintRecord2.timestamp = entry2.getValue().longValue();
                arrayList2.add(footprintRecord2);
            }
            FootprintResult footprintResult2 = new FootprintResult();
            footprintResult2.records = arrayList2;
            callback.a(footprintResult2);
            TLog.loge("FootprintAbility", "get goods footprint list: " + arrayList2.size());
        }
    }
}
