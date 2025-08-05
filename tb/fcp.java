package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;

/* loaded from: classes5.dex */
public class fcp extends eoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27808a;
    public String b;
    public String c;
    public JSONObject d;

    static {
        kge.a(-892543306);
    }

    @Override // tb.eoc, com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public fcp(JSONObject jSONObject, b bVar) {
        this.f27808a = "detail";
        emu.a("com.taobao.android.detail.wrapper.ext.event.basic.OpenRedPacketEvent");
        if (jSONObject == null && bVar == null) {
            return;
        }
        this.b = jSONObject.getString("activityId");
        this.f27808a = jSONObject.getString("channel");
        this.c = jSONObject.getString("umidToken");
        this.d = jSONObject;
    }
}
