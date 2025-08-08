package com.taobao.detail.rate.vivid.ability;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.aln;
import tb.als;
import tb.dkv;
import tb.dkw;
import tb.dla;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J<\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0017"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/DataProcessAbility;", "Lcom/alibaba/ability/IAbility;", "()V", "createErrorResult", "Lcom/taobao/android/abilitykit/AKAbilityErrorResult;", "errorId", "", "errorMsg", "", "interrupted", "", com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, "Lcom/alibaba/ability/result/ExecuteResult;", "api", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "", "", "Lcom/alibaba/ability/AbilityData;", "callback", "Lcom/alibaba/ability/callback/AbilityCallback;", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class a implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_DATA_SPLIT = "split";
    public static final C0654a Companion = new C0654a(null);
    public static final long DATA_PROCESS_ENGINE = -6435166934211554155L;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/DataProcessAbility$Companion;", "", "()V", "ABILITY_ERROR_DATA_PROCESS", "", "API_DATA_SPLIT", "", "DATA_PROCESS_ENGINE", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.detail.rate.vivid.ability.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0654a {
        private C0654a() {
        }

        public /* synthetic */ C0654a(o oVar) {
            this();
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (!q.a((Object) api, (Object) "split")) {
            return new ErrorResult("501", (String) null, (Map) null, 6, (o) null);
        }
        List<Object> b = com.alibaba.ability.e.b(params, "dataSourceArray");
        if (!(b instanceof JSONArray)) {
            return h.a.a(com.taobao.android.abilitykit.ability.h.Companion, a(-10010, "dataSourceArray is null or is not jsonArray", true), null, 2, null);
        }
        List<Object> b2 = com.alibaba.ability.e.b(params, "splitRules");
        if (!(b2 instanceof JSONArray)) {
            return h.a.a(com.taobao.android.abilitykit.ability.h.Companion, a(-10010, "splitRule is null or is not jsonArray", true), null, 2, null);
        }
        int size = b.size();
        JSONArray jSONArray = new JSONArray(b2.size() * size);
        for (int i = 0; i < size; i++) {
            Object obj = b.get(i);
            if (obj instanceof JSONObject) {
                Iterator<Object> it = ((JSONArray) b2).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) next;
                        if (!StringUtils.isEmpty(jSONObject.getString(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.VIEW_TYPE))) {
                            Boolean bool = jSONObject.getBoolean("isSplit");
                            if (bool == null) {
                                bool = true;
                            }
                            if (bool.booleanValue()) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.putAll((Map) obj);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.putAll((Map) next);
                                jSONObject3.put((JSONObject) "index", (String) Integer.valueOf(i));
                                jSONObject2.put((JSONObject) "__splitRule__", (String) jSONObject3);
                                jSONArray.add(jSONObject2);
                            }
                        }
                    }
                }
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "result", (String) jSONArray);
        return h.a.a(com.taobao.android.abilitykit.ability.h.Companion, new dla(jSONObject4), null, 2, null);
    }

    private final dkw a(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkw) ipChange.ipc$dispatch("1e545a07", new Object[]{this, new Integer(i), str, new Boolean(z)}) : new dkw(new dkv(i, str), z);
    }
}
