package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fcl extends eoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27803a;
    public JSONObject b;

    static {
        kge.a(1064167114);
    }

    @Override // tb.eoc, com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public fcl(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (!TextUtils.isEmpty(jSONObject.getString("url"))) {
                this.f27803a = jSONObject.getString("url");
            } else {
                this.f27803a = "";
            }
            if (!TextUtils.isEmpty(jSONObject.getString("params"))) {
                this.b = jSONObject.getJSONObject("params");
            } else {
                this.b = new JSONObject();
            }
        }
        emu.a("com.taobao.android.detail.wrapper.ext.event.basic.OpenFloatWeexDialogEvent");
    }
}
