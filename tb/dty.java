package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.rule.AURALocalAdjustIO;
import com.alibaba.android.aura.datamodel.rule.a;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

@AURAExtensionImpl(code = "alibuy.impl.rule.localAdjust.validateData")
/* loaded from: classes4.dex */
public final class dty extends ava {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1174241252);
    }

    public static /* synthetic */ Object ipc$super(dty dtyVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.avb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "buyValidateRuleHandle";
    }

    @Override // tb.ava
    public Component a(AURALocalAdjustIO aURALocalAdjustIO) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("da37e4fc", new Object[]{this, aURALocalAdjustIO});
        }
        a localAdjustModel = aURALocalAdjustIO.getLocalAdjustModel();
        String a3 = localAdjustModel.a();
        Map<String, Object> map = localAdjustModel.b().f2137a;
        if (bau.a(map)) {
            return null;
        }
        String str = (String) bbc.a(map, "validateState", String.class, null);
        JSONObject c = localAdjustModel.c();
        if (c == null) {
            return null;
        }
        String string = c.getString("shareContextPath");
        if (StringUtils.isEmpty(string) || (a2 = a()) == null) {
            return null;
        }
        JSONObject jSONObject = a2.getJSONObject(string);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            a2.put(string, (Object) jSONObject);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("componentKeys");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            jSONObject.put("componentKeys", (Object) jSONObject2);
        }
        jSONObject2.put(a3, (Object) str);
        jSONObject.put("state", (Object) Boolean.valueOf(a(jSONObject2)));
        Component component = new Component();
        component.fields = map;
        return component;
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        for (String str : jSONObject.keySet()) {
            if (!jSONObject.getBooleanValue(str)) {
                return false;
            }
        }
        return true;
    }
}
