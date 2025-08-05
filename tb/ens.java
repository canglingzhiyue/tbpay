package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class ens extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27476a;

    static {
        kge.a(190506032);
    }

    public ens(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f27476a = jSONObject.getString("url");
        }
        emu.a("com.taobao.android.detail.datasdk.event.basic.OpenPopLayerEvent");
    }

    public ens(String str) {
        this.f27476a = str;
        emu.a("com.taobao.android.detail.datasdk.event.basic.OpenPopLayerEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27476a;
    }
}
