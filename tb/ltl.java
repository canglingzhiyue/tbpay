package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.a;
import java.util.Map;

/* loaded from: classes7.dex */
public class ltl implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lxb f30917a;

    static {
        kge.a(815731617);
        kge.a(-1789185574);
    }

    public ltl(lxb lxbVar) {
        this.f30917a = lxbVar;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.a
    public JSONObject getCurrentPageParams() {
        Map<String, String> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58f7263f", new Object[]{this});
        }
        lwf a2 = this.f30917a.a();
        if (a2 == null || (b = a2.b()) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(b);
        return jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.a
    public JSONObject getCurrentUTParams() {
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83ce92ef", new Object[]{this});
        }
        lwf a2 = this.f30917a.a();
        if (a2 == null || (c = a2.c()) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", (Object) c);
        return jSONObject;
    }
}
