package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionActionType;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class bad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(950477065);
    }

    public static void a(s sVar, AURARenderComponent aURARenderComponent, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871dc9bc", new Object[]{sVar, aURARenderComponent, str, str2, str3, str4, jSONObject});
        } else if (sVar == null) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionUT", "instance is null");
        } else {
            d dVar = new d();
            dVar.a(aURARenderComponent);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("eventId", (Object) "19997");
            jSONObject2.put("page", (Object) str);
            jSONObject2.put("arg1", (Object) str2);
            jSONObject2.put("arg2", (Object) str3);
            jSONObject2.put("arg3", (Object) str4);
            jSONObject2.put("args", (Object) jSONObject);
            dVar.a(jSONObject2);
            c.a(sVar, "userTrack", dVar);
        }
    }

    public static void a(s sVar, UserMotionConfig userMotionConfig, AURARenderComponent aURARenderComponent, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2545d98d", new Object[]{sVar, userMotionConfig, aURARenderComponent, jSONObject, new Integer(i)});
        } else if (sVar == null) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionComponentAppear", "instance is null");
        } else if (!UserMotionConfig.isValid(userMotionConfig)) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionComponentAppear", "invalid userMotionConfig");
        } else if (!a(aURARenderComponent)) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionComponentAppear", "invalid component");
        } else {
            String str = userMotionConfig.page + "_Appear-" + b(aURARenderComponent);
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && !jSONObject.isEmpty()) {
                jSONObject2.putAll(jSONObject);
            }
            jSONObject2.put("uniqueId", (Object) userMotionConfig.uid);
            jSONObject2.put("from", (Object) String.valueOf(i));
            jSONObject2.put("componentKey", (Object) aURARenderComponent.key);
            a(sVar, aURARenderComponent, userMotionConfig.page, str, UserMotionActionType.COMPONENT_APPEAR, "", jSONObject2);
        }
    }

    public static void a(s sVar, UserMotionConfig userMotionConfig, AURARenderComponent aURARenderComponent, JSONObject jSONObject, int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb440e6e", new Object[]{sVar, userMotionConfig, aURARenderComponent, jSONObject, new Integer(i), new Integer(i2), new Long(j)});
        } else if (sVar == null) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionComponentDisappear", "instance is null");
        } else if (!UserMotionConfig.isValid(userMotionConfig)) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionComponentDisappear", "invalid userMotionConfig");
        } else if (!a(aURARenderComponent)) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionComponentDisappear", "invalid component");
        } else {
            String str = userMotionConfig.page + "_DisAppear-" + b(aURARenderComponent);
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && !jSONObject.isEmpty()) {
                jSONObject2.putAll(jSONObject);
            }
            jSONObject2.put("uniqueId", (Object) userMotionConfig.uid);
            jSONObject2.put("from", (Object) String.valueOf(i));
            jSONObject2.put("to", (Object) String.valueOf(i2));
            jSONObject2.put("stayTime", (Object) String.valueOf(j));
            jSONObject2.put("componentKey", (Object) aURARenderComponent.key);
            a(sVar, aURARenderComponent, userMotionConfig.page, str, UserMotionActionType.COMPONENT_DISAPPEAR, String.valueOf(j), jSONObject2);
        }
    }

    public static void a(s sVar, UserMotionConfig userMotionConfig, AURARenderComponent aURARenderComponent, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc6880", new Object[]{sVar, userMotionConfig, aURARenderComponent, jSONObject, str});
        } else if (sVar == null) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionComponentClick", "instance is null");
        } else if (!UserMotionConfig.isValid(userMotionConfig)) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionComponentClick", "invalid userMotionConfig");
        } else if (!a(aURARenderComponent)) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionComponentClick", "invalid component");
        } else {
            String str2 = userMotionConfig.page + "_Click-" + b(aURARenderComponent);
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && !jSONObject.isEmpty()) {
                jSONObject2.putAll(jSONObject);
            }
            jSONObject2.put("uniqueId", (Object) userMotionConfig.uid);
            jSONObject2.put("eventId", (Object) (str == null ? "" : str));
            jSONObject2.put("componentKey", (Object) aURARenderComponent.key);
            a(sVar, aURARenderComponent, userMotionConfig.page, str2, UserMotionActionType.COMPONENT_CLICK, str == null ? "" : str, jSONObject2);
        }
    }

    public static void a(s sVar, UserMotionConfig userMotionConfig, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863e8f4", new Object[]{sVar, userMotionConfig, jSONObject, new Integer(i)});
        } else if (sVar == null) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionScroll", "instance is null");
        } else if (!UserMotionConfig.isValid(userMotionConfig)) {
            arc.a().c("UserMotionUTUtils", "commitUserMotionScroll", "invalid userMotionConfig");
        } else {
            String str = userMotionConfig.page + "_Scroll";
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && !jSONObject.isEmpty()) {
                jSONObject2.putAll(jSONObject);
            }
            jSONObject2.put("uniqueId", (Object) userMotionConfig.uid);
            jSONObject2.put("direction", (Object) Integer.valueOf(i));
            a(sVar, (AURARenderComponent) null, userMotionConfig.page, str, UserMotionActionType.COMPONENT_SCROLL, String.valueOf(i), jSONObject2);
        }
    }

    private static boolean a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent == null || StringUtils.isEmpty(aURARenderComponent.key) || StringUtils.isEmpty(b(aURARenderComponent))) {
            return false;
        }
        if (aURARenderComponent.data != null && aURARenderComponent.data.fields != null) {
            Map<String, Object> map = aURARenderComponent.data.fields;
            if (map.containsKey("asyncStatus")) {
                return "success".equals(map.get("asyncStatus"));
            }
        }
        return true;
    }

    private static String b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9aaefeae", new Object[]{aURARenderComponent}) : (aURARenderComponent == null || aURARenderComponent.mirror == null || aURARenderComponent.mirror.data() == null || aURARenderComponent.mirror.data().getComponent() == null || aURARenderComponent.mirror.data().getComponent().getTag() == null) ? "" : aURARenderComponent.mirror.data().getComponent().getTag();
    }
}
