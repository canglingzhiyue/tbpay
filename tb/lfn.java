package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ju.track.server.JTrackParams;

/* loaded from: classes4.dex */
public class lfn extends ezg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String g;
    private JSONObject h;
    private JSONObject i;

    static {
        kge.a(681610082);
    }

    public lfn(JSONObject jSONObject, ezo ezoVar) {
        super(jSONObject, ezoVar);
        b(jSONObject, ezoVar);
    }

    private void b(JSONObject jSONObject, ezo ezoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6da0afd", new Object[]{this, jSONObject, ezoVar});
            return;
        }
        this.g = jSONObject.getString("type");
        this.h = jSONObject.getJSONObject("data");
        this.i = jSONObject.getJSONObject(JTrackParams.TRACK_PARAMS);
        JSONObject jSONObject2 = this.i;
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return;
        }
        this.h.put(JTrackParams.TRACK_PARAMS, (Object) this.i);
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.g;
    }

    public JSONObject i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[]{this}) : this.h;
    }

    public JSONObject j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2185e711", new Object[]{this}) : this.i;
    }
}
