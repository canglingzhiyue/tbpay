package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.newmodel.a;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.Map;

/* loaded from: classes6.dex */
public class joo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1867381374);
    }

    public static JSONObject a(DMComponent dMComponent, JSONObject jSONObject, IDMComponent iDMComponent, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c753f5cc", new Object[]{dMComponent, jSONObject, iDMComponent, jSONObject2});
        }
        if (iDMComponent == null) {
            return jSONObject2;
        }
        try {
            String key = iDMComponent.getKey();
            if (StringUtils.isEmpty(key)) {
                return jSONObject2;
            }
            int indexOf = key.indexOf("_" + iDMComponent.getId());
            if (indexOf <= 0) {
                return jSONObject2;
            }
            String substring = key.substring(0, indexOf);
            if (StringUtils.isEmpty(substring) || (jSONObject3 = jSONObject.getJSONObject(substring)) == null) {
                return jSONObject2;
            }
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key2 = entry.getKey();
                if (jSONObject3.get(key2) == null) {
                    jSONObject4.put(key2, entry.getValue());
                }
            }
            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                Object a2 = a(jSONObject2, entry2);
                String key3 = entry2.getKey();
                if ("events".equals(key3)) {
                    a2 = a(dMComponent, iDMComponent, jSONObject2, a2);
                }
                if (a2 != null) {
                    jSONObject4.put(key3, a2);
                }
            }
            return jSONObject4;
        } catch (Exception e) {
            UnifyLog.d("AliUltronDataProtocolCropper#exception", e.getMessage());
            return jSONObject2;
        }
    }

    private static Object a(DMComponent dMComponent, IDMComponent iDMComponent, JSONObject jSONObject, Object obj) {
        String str;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cb84cda", new Object[]{dMComponent, iDMComponent, jSONObject, obj});
        }
        if (dMComponent == null || !dMComponent.getKey().equals(iDMComponent.getKey())) {
            return obj;
        }
        String triggerEvent = dMComponent.getTriggerEvent();
        if (StringUtils.isEmpty(triggerEvent)) {
            return obj;
        }
        String[] split = triggerEvent.split("\\.");
        if (split != null && split.length > 0) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events");
            if (jSONObject2 == null || (obj2 = jSONObject2.get((str = split[0]))) == null) {
                return obj;
            }
            if (obj == null) {
                obj = new JSONObject();
            }
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).put(str, obj2);
            }
        }
        return obj;
    }

    private static Object a(JSONObject jSONObject, Map.Entry<String, Object> entry) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("16b62143", new Object[]{jSONObject, entry});
        }
        Object value = entry.getValue();
        if (!(value instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject3 = (JSONObject) value;
        if (jSONObject3.getBooleanValue(a.MATCH_IGNORE) || (jSONObject2 = jSONObject3.getJSONObject("template")) == null) {
            return null;
        }
        return jpy.a(jSONObject, JSONObject.parseObject(jSONObject2.toJSONString()));
    }
}
