package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.event.params.d;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;

/* loaded from: classes4.dex */
public class env extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d f27480a;
    public JSONObject b;

    static {
        kge.a(-672588278);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public env(d dVar) {
        this.f27480a = dVar;
        emu.a("com.taobao.android.detail.datasdk.event.basic.OpenWangxinEvent");
    }

    public env(JSONObject jSONObject) {
        emu.a("com.taobao.android.detail.datasdk.event.basic.OpenWangxinEvent");
        if (jSONObject == null || !jSONObject.containsKey(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS)) {
            return;
        }
        this.b = jSONObject.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        String a2 = epw.a(this.b.getString("nick"));
        String a3 = epw.a(this.b.getString("itemid"));
        String a4 = epw.a(this.b.getString("shopId"));
        String a5 = epw.a(this.b.getString("saleCount"));
        this.f27480a = new d(a2, a3, a4);
        try {
            this.f27480a.d = Integer.parseInt(a5);
        } catch (Exception unused) {
        }
    }
}
