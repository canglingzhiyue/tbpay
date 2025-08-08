package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.rule.b;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class dti extends dtj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(282871451);
    }

    public static /* synthetic */ Object ipc$super(dti dtiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dtj
    public ExecuteResult a(JSONObject jSONObject, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("bb9ccd2a", new Object[]{this, jSONObject, alnVar});
        }
        JSONObject e = e();
        if (e == null) {
            arc.a().a("fields is null");
            return null;
        }
        String string = e.getString("id");
        String a2 = a(e, string);
        if (StringUtils.isEmpty(a2)) {
            arc.a().a("循环导航，未找到目标组件");
            alnVar.a(new FinishResult(new HashMap(jSONObject), "failure"));
        } else {
            HashMap hashMap = new HashMap(jSONObject);
            hashMap.put("result", a2);
            alnVar.a(new FinishResult(hashMap, "success"));
            a(string, a2);
        }
        return new FinishResult();
    }

    private JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        Object[] a2 = a();
        if (a2 == null) {
            return null;
        }
        Object obj = a2[1];
        if (!(obj instanceof JSONObject)) {
            arc.a().a("fields is null");
            return null;
        }
        return (JSONObject) obj;
    }

    private String a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731d6f8e", new Object[]{this, jSONObject, str});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("componentKeys");
        if (bau.a(jSONArray)) {
            return null;
        }
        JSONObject a2 = a(b());
        if (a2 != null) {
            return (String) a(jSONArray, a2.getString(str));
        }
        return (String) a(jSONArray, (String) null);
    }

    private JSONObject a(AURARenderComponent aURARenderComponent) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e41c2f3", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (map = aURARenderComponentData.fields) == null) {
            return null;
        }
        Object obj = map.get("curLocatorInfo");
        if (!(obj instanceof String)) {
            return null;
        }
        return bba.a((String) obj);
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            JSONObject a2 = a(b());
            if (a2 == null) {
                a2 = new JSONObject();
            }
            a2.put(str, (Object) str2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("curLocatorInfo", (Object) a2.toJSONString());
            a(c().b(), b(), jSONObject);
        }
    }

    private void a(s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71268e4", new Object[]{this, sVar, aURARenderComponent, jSONObject});
            return;
        }
        a aVar = new a();
        aVar.f2839a = RuleType.PROPS_WRITE_BACK;
        aVar.b = aURARenderComponent.key;
        Map<String, Object> map = aURARenderComponent.data == null ? null : aURARenderComponent.data.fields;
        aVar.d = new b(map, aURARenderComponent.data == null ? null : aURARenderComponent.data.events, null);
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
        hashMap.putAll(jSONObject);
        aVar.c = new b(hashMap, null, null);
        sVar.a("aura.workflow.adjustRules", new UMFRuleIO(Collections.singletonList(aVar)), null);
    }

    private Object a(List<Object> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b824aaf", new Object[]{this, list, str});
        }
        if (StringUtils.isEmpty(str)) {
            return list.get(0);
        }
        int size = list.size();
        for (int i = 0; size > i; i++) {
            if (str.equals(list.get(i))) {
                int i2 = i + 1;
                return size > i2 ? list.get(i2) : list.get(0);
            }
        }
        return list.get(0);
    }
}
