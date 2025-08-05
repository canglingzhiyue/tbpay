package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.rule.AURALocalAdjustIO;
import com.alibaba.android.aura.datamodel.rule.a;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bbd;

@AURAExtensionImpl(code = "aura.impl.rule.localAdjust.writeShareContext")
/* loaded from: classes2.dex */
public final class hvq extends ava {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1205769742);
    }

    public static /* synthetic */ Object ipc$super(hvq hvqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.avb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "writeShareContextHandler";
    }

    @Override // tb.ava
    public Component a(AURALocalAdjustIO aURALocalAdjustIO) {
        JSONObject c;
        JSONObject jSONObject;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("da37e4fc", new Object[]{this, aURALocalAdjustIO});
        }
        a localAdjustModel = aURALocalAdjustIO.getLocalAdjustModel();
        Map<String, Object> map = localAdjustModel.b().f2137a;
        if (bau.a(map) || (c = localAdjustModel.c()) == null || (jSONObject = c.getJSONObject("fields")) == null) {
            return null;
        }
        String string = c.getString("shareContextPath");
        if (TextUtils.isEmpty(string) || (a2 = a()) == null) {
            return null;
        }
        JSONObject jSONObject2 = a2.getJSONObject(string);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            a2.put(string, (Object) jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("fields", (Object) map);
        a(jSONObject2, jSONObject, jSONObject3);
        Component component = new Component();
        component.setFields(map);
        return component;
    }

    private void a(JSONObject jSONObject, Map<String, Object> map, Map<String, Object> map2) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d15f02e8", new Object[]{this, jSONObject, map, map2});
            return;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if ((obj instanceof String) && (a2 = a(map2, (String) obj)) != null) {
                jSONObject.put(str, a2);
            }
        }
    }

    private Object a(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1a438b6b", new Object[]{this, map, str});
        }
        String a2 = a(str);
        return (TextUtils.isEmpty(a2) || TextUtils.equals(a2, "*")) ? map : bbd.b.a(a2.split("\\."), map);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str.startsWith("$.")) {
            str = str.substring(2);
        }
        if (str.startsWith("${")) {
            str = str.substring(2);
        }
        return str.endsWith(riy.BLOCK_END_STR) ? str.substring(0, str.length() - 1) : str;
    }
}
