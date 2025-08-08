package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.GatewayActionInfo;
import com.taobao.android.gateway.datastructure.a;
import com.taobao.android.gateway.datastructure.b;

/* loaded from: classes.dex */
public class gki {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f28365a;
    private JSONObject b;
    private GatewayActionInfo c;

    static {
        kge.a(1400500781);
    }

    public gki(b bVar, JSONObject jSONObject) {
        this.f28365a = bVar;
        this.b = jSONObject;
    }

    public GatewayActionInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GatewayActionInfo) ipChange.ipc$dispatch("3b376dd9", new Object[]{this});
        }
        GatewayActionInfo gatewayActionInfo = this.c;
        if (gatewayActionInfo != null) {
            return gatewayActionInfo;
        }
        JSONObject jSONObject = this.b;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("actionName");
        a a2 = a(this.b.getString(com.taobao.android.gateway.util.b.KEY_TARGET_COMPONENT));
        JSONObject jSONObject2 = new JSONObject();
        if (this.f28365a.a() != null) {
            jSONObject2.putAll(this.f28365a.a());
        }
        if (this.b.get(com.taobao.android.gateway.util.b.KEY_ACTION_PARAM) != null) {
            JSONObject parseObject = JSON.parseObject(this.b.getString(com.taobao.android.gateway.util.b.KEY_ACTION_PARAM));
            if (parseObject.containsKey("bizParam") && jSONObject2.containsKey("bizParam")) {
                if (parseObject.getJSONObject("bizParam") != null) {
                    jSONObject2.getJSONObject("bizParam").putAll(parseObject.getJSONObject("bizParam"));
                }
                parseObject.remove("bizParam");
            }
            jSONObject2.putAll(parseObject);
        }
        this.c = new GatewayActionInfo(string, a2, this.f28365a, jSONObject2, this.b.getJSONObject("callback"));
        return this.c;
    }

    private a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a55f6bd6", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return this.f28365a.c();
        }
        return a.a(str);
    }
}
