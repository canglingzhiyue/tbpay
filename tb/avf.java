package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.rule.AURALocalAdjustIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class avf extends avc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25628a = "LocalAdjustRule";
    private final Map<String, avb> b = new HashMap();

    static {
        kge.a(-1617314155);
    }

    public static /* synthetic */ Object ipc$super(avf avfVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.avc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : RuleType.LOCAL_ADJUST;
    }

    public void a(String str, avb avbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b1dab5", new Object[]{this, str, avbVar});
        } else if (this.b.get(str) == null) {
            this.b.put(str, avbVar);
        } else {
            baw.a("注册相同的事件");
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b.remove(str);
        }
    }

    @Override // tb.avc
    public Map<String, Component> a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef66eb32", new Object[]{this, aVar});
        }
        Map<String, Object> map = aVar.c.f2137a;
        JSONObject jSONObject = (JSONObject) bbc.a(map, "params", JSONObject.class, null);
        JSONArray jSONArray = (JSONArray) bbc.a(map, "collectors", JSONArray.class, null);
        if (bau.a(jSONArray)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.size(); i++) {
            Component a2 = a(aVar, jSONArray.getJSONObject(i), jSONObject);
            if (a2 != null) {
                hashMap.put(aVar.b, a2);
            }
        }
        return hashMap;
    }

    private Component a(a aVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("1b3507b3", new Object[]{this, aVar, jSONObject, jSONObject2});
        }
        String string = jSONObject.getString("type");
        if (StringUtils.isEmpty(string)) {
            c().a(new b(1, "AURAEventServiceDomain", "-1000_EMPTY_TYPE", "执行事件失败, eventType 为空"));
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("params");
        avb avbVar = this.b.get(string);
        if (avbVar == null) {
            return null;
        }
        return a(avbVar, a(aVar, string, jSONObject2, jSONObject3), c());
    }

    private AURALocalAdjustIO a(a aVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURALocalAdjustIO) ipChange.ipc$dispatch("fd926433", new Object[]{this, aVar, str, jSONObject, jSONObject2});
        }
        com.alibaba.android.aura.datamodel.rule.a aVar2 = new com.alibaba.android.aura.datamodel.rule.a();
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject != null) {
            jSONObject3.putAll(jSONObject);
        }
        if (jSONObject2 != null) {
            jSONObject3.putAll(jSONObject2);
        }
        aVar2.a(jSONObject3);
        aVar2.a(aVar.b);
        aVar2.a(aVar.c);
        aVar2.b(aVar.d);
        return new AURALocalAdjustIO(str, aVar2);
    }

    private Component a(avb avbVar, AURALocalAdjustIO aURALocalAdjustIO, aqq<AURAParseIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("e1a0d550", new Object[]{this, avbVar, aURALocalAdjustIO, aqqVar});
        }
        try {
            return avbVar.a(aURALocalAdjustIO, b());
        } catch (Throwable th) {
            String localAdjustType = aURALocalAdjustIO.getLocalAdjustType();
            HashMap hashMap = new HashMap();
            hashMap.put("ruleType", localAdjustType);
            b bVar = new b(1, "AURARuleServiceDomain", "-1001_EXECUTE_EXCEPTION", "执行localAdjust【" + localAdjustType + "】出错，errorMessage=" + th.getMessage());
            bVar.a(hashMap);
            aqqVar.a(bVar);
            if (!baw.a()) {
                return null;
            }
            th.printStackTrace(new PrintStream(new ByteArrayOutputStream()));
            baw.a(th);
            return null;
        }
    }
}
