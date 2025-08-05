package com.taobao.android.abilitykit.ability;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dmp;
import tb.kge;

/* loaded from: classes4.dex */
public final class i extends dlg<dle> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BATCHCHAINSTORAGESET = "-3464126933797309446";
    public static final a Companion;

    static {
        kge.a(-1806510777);
        Companion = new a(null);
    }

    @Override // tb.dlg
    public dkx<?> a(dlh abilityData, dle akCtx, dll akiAbilityCallback) {
        Set<Map.Entry<String, Object>> entrySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, abilityData, akCtx, akiAbilityCallback});
        }
        kotlin.jvm.internal.q.d(abilityData, "abilityData");
        kotlin.jvm.internal.q.d(akCtx, "akCtx");
        kotlin.jvm.internal.q.d(akiAbilityCallback, "akiAbilityCallback");
        JSONObject jSONObject = abilityData.c().getJSONObject("pairs");
        if (jSONObject != null && (entrySet = jSONObject.entrySet()) != null) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                kotlin.jvm.internal.q.b(key, "it.key");
                dmp.a((String) key, akCtx.d(), entry.getValue());
            }
        }
        return new dla();
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-410381361);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
