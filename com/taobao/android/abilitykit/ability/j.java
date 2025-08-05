package com.taobao.android.abilitykit.ability;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.dkt;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dmp;
import tb.kge;

/* loaded from: classes4.dex */
public final class j extends dlg<dle> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BATCHENGINESTORAGESET = "4265000693395010670";
    public static final a Companion;

    static {
        kge.a(-1429375236);
        Companion = new a(null);
    }

    @Override // tb.dlg
    public dkx<?> a(dlh abilityData, dle abilityRuntimeContext, dll akiAbilityCallback) {
        Set<Map.Entry<String, Object>> entrySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, abilityData, abilityRuntimeContext, akiAbilityCallback});
        }
        kotlin.jvm.internal.q.d(abilityData, "abilityData");
        kotlin.jvm.internal.q.d(abilityRuntimeContext, "abilityRuntimeContext");
        kotlin.jvm.internal.q.d(akiAbilityCallback, "akiAbilityCallback");
        dkt e = abilityRuntimeContext.e();
        kotlin.jvm.internal.q.b(e, "abilityRuntimeContext.abilityEngine");
        JSONObject jSONObject = abilityData.c().getJSONObject("pairs");
        if (jSONObject != null && (entrySet = jSONObject.entrySet()) != null) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                kotlin.jvm.internal.q.b(key, "it.key");
                dmp.a((String) key, e.c(), entry.getValue());
            }
        }
        return new dla();
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-945694908);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
