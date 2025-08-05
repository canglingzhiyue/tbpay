package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dqy extends dqu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "python";

    static {
        kge.a(-695766196);
    }

    @Override // tb.dqu
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.dqu
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        }
    }

    public dqy(BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        super(bHRTaskConfigBase, bHREvent);
    }

    public Map<String, Object> C_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a41afff8", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (this.b != null) {
            hashMap.put("triggerEvent", this.b.toJsonObject().toJSONString());
        }
        hashMap.put(JarvisConstant.KEY_JARVIS_TRIGGER, "BehaviR");
        hashMap.put(OConstant.DIMEN_CONFIG_NAME, this.c != null ? this.c.getConfigName() : "");
        hashMap.put("config", this.c != null ? this.c.getOriginal().toJSONString() : new JSONObject());
        return hashMap;
    }
}
